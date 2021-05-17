<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<style>
    pre{
        font-size: 1.5rem;
        padding: 1rem;
    }
</style>
<body>
    <pre id="root"></pre>
    <button id='compute' onclick="logic()">compute</button>
</body>
</html>

<script>
    let container = document.getElementById('root');

    async function getArticlesOfPage(page){
        return fetch(`https://jsonmock.hackerrank.com/api/articles?page=${page}`)
        .then(results => results.json())
        .then(jsonResults => {
            let validatedArticles = jsonResults.data.filter(article => ((article.title !== null && article.title !== "") && ( !isNaN(article.num_comments) && (article.num_comments !== null) )) )
            return validatedArticles;
        })
        .then(validatedArticles => {
            let name_commentCount_mapList = [];
            validatedArticles.forEach(article => {
                name_commentCount_mapList.push({name: article.title, count: article.num_comments})
            });
            return name_commentCount_mapList;
        })
        .then(nameCountMapList => {
            let sorted = nameCountMapList.sort( (a, b) => b.count - a.count);
            return sorted;
        })
        .then(result => result)
        .catch(err => console.error(err));
    }

    async function getArticlesWithTopComment(rCount){
        let results = [];

        // get total number of pages
        let totalPages = await fetch('https://jsonmock.hackerrank.com/api/articles')
        .then(res => res.json())
        .then(jsonResp => jsonResp.total_pages)
        .catch(err => console.error(err));

        // loop over all pages
        for (let i = 1; i <= totalPages; i++) {
            let tempData = await getArticlesOfPage(i);
            fillArray(results, tempData, rCount);
            // debugger
            if (results.length > rCount) break;
        }
        results.sort( (a, b) => b.count - a.count );
        if(results.length > rCount){
            results.pop();
        }

        // dev usage
        // results.unshift({meta: {length: results.length}});
        // container.innerText = JSON.stringify(results, null, 2);

        let htmlContent = "";
        let nameArray = results.map((r, index) => htmlContent += `${index}\t${r.count}\t${r.name}\n`)
        container.innerText = htmlContent;

    }

    function fillArray(originalArray, tempArray, rCount){
        for (let i = 0; i < tempArray.length; i++) {
            originalArray.push(tempArray[i]);
            if (originalArray.length > rCount) break;
        }
    }

    var t0 = performance.now()
    getArticlesWithTopComment(213).then(() => {
      var t1 = performance.now();
      console.log("Call to doSomething took " + (t1 - t0)/1000 + " seconds.")
    });
</script>

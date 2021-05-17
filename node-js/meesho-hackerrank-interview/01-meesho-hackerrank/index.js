const articlesController = require('./controller/articlesController');
const {performance} = require('perf_hooks');
const no_of_articles = process.argv[2];

async function getResults(no_of_articles) {
    return await articlesController.getArticlesWithTopComment(no_of_articles);
}

var t0 = performance.now()
var t1;
getResults(no_of_articles)
    .then(result => {
        result.forEach(article => console.log(`${article.count}\t${article.name}`))
        t1 = performance.now()
        console.log("\n\nCall to doSomething took " + ((t1 - t0)/1000) + " seconds.")
    })
    .catch(err => console.error(err));
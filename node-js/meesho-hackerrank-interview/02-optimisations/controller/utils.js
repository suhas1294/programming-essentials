exports.fillArray = (originalArray, tempArray, rCount) => {
    for (let i = 0; i < tempArray.length; i++) {
        originalArray.push(tempArray[i]);
        if (originalArray.length > rCount) break;
    }
}

exports.validateArticles = articleList => {
    let notNullList = articleList.filter(article => ((article.title !== null && article.title !== "") && ( !isNaN(article.num_comments) && (article.num_comments !== null) )) )
    let name_commentCount_mapList = [];
    notNullList.forEach(article => {
        name_commentCount_mapList.push(
            {name: article.title, count: article.num_comments}
        )
    });
    return name_commentCount_mapList;
}

exports.sortArticles = articleList => {
    return articleList.sort( (article1, article2) => article2.count - article1.count);
}
const articlesController = require('./controller/articlesController');

const no_of_articles = process.argv[2];

async function getResults(no_of_articles) {
    return await articlesController.getArticlesWithTopComment(no_of_articles);
}

getResults(no_of_articles)
    .then(result => {
        result.forEach(article => console.log(`${article.count}\t${article.name}`))
    })
    .catch(err => console.error(err));
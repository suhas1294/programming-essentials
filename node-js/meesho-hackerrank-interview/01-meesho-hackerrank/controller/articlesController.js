const axios = require('axios');
const constants = require('../utils/constants');
const {fillArray, validateArticles, sortArticles} = require('../utils/utils');

axios.defaults.baseURL = constants.HOST_URL;

const getArticlesOfPage = async (page) => {
    return axios
    .get(`${constants.END_POINT}`, {
        params: {
            page
        }
    })
    .then(results => validateArticles(results.data.data))
    .then(validatedArticles => sortArticles(validatedArticles))
    .then(result => result)
    .catch(err => console.error(err));
}

const getTotalPages = async () => {
    let totalPages = await axios
        .get(`${constants.END_POINT}`)
        .then(res => res.data)
        .then(jsonResp => jsonResp.total_pages)
        .catch(err => console.error(err));
    return totalPages;
}

exports.getArticlesWithTopComment = async (rCount=20) => {
    let results = [];
    
    // get total number of pages
    let totalPages = await getTotalPages();

    // loop over all pages or until the minimum records is satisfied
    for (let i = 1; i <= totalPages; i++) {
        // console.log(`fetching results from page ${i}`);
        let tempData = await getArticlesOfPage(i);
        fillArray(results, tempData, rCount);
        if (results.length > rCount) break;
    }
    results.sort( (a, b) => b.count - a.count );
    if(results.length > rCount){
        results.pop();
    }
    return results;
}
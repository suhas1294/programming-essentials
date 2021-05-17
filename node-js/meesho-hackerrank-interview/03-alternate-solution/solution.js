const https = require("https");
const {performance} = require('perf_hooks');
const API_BASE_URL = "https://jsonmock.hackerrank.com";
function makeARequest(path, method = "GET") {
  return new Promise((resolve, reject) => {
    const req = https.get(API_BASE_URL + path, (res) => {
      let data = "";
      res.on("data", (d) => {
        data += d;
      });
      res.on("end", () => {
        resolve(JSON.parse(data));
      });
    });
    req.on("error", (e) => {
      reject(e);
    });
  });
}
async function getSpecOfArticlesReceived() {
  const data = await makeARequest("/api/articles?page=1");
  // console.log(data);
  return {
    per_page: data.per_page,
    total: data.total,
    total_pages: data.total_pages,
  };
}
async function getDataFromPageNo(pageNo) {
  const data = await makeARequest("/api/articles?page=" + pageNo);
  return {
    data: data.data,
  };
}
function sorter(a, b) {
  if (a.num_comments === b.num_comments) {
    if (a.title < b.title) return -1;
    if (a.title > b.title) return 1;
    return 0;
  }
  return b.num_comments - a.num_comments;
}
async function getArticlesWithTopComment(num_of_articles) {
  const spec = await getSpecOfArticlesReceived();
  const total_pages = spec.total_pages;
  let dataArray = [];
  // We iterate an array from 1 to total_pages
  // So [...Array(5).keys()] generates [0,1,2,3,4] hence [...Array(6).keys()].shift() will get [1,2,3,4,5]
  const pages = [...Array(total_pages + 1).keys()];
  pages.shift();
  for await (const pageNo of pages) {
    const toAppend = await getDataFromPageNo(pageNo);
    dataArray = [...dataArray, ...toAppend.data];
  }
  //  filter the ones that don't have
  dataArray = dataArray.filter((i) => {
    // console.log(
    //   i.num_comments,
    //   i.title,
    //   i.num_comments != undefined && i.title !== "" && i.title != undefined
    // );
    return (
      i.num_comments != undefined && i.title !== "" && i.title != undefined
    );
  });
  dataArray.sort(sorter);
  const lengthOfDataArray = dataArray.length;
  const resultArray = [];
  [...Array(num_of_articles).keys()].forEach((e) => {
    if (e >= lengthOfDataArray) return;
    resultArray.push(dataArray[e]);
  });
  return resultArray.map((e) => `${e.num_comments} ${e.title}`);
}
async function main() {
  try {
    var t0 = performance.now()
    const testVal = 100;
    const array = await getArticlesWithTopComment(testVal);
    array.forEach((e) => console.log(e));
    var t1 = performance.now()
    console.log("\n\nCall to doSomething took " + (t1 - t0) + " milliseconds.")
  } catch (e) {
    console.error(e);
  }
}
if (require.main == module) {
  main();
}

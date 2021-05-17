/* api 2 is dependent on api 1, api 3 is independent, how will you take least time to get data from server and populate in UI */

const fetchData = async () => {
    // make 1st api call
    const api3Resp = fetch('api_3').then().catch(err => console.error(err));

    const api1Resp = await fetch('api1_url');
    const api2Resp = fetch('api2');


    Promise.resolveAll(api3Resp, api2Resp);
    // b4 populating data
}

/* Return a promise that should do the work after 30 second */
const returnPromise = () => {
    return new Promise(resolve, reject => {
        resolve( () => setTimeout(() => {
            console.log('success');
        }, 30000)),
        reject(false)
    });
}


// write debounce function


// difference between __proto__ and class.prototype.method_name
let Person = {
    name: "",
    yob: 1994
}

Person.prototype.calcAge = function(){
    return 2021 - this.yob;
}

// there are 3 hyperlinks , all with title 'abc', how will you select all using title selector ?
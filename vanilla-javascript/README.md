## Javascript contepts / FAQs in Interviews.

* what is difference between __undefined__ and __null__ ?
  ```javascript
    // undefined means the variable is declared But not assigned with any value But null means variable is assinged with null value.

    null === undefined // false
    null == undefined // true
    null === null // true
  ```

* Javascript __data types__
  1. number
  2. string
  3. boolean
  4. undefined (datatype of a variable which does not have a value yet)
  5. null (AKA Non existent)

* Declaring variables
  ```javascript
        var name = 'Foo Bar';
  ```

* Stirng interpolation
  ```javascript
    var name, age;
    name = "John Doe";
    age = 21;
    var sentence = `Person name is ${name} and he/she is ${age} years of age`
  ```

* Switch case statement
  ```javascript
    var job = 'instructor';
    switch (job) {
        case 'teacher':
        case 'instructor':
            console.log(firstName + ' teaches kids how to code.');
            break;
        case 'driver':
            console.log(firstName + ' drives an uber in Lisbon.');
            break;
        case 'designer':
            console.log(firstName + ' designs beautiful websites.');
            break;
        default:
            console.log(firstName + ' does something else.');
    }
  ```

* Common Array methods
  ```javascript
    var john = ['John', 'Smith', 1990, 'designer', false];

    john.push('blue'); // adds element to last
    john.unshift('Mr.'); // adds element to first
    john.pop(); // removes last element
    john.shift(); // removes first element
    john.indexOf('John'); // gives 1

    var personArr = [{ id: 1, name: "John" }, { id: 2, name: "Marry" }, { id: 3, name: "Mark" }];

    var findPersonIndex = (id) => personArr.findIndex(person => person.id === id);
    findPersonIndex(3); // retuns index of a person whose id is 3, returns -1 if person not found

    var findPerson = (name) => personArr.find(person => person.name === name);
    findPerson("John"); // return person object if its present in array
    findPerson("Johv"); // returns 'undefined'

    // splice alters the original array
    // splice(fromElementIndex, number of elements)
    var array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99];
    var returnedArr1 = array.splice(2, 4); // [3, 4, 5, 6]
    console.log(array); // [1,2,7,8,9,11,22,33,44,55,66,77,88,99];

    // slice DOES NOT alters the original array
    // slice(fromElementIndex, until element index)
    // slice extracts up to but not including end
    var array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99];
    var returnedArr2 = array.slice(2, 7); // [3, 4, 5, 6, 7]
    console.log(array); // [1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99];

    // includes method:
    cur.className.includes('blue') ? 'its blue' : 'Its not blue';
  ```

* Object literal
  ```javascript
    // Object literal
    var john = {
        firstName: 'John',
        lastName: 'Smith',
        birthYear: 1990,
        family: ['Jane', 'Mark', 'Bob', 'Emily'],
        job: 'teacher',
        isMarried: false
    };

    // accessing object fields
    console.log(john.firstName);
    console.log(john['lastName']);
    var x = 'birthYear';
    console.log(john[x]);

    // new Object syntax
    var jane = new Object();
  ```

* Alternate way of creating object
  ```javascript
    var personProto = {
        calculateAge: function () {
            console.log(2016 - this.yearOfBirth);
        }
    };

    var john = Object.create(personProto);
    john.name = 'John';
    john.yearOfBirth = 1990;
    john.job = 'teacher';

    var jane = Object.create(personProto, {
        name: { value: 'Jane' },
        yearOfBirth: { value: 1969 },
        job: { value: 'designer' }
    });
  ```

* Objects and Methods
  ```javascript
    var john = {
        firstName: 'John',
        lastName: 'Smith',
        birthYear: 1992,
        family: ['Jane', 'Mark', 'Bob', 'Emily'],
        job: 'teacher',
        isMarried: false,
        calcAge: function () {
            this.age = 2018 - this.birthYear;
        }
    };

    john.calcAge();
    console.log(john);
  ```

* Dynamically creating fields inside object methods
  ```javascript
    var numObj = {
        even_numbers: [2, 4, 6, 8],
        odd_numbers: [1, 3, 5, 7],
        oddSquare: function () {
            this.odd_square = [];
            this.odd_numbers.forEach(element => {
                this.odd_square.push(element * element);
            });
        }
    }

    numObj.oddSquare();
    console.log(numObj.odd_square);
  ```

* JSON parsing and local storate
  ```javascript
    localStorage.setItem('likes', JSON.stringify(this.someObj));
    const storage = JSON.parse(localStorage.getItem('likes'));
  ```

* List of all __Falsy__ values:
  ```
    1. undefined
    2. null
    3. 0
    4. ' '
    5. NaN
  ```
* Declare array of fixed length
  ```javascript
    new Array(4);
    var years = new Array(1990, 1969, 1948); // alternate way of creating array
  ```
* Difference between __splice__ and __slice__
  ```javascript
    // splice: alters the original array syntax:
    splice(fromElementIndex, how_many_elements)
    // slice: Does NOT alter the original array syntax:
    slice(fromElementIndex, till_which_element)
    // slice extracts up to but not including end
  ```
* __IIFE__: immediately invoked function expression
  ```javascript
    (function () {
        var score = Math.random() * 10;
        console.log(score >= 5);
    })();
  ```

* __Closure__
  ```javascript
    // An inner function has always access to variables and parameters of its outer function,even after the outer function has returned.

    function closureDemo(){
        let data = "hello";
        return function(name){
            console.log(`${data} ${name}, welcome`);
        }
    }

    let returnedFunc = closureDemo();
    returnedFunc('johndoe');
  ```

* Alternate way of creating __object__
  ```javascript
    var personProto = {
        calculateAge: function() {
            console.log(2016 - this.yearOfBirth);
        }
    };

    var john = Object.create(personProto);
    john.name = 'John';
    john.yearOfBirth = 1990;
    john.job = 'teacher';

    var jane = Object.create(personProto, {
        name: { value: 'Jane' },
        yearOfBirth: { value: 1969 },
        job: { value: 'designer' }
    });
  ```

* __Call Apply Bind__ Remember as C - A - B
  ```javascript
    // These methods are usually used when we are borowing methods mainly for manipulating 'this' keyword
    let john = {
        firstName: 'John',
        lastName: 'Doe',
        weightInKg: 80,
        heightInCm: 177,
        calcBmiArrow: () => {
            console.log(this.heightInCm);
        },
        calcBmi: function(year=2021) {
            let bmi = (this.weightInKg/Math.pow((this.heightInCm/100), 2)).toFixed(2);
            return `${this.firstName}, your BMI is ${bmi} on ${year}`;
        }
    }

    console.log(john.calcBmi());


    // call:
    let foo = {
        firstName: 'Foo',
        lastName: 'Bar',
        weightInKg: 70,
        heightInCm: 180
    }
    console.log(john.calcBmi.call(foo, 2020));

    // apply:
    // apply' method does the same thing which 'call' does, But after first_argument, it takes rest of the arguments in an array
    console.log( john.calcBmi.apply(foo, [2020]) );

    // bind:
    // 'call' and 'apply' executes the method BUT 'bind' returns a function.
    // bind does not immediately call the function, instead it returns a new function where the 'this' keyword is bound.
    let msg =  john.calcBmi.bind(foo, 2022);
    msg()

    // USING 'BIND' METHOD IN DOM
    someObj.someFunc = function () {
        this.someNumProperty++; // 'this' refers to someObj
        console.log(`new value: ${someNumProperty}`);
    }
    document.querySelector('.someClass')
        .addEventListner('click', someObj.someFunc.bind(someOtherObj))
  ```
* Difference between : __Local-storage__ and __Session-storage__ and __Cookies__
  ```
    Cookies : 4KB | HTML 4&5 | accessed from any window | stored in browser & server
    Local-storage : 10mb | HTML 5 | No Expiry
    Session-storage : 5mb | HTML 5 | accessed from SAME tab only | Expires on tab close
  ```
* __Promisify__ a function
  ```javascript
    function promisifyFunc(){
        return new Promise(function (resolve, reject) {
            setTimeout(() => {
                let day = new Date().getDate();
                if (day % 3 === 0) {
                    resolve("Done");
                } else {
                    reject(new Error("Come back"));
                }
            }, 2000);
        })
    }

    promisifyFunc()
        .then((result) => console.log(result))
        .catch(err => console.error(err));
  ```
* Differece between var and let
  ```javascript
    //var can be accessed outside function also.
    function foo(flag){
        if(flag){
            var name = "something";
        }
        console.log(name +  ' is accessible outside the function also.')
    }
  ```
* Javascript __Maps__
  ```javascript
    const allTypeData = new Map();
    allTypeData.set('name', 'Foo');
    allTypeData.set(1, 'luckyNumber');
    allTypeData.set('yob', 1990);
    allTypeData.set(true, 'isAdult');

    allTypeData.get('name');
    allTypeData.size;
    allTypeData.delete(4);
    allTypeData.has(4);
    allTypeData.clear();

    // MAP ITERATION
    allTypeData.forEach(
        (value, key) => console.log(`This is ${key},
        and it's set to ${value}`));

    // MAP KEY-VALUE ITERATION
    for (let [key, value] of allTypeData.entries()) {
        if (typeof(key) === 'number') {
            console.log(`Answer ${key}: ${value}`);
        }
    }
  ```

* Detect if javascript is enabled in browser
  ```html
  <noscript>
      Your browser does not support JavaScript!
  </noscript>

  <noscript><meta http-equiv="refresh" content="0; url=whatyouwant.html" /></noscript>

  ```
* \_\_proto\_\_ vs prototype

    __Instances__ have \_\_proto\_\_\
    __classes__ have prototype\
    __prototype__ is a property of a Function object. __proto__ is internal property of an object, pointing to its prototype.

  ```javascript
    function Person(name){
        this.name = name
    };
    var eve = new Person("Eve");
    eve.__proto__ == Person.prototype //true
    eve.prototype  //undefined
  ```
* Access function before it is called
  ```javascript
    func4(); // able to access since its pre-es6 syntax
    function func4() {
        console.log("hello from func4");
    }

    // func5(); // wont work since its arrow function
    func5 = () => {
        console.log("hello from func5");
    }
  ```
* Access variable before it is called
  ```javascript
    console.log(`${varVariable} is accessible`); // returns UNDEFINED
    console.log(`${letVariable} is accessible`); // wont work since 'let' is in Temporal Dead Zone (TDZ)
    console.log(`${constVariable} is accessible`);  // wont work since 'const' is in Temporal Dead Zone

    var varVariable = 'varVariable';
    let letVariable = "letVariable";
    const constVariable = 'constVariable' ;
  ```
* What is __event delegation__ ?

    __Bubbling__ : whenever an event is triggered on a DOM element, that will trigger exact same event on all its parent elements.\
    __Use cases__:
    1. when we have an element with lot of child elements that we are interested in. instead of adding event to all child element, we add it to parent element.
    2. when we want to add even handler to an element which is not yet in the DOM when our page is loaded.In such case we give event handler to the parent element under which the new element is expected to appear.

   There are multiple ways of implementing Event Delegation:
   1. Traversing upto parent element using 'parent' property
   2. using closest() method
   3. using mathces() method (in case we want to select more then one thing)

    Using __parent node__:
  ```javascript
    document.querySelector('.parentElementIdentifier').addEventListener('click',event =>  callbackFn(event));
    function callbackFn(event){
        // traverse upto element where you get unique element on which operation
        // has to be performed
        var uniqueId = event.parent.parent.parent.id;
        if (uniqueId){
            // logic
        }
    };
  ```
  Using __closest__:
  ```html
  <!-- say suppose we have a button interface as below :
    there are 3 cases:
        1. user may be click on button
        2. user may be click on (svg) icon
        3. user may be click on span element
    But we need to fetch pageNo from button element which is PARENT -->

    <button class="btn-inline" data-goto=${pageNo}>
        <span>Page ${pageNo}</span>
        <svg class="search__icon">
            <use href="img/icons.svg#icon-triangle-${direction}"></use>
        </svg>
    </button>

    <!-- In that case we use closest
    here e is event and e.target is element on which click happened
    .closest(selector) means traverse back until root element in DOM OR until selector element -->

    <script>
        const btn = e.target.closest('.btn-inline');
        if (btn) {
            const goToPage = parseInt(btn.dataset.goto, 10); // 10 for base10
            doSomething(goToPage);
        }
    </script>
  ```
  using __matches__:
  ```javascript
  document.querySelector('#someId').addEventListener('click', e => {
    // ".btn-decrease *" meaning : .btn-decrease and it's children
    if (e.target.matches('.btn-decrease, .btn-decrease *')) {
        if (flag) {
            doSomething();
        }
    }
    });
  ```
* var vs let behavior in FOR loop
  ```javascript
    for (let pqr = 0; pqr < 3; pqr++) {
        setTimeout(() => {
            console.log(pqr);
        }, 0);
    }
    // output: 0,1,2

    for (var xyz = 0; xyz < 3; xyz++) {
        setTimeout(() => {
            console.log(xyz);
        }, 0);
    }
    // output: 3,3,3
  ```
* Swap (using ES6)
  ```javascript
    [a, b] = [b, a]
    // alternate solution (without using temp variable)
    a = a + b;
    b = a - b;
    a = a - b;
  ```
* Write Polyfil for 'bind' function
  ```javascript
    let personName = {
        firstname: "Akshay",
        lastname: "Saini"
    }

    let printName = function (hometown, state, country) {
        console.log(this.firstname + " " + this.lastname + " , " + hometown + ", " + state + ", " + country);
    }

    let printMyName = printName.bind(personName, "Dehradun", "Uttarakhand");
    printMyName("India");

    Function.prototype.mybind = function (...args) {
        let obj = this,
            params = args.slice(1);
        return function (...args2) {
            obj.apply(args[0], [...params, ...args2]);
        }
    }

    let printMyName2 = printName.mybind(personName, "Dehradun", "Uttarakhand");
    printMyName2("India");
  ```

* Write function for debouncing
  ```javascript
    function debounce(func, wait, immediate) {
        var timeout;
        return function() {
            var context = this, args = arguments;
            var later = function() {
                timeout = null;
                if (!immediate) func.apply(context, args);
            };
            var callNow = immediate && !timeout;
            clearTimeout(timeout);
            timeout = setTimeout(later, wait);
            if (callNow) func.apply(context, args);
        };
    };
  ```
* Following function prints the '2' thrice why ?\
  because 'var' is used instead of 'let'
  ```javascript
    for (var i = 0; i < 3; i++) {
        setTimeout(() => {
            console.log(i);
        }, 0);
    }
  ```
* Get angle between hour hand and minute hand
  ```javascript
    function getAngle(h, m) {
        if (h < 0 || m < 0 || h > 12 || m > 60) return null;
        if (h == 12) h = 0;
        if (m == 60) {
            m = 0;
            h += 1;
            if (h > 12) h = h - 12;
        }
        //Calculate the angles moved by hour and minute hands with reference to 12:00
        let hour_angle = 0.5 * (h * 60 + m);
        let minute_angle = 6 * m;
        let angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360 - angle, angle); //smaller angle of two possible angles
        return angle;
    }
  ```
* what is output of following question ?
  ```javascript
    console.log('start');
    setTimeout(() => {
        console.log('middle');
    }, 0);
    console.log('end');
  ```
* what is output of following question ?
  ```javascript
    function foo(){
    function bar(){
        return 3;
    }
    return bar();
    function bar(){
        return 8;
    }
}
console.log(foo())
  ```
* what is output of following question ?
  ```javascript
    var data = [];
    for (var k=0;k<3;k++){
        data[k] = function(){
            console.log(k);
        };
    }

    data[0]();
    data[1]();
    data[2]();
  ```
* what is output of following question ?
  ```javascript
    function foo(num){
        //keep track of how many times 'foo' called
        this.count++;
    }
    foo.count = 0;
    var i;
    for(i=0; i< 10;i++){
        if(i > 5){
            foo(i);
        }
    }
    // how many times was foo executed ?
    console.log(foo.count);
  ```
* Check if the given number is an armstrong or not
  ```javascript
    const isArmstrongNumber = (input) => {
        for (let index = 1; index <= input[0]; index++) {
            let cubeArray = input[index]
                .toString()
                .split("")
                .map(r => parseInt(r))
                .map(e => getCubeOfNumber(e));
            let sumArray = getSumOfArray(cubeArray);
            if (sumArray == input[index]){
                console.log(`${input[index]} is an armstrong number`);
            }else{
                console.log(`${input[index]} is a NOT an armstrong number`);
            }
        }
    }

    const getSumOfArray = (arr) => {
        const reducer = (accumulator, currentValue) => accumulator + currentValue;
        return arr.reduce(reducer);
    }

    const getCubeOfNumber =(num) => {
        return num * num * num;
    }
  ```
## Concept of async

* Simple async function
  ```javascript
    const asyncFunc = () => {
        console.log("this prints first");
        setTimeout(() => {
            console.log("this prints last")
        }, 500);
        console.log("this prints second");
    }
  ```

* Callback hell
  ```javascript
    function getRecipe() {
        setTimeout(() => {
            const recipeID = [523, 883, 432, 974];
            console.log(recipeID);

            setTimeout(id => {
                const recipe = { title: 'Fresh tomato pasta', publisher: 'Jonas' };
                console.log(`${id}: ${recipe.title}`);

                setTimeout(publisher => {
                    const recipe2 = { title: 'Italian Pizza', publisher: 'Jonas' };
                    console.log(recipe);
                }, 1500, recipe.publisher);

            }, 1500, recipeID[2]);

        }, 1500);
    }
    getRecipe();
  ```

* Evolution of promises\
  __Definition__: An object that is used as placeholder for future result of async ops.
                Basically - Container for a future value.
  ```javascript
    const getIDs = new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve([523, 883, 432, 974]);
        }, 1500);
    });

    const getRecipe = recID => {
        return new Promise((resolve, reject) => {
            setTimeout(ID => {
                const recipe = { title: 'Fresh tomato pasta', publisher: 'Jonas' };
                resolve(`${ID}: ${recipe.title}`);
            }, 1500, recID);
        });
    };

    const getRelated = publisher => {
        return new Promise((resolve, reject) => {
            setTimeout(pub => {
                const recipe = { title: 'Italian Pizza', publisher: 'Jonas' };
                resolve(`${pub}: ${recipe.title}`);
            }, 1500, publisher);
        });
    };
  ```
  ES-6 way of chaining multiple async tasks:
  ```javascript
  getIDs
        .then(IDs => {
            console.log(IDs);
            return getRecipe(IDs[2]);
        })
        .then(recipe => {
            console.log(recipe);
            return getRelated('Jonas Schmedtmann');
        })
        .then(recipe => {
            console.log(recipe);
        })
        .catch(error => {
            console.log('Error!!');
        });
  ```
    ES-8 ways of processing Promises:\
    Handling promise chaining using async-await\
    Note: async function always returns a Promise Object
  ```javascript
    async function getRecipesAW() {
        const IDs = await getIDs;
        console.log(IDs);
        const recipe = await getRecipe(IDs[2]);
        console.log(recipe);
        const related = await getRelated('Jonas Schmedtmann');
        console.log(related);

        return recipe;
    }
    getRecipesAW().then(result => console.log(`${result} is the best ever!`));
  ``

* Promise example:\
[source](https://javascript.info/promise-basics)
  ```javascript
    function loadScript(src) {
        return new Promise(function (resolve, reject) {
            let script = document.createElement('script');
            script.src = src;

            script.onload = () => resolve(script);
            script.onerror = () => reject(new Error(`Script load error for ${src}`));

            document.head.append(script);
        });
    }

    // usage:

    let promise = loadScript("https://cdnjs.cloudflare.com/ajax/libs/lodash.js/4.17.11/lodash.js");

    // Syntax for .then()
    // promise.then(
    //     function(result) { /* handle a successful result */ },
    //     function(error) { /* handle an error */ }
    // );


    promise.then(
        script => alert(`${script.src} is loaded!`),
        error => alert(`Error: ${error.message}`)
    );

    promise.then(script => alert('Another handler...'));
  ```

* Fetch api + Promise api
  ```javascript
    function getWeather(woeid) {
        fetch(`https://crossorigin.me/https://www.metaweather.com/api/location/${woeid}/`)
            .then(result => {
                // console.log(result);
                return result.json();
            })
            .then(data => {
                // console.log(data);
                const today = data.consolidated_weather[0];
                console.log(`Temperatures today in ${data.title} stay between ${today.min_temp} and ${today.max_temp}.`);
            })
            .catch(error => console.log(error));
    }
    getWeather(2487956);
  ```

* Fetch API + Async-Await
  ```javascript
    async function getWeatherAW(woeid) {
        try {
            const result = await fetch(`https://crossorigin.me/https://www.metaweather.com/api/location/${woeid}/`);
            const data = await result.json();
            const tomorrow = data.consolidated_weather[1];
            console.log(`Temperatures tomorrow in ${data.title} stay between ${tomorrow.min_temp} and ${tomorrow.max_temp}.`);
            return data;
        } catch (error) {
            alert(error);
        }
    }
    getWeatherAW(2487956);
    // getWeatherAW(2487956).then(...); //in case further logic needs to be implemented
  ```

## DOM Manipulations using javascript
* DOM manipulation using function call back
  ```javascript
    // syntax
    document.querySelector('#submit-form').addEventListener(type_of_event, function_callback);

    function clickalert() {
        alert('you just clicked a button');
    }

    document.querySelector('#submit-form').addEventListener('click', clickalert);
    ['hashchange', 'load'].forEach(event => window.addEventListener(event, someCallbackFunc));

    // for selet tag element
    document.querySelector("#submit-form").addEventListener('change', someCallbackFunc);
  ```
* Window onload functions
  ```javascript
    window.addEventListener('load', () => {
        console.log("sdf");
    });


    window.onload = function () {
        yourFunction(param1, param2);
    };
  ```
* The event object
  ```javascript
    // notice that we are passing 'myNameForEvent' which is basically 'event' object ALWAYS.
    // we dont have to specifiy its an 'event' object, browser will automatically send event obect itself.

    document.addEventListener('keypress', function (myNameForEvent) {
        console.log(event); // event will have certain properties
    });
  ```
* DOM manipulation using anonymous function
  ```javascript
    document.querySelector('#submit-form').addEventListener('click', function () {
        alert('you just clicked a button');
    });
  ```
* DOM manipulation - more examples
  ```javascript
    var diceDOM = document.querySelector('.dice');
    diceDOM.style.display = 'block';
    diceDOM.src = 'dice-' + dice + '.png';

    document.querySelector('#someClass-' + dynamicAttribute).textContent = dice;
    document.querySelector('#someClass-' + dynamicAttribute).innerHTML = '<em>' + dice + '<em>';

    document.querySelector('.nav-menu').classList.add('active');
    document.querySelector('.nav-menu').classList.remove('active');
    document.querySelector('.nav-menu').classList.toggle('active');

    // getting Hash value from url
    console.log(window.location.hash);
  ```
* Deleting a part of UI from DOM(Deleting element from DOM)
  ```javascript
    // example-1
    // suppose there are multiple child for a parent, then we need to
    // pass unique selector of the element which needs be deleted

    var deleteListItem = function (selectorID) {
        var el = document.getElementById(selectorID);
        el.parentNode.removeChild(el);
    }

    // example-2 (removing loader)
    const loader = document.querySelector('.loader');
    if (loader) loader.parentElement.removeChild(loader);
  ```
* querySelectorAll, Clearing inputs fields, using forEach with full capacity
  ```javascript
    var fields = Arrays.from(document.querySelectorAll('#firstname,#lastname,.comments'));
    fieldsArr.forEach(function (currentElement, index, array) {
        currentElement.value = "";
    });
  ```
* keypress event on Enter key
  ```javascript
    document.addEventListener('keypress', function (event) {
        if (event.keyCode === 13 || event.which === 13) {
            doSomething();
        }
    });
  ```
* Prevent default
  ```javascript
    document.querySelector('#submit-form').addEventListener('submit', e => {
        e.preventDefault();
        doSomethingElse();
    });
  ```
* data attribute in HTML
  ```html
    // syntax : data-someName='someValue'
    // html code
    <svg id="Layer_1" data-name="Layer 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 123 25.51"></svg>

    // js code
    var element1 = document.querySelector('#Layer_1');
    console.log(element1.dataset.name); //prints 'Layer 1'
  ```
* closest() : Adding event listner to an element when its not yet in DOM (when page is not loaded)
  ```html
    <!-- say suppose we have a button interface as below :
    there are 3 cases:
    1. user may be click on button
    2. user may be click on (svg) icon
    3. user may be click on span element
    But we need to fetch pageNo from button element which is PARENT -->

    <button class="btn-inline" data-goto=${pageNo}>
        <span>Page ${pageNo}</span>
        <svg class="search__icon">
            <use href="img/icons.svg#icon-triangle-${direction}"></use>
        </svg>
    </button>

    <!-- In that case we use closest
    here e is event and e.target is element on which click happened
    .closest(selector) means traverse back until root element in DOM OR until selector element -->

    <script>
        const btn = e.target.closest('.btn-inline');
        if (btn) {
            const goToPage = parseInt(btn.dataset.goto, 10); // 10 for base10
            doSomething(goToPage);
        }
    </script>
  ```
* matches(): method for event delegation
  ```javascript
    document.querySelector('#someId').addEventListener('click', e => {
        // ".btn-decrease *" meaning : .btn-decrease and it's children
        if (e.target.matches('.btn-decrease, .btn-decrease *')) {
            if (flag) {
                doSomething();
            }
        }
    });
  ```
---
## Javascript Internals:
---
__Javascript__ is
- high level
- prototype based objject oriented
- multi paradigm
- interpreted (just in time compiled)
- dynamic
- single threaded
- garbage collected
- first class functions
- non blocking event loop concurrency model
- converting high level code to machine code will happen inside js engine
---
__Paradigm__:
1. an approach and mindset of structuring the code.
2. procedural
3. object oriented
4. functional programming
---
__prototype inheritance__:\
ex: how we can use 'push' method on array ?\
because the 'push' method is defined in "Array" prototype.\
prototype contains all the array methods, the array that we create inherits the blueprint.

---
__JS Engine__:
1. program that executes javascript code.
2. chrome's v8, firefox's spider monkey, safari's webkit engine
3. JS engine contains a CALL STACK and HEAP
4. CALL STACK is where our code is executed using EXECUTION CONTEXT
5. HEAP is unstructured memory pool that stored all objects that our application needs.
---
__JIT compilation__:\
Modern javascript is not just 'interpreted' language. It is 'JIT (just in time) compiled'
language. only thing is there is no portable file to be executed. execution immediately happens after compilation.
1. code enters JS engine
2. code gets parsed(read) in JS engine - code is parsed into a DATA STRUCTURE called AST (ABSTRACT SYNTAX TREE), syntax errors are checked here.
3. compilation phase: resulting tree from AST will be used to generate machine code.
4. execution phase
---
__JS Runtime__:
1. Its a container that contains all the functionalities that we use in engine.
2. Heart of any javascript RUNTIME is JS ENGINE
3. ex: console.log, webapis (fetch, DOM, timers)
4. Runtime contains:
   1. Engine
   2. WEB APIs (js gets access to these through global window object)
   3. CALLBACK QUEUE (click, timer)
5. 'Event Loop' takes 'callback functions' (ex: onclick) from 'callback QUEUE' and puts them in 'CALL STACK' so that it can be executed.
6. Different js runtimes exists (js runtime for browser, js runtime outside browser - node js runtime )

---
HOW JAVASCRIPT IS EXECUTED IN CALL STACK ?
1. creation of execution context
   1.  Global execution context is created (for top level code)
   2.  top-level-code is code that is NOT inside any function.
   3.  No matter how much large a javascript project is, there will be only ONE EXECUTION CONTEXT
2. execution of top level code
3. executed of functions and waiting for callbacks
4. For each and every function call, a new execution context will be created containing all necessary details to run that function,
5. same goes to methods(functions attached to objects).
6. 'Event loops' is the one which provides these 'new call back functions'

---
WHATS INSIDE EXECUTION CONTEXT ?
1. __variable environment__ : contains let, var,const, functions declaration, arguments objects (all args passed into the func that current execution context belong to - because each function gets its own execution context as soon as function is called).
2. __scope chain__ : consists references to those variables located outside current function
3. 'this' keyword\
__NOTE__: ARROW functions does have have (arguments object) and ('this' keyword)

---
CALL STACK
1. place where 'execution context' gets stacked on top of each other in order to keep track of where we are in the program's execution.
2. 'exection context' at the top of call stack is the one which is currently running
3. mainly maintains the order of execution
code runs inside 'execution stack' which is again inside 'call stack'

---
SCOPE AND SCOPE CHAIN : where do variables live? where can we access a variable ?\
__LEXICAL SCOPING__: coping is controlled by placement of functions and block in the code.\
'SCOPE' is the env/place where variable is declared.\
scope:
1. global scope
2. functional scope
3. block scope

scope chain vs call stack :
1. __scope-chain__: where variables live and how it can be acccessed
2. __call-stack__: in what order js code gets executed ?
---

__HOISTING__:
1. makes some types of variables accessible/usable in the code before they are actually declared
2. variables are scanned before its executed
3. HOISTING happens during 'creation' part of execution context.
4. for each variable, new property will be defined in 'variable environment'

---
* Importing and exporting
  ```javascript
    /*
        There are two types of exporting :
        1. default exporting
        2. names exporting

        There can be only one default export per file.
        There can as many number of named exports

        Default export can be imported by any name in other files.
        But Named exports has to be imported by same name it was exported with.
    */

    // default export syntax:
    export default app = props => { }

    // named export
    export const pi = 3.14;

    // Importing a default export
    import App from './app'

    // Importing a named export
    import { pi } from './maths'
    import { pi as py } from './maths' // importing with alias
  ```

* __ES-5 vs ES-6__
1. var vs let
2. IIFE vs Block encapsulation
3. Arrow functions
4. Destructuring (Array and Object)
5. Spread operator
6. Rest parameters
7. Default parameters in functions

* Functions in Javascript
  ```javascript
    function addTwoNum(arg1, arg2) {
        return arg1 + arg2;
    }
  ```
* Arrow function and Array.map method
  ```javascript
    const yob = [1963, 1991, 2000];
    let ages = yob.map(el => new Date().getFullYear() - el);
    console.log(ages);

    // Anonymous arrow function
    () => "this function is returned"

    () => {
        console.log("Multiple lines inside a block");
        console.log("doing other processing");
        return "this function is returned";
    }

    // Anonymous function with parameter
    (arg1, arg2) => {
        console.log("Multiple lines inside a block")
        "sum is ${arg1 + arg2}"
    }


    // utilising index of the element in map method
    let ages2 = yob.map((el, index) => {
        const now = new Date().getFullYear();
        const age = now - el;
        return `Age element ${index + 1}: ${age}.`
    });
  ```

* When NOT to use this key inside arrow functions:
  ```javascript
  const box6 = {
        color: 'green',
        position: 1,
        clickMe: function () {
            document.querySelector('.green')
                .addEventListener('click', () => {
                    var str = 'This is box number ' +
                        this.position + ' and it is '
                        + this.color;
                    console.log(str);
                });
        }
    }
    box6.clickMe();

    // this does not work in ES6:

    const box66 = {
        color: 'green',
        position: 1,
        clickMe: () => {
            document.querySelector('.green')
                .addEventListener('click', () => {
                    var str = 'This is box number ' +
                        this.position + ' and it is ' +
                        this.color;
                    console.log(str);
                });
        }
    }
    box66.clickMe();
  ```
* Destructuring
  ```javascript
  var john = ['John', 26];
    const [name, age] = ['John', 26];

    // destructuring on objects
    const obj = {
        firstName: 'John',
        lastName: 'Smith'
    };
    const {firstName, lastName} = obj;

    // destructuring and assigning values to custom variables
    const {firstName: a, lastName: b} = obj;
  ```

* List to array conversion
  ```javascript
    // ES5
    const boxes = document.querySelectorAll('.box');
    var boxesArr5 = Array.prototype.slice.call(boxes);
    // ES6
    const boxes = document.querySelectorAll('.box');
    const boxesArr6 = Array.from(boxes);"
  ```

* Spread operator
  ```javascript
    function addFourAges (a, b, c, d) {
        return a + b + c + d;
    }
    const sum3 = addFourAges(...ages);

    // MERGING TWO ARRAYS USING SPREAD OPERATOR:
    const familySmith = ['John', 'Jane', 'Mark'];
    const familyMiller = ['Mary', 'Bob', 'Ann'];
    const bigFamily = [...familySmith, 'Lily', ...familyMiller];
  ```

* Rest parameters
  ```javascript
    // NOTE:
    // rest parameters are used in FUNCTION ARGUMENTS
    // spread operators are used in FUNCTION CALL

    function isFullAge6(...years) {
        years.forEach(cur => console.log((2016 - cur) >= 18));
    }

    function isFullAge6(limit, ...years) {
        years.forEach(cur => console.log((2016 - cur) >= limit));
    }
    isFullAge6(16, 1990, 1999, 1965, 2016, 1987);
  ```

* default parameters
  ```javascript
    function person(name, yob = 1990) {
        this.name = name;
        this.yob = yob;
    }
    var john = new person('John');
  ```
---
* __OOPS in Javascript__:
1. class : define function
2. object : new FunctionName(args1, args1)
3. inheritance : extending Superclass
4. polymophism : decide at runtime what kind of Object to create
5. encapsulation : achieved through Closures

```javascript
// ES 5 class

// 1. creating a class
let Product = function(id, name, price){
    this.id = id;
    this.name = name;
    this.price = price;
}

// creating an object
let pen = new Product(12, 'pen', 23);

// defining class methods
Product.prototype.getInfo = function(){
    console.log(`id: ${this.id}, name: ${this.name}, price: ${this.price}`);
}

// inheritance
let EletronicProduct = function(id, name, price, isBatterOperated){
    Product.call(this, id, name, price);
    this.isBatterOperated = isBatterOperated;
}

// Method Borrowing
EletronicProduct.prototype = Object.create(Product.prototype);
EletronicProduct.prototype = new Product(); // alternate way of declaring

// function overriding
EletronicProduct.prototype.getInfo = function(){
    console.log(`id: ${this.id}, name: ${this.name}, price: ${this.price}, BatterOperated ? : ${this.isBatterOperated ? 'Yes' : 'No'}`);
}

// polymorphism : creating desired Object at run time
let mobile = new EletronicProduct(12, 'samsung', 230, true);
let pencil = new Product(45, 'Nataraja', 344);

// Encapsulation : achieved through closures
Product.prototype.getStoreInfo = function(){
    let outerFuncVariable = `This is bought from XYZ store \n ${this.getInfo()}`;
    return function(){
        console.log(outerFuncVariable);
    }
}

let pensilStoreInfo = pencil.getStoreInfo.call(pencil);
pensilStoreInfo();

let mobileStoreInfo = mobile.getStoreInfo.call(mobile);
mobileStoreInfo();
```
__ES-6 classes:__
```javascript
class Product{
    constructor(id, name, price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    getInfo(){
        console.log(`id: ${this.id}, name: ${this.name}, price: ${this.price}`);
    }
}

// inheritance
class NonElectronics extends Product{
    constructor(id, name, price, isHeavy){
        super(id, name, price);
        this.isHeavy = isHeavy;
        this.getInfo();
    }

    getInfo(){
        console.log(`non-electronics is ${this.name} and Its ${this.isHeavy ? 'a' : 'not a'} heavy object`);
    }
}

// inheritance
class ElectronicsProduct extends Product{
    constructor(id, name, price, isBatteryOperated){
        super(id, name, price);
        this.isBatteryOperated = isBatteryOperated;
        this.getInfo();
    }

    getInfo(){
        console.log(`electronics is ${this.name} and battery operated ? ${this.isBatteryOperated}`);
    }

    getDiscountInfo(){
        let fixedDiscount = 0.05; // encapsulated data
        let self = this;
        let discountingMsg = "Price after Applying discount: ";
        return function(){
            let discount = (self.price - (self.price - (self.price * fixedDiscount))).toFixed(2);
            console.log(`${discountingMsg} ${ discount }`);
        }
    }
}

// object
book = new Product(45, 'Mystic', 234);
book.getInfo();

// polymorphism
pencil = new NonElectronics(12, 'Nataraja', 23, false);
watch = new ElectronicsProduct(34, 'casio', 567, true);

// Encapsulation
watchDiscoutInfo = watch.getDiscountInfo();
watchDiscoutInfo();
```

* Slice and splice extensive examples:
  ```javascript
  //syntax :
  array.slice(startIndex, endIndex) // startIndex included, endIndex excluded
  array.splice(startIndex, numberOfElementsAfterStartIndex) // startIndex Included,

  const cart = [
      { id: 7235, name: 'pen', price: 23 },
      { id: 3563, name: 'ball', price: 435 },
      { id: 8394, name: 'chocolate', price: 345 },
      { id: 2093, name: 'pencil', price: 536 },
      { id: 2399, name: 'eraser', price: 465 },
      { id: 3589, name: 'geometry-box', price: 68 }
  ]

  const printItems = (cartToBePrinted) => {
      cartToBePrinted.forEach((item, index) => console.log(`item: ${item.name}, index: ${index}`));
  }

  // slice experiments
  // problem : place some item immediately after chocolate

  const newItem = { id: 5739, name: 'mobile', price: 1200 };

  // step-1: find index of chocolate item in cart array
  let chacolateIndex = cart.findIndex(item => item.name === 'chocolate'); // 2

  let untilChacolate = cart.slice(0, chacolateIndex); // excludes chocolate
  // console.log(untilChacolate);

  let untilIncludingChacolate = cart.slice(0, chacolateIndex + 1);
  // console.log(untilIncludingChacolate);

  let updatedCart = [...untilIncludingChacolate, newItem, ...cart.slice(chacolateIndex + 1, cart.length)];
  printItems(updatedCart);
  console.log('--------------------------------')

  // problem: Remove all elements AFTER chocolate(excluding chocolate)
  let copyOfCart = [...cart];
  let chocolateIndex = cart.findIndex(item => item.name === 'chocolate');
  // copyOfCart.splice(chocolateIndex + 1, copyOfCart.length);
  copyOfCart.splice(chocolateIndex + 1, 2);
  printItems(copyOfCart);
  ```

* Get static data from local/public folder of application and display it in html page using js
  ```html
  <script>
      fetch("./../data/react/redux-3.txt", {
          headers: {
              'Content-Type': 'text/plain',
              'Accept': 'text/plain'
          }
      })
          .then(content => content.text())
          .then(htmlContent => {
              htmlContent = htmlContent.replace(/</g, '&lt;');
              htmlContent = htmlContent.replace(/>/g, '&gt;');
              document.getElementById('pre-root').innerHTML = htmlContent;
          })
          .catch(err => {
              console.log('Error while fetching content from local file.');
          });
  </script>
  ```
* what is CORS issue ?
  ```javascript
  function search(query) {
      fetch(`https://javascript.info/search/?query=${query}&type=article`)
          .then(results => result.text())
          .then(htmlCode => document.querySelector('body').innerHTML = htmlCode)
          .catch(error => {
              document.querySelector('body').innerHTML = error;
          });
  }
  ```
## Sorting
* Bubble sort - O(n^2)
  ```javascript
    for (let i = 0; i < arrayLength; i++) {
        for (let j = 0; j < arrayLength - i - 1; j++) {
            if(arr[j] > arr[j+1]){
                swap(a[j], a[j+1]);
            }
        }
    }
  ```
* Selection sort - O(n^2)
  ```javascript
    for (let i = 0; i < arrayLength-1; i++) {
        let indexOfMin = i;
        for (let j = (i+1); j < arrayLength; j++) {
            if (a[j] < a[indexOfMin]){
                indexOfMin = j;
            }
        }
    }
  ```
* Merge Sort- O(nLogn)
  ```javascript
    // merge method to combine already sorted two arrays
    // shift method removes first element and returns it
    const merge = (arr1, arr2) => {
        let sorted = [];
        while (arr1.length && arr2.length) {
            if (arr1[0] < arr2[0]){
                sorted.push(arr1.shift());
            }else{
                sorted.push(arr2.shift());
            }
        };
        return sorted.concat(arr1.slice().concat(arr2.slice()));
    };

    // function to recursively break down the array into two halves
    const mergeSort = arr => {
        if (arr.length <= 1) return arr;
        let mid = Math.floor(arr.length / 2);
        let left = mergeSort(arr.slice(0, mid));
        let right = mergeSort(arr.slice(mid));
        return merge(left, right);
    };

    let unsortedArr = [38, 27, 43, 3, 9, 82, 10]
    console.log(mergeSort(unsortedArr));
  ```

## Data structures

* Singly Linkedlist implementation & detecting loop
  Detecting loop
  Using tortoise and hare algorithm
  ```javascript
    class Node {
        constructor(value, next) {
            this.value = value
            this.next = next
        }
    }

    class LinkedList {
        constructor() {
            this.head = null
            this.length = 0
        }

        insertAtHead(data) {
            const newNode = new Node(data, this.head)
            this.head = newNode
            this.length++
        }

        getByIndex(index) {
            if (index < 0 || index >= this.length) return null

            let current = this.head
            for (let i = 0; i < index; i++) {
                current = current.next
            }
            return current
        }

        removeHead() {
            this.head = this.head.next
            this.length--
        }

        insertAtIndex(index, value) {
            if (index === 0) return this.insertAtHead(value)

            const prev = this.getByIndex(index - 1)
            if (prev == null) return null

            prev.next = new Node(value, prev.next)
            this.length++
        }

        removeAtIndex(index) {
            if (index === 0) return this.removeHead()

            const prev = this.getByIndex(index - 1)
            if (prev == null) return null

            prev.next = prev.next.next
            this.length--
        }

        print() {
            let output = ''
            let current = this.head
            while (current) {
                output = `${output}${current.value} -> `
                current = current.next
            }
            console.log(`${output}null`)
        }

        detectLoop(node = this.head) {
            let temp = node;
            let nodeNextValues = [];
            while (temp.next) {
                if (nodeNextValues.includes(temp.next)) {
                    return { found: true, detectedAt: temp.value };
                }
                nodeNextValues.push(temp);
                temp = temp.next;
            }
            return { found: false, detectedAt: null };
        }

        hasCycle(head = this.head) {
            let slow = head;
            let fast = head;
            while (fast && fast.next) {
                fast = fast.next.next;
                slow = slow.next;
                // two pointers meet, cycle
                if (fast === slow) {
                    return true;
                }
            }
            return false;
        }
    }

    LinkedList.fromValues = function (...values) {
        const ll = new LinkedList()
        for (let i = values.length - 1; i >= 0; i--) {
            ll.insertAtHead(values[i])
        }
        return ll;
    }

    module.exports = LinkedList
  ```
* Find middle node value in Linkedlist - slow & fast pointers
  ```javascript
    findMiddle(){
        let slowPointer = this.head;
        let fastPointer = this.head;
        while (fastPointer && fastPointer.next) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer.value;
    }
  ```
* Stack Implementation in Javascript
  ```javascript
    class Stack {
        constructor() {
            this.items = [];
            this.top = null;
        }

        push(element) {
            this.items.push(element);
            this.top = element;
        }

        pop() {
            if (this.items.length != 0) {
                if (this.items.length == 1) {
                    this.top = null;
                    return this.items.pop();
                } else {
                    this.top = this.items[this.items.length - 2];
                    return this.items.pop();
                }
            } else
                return null;
        }

        getTop = () => {
            if (this.items.length == 0) return null;
            return this.top;
        }
        isEmpty = () => this.items.length === 0;
        size = () => this.items.length;
    }
  ```
* Check If bracets are balanced (using stack)

  Solution-1
  ```javascript
    function isBalanced(exp) {
        var myStack = new Stack();
        for (var i = 0; i < exp.length; i++) {
            //For every closing parenthesis check for its opening parenthesis in stack
            if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
                if (myStack.isEmpty()) return false;
                let output = myStack.pop();
                //If you can't find the opening parentheses for any closing one then returns false.
                if (((exp[i] == "}") && (output != "{")) || ((exp[i] == ")") && (output != "(")) || ((exp[i] == "]") && (output != "["))) {
                    return false;
                }
            } else {
                //For each opening parentheses, push it into stack
                myStack.push(exp[i]);
            }

        }
        //after complete traversal of string exp, if there's any opening parentheses left
        //in stack then also return false.
        if (!(myStack.isEmpty())) return false;
        return true; // when its balanced
    }
  ```
  Solution-2
  ```javascript
    let isParenthesisMatching = (str) => {
        let stack = [];

        let open = {
            '{': '}',
            '[': ']',
            '(': ')'
        };

        let closed = {
            '}': true,
            ']': true,
            ')': true
        }

        for (let i = 0; i < str.length; i++) {
            let char = str[i];
            if (open[char]) {
                stack.push(char);
            } else if (closed[char]) {
                if (open[stack.pop()] !== char) return false;
            }
        }
        return stack.length === 0;
    }

    let testString = "({(()))}}";
    console.log(isParenthesisMatching(testString));
  ```
* queue Implementation using javascript
  ```javascript
    class Queue {
        constructor() {
            this.items = [];
            this.front = null;
            this.back = null;
        }

        enqueue(element) {
            this.items.push(element);
        }

        dequeue() {
            if (this.items.length === 0) return null;
            return this.items.shift();
        }

        getFront() {
            if (this.items.length != 0) return this.items[0];
            return null;
        }

        isEmpty = () => this.items.length === 0;
        size = () => this.items.length;
    }
  ```
* Factorial using recursion
  ```javascript
    function factorial(x) {
        if (x === 0) return 1;
        return x * factorial(x - 1);
    }
  ```
* Fibonacci series by recursion
  ```javascript
    function fibonacci(num) {
        if (num == 1)
            return 0;
        if (num == 2)
            return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
  ```
* Binary Search Implementation (BST) Implementation
  ```javascript
    class Node {
        constructor(val) {
            this.val = val;
            this.right = null;
            this.left = null;
            this.count = 0;
        };
    };

    class BST {
        constructor() {
            this.root = null;
        }

        create(val) {
            const newNode = new Node(val);
            if (!this.root) {
                this.root = newNode;
                return this;
            };
            let current = this.root;

            const addSide = side => {
                if (!current[side]) {
                    current[side] = newNode;
                    return this;
                };
                current = current[side];
            };

            while (true) {
                if (val === current.val) {
                    current.count++;
                    return this;
                };
                if (val < current.val) addSide('left');
                else addSide('right');
            };
        };

        find(val) {
            if (!this.root) return undefined;
            let current = this.root,
                found = false;

            while (current && !found) {
                if (val < current.val) current = current.left;
                else if (val > current.val) current = current.right;
                else found = true;
            };

            if (!found) return 'Nothing Found!';
            return current;
        };

        BFS(start) {
            let data = [],
                queue = [],
                current = start ? this.find(start) : this.root;

            queue.push(current);
            while (queue.length) {
                current = queue.shift();
                data.push(current.val);

                if (current.left) queue.push(current.left);
                if (current.right) queue.push(current.right);
            };

            return data;
        }

        delete(val) {
            if (!this.root) return undefined;
            let current = this.root,
                parent;

            const pickSide = side => {
                if (!current[side]) return 'No node found!';
                parent = current;
                current = current[side];
            };

            const deleteNode = side => {
                if (current.val === val && current.count > 1) current.count--;
                else if (current.val === val) {
                    const children = this.BFS(current.val);
                    parent[side] = null;
                    children.splice(0, 1);
                    children.forEach(child => this.create(child));
                };
            };

            while (current.val !== val) {
                if (val < current.val) {
                    pickSide('left');
                    deleteNode('left');
                }else {
                    pickSide('right');
                    deleteNode('right');
                };
            };

            return current;
        }
    };

    let tree = new BST();
    tree.add(10);
    tree.add(4);
    tree.add(4);
    tree.add(12);
    tree.add(2);
    console.log(tree);
  ```
* Multiply two integers using recursion
  ```javascript
    function multiply(a, b){
        if (b === 0) return 0;
        if (b > 0) return(a + multiply(a, b-1));
        if (b < 0) return (-multiply(a, b));
        return -1;
    }
  ```

## Credits:
* [Google](https://www.google.com)
* [jonas schmedtmann](https://www.udemy.com/course/the-complete-javascript-course/)
* [Maximilian Schwarzmüller](https://www.udemy.com/course/nodejs-the-complete-guide/)
* [Various Medium articles](https://medium.com/)
* [Amanda Fawcett](https://www.educative.io/blog/javascript-data-structures)
* [Geeks for geeks](https://www.geeksforgeeks.org/)
* [stackoverflow](https://stackoverflow.com/)
* [DS Guy](https://www.udemy.com/course/draft/1330262/learn/)
* [DigitalOcean community tutorials](https://www.digitalocean.com/community/tutorials)
* Akshay Saini, [namaste-javascript](https://www.youtube.com/channel/UC3N9i_KvKZYP4F84FPIzgPQ)
* [David walsh](https://davidwalsh.name/javascript-debounce-function)

## PDF Resources:
1. [JavaScript Notes For Professionals](https://drive.google.com/file/d/1ZS3gC96zutBRucn5chQnOxT-Sl4SnINX/view?usp=sharing)
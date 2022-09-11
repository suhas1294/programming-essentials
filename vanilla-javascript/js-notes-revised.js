/* 
data types:
Number, string, boolean
undefined, null, 
Symbol (ES2015) - values in unique and cannot be changed
BigInt (ES 2020)

JS Supports Dynamic typing.: we do not have to manually defined data type of values shored in variable.
(value has type, not variable)

If you do not specify any data type, then your variable will be considered as global variable.
ex: lastname = "mysore"

Note : (typeof null) is an (object) which is wrong but maintained for legacy reasons.
Note : (typeof NaN) is an (number) which is wrong but maintained for legacy reasons.

-----------
operators
operator precedence : check mdn table in this link
https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Operator_Precedence

Type conversion : manually convert from one type to another. Number('23'), String(23), Boolean('')
Type coerercion: js automatically converts behind the screens , let a = "i am " + 23 + " yrs old"
more examples of coerercion : console.log('23' - '10' - 3) converts and gives proper results

most weired examples :
let n = '1' + 1; // '11'
n = n - 1 ; // 10

6 falsy values : 0, '', undefined, null, NaN, false

-----------

versioning -
es5 = 2009
es6 = es2015 = 2015

----------

*/

// function declation
function caclAge(birthYear){
    return 2045 - birthYear;
}

// function expression AKA anonymous function, expression produces value
const doThat = function () {
     
}
const calcAge2 = function (birthYear) {
    return 2045 - birthYear;
}

/* what is major difference b/w function expression and function declation ?
we can call function declarations  before they are defined in code
when to use which one ? - personal preference

Arrow functions do not have this keyword.


Objects can contain only function expression not function declaration.
 */

const person = {
    fistName : 'bla bla',
    lastName : "somethinf",
    birthYear: 1993,
    job : 'coder',
    friends: ['a', 'b', 'c'],
    isMarried: false,
    calcAge: function (){ // this keyword refer to person object itself, do console.log(this)
        this.age = new Date().getFullYear - this.birthYear; // usage of key word inside object
        // also we added new property to obj by calling this function.
        return this.age;  // optional
    }
}

person.calcAge()

// console statements
console.log('')
console.warn('')
console.error('')
console.table(/* some obj */)

/* DOM : structured representation of HTML Document, allows JS to access 
html elements and styles to manipulate them
DOM is created by browser as soon as HTML loads
From HTML file, DOM tree is created by browser, 'document' is the root of DOM tree. 
thats why we say document.queryselector('bla')

DOM and DOM methods are part of web apis , they dont have any relation with JS
Web apis are like libraries browser implement and we can access those apis from JS code.
Those webapis are automatically available for JS, so we dont need to import them explicitly.

There is official DOM specification that browser implement, thats why they behave same in all browsers

Ex web apis :  timer, fetch etc
*/


document.querySelector('.someClassName')
document.querySelectorAll('.someClassName')
document
.querySelector('.someClassName')
.addEventListener('click', function(){ console.log('clicked'); })
document.querySelector('.someClassName').classList.toggle('hidden')

// handling esc key press from keyboard
document.addEventListener('keydown', (event) => {
    if(event.key === 'Escape') console.log('esc pressed');
})


/* 
JS is :

    high level
    garbage collected
    interpreted or just in compile
    multi paradigm :  approach of structuring the code, 3 types
        procedural
        object oriented
        functional programming
    prototype based object oriented
        almost everything in JS is object except some primitives like numbers,strings
    first class function
    dynamic : let x = 23, z = "test"
    single threaded
    non blocking event loop


JS Engine: Its just a program that executes JS code
ANy Engine  contains these two things:
    1. call stack - our code is executed here with something called execution context
    2. heap - where objects are stored

Compilation - read and convert the src code to binary at once.
Interpretation - read and convert the src code into binary line by line
JIT - mix of compilation and interpretation, but like compilation, we dont have a intermediate bycode file which gets executed.

When piece of js enters engine, 
    s1 - its parsed. (read the code) into AST (Abstract syntax tree), syntax will be checked.
    The resulting tree will be later used to generate machine code

    s2 - compilation - generated AST will be compiled into machine code.

    s3 - execution (happens in call stack)

JS runtime :  container which includes everything thats needed to run our code.
heart of any js runtime is js engine.
SO, JS runtime includes 
    Engine, 
    Web apis - dom, timers, fetch api etc
    callback queue - contains all callback functions ready to be executed. ex : click

    When callstack (in engine) is empty, cb fn from calback queue to transfered to callstack and executed.
    This is managed by event loop.

    run time can be any of following : 
    1. browser
    2. non browser (nodejs)

How JS is executed.
1. Our code is compiled tp machine code and is ready.
2. Global execution context is created for TOP level code. (code outside func is called top level code)
3. No matter how big project is,  there will be only one execution context
4. Execution of top level code.
5. execution of functions and waiting for callbacks.
6. For each and every function call, a new execution context will be created containing necessary info.
    whats inside execution context ? : 
        1. variable environment, which contains:
            1. let, const, var variables
            2. functions
            3. arguments object (special object)
        2. scope chain
        3. this keyword.
    All above things inside execution context is generated during creation phase right before execution.
    NOTE : arrow functions does not have arguments and this keyword.

Scope and Scope chain: (each execution context has a variable env, scope chain and this keyword)
now lets see scope chain here.

Scoping :where do variables live ? (how its organized and accessed)
    Lexical scoping : scoping is controlled by placement of functions and blocks in code. (closure)
    scope : 
        global scope : top level code variables
        function scope AKA local scope, Note : var variable is function scoped not Blocked scope.
        block scope (es6 onwards):

        Functions are also block scoped  only inside strict mode.
    
*/

function first(){
    const age = 23;
    console.log(`i can't access millenial before its defined!! ${millenial}`); // undefined
    if(age > 13){
        var millenial = true; // variable declared with var keyword is function scoped and block scoped
    }
    function second(){
        console.log(`I can access millenial keyword, is millenial ? : ${millenial}`)
    }
    second();
}

// Functions are also block scoped  only inside strict mode. demo :
// disable strict mode
function first(someCondition) {
    if(someCondition){
        function add(a, b){
            return a + b;
        }
    }
    console.log(add(2,3)); // will print 5 when no strict mode, reference error when strict mode enabled
}

/* 

Hoisting and TDZ (temporal dead zone)

We already took a look about what execution context contains : 1.var env, 2. scope chain 3.this keyword
now, lets see variable environment.

hoisting : makes some types of variables accessible/usable in the code before they are actually declared.
"variables lifted to top of their scope"

*/

// TDZ demo

const PI = 3.14

if(PI < 5){
    console.log(`pi value is ${PI_SENTENCE}`); // here PI_SENTENCE will be in TDZ, throws reference error-not initialized
    const PI_SENTENCE = 'three point one four'
}

/* 

Hoisting can be classified for:
function declaration - works perfectly fine.
var - we will get 'undefined'
variables declared using let and const - those variables will be in TDZ
function expression and arrow function - depends on whether its declared using var / let/ const
variables declared with var keyword will be there as key in window object.

this keyword : 
its a special keyword created for every execution context.
 */

// swapping
[first, second] = [second, first]

// object destructuring - overriding values
let a = 999
let b = 111
const obj = {a: 333, b: 444}
// {a, b} = obj // gives error
({a, b} = obj) //  overriding values 

// destructuring nested object
const store = {
    timings: {
        start: 1300,
        end: 1400
    }
}

const { timings: {start, end: close} } = store
console.log(start, close);

// iterables : arrays, strings , maps, sets but not objects

// rest pattern:
const arr = [1,2,3,4,5]
const [a1,b1, ...others] = arr // here if three dots are there on left side of assignment operators,
// it works as rest parameters instead of spread operator. so other will be [3,4,5]

// rest parameters
const add = function (...numbers) {
    console.log(numbers);
    let sum = 0;
    numbers.forEach(no => {
        sum += no;
    });
    return sum;
}
add(1,2,3,4,5,6)
add(...arr)

// nullish coalescing operator
// ?? values just work like ||  but it will work only when somekwy value is null or undefined only.
const value = someobj.somekey ?? 10

/* 
how DOM works
DOM is just interface between JS and browser 
*/

console.log(document.documentElement);
console.log(document.head);
console.log(document.body);
document.getElementsByTagName('button')

const cookieElement = document.createElement('div')
cookieElement.classList.add('.cookie-msg')
cookieElement.innerHTML = 'We bla bla bla <button class="something">Got it !</button>'
document.querySelector('.footer').prepend(cookieElement);
document.querySelector('.footer').prepend(cookieElement.cloneNode(true));
document.querySelector('.footer').before(cookieElement)
document.querySelector('.footer').after(cookieElement)

document.querySelector('.btn-cookie').addEventListener('click', () => cookieElement.remove())
// in legacy code : 
document.querySelector('.btn-cookie').addEventListener('click', cookieElement.parentElement.removeChild(cookieElement));

getComputedStyle(cookieElement).color

// custom property
// css variables
/* 
// In css file
:root{
    --color-primary: red;
    --color-secondary: green;
}
 */
document.documentElement.style.setProperty('--color-primary', 'orange')

{/* <img src="logo.png" class='nav__logo' customAttr="myValue" /> */}
document.querySelector('.nav__logo').getAttribute('customAttr')
document.querySelector('.nav__logo').setAttribute('newAttr', 'somethng')

// custom data attribute : pascal case
{/* <img src="logo.png" class='nav__logo' data-version-number='3.0' /> */}
document.querySelector('.nav__logo').dataset.versionNumber

// DONOT user - it will override all class names for that element
document.querySelector('.nav__logo').className = 'whatever'

// get coordinates of an element
const element = document.querySelector('.something')
element.getBoundingClientRect();
// get current scroll position in the view port.
console.log(window.pageXOffset)
console.log(window.pageYOffset)
// height and width of viewport
console.log(document.documentElement.clientHeight)
console.log(document.documentElement.clientWidth)

// scroll to a particular section:
document.querySelector('.btn-submit').addEventListener('click', () => {
    const sectionOne = document.getElementById('nothing');
    const sectionCordinates = sectionOne
})

// bigInt data type;
const someBigNo = 8392647635767923969273274987583783753094535n;
const someBigNo2 = BigInt(8392647635767923969273274987583783753094535);

// Internationalization
console.log(new Intl.DateTimeFormat('en-US').format(new Date()));
// google for iso language code table to get list of all local strings

// settimeout
setTimeout((ing1, ing2) => {
    console.log(`here is your pizza with ${ing1} and ${ing2}`);
}, 3000, 'spinach', 'pineapple');


// illustaration of getBoundingClientRect() and pageYOffset

// <!DOCTYPE html>
// <html lang="en">
// <head>
//     <meta charset="UTF-8">
//     <meta http-equiv="X-UA-Compatible" content="IE=edge">
//     <meta name="viewport" content="width=device-width, initial-scale=1.0">
//     <title>Document</title>
// </head>
// <style>
//     .heightmed{
//         height: 250px;
//     }
//     #root{
//         max-width: 50vw;
//         position: fixed;
//         top: 0;
//         right: 0;
//         border: 1px solid red;
//         padding: 0;
//         margin: 5px;
//     }
//     p{
//         /* font-size: 1.5rem; */
//         max-width: 50vw;
//         color: orangered;
//     }
//     .special{
//         border: 2px solid cyan;
//     }
// </style>
// <body>
//     <div id="root">
//         <h2></h2>
//         <p></p>
//     </div>
//     <h1 id="dyid1">this is a test msg - 1</h1>
//     <div class="heightmed"></div>
//     <h1 id="dyid2">this is a test msg - 2</h1>
//     <div class="heightmed"></div>
//     <h1 id="dyid3">this is a test msg - 3</h1>
//     <div class="heightmed"></div>
//     <h1 id="dyid4">this is a test msg - 4</h1>
//     <div class="heightmed"></div>
//     <h1 id="dyid5">this is a test msg - 5</h1>
//     <div class="heightmed"></div>
//     <h1 id="dyid6">this is a test msg - 6</h1>
//     <div class="heightmed"></div>
//     <h1 id="dyid7">this is a test msg - 7</h1>
//     <div class="heightmed"></div>
//     <h1 id="dyid8">this is a test msg - 8</h1>
//     <div class="heightmed"></div>
//     <h1 id="dyid9">this is a test msg - 9</h1>
//     <div class="heightmed"></div>
//     <h1 id="dyid10" class="special">this is a test msg - 10</h1>
//     <div class="heightmed"></div>
//     <h1 id="dyid11">this is a test msg - 11</h1>
//     <div class="heightmed"></div>
//     <h1 id="dyid12">this is a test msg - 12</h1>
//     <div class="heightmed"></div>
// </body>
// <script>
//     function printscroll(){
//         const scrolledUntil = window.pageYOffset.toFixed(2); // ಎಲ್ಲಿಯವರೆಗೆ ಸ್ಕ್ರಾಲ್ ಮಾಡಿದ್ದಿಯ 
//         const scrolledUntilOld = window.scrollY // old way of doing it. 
//         document.querySelector('div#root>h2').innerHTML = `you have scrolled ${scrolledUntil} px`
        
//         const sectionDetails = document.querySelector('h1.special').getBoundingClientRect() // relative height of an element from visible view port
//         document.querySelector('div#root>p').innerHTML = JSON.stringify(sectionDetails, null, 2)
//     }
//     window.addEventListener('scroll', printscroll)

// </script>
// </html>

// alternate way (modern) of scrolling into a section smoothly:
document.querySelector('.someSection').scrollIntoView({behavior: 'smooth'})

// dimensions of viewport available for the content  (excludes scrollbar)
document.documentElement.clientHeight
document.documentElement.clientWidth


// event.target : gives target element where event originated
// event.currentTarget : gives element where currently event is being propogated. it can even be parent of actual element where event occured.

// 'this' inside event listner points to event.currentTarget

// stop propogation
// event.stopPropagation

// by default even bubbling is captured by event listners, where as event capturing which happens before 
// event bubbling, is not activated by default, to activate it pass third parameter true for event listner. ex:

document.querySelector('.something').addEventListener('click', () => {}, true)

// event delegation

// ... continued

/* 

how do we impliment prototype in js ?
there are 3 ways:
1. constructor functions
2. es6 classes
3. objects.create() function
 */

Promise.any
Promise.all
Promise.race
Promise.allSettled

// https://www.udemy.com/course/the-complete-javascript-course/learn/lecture/22649501#overview

// we add '!' to say ts compiler that we are 100 % gurantee that right side expression will never yield null
// Suhas@Udemy7
const inputTxt = document.getElementById("test")!;

// typecasting
const inputTxt2 = document.getElementById("test")! as HTMLInputElement;

function add(num1: number, num2: number) {
    return num1 + num2;
}

// --------- data types start ---------------

/* 
javascript inbuilt types:

number
string
boolean

objects
arrays
tuple
enum
any

undefined

javascript is dynamically typed BUT typescript is statically typed

The core primitive types in TypeScript are all lowercase!

 */

// type inference
const userInput = 1; // here i need not explicitly declare that userINput is a number.
const userINput2: number = 34; // however we can initialize it explicitly which is useless.

// But its good practice to explicitly declare type when variable not initialized;
let age: number;

// in js following code was possible, But in ts, its not possible, compiler wil throw error
/* let name1 = "john doe"
name1 = 34; */

// object type
const person: object = {
    name: "skbfhbsg",
    age: 23,
};

// console.log(person.nickName) //  will throw error
// console.log(person.name) //  even this will throw error sice ts just knows that person is an object type, but ts does not know if a particular key is present or not.

// above code is same as :
const person2: {
    name: string;
    age: number;
} = {
    name: "skdbjfsb",
    age: 34,
};

// for nested objects:

const product = {
    id: "abc1",
    price: 12.99,
    tags: ["great-offer", "hot-and-new"],
    details: {
        title: "Red Carpet",
        description: "A great carpet - almost brand-new!",
    },
};

/* 

{
    id: string;
    price: number;
    tags: string[];
    details: {
        title: string;
        description: string;
    }
} 

*/

// array data type:

let activities: string[];
activities = ["hike", "play"];
// activities = ['hike', 'play', 2]; // fails, workaround: let activities: any[]

// tuples ; [1, '2']
// first number is always numeric identifier, second element is always of string type

const per: {
    name: string;
    role: [number, string];
} = {
    name: "john doe",
    role: [2, "admin"], // tuple example
};

// Enums
enum Role {
    ADMIN,
    READ_ONLY,
    EDITOR,
}
// enum Role { ADMIN = 5, READ_ONLY, EDITOR }
// enum Role { ADMIN = 'ADMIN', READ_ONLY = 100, EDITOR }

const exPer = {
    name: "john",
    role: Role.EDITOR,
};

// union types
function combine(input1: number | string, input2: number | string) {
    let result;
    if (typeof input1 === "number" && typeof input2 == "number") {
        return input1 + input2;
    } else {
        result = input1.toString() + input2.toString;
    }
    return result;
}

// literal types
function combine2(
    input1: number | string,
    input2: number | string,
    opFormat: "as-number" | "as-text"       // literal type
) {
    let result;
    if (typeof input1 === "number" && typeof input2 == "number") {
        return input1 + input2;
    } else {
        if (opFormat === 'as-number') return +input1 + +input2;
        result = input1.toString() + input2.toString;
    }
    return result;
}


// aliases , typically used with union types

type numStr = number | string
type convDesc = "as-number" | "as-text"

function combine3(
    input1: numStr,
    input2: numStr,
    opFormat: convDesc
) {
    let result;
    if (typeof input1 === "number" && typeof input2 == "number") {
        return input1 + input2;
    } else {
        if (opFormat === 'as-number') return +input1 + +input2;
        result = input1.toString() + input2.toString;
    }
    return result;
}

type User = { name: string; age: number };
const u1: User = { name: 'Max', age: 30 }; // this works!
function isOlder(user: User, checkAge: number) {
    return checkAge > user.age;
}

// undefined, Function type
let unknown: undefined
let unknownFn: Function

// function return type and and void.
let someFn: (a: number, b: number) => number
function iAlwaysReturnONLYNumber(): number {
    return -1;
}
someFn = iAlwaysReturnONLYNumber;
// someFn = combine; // will throw error
// someFn = combine2; // throws error

function addAndHandle(num1: number, num2: number, cb: (num: number) => void) {
    const result = num1 + num2;
    cb(result);
}

addAndHandle(10, 20, (inputNo) => {
    console.log(inputNo);
    return inputNo; // although value returned here, it wont be ignored in 'addAndHandle' function since we are saying cb returns void.
})

// unknwon type
let specialCase: unknown // almost same as any
let specialCaseAny: any // almost same as any

let blabla: string;
// blabla = specialCase;    // does not work
blabla = specialCaseAny; // works

// unknown is bit more restricted then any type

// never type - function willl never return anything
function genErr(msg: string, code: number): never {
    throw { message: `error msg: ${msg}`, errorCode: code }
}

genErr("invalid input", 401);

// TODO: what is difference between
let myType3: number | string
type myType2 = number | String

// --------- data types end ---------------

/* typescript in watch mode (hot reload)
tsc filename.ts --watch
tsc filename.ts -w
tsc --init // it creates tsconfig file
tsc // just tsc command to compile the whole project
tsc -w // whole project is watched.
*/

// default included libraries in tsconfig:
/* lib: [
    "dom",
    "es6",
    "dom.iterable",
    "scripthost"
] */


// working with source maps : helps in debugging and development
// if you want to see .ts files in source tab in dev tools, then sourceMap should be true
// outdir : './dist' // to specify wheren compiled js files should be present

//  noEmitOnError : even if there is a single compilation error in  one file, other files wont be compiled

// apart from debugging through dev tools, we can debug in vs code itself
// sourceMap enable + install "debugger for chrome" extension in VS code + add break points

/* 
resources for knowing debugging and tsconfig.
tsconfig Docs: https://www.typescriptlang.org/docs/handbook/tsconfig-json.html
Compiler Config Docs: https://www.typescriptlang.org/docs/handbook/compiler-options.html
VS Code TS Debugging: https://code.visualstudio.com/docs/typescript/typescript-debugging 
*/

// next gen js and ts

// vanilla js way of writing
// const printMsg = (output) => console.log(`hey ! ${output}`)

const printOutput: (a: number | string) => void = output => console.log(`hey ! ${output}`)
printOutput('meow !')

// default arguments has to be last in the list of parameters
// const sumTwoNum: (a: number, b: number = 2) => number = (a, b) => a + b; // WRONG
const sumTwoNum: (a: number, b: number) => number = (a, b = 2) => a + b; // RIGHT
const sumTwoNum2 = (a: number, b: number = 2) => a + b // RIGHT
const printOutput2: (a: number | string) => void = (output = 'john doe') => console.log(`hey ! ${output}`)


// OOPS

class Department {
    name: string

    constructor(name: string) {
        this.name = name;
    }

    describe(this: Department) { // ts feature
        console.log(`Dept name is ${this.name}`);
    }
}

const finance = new Department('finance');
finance.describe();

// lets say we share method : 
const fDept = { describe: finance.describe }
// fDept.describe();           // shows error since we have defined describe method requires 'this' keyword

// But this works since the object schema matches with that of class object
const fDept2 = { name: 'funding', describe: finance.describe }
fDept2.describe();


// modifiers
class Department2 {
    public name: string
    private id: string

    constructor(id: string, name: string) {
        this.name = name;
        this.id = id;
    }

    describe(this: Department2) { // ts feature
        console.log(`Dept name is ${this.name} wit id : ${this.id}`);
    }
}


// short way of initializing fields and readonly field
class Department3 {
    private employees: string[]

    // readonly field can be initialized only once
    constructor(private readonly id: string, public name: string) {
        this.name = name;
        this.id = id;
    }

    // getters and setters
    // while accessing : new Department3("whatever", "somename").lastEmployeeJoined - here 
    // we dont use paranthesis
    public get lastEmployeeJoined(): string {
        if (this.employees.length > 0) {
            return this.employees[0];
        }
        throw new Error("No Employees found")
    }

    // while calling the setter, we call it like: new Department3("whatever", "somename").lastEmployeeJoined
    set lastEmployeeJoined(value: string) {
        if (value) {
            this.employees.push(value);
            return;
        }
        throw new Error("enter valid value")
    }


    describe(this: Department3) { // ts feature
        console.log(`Dept name is ${this.name} wit id : ${this.id}`);
    }

    addEmployess(employeeName: string) {
        // some validation steps
        this.employees.push(employeeName);
    }
}


// inheritance
// overriding properties and protected modifier
// getters and setters

/*
abstract classes
functions can be made abstract
properties can be made abstract
in either of the cases, class has to be made abstract.
abstract classes cant be instantiated.


singleton and private constructors

 */


//  Interfaces : in simple words : Describes structure of an object

/* 
interface can 'extend' multiple other interfaces(this was not possible in classes)

type addFN = (a: number, b: number) => number;
let add2Num: addFN;
add2Num = (n1: number, n2: number) => (n1 + n2);

same thing can be done using interface :

interface addFN {
    (a: number, b: number): number; // we are not adding a method name, its anonymous func.
}
let add2Num: addFN;
add2Num = (n1: number, n2: number) => (n1 + n2);

 */

// optional Property
interface Greetable {
    someProperty?: string
    otherProperty: string
}

class NewPerson implements Greetable {
    otherProperty: string;
    constructor(protected readonly name: string, op?: string) {
        this.name = name;
        if (op) {
            this.otherProperty = op;
        }
    }
}

/* 
Intersection types
type guards
discriminated unions
type casting
index properties
function overloading
*/

/* 
type guards:

1. typeof (only works with native js types - number, string, object, boolean)
2. instanceof (only works with classes)
3. if ('propertyName' in object) { // ... }
4. discriminated unions (works with object types)

interface Bird{
    type: 'bird';           // observe - this is a string literal, not a property in interface
    flyingSpeed: number;
}
*/

// Generics
function merge<T extends object, U extends object>(obj1: T, obj2: U) {
    return Object.assign(obj1, obj2);
}
const mergeResult = merge({ name: 'john' }, { age: 23 }); // result will be of type T & U (T intersection U)
// and hence we can access name property
const dispName = mergeResult.name;

// but we could not have this worked with below code:
/* 
function merge(obj1: object, obj2: object) {
    return Object.assign(obj1, obj2);
}
const mergeResult = merge({ name: 'john' }, { age: 23 }); // result will be of type object & object (object intersection object)
// and hence we can not access name property
const dispName = mergeResult.name;
 */

interface Lengthy {
    length: number
}

// returns a tuple
function countAndDescribr<T extends Lengthy>(element: T): [T, string] {
    let description = 'Got no values !'
    if (element.length === 1) {
        description = 'Got 1 value'
    } else (element.length > 1){
        description = `got ${element.length} values`
    }
    return [element, description];
}


function extractAndConvert<T extends object, U extends keyof T>(obj: T, key: U) {
    return `value is ${obj[key]}`
}
extractAndConvert({ name: 'something' }, 'name')
// extractAndConvert({}, 'name') // will throw error


//  generic classes

// partial generic type
interface CourseGoal {
    name: string;
    desc: string;
    completetionDate: Date;
}

function createCourseoal(title: string, desc: string, date: Date): CourseGoal {
    // let result: CourseGoal = {}; // will throw error
    let result: Partial<CourseGoal> = {};
    result.name = 'something';
    // some validation
    result.desc = 'bla bla'
    // some validation
    result.completetionDate = new Date();
    // return result; // will throw error
    return result as CourseGoal; // will type cast and return
}

// readonly generic type
const names: Readonly<String[]> = ['john', 'doe']
// names.push('newperson'); // ts will show error
// names.pop(); // ts will show error


// Decorators - Meta programming
/* 
writing code that is easy to use by other developers
its a function that you apply to something, that something is typically a class
decorators are executed when class is defined and when instantiated
 */

function Logger(target: Function) {
    console.log('logging...');
    console.log(target);
}

@Logger
class Person3 { // ignore warning
    name: string = "john doe"
    constructor() {
        console.log(`my name is ${this.name}`)
    }
}

// -------- another example -----
function withTemplate(template: string, hookId: string) {
    // return function(_: any){ // ignore constructor
    return function (constructor: any) {
        const targetElement = document.querySelector(hookId);
        const person = new constructor();
        if (targetElement) {
            targetElement.innerHTML = template;
            targetElement.querySelector('h1')!.textContent = person.name;
        }
    }
}

@withTemplate('<h1>hello world </h1>', 'root')
class Person4 { // ignore warning
    name: string = "john doe"
    constructor() {
        console.log(`my name is ${this.name}`)
    }
}

/* 

decorator types:
1. class decorator (attached to class)
2. property decorator (attached to a property)
3. accessor decorator (attached to a getter/ setter)
4. method decorator (attached to a function/method)
5. parameter decorator (attached to function paramaters)

note : 
1. A decorator will always receive 3 parameters:
ex: function Logger(target: any, name: string, descroptio: PropertyDescriptor)

2. if decorator is attached to a instance property/ instance function then we get 'Prototype'
as target type.

3. if decorator is attached to a static property/ static function then we get constructor
for target.

4. in parameter decorator name of method in which we use this parameter, and thord parameter would
be position of parameter in parameter list.

5. decorators where u can return something: class, method , accessors

decorators run at run time not when instance is created.
 */

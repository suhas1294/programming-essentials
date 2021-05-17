// question 1
console.log('start');
setTimeout(() => {
    console.log('middle');
}, 0);
console.log('end');

// __________________________________________
// question 2
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

// __________________________________________
// question 3
var data = [];

for (var k=0;k<3;k++){
    data[k] = function(){
        console.log(k);
    };
}

data[0]();
data[1]();
data[2]();

// __________________________________________
// question 4
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
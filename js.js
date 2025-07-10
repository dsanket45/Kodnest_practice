function showScope() {
    return new Date().getFullYear();
}

console.log(showScope())

even(10,45)
function even(a,b){
    for(let i=a;i<=b;i++){
        if(i%2==0){
            console.log(i);
        }
    }
}

let count = 5;

function increment() {
    let count = 10;
    console.log(count);
}

increment();
console.log(count);

class Employee{
    id;
     name;
     salary;
     work(){

    }
    doproject() {

    }
}

class Vehicle {
    start() {
        console.log("vehicle starting");
    }
    stop() {
        console.log("vehicle stopping");
    }
}
class Bike extends Vehicle {
    start() {
        console.log("bike starting");
    }

    bikemove() {
        console.log("bike is moving");
    }
}
class Car extends Vehicle {
    start() {
        console.log("car starting");
    }
    
    carmove() {
        console.log("car is moving");
    }
}

const v = new Vehicle();
v.start();
v.stop();

const b = new Bike();
b.start();
b.stop();
b.bikemove();

const c= new Car();
c.start();
c.stop();
c.carmove();

if(true){
    console.log("hello")
}
else{
    console.log("bye")
}



//1. Function Statement or Function declarations
    a();
    function a() {
      console.log("a is called");
    }
    a();


    // b(); calling before function is not valid bcz it hoisted only delacared variables on value assigned
    // 2.Function Expression
    let bb=  function () {
        console.log("b is called");
    }
    bb();


    // 3 .Ananomous functions -> functions should be named
    // function () {

    // }

    // 4.Named Function Expression 
    let cc = function sanket() {
        console.log(sanket);
        console.log("hello world");
    }
   cc();

    // 5.Arrow Functions
    let add = (a,b) => a+b;
    console.log(add(2,4))


// CLOSURES----------------------------------------------------------------------------------------------
function fun1() {
    console.log("function1")
    function fun2() {
        console.log("function2")
    }
    return fun2;
}
exmp = fun1()
exmp()
// console.log(exmp())

function outer() {
    let counter = 0;
    return function inner() {
        counter+=1;
        console.log(counter);
    }
}
inn = outer();
// inn()88888

//MAP FUNCTION 
let arr = [1,2,3,4,5]
let mapp = arr.map((i) => i*i)
console.log(mapp)

// FILTER FUNCTION
let FILTER = arr.filter((i) => i%2==0);
console.log(FILTER) 

// REDUCE FUNCTION
let Reduce = arr.reduce((sum,curr) => sum+=curr)
console.log(Reduce)


// function hi(){
//     console.log("hiii")
//     return "hello";
// }
// console.log(hi());


console.log("hi")
// let start = Date.now();
// let end = 2000;
// let total = start+end
// while(Date.now() <= total){
//     // console.log("delay")
// }
setTimeout(() =>{
    console.log("delayed for 2 seconds")
},2000)
console.log("hello")
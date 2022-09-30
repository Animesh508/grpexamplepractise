function m(){
    return function(){
        console.log("hello");
    };
}
let f = m();
f();
console.log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

function test(a){
    console.log(a);
}
test(10);
console.log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

function foo(a){
    console.log(10);
    return a;
}
let you = foo(
    function(){
        console.log("good");
    }
);
you();
console.log("<<<<<<<<<<<<<<<<<<<<<<<<");

(function mm(){
    console.log("heloo........sir");
})();
console.log("<<<<<<<<<<<<<<<<<<<<<<<<<");

function run(){
    return function(){
        console.log("hello....brother");
    }
}
let n1 = run();
n1();
test();

function test(){
    console.log("hello world");
}

console.log("<<<<<<<<<<<<<<<<<<<<<<<<<  ") ;
var msg;
console.log(msg);
msg = "good morning";
console.log("<<<<<<<<<<<<<<<<<<<<<<<<<<");
function doAdd(a,b){
    return function(){
        return a+b;
    }
}
let br = doAdd(10,30)();
let c = br;
console.log(c);
console.log("<<<<<<<<<<<<<<<<<<<");
//self excecutable function
(function(){
    console.log("hello brother");
})();

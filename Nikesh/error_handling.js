function add(a,b){
    return a+b;
}
let sum;
console.log("operation is here");

try{
    sum = add1(10,20);
}catch(e){
    console.log(e.name);
    console.log(e.message);
}finally{
    console.log("i am final block");
}
console.log("hello sum is done");
console.log("sum = " + sum);

console.log("do next operation");
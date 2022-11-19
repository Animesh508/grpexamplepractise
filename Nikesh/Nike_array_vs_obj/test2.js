let arr = [10,20,30,40];

console.log(arr);
console.log(arr.length);
console.log(arr[0]);
console.log(arr['0']);

arr.push(100);
arr.push(200);
arr.push(300);
arr.push(400);
console.log(arr);
console.log(arr.length);
arr.unshift(1);
console.log(arr);
arr.unshift(2);
console.log(arr);
let num = arr.pop();
console.log(arr);
console.log(num);
let first = arr.shift();
console.log(first);
console.log(arr);
let i = arr.indexOf(100);
console.log(i);
let i1 = arr.indexOf(1000);
console.log(i1);
let isArray = Array.isArray([1,2,3]);

console.log(isArray);
let aa = [];
let foo = function foo(){}
console.log(typeof foo);


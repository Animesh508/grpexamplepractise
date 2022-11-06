let arr =[10,20,30];

console.log(arr[0]);
console.log(arr['0']);

console.log(arr.length);


arr.push(154);//push is used to add data to the array at the end of the array. 
arr.push(254);
arr.push(300);

console.log(arr.length);// is use to view the length of the array
console.log(arr);// shows the array.

arr.unshift(54);//unshift is used to add data to the array at the begening of the array.
console.log(arr);
arr.unshift(547);
console.log(arr);

let i = arr.pop();//pop is used remove the last element from the array
console.log(arr);
console.log(i);

let j = arr.shift(); //shift is used to remove data from the array at the begening of the array.

console.log(arr);
console.log(j);
console.log(arr);

arr.shift();

k = arr.indexOf(154);// indexOf is used to return of element.
console.log(arr.length)
console.log(k);

let l = arr.indexOf(1000);
console.log(l);


let is = Array.isArray([1,2,3]);// Array.isArray is a static method that determines whether  the passed value is an array. if it is  an array then it gives the boolean value(true) else it returns false.
console.log(is);

let aa = [];
let foo = function foo(){}
console.log(typeof foo);





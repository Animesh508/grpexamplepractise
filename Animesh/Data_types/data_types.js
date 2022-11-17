let a = 120.00 //require less memory to store
let b = 120.85 // requires more memory to store

console.log(a);
console.log(b);

let a1 = "hello giraffe"/2;// not a number 
console.log(a1);

//String
let str = 'a';
let str1 = "abc";
let k = "bgmi khelega to trea kuch nai jaie ga ";
console.log(k);

//String data value is immutable

let b1 = "giraffe";
console.log(b1);
b1[1]='jai';
console.log(b1);

let str2="hi";
str2 = str2 + " hello world";
console.log(str2);

//string to boolean
let ss = Boolean("hi")
console.log(ss);
ss = Boolean("")//'' in this case it also gives out false
console.log(ss);


let nn = Boolean(0)
console.log(nn);
nn = Boolean(-20);
console.log(nn);// if the value is zero then it is false else it is true even if no is in -ve aspects.


let mm = Boolean(null);
console.log(mm);
mm=Boolean(undefined);
console.log(mm);

let k1 = {};// object into boolean
console.log(Boolean(k1));
k1 = null;
console.log(Boolean(k1));

let n1 = 32646154748615416844684n;
console.log(n1);




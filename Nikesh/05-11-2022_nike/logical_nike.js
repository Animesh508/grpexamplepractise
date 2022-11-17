let status = true;

if (!status){
    console.log("i am true part");
}else{
    console.log("i am false part");
}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>
let s1 = true;
let s2 = !s1;
console.log(s2);
//>>>>>>>>>>>>>>>>>>>>>>>>>>
// number , actually in JS 0 is false & any non-zero number is true
let n = 100;
console.log(!n);
console.log(!!n);

let p = 0;
console.log(!p);
console.log(!!p);

let d = NaN;
console.log(!d);
console.log(!!d);

let str = "hi";
console.log(!str);
console.log(!!str);

let str1 = "";
console.log(!str1);
console.log(!!str1);

let k = undefined;
console.log(!k);
console.log(!!k);
console.log(!null);

let obj = {};
console.log(!obj);
console.log(!!obj);
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

let j = 12;
j = true;
j = {};
j = "";
j = null;
j = undefined;
j = [];

function exp1 (){
    console.log("hi i am exp1");
    return false;
}

function exp2 () {
    console.log("hi i am ep2");
    return true;
}

if (exp1() && exp2 ()){
    console.log("i am true part");
}else {
    console.log("i am false part");
}
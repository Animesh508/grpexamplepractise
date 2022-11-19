let m = 10; let n = 20;

function exp1() {
    console.log("exp1() is called");
    return m==11;
}

function exp2(){
    console.log("exp2() is called");
    return n==20;
}

if (exp1() || exp2()) {
    console.log("true part is called");
}else {
    console.log("false part is called");
}

let mn = 10; let nn =20;
let result = (mn == 11 && nn ==20)? true : "sorry";

console.log(result);
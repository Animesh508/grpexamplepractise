let m = 10; let n = 20;


function exp1(){
    console.log("exp1 is called");
    return m == 11;
}

function exp1(){
    console.log("exp2 is called");
    return n == 20;
}

if(exp1()||exp2()){
    console.log("exp1 and exp2 are true");
}else{
    console.log("exp1 and exp2 are false");
}


let mn =10; let nn = 20;

let result = (mn == 10 && nn == 20)? true : "sorry"

console.log(result);

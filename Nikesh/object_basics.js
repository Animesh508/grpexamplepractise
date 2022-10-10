let person = {};
person.firstName = "cool";
person.lastName = "nike";

function f(msg){
    console.log(msg);
}
person.message = f;
console.log(person);
person.message("ha hahaha haha");

//case2
let crush = {
    firstname : "anupama",
    lastname : "parmeshwaram",
    mesg : function foo(msg){
        console.log(msg);
    }
}
console.log(crush);
crush.mesg("good morning");
function message(msg){
    console.log(msg);
}
message("nices..");

let foo = function print (msg){
    console.log(msg)
}
foo("hello bro");

let too = function(msg){
    console.log(msg);
}
too("hi there");

function jk(){
    console.log("hiii.............");

}

let p ={}
p.foo = jk;
let p1 ={too:jk}
p1.too();
let person = {}
person.firstname ="Animesh";
person.lastname = "Patil";

function m(msg){
    console.log(msg);
}

person.message=m;

console.log(person);

person.message("hahaha haaah ahaha ");

//case 2
let crush ={
    firstname :"Anupama",
    lastname :"Permeshwaram",
    msg : function foo(msg){
        console.log(msg);
    }
} 

crush.msg("Good morning.......");

function message(msg){
    console.log(msg);
}

message("nice..");


let foo = function print(msg){
    console.log(msg)
}

foo("hello there")

let too = function(msg){
    console.log(msg);
}
too("hi bro");


function jk(){
    console.log("hi...");
}

let p = {}

p.foo = jk;

let p1 = {
    too:jk
}

p1.too;

console.log(crush)

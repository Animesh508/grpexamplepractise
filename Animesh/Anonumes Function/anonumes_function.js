let m = function(){
    console.log("I am m Function......")
}
m();

console.log(">>>>>>>>>>>>>>>>>>>>>>>>")

function add(a,b){
    return function(){
        console.log(a+b);
    }
}

add(10,50)();
add(25,54);
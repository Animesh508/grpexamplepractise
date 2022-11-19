let m = function(){
    console.log("i am m function");
}
m();

function dosum(a,b){
    return function(){
        console.log(a+b);
    }
}
dosum(10,30)(); 


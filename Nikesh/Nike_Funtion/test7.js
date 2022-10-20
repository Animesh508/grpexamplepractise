function test() {};
let s = test();
console.log(s);
console.log(",<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"); 

function test2(){
   let test2= 0;
    for(let i=0;i<arguments.length;i++){
        test2+=arguments[i];
    }
    console.log(test2);
}
test2(10,20,30,4,5,6,5,5,56);
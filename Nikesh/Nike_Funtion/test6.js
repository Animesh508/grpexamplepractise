function sum (a,b){
   return a+b;
   
}
let m = sum(10,40);
console.log(m);

function dosum(a,b,c){
    return c(a,b);
}

let f = dosum(10,70,sum);
console.log(f);
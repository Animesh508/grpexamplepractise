function foo (data){
    console.log(" he I am second program");
}
console.log("   I  ..  am fast program");
let flag = true;
let cunt = 1;
while(flag){
cunt++;
if (cunt>10000000000){
    flag= false;
    foo();
}
}
console.log("I am last program")
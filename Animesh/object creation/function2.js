function sum(){
    let sum = 0;
    for(let i = 0; i<arguments.length; i++){
        sum = sum + arguments[i];
    }
    console.log(sum);
}


sum(10)

sum(1020,745,0,502,0540,256)
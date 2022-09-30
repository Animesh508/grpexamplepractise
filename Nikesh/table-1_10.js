function printTable(t){
    let i = 1;
    while(i<=10){
        console.log(i*t);
        i++;
    }
    console.log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
}

let t = 1;
while(t<=10){
    printTable(t);
    t++;
}
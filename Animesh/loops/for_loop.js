let arr =[10,20,30,40,50,60,70,80,90,100];

for(let index = 0; index<arr.length; index++){
    if(arr[index] != 60){
        if(index == arr.length - 1){
            console.log("Number is not present");
            break;
        }
        continue;
    }
    console.log("60 number is "+ index);
    break;
}
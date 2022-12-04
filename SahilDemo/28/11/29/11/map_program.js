let arr = [1,2,3,4,5,6,7,8,9,10];
for(let i=0 ; i<arr.length; i++){
arr[i] = arr[i]*5;
}
console.log(arr);



let new_array = arr.map(function(elm){
     // console.log(index +" >> "+elm +"  "+array);
    return elm +20;
});
console.log(new_array);


let new_array1 = arr.map ((elm)=>elm+100);
console.log(new_array1);



let arre = [5,10,15,20,25,30,35,40,45,50];
let  arr6 = arre.map((elm)=>elm-200);
console.log(arr6);

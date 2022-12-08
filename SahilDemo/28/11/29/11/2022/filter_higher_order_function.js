let  arr =[11,12,23,45,67,88,80,66];
let arr1=[];
for(let i=0 ;i<arr.length;i++){
if(arr[i]%2 ==0){
    arr1.push(arr[i]);

}
}
console.log(arr1);
console.log("======================")
let new_array = arr.filter(function(elm,index,array){
    if (elm%2 == 0) {
        return elm;
    }
});
console.log(new_array);

console.log("smart code")
let new_array1 = arr.filter((elm)=>{
    if(elm%2 ==0)return elm;
}
);
console.log(new_array1);



let arr2 =[1,2,3,4,5,6,7,8,9,10];
let arr3 =[];
let new_array3 = arr2.filter((elm)=>{
    if(elm%2 ==0)return elm;
});
console.log(new_array3);

//  note point
// filter I am filtering elem and rteurn fillteing elemnt
// map>> I am  returing same size array , I am doing operation on echa elemnt
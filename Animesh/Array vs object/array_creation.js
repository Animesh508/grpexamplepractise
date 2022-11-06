let arr = ['AA','BB','CC','DD'];

console.log(arr);
console.log(arr.length);
console.log(arr[1],arr[0]);

let arr1 = {
    '0':'A',
    '1':'B',
    '2':'C',
    '3':'D',
    length:3,
    foo:function(){
        console.log("Iam foo");

    }
    
};

arr1.name="Animesh";
arr1.age=24;
arr1.doWork=function(){
    console.log(">>>>>>>>>>>>>.")
}

console.log(arr1);
arr1.foo();

arr.length=1000;
console.log(arr.length);

arr1.length=100;
console.log(arr.length);
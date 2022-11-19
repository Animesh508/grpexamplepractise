let arr = ['AA','BB','CC','DD'];

console.log(arr);
console.log(arr.length);
let arr1 = {
  '0': 'A',
    '1': 'B',
    '2': 'C',
    '3': 'D',
    length:4,
    foo:function(){
        console.log("i am foo");
    }

};
arr1.name = "mahaesh";
arr1.age = 34;
arr1.doWork = function () {
    console.log(">>>>>>>>>>>>>>>");
}
arr1.foo();
console.log(arr1);
console.log("<<<<<<<<<<<<<<<<<<");
arr.name = "mahesh";
arr.age = 34;

arr.doWork = function () {
    console.log("<<<<<<<<<<<<<<<<<<<");
}
console.log(arr);    
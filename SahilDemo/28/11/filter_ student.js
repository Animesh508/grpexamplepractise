let student = [
    {
        name : "sahil" ,
        mark: 65
    },
    {
        name : "jivan",
        mark: 45
    },
    {
        name : "nikesh",
        mark: 85
    },
    {
        name: "animesh",
        mark:87
    },
    {
        name: "nirmal",
        mark: 58
    },
]
let result = student.filter((elem)=>{
    if(elem.mark >= 60){
        return elem;
    }
});
console.log(result);


let arr5 = ["red","blue","pink","red","pink","blue","red"];

let  arr6 = {};
arr5.map((color)=>{
    if(arr6[color]){
        let v = arr6[color];
        v++;
        arr6[color] = v;

    }else{
        arr6[color] = 1;
    }
});
console.log(arr6)
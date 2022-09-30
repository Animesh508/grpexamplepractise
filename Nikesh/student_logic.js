let student=[
    {
        name:"nike",
        age:21,
        marks:[85,70,55,87,68]
    },
    {
        name:"zilla",
        age:22,
        marks:[70,89,56,69,74]
    },
    {
        name:"akash",
        age:24,
        marks:[89,56,65,69,78]
    },
    {
        name:"karan",
        age:19,
        marks:[55,45,65,95,45]
    },
];
console.log(student);

let index = 0;

while(index<student.length){
    let i=0;
    let sum = 0;
    while(i<student[index].marks.length){
        sum = sum+student[index].marks[i];
        i++;
    }
    student[index].percentage = sum/student[index].marks.length;
    
    index++;
}
console.log(student);

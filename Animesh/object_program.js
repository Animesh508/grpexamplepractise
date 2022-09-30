let student={
    name:"Animesh",
    Rollno:29,
    Age:23,
    marks:[43,55,64,63,62,61]
};
console.log(student);

student.section = "A";
//console.log(student);

student.name="Animesh Patil";
//console.log(student);

delete student.age;  //deleat age property

let sum =0;
let initial = 0;

while(initial<student.marks.length){
    sum=sum+student.marks[initial];
    initial++
}

student.percenttage=sum/student.marks.length;
console.log(student);
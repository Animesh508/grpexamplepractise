let student = {
    name : "coolNike",
    age : 10,
    schoolName : {
        Sname : "KV VSN",
        rank : 2,
    },
    address : "near air force station Nagpur"
};

student.standard = "4rd";
student.age = 21;
delete student.address;
student.schoolName.rank = 1;
student.schoolName.owner = "nike";
console.log(student);
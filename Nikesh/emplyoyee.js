let employee= [
    {
        name:"nike",
        age:30,
        salary:20000
    },
    {
        name:"sahil",
        age:25,
        salary:15000
    },
    {
        name:"zilla",
        age:20,
        salary:10000
    }
];

let i = 0;
while(i<employee.length){
    if(employee[i].age>29){
        employee[i].bonus = 10000;
    }else if(employee[i].age>24){
        employee[i].bonus = 8000;
    }else{
        employee[i].bonus = 5000;
    }
    i = i+1;
}
console.log(employee);
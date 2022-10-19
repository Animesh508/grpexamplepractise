function createStudent (firstName,lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullNmae = function(){
        return this.firstName + "" + this.lastName;
    }
}
let obj1 = new createStudent("AB" , "LM");
console.log(obj1.fullName());

let obj2 = new createStudent("nike","sharma");
console.log(obj2.fullName());
function createStudent(fname , lname){
    this.fname = fname;
    this.lname = lname;
    this.fullName = function(){
        return this.fname + " " + this.lname ;
    } 
}

let obj1 = new createStudent("cool","nike");
console.log(obj1.fullName());

let obj2 = new createStudent("Alexzendra", "Daddario");
console.log(obj2.fullName());
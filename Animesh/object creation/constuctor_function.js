function studentcase(fname, lname){
    this.fname=fname;
    this.lname=lname;
    this.fullname = function(){
        return this.fname+ " " + this.lname;
    }
}

let obj1 = new studentcase("rashmika", "mandanna");
console.log(obj1.fullname());

let obj2 = new studentcase("keerthy", "suresh");
console.log(obj2.fullname());
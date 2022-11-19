let obj ={
    fname:"cool",
    lname:"nike",
    fullName:function(){
        fname = "rohan";
        lname = "gadvae";
        console.log(this.fname);
        console.log(this.lname);
        console.log(fname);
        console.log(lname);
    }
}
obj.fullName();
console.log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

function printfullName (){
    return this.fname + " " + this.lname;
}

let obj1 = {
    fname: "raju",
    lname: "chowhan"
}

obj1.foo = printfullName;
console.log(obj1.foo());
console.log(printfullName()); //cosz we are not using obj1
console.log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

let obj2 = {
    fname: "kallu",
    lname: "kalia"
}
obj2.foo = printfullName;
console.log(obj2.foo());
console.log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
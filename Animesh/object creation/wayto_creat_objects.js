let obj = {
    fname:"Kajal",
    lname:"Aggawal",
    fullname:function(){
        fname = "Chandu";
        lname = "AI change";
        console.log(this.fname);
        console.log(this.lname);
        console.log(fname);
        console.log(lname);
    }
}

obj.fullname();
console.log("/-----------------------------------------------------------------");

function printfullname(){
    return this.fname + " " + this.lname;
}

let obj1 ={
    fname:"preet",
    lname:"sing"
}

obj1.foo = printfullname;
console.log(obj1.foo());
console.log("/---------------------------------------------------")

let obj2 = {
    fname:"mrinal",
    lname:"kumari"
}

obj2.foo= printfullname;
console.log(obj2.foo());

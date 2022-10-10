let j = module.require("./message.js");
let a = module.require("./cal.js");

let r1 = a.add(10,20);
let r2 = a.min(100,20);

let r3 = j.msg;
console.log(r1);
console.log(r2);
console.log(r3);
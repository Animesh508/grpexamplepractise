let c = module.require("./test1.js");
let k = module.require("./test2.js");
let r1 = k.sum(10,20);
let r2 = k.sub(100,50);
let r3 = c.msg;
console.log(r1);
console.log(r2);
console.log(r3);
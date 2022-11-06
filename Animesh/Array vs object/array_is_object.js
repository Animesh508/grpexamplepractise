let obj = {
    name:"Animesh",
    age:24,
    "29date":"June"
};

let keyName = 'name';
console.log(obj[keyName]);

console.log(obj.name);
console.log(obj.age);

//or
console.log(obj['name']);
console.log(obj['age']);
console.log(obj['29date']);//illegal key

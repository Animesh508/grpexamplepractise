let obj = {
    valueOf : function(){
        return 10;
    }
}
console.log(30 + obj);
console.log('30' + obj);
console.log('30' - obj);

let obj1 = {
    toString: function(){
        return true;
    }
}

console.log(11 + obj1);
console.log('11' + obj1);
console.log('11' - obj1);

let obj2 = {
valueOf : function(){
    return 10;
},
toString : function(){
    return 20;
}

}
console.log(100 + obj2);
console.log(100 + obj2.toString());
console.log(100 + obj2.valueOf());

let obj3 = {
    hi : function(){
        return 60;
    }
}
console.log(10 + obj3);
let obj = {
    valueOf:function(){
        return 10;
    }
}

console.log(30 + obj);//40 &30[object obj]
console.log('30'+obj);//3010
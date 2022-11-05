let obj = {
    valueOf : function(){
        return 10;
    }
}
console.log(30 + obj);
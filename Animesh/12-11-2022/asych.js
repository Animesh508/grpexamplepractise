function test(){
    console.log('I am second line');
}

console.log("I am first line");

setTimeout(test, 5000);

console.log("I am third line");
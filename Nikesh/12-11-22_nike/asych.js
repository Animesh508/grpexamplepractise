function test() {
    console.log("i am second line");
}
console.log("i am first line");

setTimeout(test, 5000);

console.log("i am third line");
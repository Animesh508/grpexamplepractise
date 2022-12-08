let day = "Monday";

if (day == 'Saturday') {
    console.log("i am Saturday");
}else if (day == 'Monday'){
    console.log("i am Monday");
}else if (day == 'Thuesday'){
    console.log("i am Thuesday");
}else if (day == 'i am Friday'){
    console.log("i am Friday");
}else{
    console.log("other days...");
}
console.log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")

//switch case
day = 'Friday';
switch(day){
    case 'Monday' : {
        console.log("i am Monday");
        break;
    }
    case 'Tuesday' : {
        confirm("I am Tuesday");
        break;
    }

    case 'Friday':{
        console.log("i am Friday");
        break;
    }
   case 'Sunday' : {
    console.log("i am Sunday");
    break;
   }

   default:{
    console.log("i am default case");
    break;
   }
}
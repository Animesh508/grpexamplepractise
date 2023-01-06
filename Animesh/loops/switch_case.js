let day = "Monday";

if(day == 'sunday'){
    console.log("I am sunday");
}else if(day == 'Saturday'){
    console.log("I am Saturday");
}else if(day == 'Monday'){
    console.log("I am Monday");
}else if (day == 'Friday'){
    console.log("I am Friday");
}else {
    console.log("other days...")
}


// switch case

day = 'Friday';
switch(day){
    case'Monday':{
        console.log("I am Monday");
        break;
    }
    
    case 'Tuesday':{
        console.log("I am Tuesday");
        break;
    }

    case 'Friday':{
        console.log("I am Friday");
        break;
    }

    case 'Sunday':{
        console.log("I am Sunsay");
        break;
    }

    default:{
        coonsole.log("I am default case");
        break;
    }
}
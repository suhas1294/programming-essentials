// why using var keyword prints same number every time as against let keyword ?
for (var i = 0; i < 2; i++) {
    setTimeout(() => {
        console.log(i);
    }, 0);
}



// write a fuction wto return angle between hour hand and minute hand give a time
function getAngle(h, m) {
    // ex: 3 o clock = 90 d
    //let hourAngle = (360/12) * h; // 30 * 6 = 180
    //let minuteAngle = (360/60) * m; //6 * 30 = 180
    let a = (m / h); // 5
    return a;
}

console.log(getAngle(6, 30));
console.log(getAngle(12, 30));
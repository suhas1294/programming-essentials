
function countWords(sentence){
    const specialCharArray = ["`","!","@","#","$","%","^","&","*","(",")", "-", "_","+","\\","=","[","]","{","}",";","'",":","\"","|",",",".","<",">","?","~"]
    let tempSentence = sentence.replace(/\s+/g, ' ').trim();
    tempSentence = tempSentence.replace(/[&\/\\#,+()$~%.'":*?<>{}]/g, '');
    let senArray = tempSentence.split(" ");
    console.log(senArray);
    let resArray = [];

    senArray.forEach(char => {
        let type = parseInt(char);
        if (isNaN(type) && !specialCharArray.includes(char) ){
            resArray.push(char);
        }
    });
    let uniqresults = [...new Set(resArray)];
    console.log(uniqresults);
    console.log(uniqresults.length);
    return uniqresults.length;
}

// countWords("jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.");
countWords("b? Dl )B 4(V! A. MK, YtG ](f 1m )CNxuNUR {PG?");



// b? Dl )B 4(V! A. MK, YtG ](f 1m )CNxuNUR {PG? 
// expected 5
// actual 9

// )}OJR 92ww. z )UPl 49e ]S  g. zrZEnQ  D. FoKp ]ow 1EceB 3oK }w ]CA? L 3LPbDN! trqJY 0sBmm. Nwn
// expected 8


//he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?
//expected 21



// [ 'he',
// 'is',
// 'a',
// 'good',
// 'programmer,',
// 'he',
// 'won',
// '865',
// 'competitions,',
// 'but',
// 'sometimes',
// 'he',
// 'dont.',
// 'What',
// 'do',
// 'you',
// 'think?',
// 'All',
// 'test-cases',
// 'should',
// 'pass.',
// 'Done-done?' ]
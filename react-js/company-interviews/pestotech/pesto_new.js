// const s = "he is a good programmer, he won  competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?";

// `)}OJR 92ww. z )UPl 49e ]S  g. zrZEnQ  D. FoKp ]ow 1EceB 3oK }w ]CA? L 3LPbDN! trqJY 0sBmm. Nwn`
// expected 8

// `n? O, A? ir! FhL  gmaMbo? IQtz  Nx  rkQ?  17E? Fl-TX! P (n  r   745yDs  E 4y (bPg 1Vs, KGz-jgE 92lFDOLTE. cvuXh 5IL-h 6VN. Nqz  G. KsUj (k, Hjh 4j, q-Edw 2e,  )C  v-zyt-T 0q. BVrKLW 3u, B! Cz }DGZe-mn-jcw! hT! V? ySyJ 1k. wo. V 9wI  oR!  0JD. GLKSBUB 3Eyyg )Lft  oTHbC! apSa! ujCw, Es  z )ITnWSk. nn, w 1O-xmsw  JcB. ct? lSv {HpYTM? Mc 7C (lhM.  }G {J, w [IChoXO 6dbUgKs? MLr? o 17Q! fFh [(3x. CaGQhQ  akej }p.  (g? teS. B 8qKS )n ]E-HQ,  5Mm 2qX )xiYUO! DZ! cB! G-WZ  cZc, JqpdPEpC {d, Ce, m,  8b? HH 8W 68EM, sJ-VsgDo-u 4C   5U 5mMr ]s 1tMu 8GP 7b-MW-d 6w! v 4Vu 9mBV 58vyO? uxQa [xZ! P. DA! xNr 4nl?  5n  ElH! O 4QvCf. i 30tN 8bM 6y  Yei! jsxT-a 3CEy 5KMLYdg! L 7D 1xxQViNT. rucIiius  o? r, H {1aH 0g  is 9C 3olX }P? azL-ICWgwrC! tv [FIt?  1lF (m 9zrcAfSwNjetRkc [(DSqN. yfa. uu 6BiL (L (r 0Fo 7{hJ {Py   )4JH 14oWKQdI }L )2)PZz.  5(U. BreAl 8B-pYHla! O 6rEzI?  9LDwB! aG? F-OqB (6s-cu? Zx (cZ )xv. bkdBuPZR 2Gij 2hQ 60jV 9FukJPhQc )R 9ztytQ!  ]l 6(a, S? I  b {tS,  (s, u 6)P-irIWA-vj? O, e 8`
// expected 91

// `b? Dl )B 4(V! A. MK, YtG ](f 1m )CNxuNUR {PG? `
// b? dl B V! a. mk, ytg f 1m CNxuNUR PG?
// expected 5

const s = "jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.";
// expected 21

function howMany(sentence) {
    /*
    // Write your code here
    let sentWithoutNumber = sentence.replace(/[0-9]/g, '');
    let sentWithoutSpace = sentWithoutNumber.replace(/\s+/g, ' ');
    // console.log(`sentWithoutSpace: ${sentWithoutSpace}`);
    let wordArray = sentWithoutSpace.split(' ');
    console.log(wordArray);
    return wordArray.length;
    */

    /*
        let sentWithoutNumber = sentence.replace(/[0-9]/g, '');
        let sentWithoutSpace = sentWithoutNumber.replace(/\s+/g, ' ');
        let wordArray = sentWithoutSpace.split(' ');
        let uniqueWords = Array.from(new Set(wordArray));
        console.log(uniqueWords);
        return uniqueWords.length;
    */

    sentence = sentence.replace(/[0-9]/g, '');
    sentence = sentence.replace(/(^\s*)|(\s*$)/gi, "");//exclude  start and end white-space
    sentence = sentence.replace(/[ ]{2,}/gi, " ");//2 or more space to 1
    sentence = sentence.replace(/\n /, "\n"); // exclude newline with a start spacing
    return sentence.split(' ').filter(function (str) { return str != ""; }).length;
}

howMany(s);

function pthFactor(n, p) {
    // Write your code here
    let factors = [];
    for (let i = 1; i <= n; i++) {
        if (+n % i === 0) factors.push(i);
        console.log(`factors.length: ${factors.length}`);
        if (factors.length > p) break;
    }
    console.log(factors);
    if (factors[p - 1]) {
        return factors[p - 1]
    } else {
        return 0;
    }

}

// 22876792454961
// expected: 7625597484987
let factors = [1];
var half = Math.floor(num / 2), i, j;
num % 2 === 0 ? (i = 2, j = 1) : (i = 3, j = 2);
for (i; i <= half; i += j) {
    num % i === 0 ? factors.push(i) : null;
}
factors.push(n);


function pthFactor(n, p) {
    let factors = [1];
    var half = Math.floor(n / 2), i, j;
    n % 2 === 0 ? (i = 2, j = 1) : (i = 3, j = 2);
    for (i; i <= half; i += j) {
        n % i === 0 ? factors.push(i) : null;
    }
    factors.push(n);
    console.log(factors);
    if (factors[p - 1]) {
        return factors[p - 1]
    } else {
        return 0;
    }
}
console.log(pthFactor(22876792454961, 10));

function pthFactor(n, p) {
    const isEven = n % 2 === 0;
    let inc = isEven ? 1 : 2;
    let factors = [1];
    for (let curFactor = isEven ? 2 : 3; Math.pow(curFactor, 2) <= n; curFactor += inc) {
        if (n % curFactor !== 0) continue;
        factors.push(curFactor);
        let compliment = n / curFactor;
        if (compliment !== curFactor) factors.push(compliment);
    }
    factors.push(n);
    factors.sort((a, b) => a - b);
    // console.log(factors.length);
    if (factors[p - 1]) {
        return factors[p - 1]
    } else {
        return 0;
    }
}
console.log(pthFactor(1048576, 28));
// 1048576, expected 2048

// __________________________________________
//  MCQ
// __________________________________________

// var data = [];
// for (let k = 0; k < 3; k++) {
//     data[k] = function () {
//         console.log(k);
//     }
// }

// data[0]();
// data[1]();
// data[2]();

// let user = {
//     name: 'john',
//     address: {
//         city: 'ireland',
//         pinCode: 19
//     }
// }

// let clone = Object.assign({}, user);

// console.log(user.address === clone.address);
// user.address.pinCode++
// console.log(clone.address.pinCode);

// function foo(){
//     function bar() {
//         return 3;
//     }
//     return bar();
//     function bar() {
//         return 8;
//     }
// }

// console.log(foo())


// function add() {
//     let result = 0;
//     for (let num of arguments) {
//         result += num;
//     }
//     return result;
// }
// console.log(add(1,2));


console.log('start');
setTimeout(() => {
    console.log('middle');
}, 0);
console.log('end');

const isArmstrongNumber = (input) => {
    for (let index = 1; index <= input[0]; index++) {
        let cubeArray = input[index]
            .toString()
            .split("")
            .map(r => parseInt(r))
            .map(e => getCubeOfNumber(e));
        let sumArray = getSumOfArray(cubeArray);
        if (sumArray == input[index]){
            console.log(`${input[index]} is an armstrong number`);
        }else{
            console.log(`${input[index]} is a NOT an armstrong number`);
        }
    }
}

const getSumOfArray = (arr) => {
    const reducer = (accumulator, currentValue) => accumulator + currentValue;
    return arr.reduce(reducer);
}

const getCubeOfNumber =(num) => {
    return num * num * num;
}

let input = [3, 153, 324, 5652];
isArmstrongNumber(input);
let person = {
  name: 'john doe',
  age: 23,
  address: {
    postal: 34567,
    street: "#3, washington road",
    area: "bay area"
  }
}

let anotherPerson = {...person};

anotherPerson.address.postal = 123;

console.log(person.address.postal); // why this got changed ?
console.log(anotherPerson.address.postal);


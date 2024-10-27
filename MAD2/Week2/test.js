// const obj = {
//     a: 10,
//     operation(x, y, n) {
//         return x ** n + y + this.a;
//     }
// };

// const arr = [];
// const p = obj.operation;

// // Using bind
// arr.push(p.bind(obj, 2)(3, 2)); // 2 ** 2 + 3 + 10 = 17

// // Using apply
// arr.push(p.apply(obj, [2, 2, 3, 4, 5])); // 2 ** 3 + 2 + 10 = 20

// // Using call
// arr.push(p.call(obj, 2, 3, 4)); // 2 ** 4 + 3 + 10 = 29

// console.log(arr); // Outputs: [17, 20, 29]

// a = {
//     name : 'abhi',
//     age : 22
// }

// b = []
// for(let i=0; i<3;i++){
//     b.push(a)
// }
// console.log(a)
// console.log(b)
// b[1].name = 'Akshy'
// console.log("a :" , a, "\nb : ",b)

const course = {
    courseName: 'Modern Application Development 2',
    courseCode: 'mad2'
};

const student = {
    __proto__: course,
    studentName: 'Rakesh',
    studentCity: 'Delhi'
};

// Accessing inherited property using destructuring
const { courseName } = student;
console.log(courseName); // Outputs: Modern Application Development 2

// Using alias in destructuring
const { courseName: alt } = student;
console.log(alt); // Outputs: Modern Application Development 2

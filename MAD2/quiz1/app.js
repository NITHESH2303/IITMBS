// const player = {
//     name : "Rohit",
//     state : "Maharashtra"
// }

// const batsman = Object.create(player)

// console.log(batsman)

// class Album {
//     constructor(creator, albumName) {
//         this.creator = creator;
//         this.songs = ["s", ()=> {}];
//         this.albumName = albumName;
//     }
//     addSong(song) {
//         this.songs.push(song);
//     }
// }

// class Song {
//     constructor(name, duration) {
//         this.name = name;
//         this.album = null;
//         this.duration = duration;
//     }
// }

// s1 = new Song('song1', '3:00');
// a1 = new Album('Creator', 'Album1');
// a1.addSong(s1);

// console.log(a1.songs.length);


// new Vue({
//     el: '#app',
//     template: `
//       <div>
//         {{ text }}
//         <div>
//           <input type="text" v-model="userInput" />
//           <div id="match">
//             {{ hasMatched ? "Not Matched" : "Matched" }}
//           </div>
//         </div>
//       </div>
//     `,
//     data: {
//         text: 'This is text',
//         userInput: null
//     },
//     computed: {
//         hasMatched() {
//             return this.text.startsWith(this.userInput);
//         }
//     }
// });

// new Vue({
//     el: '#app',
//     template: `
//       <div>
//         <div id="holiday">{{ isHoliday ? "Holiday" : "Not Holiday" }}</div>
//         <button @click="increaseCount">Increase Count</button>
//       </div>
//     `,
//     data: {
//       count: 1,
//       isHoliday: false
//     },
//     watch: {
//       count() {
//         if (this.count % 5 == 0) {
//           this.isHoliday = true;
//           console.log(this.count)
//         }
//         else{
//             this.isHoliday = false;
//         }
//       }
//     },
//     methods: {
//       increaseCount() {
//         this.count += 6;
//       }
//     }
//   });


// Vue.component('new', {
//     template: `
//     <div>
//       <slot>Vue is JS Framework</slot>
//       <div>Learn Vue 2 and Vue 3</div>
//     </div>
//   `
// });

// new Vue({
//     el: '#app'
// });

// Vue.component('parent-component', {
//     props: ['title'],
//     template: `
//       <div>
//         <h1>{{ title }}</h1>
//         <slot name="header">OMG</slot>
//         <p>Main Content</p>
//       </div>
//     `
// });

// new Vue({
//     el: '#app',
//     data: {
//         parentTitle: 'Parent Component Title',
//         headerTitle: 'Header Content'
//     }
// });


// const a = {  
//     'x1': 10,  
//     func1: function() {  
//         console.log(this.x1);  
//     }  
// }  

// const b = {  
//     'x1': 20,  
//     func2: function() {  
//         c = a.func1;  
//         c.apply(b, [10, 25]);  
//     }  
// }  

// b.func2();

// const a = {  
//     'x1': 10,  
//     func1: function() {  
//         console.log(5 + this.x1);  
//     }  
// }  

// const b = {  
//     'x1': 20,  
//     func2: function() {  
//         c = a.func1;  
//         c.apply(b);  
//     }  
// }  

// b.func2();

// let x1 = {
//     'a': 5,
//     'b': 'hello',
//     'add': function (x) {
//         return this.b + ' ' + x;
//     }
// };
// let x2 = {
//     'a': 5,
//     'b': 'Welcome',
//     'add': function (x) {
//         return this.a + ' ' + x;
//     }
// };

// let y = x1.add;
// console.log(y.call(x2, "Diya"));

// const courses = [
//     { name: 'MAD-1', description: 'CSS, HTML, Flask, API, SQLite' },
//     { name: 'MAD-2', description: 'Javascript, VueJs, Flask, API' }
// ];
// function getCourse() {
//     setTimeout(() => {
//         let allCourses = []
//         courses.forEach((course, index) => {
//             allCourses.push(course)
//         })
//         console.log(allCourses)
//     },)
// }
// function addCourse(course) {
//     setTimeout(() => {
//         courses.push(course)
//     }, 2000)
// }
// addCourse({ name: 'MAD-3', description: 'Watch this space !!' })
// getCourse();
// setTimeout(() => {
//     getCourse()
// }, 2000)


class Person {
    constructor(name) {
        this.name = name;
        this.age = 23;
    }

    static fromJson(obj) {
        let new_obj = new Person(obj.name);
        new_obj.sound = obj.sound;
        return new_obj;
    }
}

let result = new Person("Abhi");
console.log(JSON.parse(JSON.stringify(result)));
console.log(Person.name)

console.log(Person.fromJson(JSON.parse(JSON.stringify(result))).constructor.name);
console.log(Person.name)

// import { defineConfig } from 'vite'
// import vueDevTools from 'vite-plugin-vue-devtools'

// export default defineConfig({
//   plugins: [
//     vueDevTools(),
//   ],
// })

// const dataObj = {
//     message: 'Welcome',
// };

// const optObject = {
//     el: '#app',
//     data: dataObj,
// };

// const app = new Vue(optObject);
// app.newMessage = 'Welcome to iitm online degree';


// const a = new Vue({
//     el: '#app1',
//     data: {
//         message: 'Kumar',
//     },
// })
// const b = new Vue({
//     el: '#app2',
//     data: {
//         message: 'Rajput',
//     },
// })
// const c = new Vue({
//     el: '#app3',
//     data: {
//         message: 'Abhishek',
//     },
// })

// const comp = {
//     template: '<li>{{ message.message }}</li>',
//     props: ['message']
// };

// const app = new Vue({
//     el: '#app',
//     data: {
//         messages: [
//             { message: 'This is message1' },
//             { message: 'This is message2' },
//             { message: 'This is message3' }
//         ]
//     },
//     components: {
//         comp
//     }
// });


// const app = new Vue({
//     el: '#app',
//     data: {
//         x: 0,
//         y: 0
//     },
//     watch: {
//         x(newVal, oldVal) {
//             if (newVal > oldVal && newVal > 10) {
//                 this.y = 1;
//             }
//         }
//     }
// });

// for (let i = 0; i < 20; i++) {
//     app.x++;
// }



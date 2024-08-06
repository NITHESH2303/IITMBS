let app = new Vue(
    {
        el: '#app',
        data: {
            message: 'Hello Vue',
            fontSize: '42px',
            msg2: 'Dummy'
        },
        methods: {
            updateMsg() {
                this.message = "Hello!!!";
            }
        },
        computed: {
            myFontSize: function () {
                return `${this.message.length +10}px`
            }
        },
        watch: {
            message: function (msg) {
                this.msg2 = `New: ${msg}`;
            }
        }
    }
)
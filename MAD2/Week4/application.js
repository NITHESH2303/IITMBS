Vue.component('message-board', {
    props : ['title'],
    template :
        '<div>' +
        '        <h4> {{title}}</h4> ' +
        '        Your Name : <input type="text" v-model="visitor_name"/>\n' +
        '        Your Message : <input type="text" v-model="visitor_message"/>\n' +
        '        <button v-on:click="reply">Reply</button>\n' +
        '\n' +
        '        <ul>\n' +
        '            <li v-for="message in messages">{{message["visitor_name"]}} : {{message\n' +
        '                ["visitor_message"]}}</li>\n' +
        '        </ul>' +
        '</div>',
    data : function() {
        return {
            visitor_name: "",
            visitor_message: "",
            messages: []
        }
    },
    methods : {
        reply : function () {
            this.messages.push(
                {
                    "visitor_name" : this.visitor_name,
                    "visitor_message" : this.visitor_message,
                }
            );
            this.visitor_name = "";
            this.visitor_message = "";
            this.$emit("add-to-total");
        }
    },
    computed : {
        count : function () {
            return this.messages.length;
        }
    }
})

var app = new Vue({
    el : "#app",
    data : {
        count : 0,
    },
    methods : {
        global_count : function () {
            this.count++
        }
    }
})
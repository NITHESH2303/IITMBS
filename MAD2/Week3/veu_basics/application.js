var app = new Vue({
    el : "#app",
    data : {
        message : "Hello World",
        visitor_name : "",
        visitors : []
    },
    methods : {
        reply : function () {
            this.message = "Hello!!!";
            this.visitors.push(this.visitor_name);
        }
    },
    computed : {
        count : function () {
            return this.visitors.length;
        }
    }
})
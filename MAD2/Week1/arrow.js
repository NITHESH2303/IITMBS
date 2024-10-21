const obj = {
    name: 'Rohit',
    arrowFunction: null,
    normalfunction: function (name) {
        this.arrowFunction = function() {
            console.log(this.name = name)
        }
    },
}
obj.normalfunction('Mohit')
obj.arrowFunction()
var height = 0;
var width = 0;
var divStyle = document.getElementById('div1').style;
let res = setInterval(() => {
    height += 50;
    width += 50;
    divStyle.height = height + 'px';
    divStyle.width = width + 'px';
    console.log(height);
}, 1000);
setTimeout(() => {
    clearInterval(res);
}, 10100);

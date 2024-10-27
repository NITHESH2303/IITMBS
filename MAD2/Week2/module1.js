import { divStyle1, divStyle2 } from './module2.js';

const div1Style = document.getElementById('div1').style;
console.log(div1Style.height, div1Style.width)
div1Style.backgroundColor = divStyle1.color;
div1Style.height = divStyle2.height;
div1Style.width = divStyle1.width;


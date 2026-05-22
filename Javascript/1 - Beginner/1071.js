var input = require('fs').readFileSync('./dev/stdin', 'utf8');
var lines = input.split('\n');

const valorFinal = Number(lines[0])
const valorInicial = Number(lines[1])
let acumulador = 0

for(x = (valorInicial + 1); x < valorFinal; x++){
    if(x % 2 !== 0) acumulador += x
}

console.log(acumulador)
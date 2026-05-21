var input = require('fs').readFileSync('./dev/stdin', 'utf8');
var lines = input.split(' ');

const maiorValor = lines.reduce((acumulador, numero) => {
    if(Number(numero) > acumulador) return Number(numero) 
    else return acumulador
}, 0)

console.log(`${maiorValor} eh o maior`)
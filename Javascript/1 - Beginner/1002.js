var input = require('fs').readFileSync('./dev/stdin', 'utf8');
var lines = input.split('\n');

const soma = lines.reduce((acumulador, numeroAtual) => {
    return acumulador + Number(numeroAtual)
}, 0)

console.log(`X = ${soma}`)
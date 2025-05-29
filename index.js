// Función simplificada para verificar palíndromos
function esPalindromo(texto) {
    // Limpiamos el texto (convertimos a minúsculas y quitamos espacios y caracteres especiales)
    const limpio = texto.toLowerCase().replace(/[^a-z0-9]/g, '');

    // Invertimos el texto
    const invertido = limpio.split('').reverse().join('');

    // Comparamos y retornamos directamente true o false
    return limpio === invertido;
}

// Pedimos el texto al usuario
const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question('Ingresa un texto para verificar si es palíndromo: ', (texto) => {
    // Verificamos y mostramos el resultado
    if (esPalindromo(texto)) {
        console.log(`"${texto}" es un palíndromo`);
    } else {
        console.log(`"${texto}" no es un palíndromo`);
    }
    readline.close();
});

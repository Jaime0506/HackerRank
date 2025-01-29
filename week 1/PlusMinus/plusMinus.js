const plusMinus = (arr = []) => {
    // Necesito contar cuantos numeros positivos hay
    // cuantos numeros negativos hay y el 0

    // y con estos valores encontrados los divido cada uno x el tamaño
    // del arr, mostrandolo x consola cada valor redondeado a 6 decimales
    // la funcion no debe retornar nada.

    // positivo , negativo, 0
    let values = [0, 0, 0]

    arr.forEach(num => {

        if (num > 0) return values[0] += 1

        if (num == 0) return values[2] += 1

        return values[1] += 1
    })

    values.forEach(num => {
        console.log((num / arr.length).toFixed(6))
    })
}

const examples = [1, 1, 0, -1, -1]

plusMinus([-4, 3, -9, 0, 4, 1])
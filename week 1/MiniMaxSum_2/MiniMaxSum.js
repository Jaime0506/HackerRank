const MiniMaxSum = (arr = []) => {
    let min = arr[0]
    let max = arr [0]
    let sum = 0

    arr.forEach(num => {
        if (num > max) max = num 
        if (num < min) min = num

        sum += num
    })

    // Obtengo el minimo y el maximo de cada matriz
    // y simplemente hace falta restarlo dependiendo del caso
    // para el Max, tengo que restarle el mas pequeño y para el
    // Minimo tengo que restarlo el mas grande

    console.log(sum - max, sum - min)
}

MiniMaxSum([140638725, 436257910, 953274816, 734065819, 362748590])
public class prova {
  
    function insertionSort(arr) {
  for (let i = 1; i < arr.length; i++) {
    let currentValue = arr[i]; // Valor atual a ser inserido
    let j = i - 1; // Índice para percorrer a parte ordenada

    // Move os elementos da parte ordenada que são maiores que o valor atual
    while (j >= 0 && arr[j] > currentValue) {
      arr[j + 1] = arr[j];
      j--;
    }
    // Insere o valor atual na sua posição correta
    arr[j + 1] = currentValue;
  }
  return arr;
}

// Exemplo de uso:
console.log(insertionSort([5, 3, 8, 6, 2])); // Saída: [2, 3, 5, 6, 8]


}

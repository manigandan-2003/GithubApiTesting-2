function findMinMax(arr) {
  if (!arr || arr.length === 0) {
    return [null, null]; // Handle empty or null array
  }

  let min = arr[0];
  let max = arr[0];

  for (let i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
      min = arr[i];
    }
    if (arr[i] > max) {
      max = arr[i];
    }
  }

  return [min, max];
}

// Example usage:
// const myArray = [3, 1, 4, 1, 5, 9, 2, 6];
// const [smallest, largest] = findMinMax(myArray);
// console.log("Smallest:", smallest);
// console.log("Largest:", largest);

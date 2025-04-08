function findMinMax(arr) {
  if (!arr || arr.length === 0) {
    return []; // Return empty array for null or empty input
  }

  let min = arr[0];
  let max = arr[0];

  for (let i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
      min = arr[i];
    } else if (arr[i] > max) {
      max = arr[i];
    }
  }

  return [min, max];
}

// Example Usage:
// const myArray = [5, 2, 9, 1, 5, 6];
// const result = findMinMax(myArray);
// console.log(result); // Output: [1, 9]

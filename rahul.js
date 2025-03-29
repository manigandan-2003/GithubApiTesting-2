// Function to find the greatest and smallest elements of an array
function findMinMax(arr) {
  if (!arr || arr.length === 0) {
    return [null, null]; // Handle empty or invalid array
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
// const numbers = [5, 2, 9, 1, 5, 6];
// const [min, max] = findMinMax(numbers);
// console.log("Smallest:", min);
// console.log("Greatest:", max);

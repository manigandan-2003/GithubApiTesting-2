// Function to find the greatest and smallest elements of an array
function findMinMax(arr) {
  if (!arr || arr.length === 0) {
    return { min: undefined, max: undefined }; // Handle empty or invalid input
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

  return { min: min, max: max };
}

// Example usage:
const numbers = [5, 2, 9, 1, 5, 6];
const result = findMinMax(numbers);
console.log("Array: ", numbers);
console.log("Smallest element: ", result.min);
console.log("Greatest element: ", result.max);

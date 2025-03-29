// Function to find the greatest and smallest elements of an array
function findMinMax(arr) {
  if (!arr || arr.length === 0) {
    return { min: null, max: null }; // Handle empty or invalid input
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
// const myArray = [5, 2, 9, 1, 5, 6];
// const result = findMinMax(myArray);
// console.log("Smallest:", result.min);
// console.log("Greatest:", result.max);
function findMinMax(arr) {
  if (arr.length === 0) {
    return { min: undefined, max: undefined };
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
const numbers = [3, 1, 4, 1, 5, 9, 2, 6];
const { min, max } = findMinMax(numbers);
console.log("Minimum:", min); // Output: Minimum: 1
console.log("Maximum:", max); // Output: Maximum: 9
function findMinMax(arr) {
  if (arr === null || arr.length === 0) {
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

// Test cases
console.log(findMinMax([1, 5, 2, 8, 3])); // Output: { min: 1, max: 8 }
console.log(findMinMax([-1, 0, 1])); // Output: { min: -1, max: 1 }
console.log(findMinMax([5])); // Output: { min: 5, max: 5 }
console.log(findMinMax([])); // Output: { min: undefined, max: undefined }
console.log(findMinMax(null)); // Output: { min: undefined, max: undefined }
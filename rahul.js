// Step 1: Add a function named 'findMinMax' that takes an array as input.
function findMinMax(arr) {
  // Step 2: Inside 'findMinMax', find the smallest and largest elements of the input array.
  if (!arr || arr.length === 0) {
    return [null, null]; // Handle empty or invalid input
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

  // Step 3: Return an array containing the smallest and largest elements, respectively.
  return [min, max];
}

// Step 4: Export the 'findMinMax' function as a module.
module.exports = { findMinMax };

// Step 5: Fix the existing loop condition to iterate correctly (e.g., change 'i>5' to 'i<5' or remove it entirely).
for(let i=0;i<5;i++){ console.log(i); }
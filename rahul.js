/**
 * Finds the greatest and smallest elements in an array.
 * @param {number[]} arr The input array of numbers.
 * @returns {{greatest: number, smallest: number}} An object containing the greatest and smallest elements.
 * @throws {Error} If the input array is empty or contains non-numbers.
 */
function findMinMax(arr) {
  if (arr.length === 0) {
    throw new Error('Input array cannot be empty');
  }
  if (!arr.every(Number.isFinite)) {
    throw new Error('Input array must contain only numbers');
  }

  let greatest = arr[0];
  let smallest = arr[0];

  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > greatest) {
      greatest = arr[i];
    }
    if (arr[i] < smallest) {
      smallest = arr[i];
    }
  }

  return { greatest, smallest };
}

// Example usage:
const numbers = [3, 1, 4, 1, 5, 9, 2, 6];
const { greatest, smallest } = findMinMax(numbers);
console.log(`Greatest: ${greatest}, Smallest: ${smallest}`);

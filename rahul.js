/**
 * Finds the minimum and maximum elements in an array.
 * @param {Array<number>} arr The input array.
 * @returns {Array<number> | null} An array containing the minimum and maximum elements, or null if the input is invalid.
 */
const findMinMax = (arr) => {
  if (!Array.isArray(arr) || arr.length === 0) {
    return null;
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
};

module.exports = findMinMax;
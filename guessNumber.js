function guessNumber(min, max) {
  if (min > max) {
    [min, max] = [max, min]; // Swap if min is greater than max
  }
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

// Example usage:
const randomNumber = guessNumber(1, 100);
console.log("Guessed number:", randomNumber);
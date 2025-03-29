// This function generates a random number between a given range
function guessNumber(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

// Example usage:
// const randomNumber = guessNumber(1, 100);
// console.log("Guessed number:", randomNumber);
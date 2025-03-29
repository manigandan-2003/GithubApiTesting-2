function guessNumber(min, max) {
  if (min >= max) {
    return "Invalid range. Minimum should be less than maximum.";
  }
  const randomNumber = Math.floor(Math.random() * (max - min + 1)) + min;
  return randomNumber;
}

// Example usage
const minRange = 1;
const maxRange = 100;
const guessedNumber = guessNumber(minRange, maxRange);
console.log("Guessed number:", guessedNumber);
function guessNumber(min, max) {
  if (min >= max) {
    return "Invalid range. Minimum value must be less than maximum value.";
  }
  // Generate a random number within the specified range (inclusive).
  const randomNumber = Math.floor(Math.random() * (max - min + 1)) + min;
  return randomNumber;
}
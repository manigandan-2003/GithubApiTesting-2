function guessNumber(min, max) {
  if (min > max) {
    throw new Error("Minimum value cannot be greater than maximum value");
  }
  const randomNumber = Math.floor(Math.random() * (max - min + 1)) + min;
  return randomNumber;
}

module.exports = guessNumber;
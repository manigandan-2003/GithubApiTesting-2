function guessNumber(min, max) {
  const secretNumber = Math.floor(Math.random() * (max - min + 1)) + min;
  let guess;
  while (guess !== secretNumber) {
    guess = parseInt(prompt(`Guess a number between ${min} and ${max}:`));
    if (isNaN(guess)) {
      console.log('Invalid input. Please enter a number.');
    } else if (guess < secretNumber) {
      console.log('Too low!');
    } else if (guess > secretNumber) {
      console.log('Too high!');
    }
  }
  console.log(`Congratulations! You guessed the number ${secretNumber}.`);
}
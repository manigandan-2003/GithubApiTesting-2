/**
 * Plays a number guessing game with the user.
 * @param {number} min The minimum value of the range (inclusive).
 * @param {number} max The maximum value of the range (inclusive).
 */
function guessNumberGame(min, max) {
  if (min >= max) {
    throw new Error('Minimum value must be less than maximum value.');
  }

  const secretNumber = Math.floor(Math.random() * (max - min + 1)) + min;
  let guess;

  console.log(`Welcome to the Number Guessing Game!\nI'm thinking of a number between ${min} and ${max}.`);

  do {
    guess = parseInt(prompt('Take a guess:'), 10);
    if (isNaN(guess)) {
      console.log('Invalid input. Please enter a number.');
    } else if (guess < secretNumber) {
      console.log('Too low!');
    } else if (guess > secretNumber) {
      console.log('Too high!');
    }
  } while (guess !== secretNumber);

  console.log(`Congratulations! You guessed the number in ${guesses} tries.`);
}

// Example usage (uncomment to run):
//guessNumberGame(1, 100);
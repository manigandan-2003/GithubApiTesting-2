function guessNumberGame(min, max) {
  const secretNumber = Math.floor(Math.random() * (max - min + 1)) + min;
  let guess = null;
  let attempts = 0;

  while (guess !== secretNumber) {
    guess = parseInt(prompt(`Guess a number between ${min} and ${max}:`));
    attempts++;

    if (isNaN(guess)) {
      alert("Invalid input. Please enter a number.");
      continue;
    }

    if (guess < secretNumber) {
      alert("Too low!");
    } else if (guess > secretNumber) {
      alert("Too high!");
    } else {
      alert(`Congratulations! You guessed the number ${secretNumber} in ${attempts} attempts.`);
    }
  }
}

// You can optionally call the function here with default values or from Java
// guessNumberGame(1, 100);
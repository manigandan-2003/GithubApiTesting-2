# A* Search Algorithm Implementation in JavaScript

This repository contains a JavaScript implementation of the A* (A-star) search algorithm.  A* is a graph traversal and path search algorithm, which is often used in many fields of computer science due to its completeness, optimality, and efficiency.

## Algorithm Explanation

A* uses a heuristic function to estimate the cost of reaching the goal from a given node. The algorithm maintains two lists: an open list of nodes to be explored and a closed list of nodes already explored.  It iteratively selects the node with the lowest f_score (a combination of g_score and h_score) from the open list, expands its neighbors, and updates their g_score and f_score.

* **g_score:** The cost of reaching the current node from the start node.
* **h_score:**  A heuristic estimate of the cost of reaching the goal node from the current node (e.g., Manhattan distance, Euclidean distance).
* **f_score:** The sum of g_score and h_score (f_score = g_score + h_score).

The algorithm continues until the goal node is selected for expansion or the open list is empty.

## Usage

The `aStar.js` file contains the implementation.  You can use it by creating a graph represented as an adjacency list and providing the start and end nodes.

```javascript
// Example usage (requires aStar.js to be included)
const graph = {
  'A': [{node: 'B', cost: 1}, {node: 'C', cost: 4}],
  'B': [{node: 'D', cost: 2}],
  'C': [{node: 'D', cost: 1}],
  'D': []
};

const startNode = 'A';
const endNode = 'D';

const path = aStar(graph, startNode, endNode, heuristic); // heuristic function needs to be defined

console.log(path); // Output: The path from A to D
```

## File Structure

* `aStar.js`: Contains the A* algorithm implementation.

## Further Improvements

* Add different heuristic functions (e.g., Manhattan distance, Euclidean distance).
* Implement visualization of the search process.
* Add error handling for invalid inputs.

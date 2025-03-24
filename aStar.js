// aStar.js
function heuristic(a, b) { 
  // Example heuristic: Manhattan distance
  return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
}

function aStar(graph, start, end, heuristic) {
  // Implement A* algorithm using a priority queue for optimization
  const openSet = new PriorityQueue((a, b) => a.f - b.f);
  openSet.push({ node: start, g: 0, f: heuristic(start, end) });

  const cameFrom = {};
  const gScore = { [start]: 0 };
  const fScore = { [start]: heuristic(start, end) };

  while (!openSet.isEmpty()) {
    const current = openSet.pop().node;

    if (current === end) {
      return reconstructPath(cameFrom, current);
    }

    for (const neighbor of graph[current] || []) {
      const tentativeGScore = gScore[current] + neighbor.cost;
      if (!(neighbor.node in gScore) || tentativeGScore < gScore[neighbor.node]) {
        cameFrom[neighbor.node] = current;
        gScore[neighbor.node] = tentativeGScore;
        fScore[neighbor.node] = tentativeGScore + heuristic(neighbor.node, end);
        openSet.push({ node: neighbor.node, g: tentativeGScore, f: fScore[neighbor.node] });
      }
    }
  }

  return null; // No path found
}

function reconstructPath(cameFrom, current) {
  const path = [current];
  while (current in cameFrom) {
    current = cameFrom[current];
    path.unshift(current);
  }
  return path;
}

// PriorityQueue implementation (you'll need to implement this or use a library)
class PriorityQueue {
  constructor(compare) {
    this.heap = [];
    this.compare = compare;
  }

  push(item) {
    this.heap.push(item);
    this.bubbleUp(this.heap.length - 1);
  }

  pop() {
    if (this.heap.length === 0) return null;
    if (this.heap.length === 1) return this.heap.pop();
    const result = this.heap[0];
    this.heap[0] = this.heap.pop();
    this.bubbleDown(0);
    return result;
  }

  isEmpty() {
    return this.heap.length === 0;
  }

  bubbleUp(index) {
    while (index > 0) {
      const parentIndex = Math.floor((index - 1) / 2);
      if (this.compare(this.heap[index], this.heap[parentIndex]) >= 0) break;
      [this.heap[index], this.heap[parentIndex]] = [this.heap[parentIndex], this.heap[index]];
      index = parentIndex;
    }
  }

  bubbleDown(index) {
    while (true) {
      const leftChildIndex = 2 * index + 1;
      const rightChildIndex = 2 * index + 2;
      let smallestIndex = index;
      if (leftChildIndex < this.heap.length && this.compare(this.heap[leftChildIndex], this.heap[smallestIndex]) < 0) {
        smallestIndex = leftChildIndex;
      }
      if (rightChildIndex < this.heap.length && this.compare(this.heap[rightChildIndex], this.heap[smallestIndex]) < 0) {
        smallestIndex = rightChildIndex;
      }
      if (smallestIndex === index) break;
      [this.heap[index], this.heap[smallestIndex]] = [this.heap[smallestIndex], this.heap[index]];
      index = smallestIndex;
    }
  }
}
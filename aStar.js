// aStar.js
function heuristic(a, b) {
  // Example heuristic: Manhattan distance
  return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
}

function aStar(graph, start, end, heuristic) {
  // Using a priority queue for efficiency
  const openSet = new MinPriorityQueue();
  openSet.enqueue(start, heuristic(start, end));

  const cameFrom = {};
  const gScore = { [start]: 0 };
  const fScore = { [start]: heuristic(start, end) };

  while (!openSet.isEmpty()) {
    const current = openSet.dequeue().element;

    if (current === end) {
      return reconstructPath(cameFrom, current);
    }

    for (const neighbor of graph[current] || []) {
      const tentativeGScore = gScore[current] + neighbor.cost;
      if (!(neighbor.node in gScore) || tentativeGScore < gScore[neighbor.node]) {
        cameFrom[neighbor.node] = current;
        gScore[neighbor.node] = tentativeGScore;
        fScore[neighbor.node] = tentativeGScore + heuristic(neighbor.node, end);
        openSet.enqueue(neighbor.node, fScore[neighbor.node]);
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

//MinPriorityQueue Implementation (replace with your preferred library if needed)
class MinPriorityQueue {
  constructor() {
    this.heap = [];
  }

  enqueue(element, priority) {
    this.heap.push({element, priority});
    this.heapifyUp(this.heap.length - 1);
  }

  dequeue() {
    if (this.isEmpty()) return null;
    const [first] = this.heap; 
    this.swap(0, this.heap.length -1);
    this.heap.pop();
    this.heapifyDown(0);
    return first;
  }

  isEmpty() {
    return this.heap.length === 0;
  }
  heapifyUp(index) {
    let parentIndex = Math.floor((index - 1) / 2);
    while (index > 0 && this.heap[index].priority < this.heap[parentIndex].priority) {
      this.swap(index, parentIndex);
      index = parentIndex;
      parentIndex = Math.floor((index - 1) / 2);
    }
  }

  heapifyDown(index) {
    let leftChildIndex = 2 * index + 1;
    let rightChildIndex = 2 * index + 2;
    let smallestIndex = index;

    if (leftChildIndex < this.heap.length && this.heap[leftChildIndex].priority < this.heap[smallestIndex].priority) {
      smallestIndex = leftChildIndex;
    }
    if (rightChildIndex < this.heap.length && this.heap[rightChildIndex].priority < this.heap[smallestIndex].priority) {
      smallestIndex = rightChildIndex;
    }

    if (smallestIndex !== index) {
      this.swap(index, smallestIndex);
      this.heapifyDown(smallestIndex);
    }
  }
  swap(i, j) {
    [this.heap[i], this.heap[j]] = [this.heap[j], this.heap[i]];
  }
}
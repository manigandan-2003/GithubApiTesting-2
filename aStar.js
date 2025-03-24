function heuristic(a, b) {
  // Example heuristic: Manhattan distance
  return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
}

function aStar(graph, start, end, heuristic) {
  // Use a priority queue for efficiency
  const openSet = new PriorityQueue((a, b) => fScore[a] - fScore[b]);
  openSet.enqueue(start);

  const cameFrom = {};
  const gScore = { [start]: 0 };
  const fScore = { [start]: heuristic(start, end) };

  while (!openSet.isEmpty()) {
    const current = openSet.dequeue();

    if (current === end) {
      return reconstructPath(cameFrom, current);
    }

    for (const neighbor of graph[current] || []) {
      const tentativeGScore = gScore[current] + neighbor.cost;
      if (!(neighbor.node in gScore) || tentativeGScore < gScore[neighbor.node]) {
        cameFrom[neighbor.node] = current;
        gScore[neighbor.node] = tentativeGScore;
        fScore[neighbor.node] = tentativeGScore + heuristic(neighbor.node, end);
        if (!openSet.contains(neighbor.node)) {
          openSet.enqueue(neighbor.node);
        } else {
          openSet.updatePriority(neighbor.node);
        }
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

  enqueue(item) {
    this.heap.push(item);
    this.bubbleUp(this.heap.length - 1);
  }

  dequeue() {
    if (this.heap.length === 0) return null;
    this.swap(0, this.heap.length - 1);
    const result = this.heap.pop();
    this.bubbleDown(0);
    return result;
  }

  isEmpty() {
    return this.heap.length === 0;
  }

  contains(item) {
    return this.heap.includes(item);
  }

  updatePriority(item) {
    const index = this.heap.indexOf(item);
    this.bubbleUp(index);
    this.bubbleDown(index);
  }

  bubbleUp(index) {
    while (index > 0) {
      const parentIndex = Math.floor((index - 1) / 2);
      if (this.compare(this.heap[index], this.heap[parentIndex]) < 0) {
        this.swap(index, parentIndex);
        index = parentIndex;
      } else {
        break;
      }
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
      if (smallestIndex !== index) {
        this.swap(index, smallestIndex);
        index = smallestIndex;
      } else {
        break;
      }
    }
  }

  swap(i, j) {
    [this.heap[i], this.heap[j]] = [this.heap[j], this.heap[i]];
  }
}
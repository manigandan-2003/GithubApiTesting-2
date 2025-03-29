// aStar.js
function heuristic(a, b) {
  // Example heuristic: Manhattan distance
  return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
}

function aStar(graph, start, end, heuristic) {
  // Implement A* algorithm here...
  // This is a placeholder, replace with your actual implementation
  const openSet = new Set([start]);
  const cameFrom = {};
  const gScore = { [start]: 0 };
  const fScore = { [start]: heuristic(start, end) };

  while (openSet.size > 0) {
    let current = null;
    let lowestFScore = Infinity;
    for (const node of openSet) {
      if (fScore[node] < lowestFScore) {
        lowestFScore = fScore[node];
        current = node;
      }
    }

    if (current === end) {
      return reconstructPath(cameFrom, current);
    }

    openSet.delete(current);

    for (const neighbor of graph[current] || []) {
      const tentativeGScore = gScore[current] + neighbor.cost;
      if (!(neighbor.node in gScore) || tentativeGScore < gScore[neighbor.node]) {
        cameFrom[neighbor.node] = current;
        gScore[neighbor.node] = tentativeGScore;
        fScore[neighbor.node] = tentativeGScore + heuristic(neighbor.node, end);
        openSet.add(neighbor.node);
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

# Repository Report

This report details the files and content within this repository.

## Files:

* **TextFile.txt:**
```
Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus.
Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,
Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa.
Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim.
Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum.
Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo.Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus.
Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus.Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi.
```

* **File1.java:**
```java
public class File1{
 public int add(int a, int b) {
  return a + b;
 }
}
```

* **File2.java:**
```java
class File2{
 public static void main(String[] args) {
  File1 obj = new File1();
  System.out.println(obj.add(2, 2));
 }
}
```

* **aStar.js:**
```javascript
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
```

* **rahul.js:**
```javascript
for(let i=0;i>5;i++){
 console.log(i);
}
```

* **Omen.py:**
```python
from math import sqrt
# n is the number to be check whether it is prime or not
n = 1
# this flag maintains status whether the n is prime or not
prime_flag = 0
if(n > 1):
    for i in range(2, int(sqrt(n)) + 1):
        if (n / i == 0):
            prime_flag = 1
            break
    if (prime_flag == 0):
        print("True")
    else:
        print("False")
else:
    print("False")
```

* **Mani.java:**
```java
public class Mani {
 static double sqrt(int n, int p) {
  int s = 0;
  int e = n;
  double root = 0.0;
  while (s <= e) {
   int m = s + (e - s) / 2;
   if (m * m == n) {
    return m;
   } else if (m * m < n) {
    s = m + 1;
   } else {
    e = m - 1;
   }
  }
  double increment = 0.1;
  for (int i = 0; i < p; i++) {
   while (root * root <= n) {
    root += increment;
   }
   root -= increment;
   increment /= 10;
  }
  return s;
 }
 public static void main(String[] args) {
  System.out.printf(".3f", sqrt(2, 3));
 }
}
```

* **Searching/LinearSearch.java:**
```java
import java.util.Arrays;
class LinearSearch {
 public static int linearSearch1D(int[] arr, int target) {
  for (int i=0;i<arr.length;i++) {
   if (arr[i] == target) return i;
  }
  return -1;
 }
 public static int[] linearSearch2D(int[][] arr, int target) {
  for (int row=0;row<arr.length;row++) {
   for (int col=0;col<arr[row].length;col++) {
    if (arr[row][col] == target) return new int[]{row, col};
   }
  }
  return new int[]{-1, -1};
 }
 public static void main(String[] args) {
  int arr1D[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
  int target = 5;
  int result = linearSearch1D(arr1D, target);
  if (result == -1) {
   System.out.println("Element not found");
  } else {
   System.out.println("Element found at index: " + result);
  }
  int arr2D[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
  int result2D[] = linearSearch2D(arr2D, target);
  if (result2D[0] == -1) {
   System.out.println("Element not found");
  } else {
   System.out.println("Element found at index: " + Arrays.toString(result2D));
  }
 }
}
```

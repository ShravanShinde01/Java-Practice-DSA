#  Time and Space Complexity

Time and Space Complexity are used to measure the efficiency of an algorithm.

- **Time Complexity** tells us how the running time grows as the input size (`n`) increases.
- **Space Complexity** tells us how much extra memory an algorithm uses as the input size (`n`) increases.

---

#  Time Complexity

## Definition

Time Complexity is a way to measure how the running time of an algorithm grows as the input size (`n`) increases.

It does **not** measure the actual execution time in seconds. Instead, it measures the number of operations performed by an algorithm.

---

## Why do we use Time Complexity?

- Compare two algorithms.
- Find the most efficient algorithm.
- Predict performance for large inputs.

---

#  Common Time Complexities

| Complexity | Name | Example |
|------------|------|---------|
| O(1) | Constant | Array Access |
| O(log n) | Logarithmic | Binary Search |
| O(n) | Linear | Linear Search |
| O(n log n) | Linearithmic | Merge Sort |
| O(n²) | Quadratic | Bubble Sort |
| O(n³) | Cubic | Triple Nested Loop |
| O(2ⁿ) | Exponential | Recursive Fibonacci |
| O(n!) | Factorial | Permutations |

---

#  Examples

## O(1)

```java
int first = arr[0];
```

Constant time.

---

## O(n)

```java
for(int i = 0; i < n; i++){
    System.out.println(arr[i]);
}
```

Linear time.

---

## O(log n)

```java
while(low <= high){
    int mid = (low + high) / 2;

    if(arr[mid] == target)
        return mid;
    else if(arr[mid] < target)
        low = mid + 1;
    else
        high = mid - 1;
}
```

Binary Search.

---

## O(n²)

```java
for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
        System.out.println(i + " " + j);
    }
}
```

Nested loops.

---

#  Rules for Calculating Time Complexity

### Ignore Constants

```
O(2n) = O(n)

O(100) = O(1)
```

---

### Keep the Dominant Term

```
O(n² + n + 100)

= O(n²)
```

---

#  Best, Average and Worst Case

## Best Case

Minimum time required.

Example:

Linear Search

Element is found at the first index.

```
Best Case = O(1)
```

---

## Average Case

Expected running time for random input.

Linear Search

```
Average Case = O(n)
```

---

## Worst Case

Maximum time required.

Linear Search

Element is at the last index or not present.

```
Worst Case = O(n)
```

---

#  Asymptotic Notations

## Big O (O)

Represents the **Upper Bound** of an algorithm.

Usually used for Worst Case.

Example

```
Linear Search

Worst Case = O(n)
```

---

## Big Omega (Ω)

Represents the **Lower Bound**.

Usually used for Best Case.

Example

```
Linear Search

Best Case = Ω(1)
```

---

## Big Theta (Θ)

Represents the **Exact (Tight) Bound**.

Example

Merge Sort

```
Θ(n log n)
```

---

#  Difference Between O, Ω and Θ

| Notation | Meaning |
|----------|---------|
| O(f(n)) | Upper Bound |
| Ω(f(n)) | Lower Bound |
| Θ(f(n)) | Tight Bound |

Remember

```
O → At Most

Ω → At Least

Θ → Exactly
```

---

#  Space Complexity

## Definition

Space Complexity is the amount of memory required by an algorithm as the input size (`n`) increases.

It includes

- Input Space
- Auxiliary Space

Generally, interviews refer to **Auxiliary Space**.

---

#  Examples

## O(1)

```java
int sum = 0;

for(int i = 0; i < n; i++){
    sum += arr[i];
}
```

Only a few variables are used.

Space Complexity

```
O(1)
```

---

## O(n)

```java
int copy[] = new int[n];
```

Extra array is created.

Space Complexity

```
O(n)
```

---

## O(n²)

```java
int matrix[][] = new int[n][n];
```

Space Complexity

```
O(n²)
```

---

## Recursion

```java
void print(int n){
    if(n == 0)
        return;

    print(n - 1);
}
```

Recursive call stack grows with `n`.

Space Complexity

```
O(n)
```

---

#  Time Complexity vs Space Complexity

| Time Complexity | Space Complexity |
|-----------------|------------------|
| Measures execution time | Measures memory usage |
| Number of operations | Amount of memory used |
| Example: O(n) | Example: O(n) |

---

#  Interview Definitions

## Time Complexity

Time Complexity is the amount of time an algorithm takes as the input size (`n`) increases.

---

## Space Complexity

Space Complexity is the amount of memory an algorithm uses as the input size (`n`) increases.

---

## Big O

Represents the Upper Bound (Worst Case).

---

## Big Omega

Represents the Lower Bound (Best Case).

---

## Big Theta

Represents the Tight Bound (Exact Growth).

---

#  Cheat Sheet

| Algorithm | Best | Average | Worst | Space |
|-----------|------|---------|--------|-------|
| Linear Search | O(1) | O(n) | O(n) | O(1) |
| Binary Search | O(1) | O(log n) | O(log n) | O(1) |
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) |

---

#  Key Takeaways

- Time Complexity measures running time.
- Space Complexity measures memory usage.
- Big O → Upper Bound.
- Big Omega → Lower Bound.
- Big Theta → Tight Bound.
- Ignore constants and lower-order terms while calculating complexity.
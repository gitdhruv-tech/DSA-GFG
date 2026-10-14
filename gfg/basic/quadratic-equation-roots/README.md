# Quadratic Equation Roots

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a quadratic equation  **ax2 + bx + c = 0**, find its roots. If the equation has real roots, then return floor value of each root in decreasing order, If the roots are imaginary return  **-1**, the driver code will print  **Imaginary**.

 **Examples:** 

```
Input: a = 1, b = -2, c = 1
Output: [1, 1]
Explanation: Roots of equation x2-2x+1 are 1 and 1.
```

```
Input: a = 1, b = -7, c = 12
Output: [4, 3]
Explanation: Roots of equation x2 - 7x + 12 are 4 and 3.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T11:14:19.364Z  

```java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        int d = (b * b) - (4 * a * c);

        if (d < 0) {
           return new ArrayList<>(List.of(-1));
        }

        int x1 = (int) Math.floor((-b + Math.sqrt(d)) / (2.0 * a));
        int x2 = (int) Math.floor((-b - Math.sqrt(d)) / (2.0 * a));

        if (x1 > x2) {
            return new ArrayList<>(List.of(x1, x2));
        }

        return new ArrayList<>(List.of(x2, x1));
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/quadratic-equation-roots/1)
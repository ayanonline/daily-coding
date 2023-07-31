# Maximum and Minimum Element in an Array

## Approach Linear search:

1. Step1: Initialize values of min max by first two elements of the array respectively.
2. Step2: Starting from 3rd compare each elements with min and max then change the value accordingly.

```
class Pair {
    int min, max;
}

public class MaxMin {
    public static Pair getMinMax(int arr[]) {
        Pair minMax = new Pair();
        int n = arr.length;
        // if the array have only one elements
        if (n == 1) {
            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;
        }

        // initializing min max
        if (arr[0] > arr[1]) {
            minMax.max = arr[0];
            minMax.min = arr[1];
        } else if (arr[0] < arr[1]) {
            minMax.max = arr[1];
            minMax.min = arr[0];
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] > minMax.max) {
                minMax.max = arr[i];
            } else if (arr[i] < minMax.min) {
                minMax.min = arr[i];
            }
        }
        return minMax;
    }

    public static void main(String[] args) {
        int array[] = { 2 };
        Pair minMax = getMinMax(array);
        System.out.println("Min= " + minMax.min + "\nMax= " + minMax.max);
    }
}
```

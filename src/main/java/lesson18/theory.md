# Lesson 18



Алгоритм сортировки слиянием (Merge Sort) является классическим примером эффективного, стабильного алгоритма сортировки, работающего на принципе "разделяй и властвуй". Этот метод достигает хорошей производительности на больших массивах данных и гарантирует выполнение в худшем, среднем и лучшем случае за время \(O(n \log n)\), где \(n\) — количество элементов в массиве.

### Принцип работы

Алгоритм сортировки слиянием разбивает исходный массив на более мелкие массивы, пока каждый из мелких массивов не будет содержать только один элемент (или ни одного элемента). После этого начинается процесс слияния: мелкие массивы сливаются в более крупные упорядоченные массивы, пока не получится один отсортированный массив.

### Шаги алгоритма

1. **Разделение**: Делит массив на две примерно равные части.
2. **Рекурсивное сортирование**: Рекурсивно сортирует две половины массива.
3. **Слияние**: Сливает два упорядоченных массива в один упорядоченный массив.

### Пример реализации на Java

```java
public class MergeSort {
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
```

### Преимущества и недостатки

**Преимущества**:
- Гарантированное время выполнения \(O(n \log n)\).
- Стабильность (не меняет местами равные элементы).
- Хорошо работает для больших массивов и связных списков.

**Недостатки**:
- Требует дополнительного пространства памяти для временных массивов.
- Не так эффективен для небольших массивов по сравнению с алгоритмами типа сортировки вставками.

Алгоритм сортировки слиянием является хорошим выбором для больших наборов данных,
особенно когда важна стабильность сортировки и не критично использование дополнительной памяти.

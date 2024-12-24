#include <stdio.h>
int main() {
    int arr[100], n, largest, secondLargest;

    // Input the array size and elements
    printf("Enter number of elements: ");
    scanf("%d", &n);
    printf("Enter elements: ");
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    // Initialize `largest` and `secondLargest` with the first element
    largest = secondLargest = arr[0];

    // Find largest and second largest
    for (int i = 1; i < n; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }

    // Check if second largest is valid
    if (largest == secondLargest)
        printf("No second largest element found.\n");
    else
        printf("The second largest element is: %d\n", secondLargest);

    return 0;
}

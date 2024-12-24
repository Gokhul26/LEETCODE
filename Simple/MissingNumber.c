#include <stdio.h>
int main() {
    int arr[100], n, sum = 0, total = 5050;
    printf("Enter number of elements (1-99): ");
    scanf("%d", &n);
    printf("Enter elements: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        sum += arr[i];
    }
    printf("Missing number: %d\n", total - sum);
    return 0;
}

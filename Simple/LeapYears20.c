#include <stdio.h>
int main() {
    int year, count = 0;
    printf("Enter current year: ");
    scanf("%d", &year);
    while (count < 20) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            printf("%d ", year);
            count++;
        }
        year++;
    }
    printf("\n");
    return 0;
}

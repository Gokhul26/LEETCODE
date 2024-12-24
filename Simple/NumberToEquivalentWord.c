#include <stdio.h>
void numberToWords(int n) {
    char* words[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    if (n / 10 != 0)
        numberToWords(n / 10);
    printf("%s ", words[n % 10]);
}
int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    numberToWords(num);
    printf("\n");
    return 0;
}

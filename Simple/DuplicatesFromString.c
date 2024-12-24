#include <stdio.h>
#include <string.h>
int main() {
    char str[100];
    int freq[256] = {0};
    printf("Enter a string: ");
    scanf("%s", str);
    for (int i = 0; str[i]; i++)
        freq[(int)str[i]]++;
    printf("Duplicate characters: ");
    for (int i = 0; i < 256; i++)
        if (freq[i] > 1)
            printf("%c ", i);
    printf("\n");
    return 0;
}

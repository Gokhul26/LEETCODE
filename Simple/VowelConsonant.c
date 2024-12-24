#include <stdio.h>
#include <ctype.h>
int main() {
    char c;
    printf("Enter a character: ");
    scanf("%c", &c);
    c = tolower(c);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        printf("%c is a vowel.\n", c);
    else if ((c >= 'a' && c <= 'z'))
        printf("%c is a consonant.\n", c);
    else
        printf("Invalid input.\n");
    return 0;
}

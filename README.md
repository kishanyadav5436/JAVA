# JAVA
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

// Function prototypes
void parseExpression(const char **input);
void parseTerm(const char **input);
void parseFactor(const char **input);
void generateCode(const char *instruction);

// Global variable for temporary storage
int tempVarCount = 0;

// Generate code function
void generateCode(const char *instruction) {
    printf("%s\n", instruction);
}

// Parse expression
void parseExpression(const char **input) {
    parseTerm(input);

    while (**input == '+') {
        (*input)++;  // move pointer
        parseTerm(input);
        generateCode("ADD");  // addition
    }
}

// Parse term
void parseTerm(const char **input) {
    parseFactor(input);

    while (**input == '*') {
        (*input)++;
        parseFactor(input);
        generateCode("MUL");  // multiplication
    }
}

// Parse factor
void parseFactor(const char **input) {
    if (isdigit(**input)) {
        char num[10];
        int i = 0;

        while (isdigit(**input)) {
            num[i++] = **input;
            (*input)++;
        }
        num[i] = '\0';

        printf("PUSH %s\n", num);
    }
    else if (**input == '(') {
        (*input)++;
        parseExpression(input);

        if (**input == ')') {
            (*input)++;
        } else {
            printf("Error: Missing closing parenthesis\n");
            exit(1);
        }
    }
    else {
        printf("Error: Unexpected character %c\n", **input);
        exit(1);
    }
}

// Main function
int main() {
    char input[100];

    printf("Enter an arithmetic expression: ");
    fgets(input, sizeof(input), stdin);

    const char *inputPtr = input;

    parseExpression(&inputPtr);

    // Check extra characters
    if (*inputPtr != '\0' && *inputPtr != '\n') {
        printf("Error: Extra characters at end of input\n");
        return 1;
    }

    return 0;
}
<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0001-two-sum) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0001-two-sum) |
## Linked List
|  |
| ------- |
| [0021-merge-two-sorted-lists](https://github.com/kishanyadav5436/JAVA/tree/master/0021-merge-two-sorted-lists) |
## Recursion
|  |
| ------- |
| [0021-merge-two-sorted-lists](https://github.com/kishanyadav5436/JAVA/tree/master/0021-merge-two-sorted-lists) |
## Tree
|  |
| ------- |
| [2236-root-equals-sum-of-children](https://github.com/kishanyadav5436/JAVA/tree/master/2236-root-equals-sum-of-children) |
## Binary Tree
|  |
| ------- |
| [2236-root-equals-sum-of-children](https://github.com/kishanyadav5436/JAVA/tree/master/2236-root-equals-sum-of-children) |
## Math
|  |
| ------- |
| [0069-sqrtx](https://github.com/kishanyadav5436/JAVA/tree/master/0069-sqrtx) |
## Binary Search
|  |
| ------- |
| [0069-sqrtx](https://github.com/kishanyadav5436/JAVA/tree/master/0069-sqrtx) |
## Newton's Method
|  |
| ------- |
| [0069-sqrtx](https://github.com/kishanyadav5436/JAVA/tree/master/0069-sqrtx) |
<!---LeetCode Topics End-->
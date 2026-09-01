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
| [0004-median-of-two-sorted-arrays](https://github.com/kishanyadav5436/JAVA/tree/master/0004-median-of-two-sorted-arrays) |
| [0033-search-in-rotated-sorted-array](https://github.com/kishanyadav5436/JAVA/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/kishanyadav5436/JAVA/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0042-trapping-rain-water](https://github.com/kishanyadav5436/JAVA/tree/master/0042-trapping-rain-water) |
| [0053-maximum-subarray](https://github.com/kishanyadav5436/JAVA/tree/master/0053-maximum-subarray) |
| [0075-sort-colors](https://github.com/kishanyadav5436/JAVA/tree/master/0075-sort-colors) |
| [0179-largest-number](https://github.com/kishanyadav5436/JAVA/tree/master/0179-largest-number) |
| [0189-rotate-array](https://github.com/kishanyadav5436/JAVA/tree/master/0189-rotate-array) |
| [0238-product-of-array-except-self](https://github.com/kishanyadav5436/JAVA/tree/master/0238-product-of-array-except-self) |
| [0268-missing-number](https://github.com/kishanyadav5436/JAVA/tree/master/0268-missing-number) |
| [0303-range-sum-query-immutable](https://github.com/kishanyadav5436/JAVA/tree/master/0303-range-sum-query-immutable) |
| [0350-intersection-of-two-arrays-ii](https://github.com/kishanyadav5436/JAVA/tree/master/0350-intersection-of-two-arrays-ii) |
| [0414-third-maximum-number](https://github.com/kishanyadav5436/JAVA/tree/master/0414-third-maximum-number) |
| [0448-find-all-numbers-disappeared-in-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0448-find-all-numbers-disappeared-in-an-array) |
| [0455-assign-cookies](https://github.com/kishanyadav5436/JAVA/tree/master/0455-assign-cookies) |
| [0575-distribute-candies](https://github.com/kishanyadav5436/JAVA/tree/master/0575-distribute-candies) |
| [0704-binary-search](https://github.com/kishanyadav5436/JAVA/tree/master/0704-binary-search) |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0001-two-sum) |
| [0242-valid-anagram](https://github.com/kishanyadav5436/JAVA/tree/master/0242-valid-anagram) |
| [0268-missing-number](https://github.com/kishanyadav5436/JAVA/tree/master/0268-missing-number) |
| [0350-intersection-of-two-arrays-ii](https://github.com/kishanyadav5436/JAVA/tree/master/0350-intersection-of-two-arrays-ii) |
| [0448-find-all-numbers-disappeared-in-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0448-find-all-numbers-disappeared-in-an-array) |
| [0575-distribute-candies](https://github.com/kishanyadav5436/JAVA/tree/master/0575-distribute-candies) |
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
| [0094-binary-tree-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0094-binary-tree-inorder-traversal) |
| [2236-root-equals-sum-of-children](https://github.com/kishanyadav5436/JAVA/tree/master/2236-root-equals-sum-of-children) |
## Binary Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0094-binary-tree-inorder-traversal) |
| [2236-root-equals-sum-of-children](https://github.com/kishanyadav5436/JAVA/tree/master/2236-root-equals-sum-of-children) |
## Math
|  |
| ------- |
| [0069-sqrtx](https://github.com/kishanyadav5436/JAVA/tree/master/0069-sqrtx) |
| [0189-rotate-array](https://github.com/kishanyadav5436/JAVA/tree/master/0189-rotate-array) |
| [0268-missing-number](https://github.com/kishanyadav5436/JAVA/tree/master/0268-missing-number) |
## Binary Search
|  |
| ------- |
| [0004-median-of-two-sorted-arrays](https://github.com/kishanyadav5436/JAVA/tree/master/0004-median-of-two-sorted-arrays) |
| [0033-search-in-rotated-sorted-array](https://github.com/kishanyadav5436/JAVA/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/kishanyadav5436/JAVA/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0069-sqrtx](https://github.com/kishanyadav5436/JAVA/tree/master/0069-sqrtx) |
| [0268-missing-number](https://github.com/kishanyadav5436/JAVA/tree/master/0268-missing-number) |
| [0350-intersection-of-two-arrays-ii](https://github.com/kishanyadav5436/JAVA/tree/master/0350-intersection-of-two-arrays-ii) |
| [0704-binary-search](https://github.com/kishanyadav5436/JAVA/tree/master/0704-binary-search) |
## Newton's Method
|  |
| ------- |
| [0069-sqrtx](https://github.com/kishanyadav5436/JAVA/tree/master/0069-sqrtx) |
## Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/kishanyadav5436/JAVA/tree/master/0042-trapping-rain-water) |
| [0094-binary-tree-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0094-binary-tree-inorder-traversal) |
## Depth-First Search
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0094-binary-tree-inorder-traversal) |
## Design
|  |
| ------- |
| [0303-range-sum-query-immutable](https://github.com/kishanyadav5436/JAVA/tree/master/0303-range-sum-query-immutable) |
## Prefix Sum
|  |
| ------- |
| [0238-product-of-array-except-self](https://github.com/kishanyadav5436/JAVA/tree/master/0238-product-of-array-except-self) |
| [0303-range-sum-query-immutable](https://github.com/kishanyadav5436/JAVA/tree/master/0303-range-sum-query-immutable) |
## Bit Manipulation
|  |
| ------- |
| [0268-missing-number](https://github.com/kishanyadav5436/JAVA/tree/master/0268-missing-number) |
## Sorting
|  |
| ------- |
| [0075-sort-colors](https://github.com/kishanyadav5436/JAVA/tree/master/0075-sort-colors) |
| [0179-largest-number](https://github.com/kishanyadav5436/JAVA/tree/master/0179-largest-number) |
| [0242-valid-anagram](https://github.com/kishanyadav5436/JAVA/tree/master/0242-valid-anagram) |
| [0268-missing-number](https://github.com/kishanyadav5436/JAVA/tree/master/0268-missing-number) |
| [0350-intersection-of-two-arrays-ii](https://github.com/kishanyadav5436/JAVA/tree/master/0350-intersection-of-two-arrays-ii) |
| [0414-third-maximum-number](https://github.com/kishanyadav5436/JAVA/tree/master/0414-third-maximum-number) |
| [0455-assign-cookies](https://github.com/kishanyadav5436/JAVA/tree/master/0455-assign-cookies) |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
## Two Pointers
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/kishanyadav5436/JAVA/tree/master/0042-trapping-rain-water) |
| [0075-sort-colors](https://github.com/kishanyadav5436/JAVA/tree/master/0075-sort-colors) |
| [0125-valid-palindrome](https://github.com/kishanyadav5436/JAVA/tree/master/0125-valid-palindrome) |
| [0189-rotate-array](https://github.com/kishanyadav5436/JAVA/tree/master/0189-rotate-array) |
| [0350-intersection-of-two-arrays-ii](https://github.com/kishanyadav5436/JAVA/tree/master/0350-intersection-of-two-arrays-ii) |
| [0455-assign-cookies](https://github.com/kishanyadav5436/JAVA/tree/master/0455-assign-cookies) |
## String
|  |
| ------- |
| [0125-valid-palindrome](https://github.com/kishanyadav5436/JAVA/tree/master/0125-valid-palindrome) |
| [0179-largest-number](https://github.com/kishanyadav5436/JAVA/tree/master/0179-largest-number) |
| [0242-valid-anagram](https://github.com/kishanyadav5436/JAVA/tree/master/0242-valid-anagram) |
## Greedy
|  |
| ------- |
| [0179-largest-number](https://github.com/kishanyadav5436/JAVA/tree/master/0179-largest-number) |
| [0455-assign-cookies](https://github.com/kishanyadav5436/JAVA/tree/master/0455-assign-cookies) |
## Quicksort
|  |
| ------- |
| [0075-sort-colors](https://github.com/kishanyadav5436/JAVA/tree/master/0075-sort-colors) |
| [0455-assign-cookies](https://github.com/kishanyadav5436/JAVA/tree/master/0455-assign-cookies) |
## Divide and Conquer
|  |
| ------- |
| [0004-median-of-two-sorted-arrays](https://github.com/kishanyadav5436/JAVA/tree/master/0004-median-of-two-sorted-arrays) |
| [0053-maximum-subarray](https://github.com/kishanyadav5436/JAVA/tree/master/0053-maximum-subarray) |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
## Dynamic Programming
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/kishanyadav5436/JAVA/tree/master/0042-trapping-rain-water) |
| [0053-maximum-subarray](https://github.com/kishanyadav5436/JAVA/tree/master/0053-maximum-subarray) |
## Monotonic Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/kishanyadav5436/JAVA/tree/master/0042-trapping-rain-water) |
## Heap (Priority Queue)
|  |
| ------- |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
## Merge Sort
|  |
| ------- |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
## Bucket Sort
|  |
| ------- |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
## Radix Sort
|  |
| ------- |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
## Counting Sort
|  |
| ------- |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
## Bubble Sort
|  |
| ------- |
| [0075-sort-colors](https://github.com/kishanyadav5436/JAVA/tree/master/0075-sort-colors) |
<!---LeetCode Topics End-->
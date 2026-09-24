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
| [0049-group-anagrams](https://github.com/kishanyadav5436/JAVA/tree/master/0049-group-anagrams) |
| [0053-maximum-subarray](https://github.com/kishanyadav5436/JAVA/tree/master/0053-maximum-subarray) |
| [0075-sort-colors](https://github.com/kishanyadav5436/JAVA/tree/master/0075-sort-colors) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0106-construct-binary-tree-from-inorder-and-postorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0106-construct-binary-tree-from-inorder-and-postorder-traversal) |
| [0179-largest-number](https://github.com/kishanyadav5436/JAVA/tree/master/0179-largest-number) |
| [0189-rotate-array](https://github.com/kishanyadav5436/JAVA/tree/master/0189-rotate-array) |
| [0215-kth-largest-element-in-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0215-kth-largest-element-in-an-array) |
| [0217-contains-duplicate](https://github.com/kishanyadav5436/JAVA/tree/master/0217-contains-duplicate) |
| [0238-product-of-array-except-self](https://github.com/kishanyadav5436/JAVA/tree/master/0238-product-of-array-except-self) |
| [0268-missing-number](https://github.com/kishanyadav5436/JAVA/tree/master/0268-missing-number) |
| [0303-range-sum-query-immutable](https://github.com/kishanyadav5436/JAVA/tree/master/0303-range-sum-query-immutable) |
| [0350-intersection-of-two-arrays-ii](https://github.com/kishanyadav5436/JAVA/tree/master/0350-intersection-of-two-arrays-ii) |
| [0414-third-maximum-number](https://github.com/kishanyadav5436/JAVA/tree/master/0414-third-maximum-number) |
| [0448-find-all-numbers-disappeared-in-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0448-find-all-numbers-disappeared-in-an-array) |
| [0455-assign-cookies](https://github.com/kishanyadav5436/JAVA/tree/master/0455-assign-cookies) |
| [0575-distribute-candies](https://github.com/kishanyadav5436/JAVA/tree/master/0575-distribute-candies) |
| [0628-maximum-product-of-three-numbers](https://github.com/kishanyadav5436/JAVA/tree/master/0628-maximum-product-of-three-numbers) |
| [0643-maximum-average-subarray-i](https://github.com/kishanyadav5436/JAVA/tree/master/0643-maximum-average-subarray-i) |
| [0704-binary-search](https://github.com/kishanyadav5436/JAVA/tree/master/0704-binary-search) |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
| [1046-last-stone-weight](https://github.com/kishanyadav5436/JAVA/tree/master/1046-last-stone-weight) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0001-two-sum) |
| [0049-group-anagrams](https://github.com/kishanyadav5436/JAVA/tree/master/0049-group-anagrams) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0106-construct-binary-tree-from-inorder-and-postorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0106-construct-binary-tree-from-inorder-and-postorder-traversal) |
| [0141-linked-list-cycle](https://github.com/kishanyadav5436/JAVA/tree/master/0141-linked-list-cycle) |
| [0205-isomorphic-strings](https://github.com/kishanyadav5436/JAVA/tree/master/0205-isomorphic-strings) |
| [0217-contains-duplicate](https://github.com/kishanyadav5436/JAVA/tree/master/0217-contains-duplicate) |
| [0242-valid-anagram](https://github.com/kishanyadav5436/JAVA/tree/master/0242-valid-anagram) |
| [0268-missing-number](https://github.com/kishanyadav5436/JAVA/tree/master/0268-missing-number) |
| [0350-intersection-of-two-arrays-ii](https://github.com/kishanyadav5436/JAVA/tree/master/0350-intersection-of-two-arrays-ii) |
| [0383-ransom-note](https://github.com/kishanyadav5436/JAVA/tree/master/0383-ransom-note) |
| [0387-first-unique-character-in-a-string](https://github.com/kishanyadav5436/JAVA/tree/master/0387-first-unique-character-in-a-string) |
| [0448-find-all-numbers-disappeared-in-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0448-find-all-numbers-disappeared-in-an-array) |
| [0575-distribute-candies](https://github.com/kishanyadav5436/JAVA/tree/master/0575-distribute-candies) |
## Linked List
|  |
| ------- |
| [0021-merge-two-sorted-lists](https://github.com/kishanyadav5436/JAVA/tree/master/0021-merge-two-sorted-lists) |
| [0141-linked-list-cycle](https://github.com/kishanyadav5436/JAVA/tree/master/0141-linked-list-cycle) |
| [0206-reverse-linked-list](https://github.com/kishanyadav5436/JAVA/tree/master/0206-reverse-linked-list) |
## Recursion
|  |
| ------- |
| [0021-merge-two-sorted-lists](https://github.com/kishanyadav5436/JAVA/tree/master/0021-merge-two-sorted-lists) |
| [0206-reverse-linked-list](https://github.com/kishanyadav5436/JAVA/tree/master/0206-reverse-linked-list) |
## Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0094-binary-tree-inorder-traversal) |
| [0098-validate-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0098-validate-binary-search-tree) |
| [0100-same-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0104-maximum-depth-of-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0104-maximum-depth-of-binary-tree) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0106-construct-binary-tree-from-inorder-and-postorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0106-construct-binary-tree-from-inorder-and-postorder-traversal) |
| [0110-balanced-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0110-balanced-binary-tree) |
| [0112-path-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0112-path-sum) |
| [0124-binary-tree-maximum-path-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0124-binary-tree-maximum-path-sum) |
| [0144-binary-tree-preorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0145-binary-tree-postorder-traversal) |
| [0199-binary-tree-right-side-view](https://github.com/kishanyadav5436/JAVA/tree/master/0199-binary-tree-right-side-view) |
| [0226-invert-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0226-invert-binary-tree) |
| [0230-kth-smallest-element-in-a-bst](https://github.com/kishanyadav5436/JAVA/tree/master/0230-kth-smallest-element-in-a-bst) |
| [0235-lowest-common-ancestor-of-a-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0235-lowest-common-ancestor-of-a-binary-search-tree) |
| [0236-lowest-common-ancestor-of-a-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0236-lowest-common-ancestor-of-a-binary-tree) |
| [0437-path-sum-iii](https://github.com/kishanyadav5436/JAVA/tree/master/0437-path-sum-iii) |
| [0543-diameter-of-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0543-diameter-of-binary-tree) |
| [0572-subtree-of-another-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0572-subtree-of-another-tree) |
| [0700-search-in-a-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0700-search-in-a-binary-search-tree) |
| [0703-kth-largest-element-in-a-stream](https://github.com/kishanyadav5436/JAVA/tree/master/0703-kth-largest-element-in-a-stream) |
| [2236-root-equals-sum-of-children](https://github.com/kishanyadav5436/JAVA/tree/master/2236-root-equals-sum-of-children) |
## Binary Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0094-binary-tree-inorder-traversal) |
| [0098-validate-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0098-validate-binary-search-tree) |
| [0100-same-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0104-maximum-depth-of-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0104-maximum-depth-of-binary-tree) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0106-construct-binary-tree-from-inorder-and-postorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0106-construct-binary-tree-from-inorder-and-postorder-traversal) |
| [0110-balanced-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0110-balanced-binary-tree) |
| [0112-path-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0112-path-sum) |
| [0124-binary-tree-maximum-path-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0124-binary-tree-maximum-path-sum) |
| [0144-binary-tree-preorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0145-binary-tree-postorder-traversal) |
| [0199-binary-tree-right-side-view](https://github.com/kishanyadav5436/JAVA/tree/master/0199-binary-tree-right-side-view) |
| [0226-invert-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0226-invert-binary-tree) |
| [0230-kth-smallest-element-in-a-bst](https://github.com/kishanyadav5436/JAVA/tree/master/0230-kth-smallest-element-in-a-bst) |
| [0235-lowest-common-ancestor-of-a-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0235-lowest-common-ancestor-of-a-binary-search-tree) |
| [0236-lowest-common-ancestor-of-a-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0236-lowest-common-ancestor-of-a-binary-tree) |
| [0437-path-sum-iii](https://github.com/kishanyadav5436/JAVA/tree/master/0437-path-sum-iii) |
| [0543-diameter-of-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0543-diameter-of-binary-tree) |
| [0572-subtree-of-another-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0572-subtree-of-another-tree) |
| [0700-search-in-a-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0700-search-in-a-binary-search-tree) |
| [0703-kth-largest-element-in-a-stream](https://github.com/kishanyadav5436/JAVA/tree/master/0703-kth-largest-element-in-a-stream) |
| [2236-root-equals-sum-of-children](https://github.com/kishanyadav5436/JAVA/tree/master/2236-root-equals-sum-of-children) |
## Math
|  |
| ------- |
| [0069-sqrtx](https://github.com/kishanyadav5436/JAVA/tree/master/0069-sqrtx) |
| [0189-rotate-array](https://github.com/kishanyadav5436/JAVA/tree/master/0189-rotate-array) |
| [0268-missing-number](https://github.com/kishanyadav5436/JAVA/tree/master/0268-missing-number) |
| [0628-maximum-product-of-three-numbers](https://github.com/kishanyadav5436/JAVA/tree/master/0628-maximum-product-of-three-numbers) |
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
| [0020-valid-parentheses](https://github.com/kishanyadav5436/JAVA/tree/master/0020-valid-parentheses) |
| [0042-trapping-rain-water](https://github.com/kishanyadav5436/JAVA/tree/master/0042-trapping-rain-water) |
| [0094-binary-tree-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0094-binary-tree-inorder-traversal) |
| [0144-binary-tree-preorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0145-binary-tree-postorder-traversal) |
## Depth-First Search
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0094-binary-tree-inorder-traversal) |
| [0098-validate-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0098-validate-binary-search-tree) |
| [0100-same-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0101-symmetric-tree) |
| [0104-maximum-depth-of-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0104-maximum-depth-of-binary-tree) |
| [0110-balanced-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0110-balanced-binary-tree) |
| [0112-path-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0112-path-sum) |
| [0124-binary-tree-maximum-path-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0124-binary-tree-maximum-path-sum) |
| [0144-binary-tree-preorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0145-binary-tree-postorder-traversal) |
| [0199-binary-tree-right-side-view](https://github.com/kishanyadav5436/JAVA/tree/master/0199-binary-tree-right-side-view) |
| [0226-invert-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0226-invert-binary-tree) |
| [0230-kth-smallest-element-in-a-bst](https://github.com/kishanyadav5436/JAVA/tree/master/0230-kth-smallest-element-in-a-bst) |
| [0235-lowest-common-ancestor-of-a-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0235-lowest-common-ancestor-of-a-binary-search-tree) |
| [0236-lowest-common-ancestor-of-a-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0236-lowest-common-ancestor-of-a-binary-tree) |
| [0437-path-sum-iii](https://github.com/kishanyadav5436/JAVA/tree/master/0437-path-sum-iii) |
| [0543-diameter-of-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0543-diameter-of-binary-tree) |
| [0572-subtree-of-another-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0572-subtree-of-another-tree) |
## Design
|  |
| ------- |
| [0303-range-sum-query-immutable](https://github.com/kishanyadav5436/JAVA/tree/master/0303-range-sum-query-immutable) |
| [0703-kth-largest-element-in-a-stream](https://github.com/kishanyadav5436/JAVA/tree/master/0703-kth-largest-element-in-a-stream) |
| [0933-number-of-recent-calls](https://github.com/kishanyadav5436/JAVA/tree/master/0933-number-of-recent-calls) |
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
| [0049-group-anagrams](https://github.com/kishanyadav5436/JAVA/tree/master/0049-group-anagrams) |
| [0075-sort-colors](https://github.com/kishanyadav5436/JAVA/tree/master/0075-sort-colors) |
| [0179-largest-number](https://github.com/kishanyadav5436/JAVA/tree/master/0179-largest-number) |
| [0215-kth-largest-element-in-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0215-kth-largest-element-in-an-array) |
| [0217-contains-duplicate](https://github.com/kishanyadav5436/JAVA/tree/master/0217-contains-duplicate) |
| [0242-valid-anagram](https://github.com/kishanyadav5436/JAVA/tree/master/0242-valid-anagram) |
| [0268-missing-number](https://github.com/kishanyadav5436/JAVA/tree/master/0268-missing-number) |
| [0350-intersection-of-two-arrays-ii](https://github.com/kishanyadav5436/JAVA/tree/master/0350-intersection-of-two-arrays-ii) |
| [0414-third-maximum-number](https://github.com/kishanyadav5436/JAVA/tree/master/0414-third-maximum-number) |
| [0455-assign-cookies](https://github.com/kishanyadav5436/JAVA/tree/master/0455-assign-cookies) |
| [0628-maximum-product-of-three-numbers](https://github.com/kishanyadav5436/JAVA/tree/master/0628-maximum-product-of-three-numbers) |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
## Two Pointers
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/kishanyadav5436/JAVA/tree/master/0042-trapping-rain-water) |
| [0075-sort-colors](https://github.com/kishanyadav5436/JAVA/tree/master/0075-sort-colors) |
| [0125-valid-palindrome](https://github.com/kishanyadav5436/JAVA/tree/master/0125-valid-palindrome) |
| [0141-linked-list-cycle](https://github.com/kishanyadav5436/JAVA/tree/master/0141-linked-list-cycle) |
| [0189-rotate-array](https://github.com/kishanyadav5436/JAVA/tree/master/0189-rotate-array) |
| [0344-reverse-string](https://github.com/kishanyadav5436/JAVA/tree/master/0344-reverse-string) |
| [0350-intersection-of-two-arrays-ii](https://github.com/kishanyadav5436/JAVA/tree/master/0350-intersection-of-two-arrays-ii) |
| [0455-assign-cookies](https://github.com/kishanyadav5436/JAVA/tree/master/0455-assign-cookies) |
| [0557-reverse-words-in-a-string-iii](https://github.com/kishanyadav5436/JAVA/tree/master/0557-reverse-words-in-a-string-iii) |
## String
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/kishanyadav5436/JAVA/tree/master/0020-valid-parentheses) |
| [0049-group-anagrams](https://github.com/kishanyadav5436/JAVA/tree/master/0049-group-anagrams) |
| [0125-valid-palindrome](https://github.com/kishanyadav5436/JAVA/tree/master/0125-valid-palindrome) |
| [0179-largest-number](https://github.com/kishanyadav5436/JAVA/tree/master/0179-largest-number) |
| [0205-isomorphic-strings](https://github.com/kishanyadav5436/JAVA/tree/master/0205-isomorphic-strings) |
| [0242-valid-anagram](https://github.com/kishanyadav5436/JAVA/tree/master/0242-valid-anagram) |
| [0344-reverse-string](https://github.com/kishanyadav5436/JAVA/tree/master/0344-reverse-string) |
| [0383-ransom-note](https://github.com/kishanyadav5436/JAVA/tree/master/0383-ransom-note) |
| [0387-first-unique-character-in-a-string](https://github.com/kishanyadav5436/JAVA/tree/master/0387-first-unique-character-in-a-string) |
| [0557-reverse-words-in-a-string-iii](https://github.com/kishanyadav5436/JAVA/tree/master/0557-reverse-words-in-a-string-iii) |
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
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0106-construct-binary-tree-from-inorder-and-postorder-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0106-construct-binary-tree-from-inorder-and-postorder-traversal) |
| [0215-kth-largest-element-in-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0215-kth-largest-element-in-an-array) |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
## Dynamic Programming
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/kishanyadav5436/JAVA/tree/master/0042-trapping-rain-water) |
| [0053-maximum-subarray](https://github.com/kishanyadav5436/JAVA/tree/master/0053-maximum-subarray) |
| [0124-binary-tree-maximum-path-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0124-binary-tree-maximum-path-sum) |
## Monotonic Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/kishanyadav5436/JAVA/tree/master/0042-trapping-rain-water) |
## Heap (Priority Queue)
|  |
| ------- |
| [0215-kth-largest-element-in-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0215-kth-largest-element-in-an-array) |
| [0703-kth-largest-element-in-a-stream](https://github.com/kishanyadav5436/JAVA/tree/master/0703-kth-largest-element-in-a-stream) |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
| [1046-last-stone-weight](https://github.com/kishanyadav5436/JAVA/tree/master/1046-last-stone-weight) |
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
| [0383-ransom-note](https://github.com/kishanyadav5436/JAVA/tree/master/0383-ransom-note) |
| [0387-first-unique-character-in-a-string](https://github.com/kishanyadav5436/JAVA/tree/master/0387-first-unique-character-in-a-string) |
| [0912-sort-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0912-sort-an-array) |
## Bubble Sort
|  |
| ------- |
| [0075-sort-colors](https://github.com/kishanyadav5436/JAVA/tree/master/0075-sort-colors) |
## Queue
|  |
| ------- |
| [0387-first-unique-character-in-a-string](https://github.com/kishanyadav5436/JAVA/tree/master/0387-first-unique-character-in-a-string) |
| [0933-number-of-recent-calls](https://github.com/kishanyadav5436/JAVA/tree/master/0933-number-of-recent-calls) |
## Quickselect
|  |
| ------- |
| [0215-kth-largest-element-in-an-array](https://github.com/kishanyadav5436/JAVA/tree/master/0215-kth-largest-element-in-an-array) |
## Sliding Window
|  |
| ------- |
| [0643-maximum-average-subarray-i](https://github.com/kishanyadav5436/JAVA/tree/master/0643-maximum-average-subarray-i) |
## Bracket Sequences
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/kishanyadav5436/JAVA/tree/master/0020-valid-parentheses) |
## Data Stream
|  |
| ------- |
| [0703-kth-largest-element-in-a-stream](https://github.com/kishanyadav5436/JAVA/tree/master/0703-kth-largest-element-in-a-stream) |
| [0933-number-of-recent-calls](https://github.com/kishanyadav5436/JAVA/tree/master/0933-number-of-recent-calls) |
## Floyd's Cycle Finding Algorithm
|  |
| ------- |
| [0141-linked-list-cycle](https://github.com/kishanyadav5436/JAVA/tree/master/0141-linked-list-cycle) |
## Breadth-First Search
|  |
| ------- |
| [0100-same-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/kishanyadav5436/JAVA/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0104-maximum-depth-of-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0104-maximum-depth-of-binary-tree) |
| [0112-path-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0112-path-sum) |
| [0199-binary-tree-right-side-view](https://github.com/kishanyadav5436/JAVA/tree/master/0199-binary-tree-right-side-view) |
| [0226-invert-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0226-invert-binary-tree) |
## Binary Search Tree
|  |
| ------- |
| [0098-validate-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0098-validate-binary-search-tree) |
| [0230-kth-smallest-element-in-a-bst](https://github.com/kishanyadav5436/JAVA/tree/master/0230-kth-smallest-element-in-a-bst) |
| [0235-lowest-common-ancestor-of-a-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0235-lowest-common-ancestor-of-a-binary-search-tree) |
| [0700-search-in-a-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0700-search-in-a-binary-search-tree) |
| [0703-kth-largest-element-in-a-stream](https://github.com/kishanyadav5436/JAVA/tree/master/0703-kth-largest-element-in-a-stream) |
## Binary Lifting
|  |
| ------- |
| [0235-lowest-common-ancestor-of-a-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0235-lowest-common-ancestor-of-a-binary-search-tree) |
| [0236-lowest-common-ancestor-of-a-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0236-lowest-common-ancestor-of-a-binary-tree) |
## Lowest Common Ancestor
|  |
| ------- |
| [0235-lowest-common-ancestor-of-a-binary-search-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0235-lowest-common-ancestor-of-a-binary-search-tree) |
| [0236-lowest-common-ancestor-of-a-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0236-lowest-common-ancestor-of-a-binary-tree) |
## String Matching
|  |
| ------- |
| [0572-subtree-of-another-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0572-subtree-of-another-tree) |
## Hash Function
|  |
| ------- |
| [0572-subtree-of-another-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0572-subtree-of-another-tree) |
## DP on Trees
|  |
| ------- |
| [0124-binary-tree-maximum-path-sum](https://github.com/kishanyadav5436/JAVA/tree/master/0124-binary-tree-maximum-path-sum) |
| [0543-diameter-of-binary-tree](https://github.com/kishanyadav5436/JAVA/tree/master/0543-diameter-of-binary-tree) |
<!---LeetCode Topics End-->
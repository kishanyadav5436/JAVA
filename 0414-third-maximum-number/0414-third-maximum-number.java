class Solution {
   int thirdMax(int[] nums) {

    long first = Long.MIN_VALUE;
    long second = Long.MIN_VALUE;
    long third = Long.MIN_VALUE;

    // First maximum
    for(int num : nums) {
        if(num > first) {
            first = num;
        }
    }

    // Second maximum
    for(int num : nums) {
        if(num < first && num > second) {
            second = num;
        }
    }

    // Third maximum
    for(int num : nums) {
        if(num < second && num > third) {
            third = num;
        }
    }

    if(third == Long.MIN_VALUE) {
        return (int)first;
    }

    return (int)third;
}    
    }

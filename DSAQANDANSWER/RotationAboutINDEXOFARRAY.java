import java.util.Scanner;

public class RotationAboutINDEXOFARRAY {

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            }

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // target lies in left half
                } else {
                    left = mid + 1;  // target lies in right half
                }
            } else { // Right half is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;  // target lies in right half
                } else {
                    right = mid - 1; // target lies in left half
                }
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target value:");
        int target = sc.nextInt();

        int result = search(arr, target);
        System.out.println("Index of target: " + result);
    }
}
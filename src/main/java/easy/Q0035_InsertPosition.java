package easy;

public class Q0035_InsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i]) {
                index++;
            } else {
                return index;
            }
        }

        return index;
    }

    public static int searchInsertAns(int[] A, int target) {
        int low = 0, high = A.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid] == target) return mid;
            else if (A[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6};
        System.out.println(searchInsert(a, 5));
        System.out.println(searchInsert(a, 2));
        System.out.println(searchInsert(a, 7));
        System.out.println(searchInsert(a, 0));
    }
}

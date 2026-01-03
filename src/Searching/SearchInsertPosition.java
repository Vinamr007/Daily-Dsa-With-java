package Searching;

public class SearchInsertPosition {
    private int searchInsert(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
               int res= mid;
            }  else if (nums[mid]< target) {
                st=mid+1;
            } else {
                end=mid-1;
            }
        }

        return st;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        SearchInsertPosition ab = new SearchInsertPosition();
        System.out.println(ab.searchInsert(nums, target));
    }
}

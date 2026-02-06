package Hasing;

import java.util.HashSet;

public class ContainDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for (int num : nums) {
            if (s.contains(num)) {
                return true;
            }
            s.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,2,8,9,4};

        System.out.println(containsDuplicate(a));
    }
}
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//Explanation:
//The element 1 occurs at the indices 0 and 3.

//Example 2:
//Input: nums = [1,2,3,4]
//Output: false
//Explanation:
//All elements are distinct.

//Example 3:
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
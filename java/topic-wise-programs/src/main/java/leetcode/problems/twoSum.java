package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class twoSum {
    public static void main(String[] args) {
        //int[] input = {2,7,11,15};
        int[] input = {3, 3};
        int[] result = worstTwoSum(input, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    // this is using two pointer solution - works only if the array is sorted
    public static int[] twoSum(int[] nums, int target) {
        int start_idx = 0;
        int end_idx = nums.length - 1;
        int[] result = new int[2];
        while (end_idx > start_idx){
            if ((nums[start_idx] + nums[end_idx]) == target){
                result[0] = start_idx;
                result[1] = end_idx;
                return result;
            }else if((nums[start_idx] + nums[end_idx]) > target){
                end_idx = end_idx - 1;
            }else {
                start_idx = start_idx + 1;
            }
        }
        return result;
    }

    // this is solved using list
    public static int[] twoSumList(int[] nums, int target) {
        List<Integer> input = new ArrayList();
        int[] resultSet1 = new int[2];
        int[] resultSet2 = new int[2];
        for (int i = 0; i < nums.length; i++) {
            input.add(Integer.valueOf(nums[i]));
        }
        for (int i = 0; i < input.size(); i++) {
            int number = input.get(i);
            int diff = target - number;
            if (input.contains(diff) && (number != diff)){
                resultSet1[0] = input.indexOf(number);
                resultSet1[1] = input.indexOf(diff);
            }
            if (input.contains(diff) && (number == diff)){
                resultSet2[0] = input.indexOf(number);
                resultSet2[1] = input.lastIndexOf(diff);
            }
        }
        if (resultSet1.length == 0){
            return resultSet2;
        }else {
            return resultSet1;
        }
    }

    public static int[] worstTwoSum(int[] nums, int target){
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j] == target) && (i != j)){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}

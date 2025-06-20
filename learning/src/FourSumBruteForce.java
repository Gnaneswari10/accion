import java.util.*;

public class FourSumBruteForce {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        List<List<Integer>> result = fourSum(nums,target);
        System.out.println(result);



    }
    public static   List<List<Integer>> fourSum(int[] nums , int target) {
        Set<List<Integer>> setsum = new HashSet<>();

        int n = nums.length;
        for (int i=0;i<n-3;i++){
            for (int j=i+1;j<n-2;j++){
                for (int k=j+1; k<n-1; k++){
                    for (int l= k+1; l<n; l++) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];


                        if (sum == target) {
                            List<Integer> triplets = Arrays.asList(nums[i], nums[j], nums[k],nums[l]);
                            Collections.sort(triplets);
                            setsum.add(triplets);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(setsum);


    }
}

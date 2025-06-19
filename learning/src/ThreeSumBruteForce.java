import java.util.*;

public class ThreeSumBruteForce {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);



    }
    public static   List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> setsum = new HashSet<>();

        int n = nums.length;
        for (int i=0;i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                for (int k=j+1; k<n; k++){
                    int sum = nums[i]+nums[j]+nums[k];


                    if (sum == 0) {
                        List<Integer> triplets = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(triplets);
                        setsum.add(triplets);
                    }
                }
            }
        }

            return new ArrayList<>(setsum);


    }
}

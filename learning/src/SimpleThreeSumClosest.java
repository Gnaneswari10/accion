public class SimpleThreeSumClosest {
    public static void main(String[] args) {
        SimpleThreeSumClosest simpleThreeSumClosest = new SimpleThreeSumClosest();
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int result = simpleThreeSumClosest.simplesumClosest( nums, target);
        System.out.println(result);

    }
    public int simplesumClosest(int[] nums, int target){
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                for (int k=j+1;k< nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    int dif = Math.abs(sum-target);

                    if (dif < minDifference){
                        minDifference =dif;
                        closest = sum;
                    }
                }
            }
        }
        return closest;
    }
}

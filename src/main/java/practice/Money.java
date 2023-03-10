package practice;

public class Money {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] dp = new int[nums.length];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        }
        System.out.println(dp[dp.length-1]);


        int[] dp1 = new int[nums.length+1];
        dp1[0] = 0;
        dp1[1] = nums[0];
        for (int i = 2; i < dp1.length; i++) {
            dp1[i] = Math.max(dp1[i-1],nums[i-1]+dp1[i-2]);
        }
        System.out.println(dp1[dp1.length-1]);
    }

}

package oo.demo04;

public class Steal {
    public static void main(String[] args) {
        int[] nums = {2,10,1,1,5};
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        }
        System.out.println("最多能偷"+dp[dp.length-1]);
    }
}

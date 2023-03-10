package practice;

import java.util.Arrays;

public class Steal02 {
    public static void main(String[] args) {
        int[] num = {2,1,1,10,5};
        int[] dp = new int[num.length];
        String result = M(num,dp);
        System.out.println(result);
    }
    private static String  M(int[] num,int[] dp){
        int max=0;
        int max1=0;
        dp[0]=0;
        int[] num1 = Arrays.copyOf(num,num.length-1);
        System.out.println(Arrays.toString(num1));
        dp[1]=num1[0];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i-1], num1[i-1] + dp[i -2]);
            max=dp[dp.length-1];
        }
        System.out.println("从第一家偷："+max);
        int[] num2 = Arrays.copyOfRange(num,1,num.length);
        System.out.println(Arrays.toString(num2));
        dp[1]=num2[0];
        for (int j = 2; j < dp.length; j++) {
            dp[j]=Math.max(dp[j-1],num2[j-1]+dp[j-2]);
            max1=dp[dp.length-1];
        }
        System.out.println("从第二家偷："+max1);
        return max>max1?"最终选择从第一家偷："+max:"最终从第二家偷："+max1;
    }
}

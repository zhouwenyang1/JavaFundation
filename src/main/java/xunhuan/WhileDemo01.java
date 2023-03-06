package xunhuan;

/*
回文数
 */
public class WhileDemo01 {
    public static void main(String[] args) {
        //定义数字
        int x = 12321;
        //定义一个数保存最先的x
        int temp = x;
        //记录倒过来的结果
        int num = 0;
        //利用循环开始
        while (x != 0) {
            //从右往左获取每一位数字
            int ge = x % 10;
            //修改一下x记录的值
            x = x / 10;
            //把获取到的数字拼接到最右边
            num = num * 10 + ge;
        }
        //打印num
        System.out.println(num);
        System.out.println(x);
        //比较
        System.out.println(num == x);
    }
}

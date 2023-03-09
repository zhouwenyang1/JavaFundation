package practice;
public class HanLuoTa {
    static int step=0;
    public static void main(String[] args) {
        HanLuoTa hanLuoTa=new HanLuoTa();
        int moveStep = hanLuoTa.move(3, 'A', 'B', 'C');
        System.out.println("总共移动"+moveStep+"步");
    }
    public static int move(int num,char A,char B,char C){
        if(num==1){
            System.out.println("第"+num+"个圆盘从"+A+"移动到"+C);
            step++;
            return step;
        }else {
            move(num-1,A,C,B);
            System.out.println("第"+num+"个圆盘从"+A+"移动到"+C);
            step++;
            move(num-1,B,A,C);
        }
        return step;
    }
}

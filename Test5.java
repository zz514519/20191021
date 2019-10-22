import java.util.Random;
/**
 * Author : Zhang Zhe
 */
public class Test5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int shu =  rd.nextInt(100);//100位数。
        shu = shu * 9;
        panduan(shu);
    }
    public static void panduan(int num) {
        int b = num / 100;
        int s = num % 100 / 10;
        int g = num % 10;
        if (num % 9 == 0) {
            System.out.println(num + "能被9整除");
            if ((b + s + g) % 9 == 0) {
                System.out.println("同时" + num + "的各个位数之和能被9整除");
            } else {
                System.out.println("但是" + num + "的各个位数之和不能被9整除");
            }
        } else {
              System.out.println("next test!");
        }
    }
}
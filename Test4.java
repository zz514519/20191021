/**
 * Author : Zhang Zhe
 */
/* 、编写程序解决“百钱买百鸡”问题。
         * 公鸡五钱一只，母鸡三钱一只，
         * 小鸡 一钱三只，
         * 现有百钱欲买百鸡，共有多少种买法？
*/
public class Test4 {
    public static void main(String[] args) {
        int count = 0;
          for(int i = 0;i < 20;++i){
              for(int j = 0 ;  j < 34 ; ++j){
                  for(int n = 0 ; n < 100 - i - j ; ++n){
                      if(5*i+3*j+n/3==100&&n%3==0){
                          ++count;
                      }
                  }
              }
          }
          System.out.println(count);
    }
}

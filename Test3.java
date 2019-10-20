import java.util.Arrays;

/*import java.util.Arrays;

//数组的部分拷贝
public class Test3 {
    public static void main(String[] args) {
        int[] array = {1,445,23,456,76};
        project(array);
    }
    public static void project(int[] array){
        int[] arr = Arrays.copyOfRange(array,1,4);//下标为[1,4)=[1,3]
        for (int x:  arr
             ) {
            System.out.println(x);
        }
    }
 }
*/
public class Test3{
    public static void main(String[] args) {
        int[] array = {12,657,3,45,23};
        project(array);
    }
    public static void project(int[] array){
        Arrays.sort(array);
        for (int x: array) {
            System.out.print(x+" ");
        }
    }

}
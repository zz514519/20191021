/**
 * Author : Zhang Zhe
 */
//二分查找。
public class Test6 {
    public static void main(String[] args) {
           int[] array = {1,234,45,565,67};
           int number = project(array,565);
           System.out.println(number);
    }
    public static int project(int[] array,int toFing){
        int left = 0;
        int right = array.length-1;
        while(right>=left){
            int mid = (left+right)/2;
            if(array[mid]>toFing){
               right = mid -1;
            }else if(toFing>array[mid]){
                left = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

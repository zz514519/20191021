import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {9,1, 2, 3, 4, 5, 6};

        for (int i = 0; i < array.length - 1; ++i) {
           boolean flag = false;
            for (int j = i; j < array.length - 1 - i; ++j) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = true;
                }
                if(!flag){
                    break;
                }
            }
        }
            System.out.println(Arrays.toString(array));
        }
    }

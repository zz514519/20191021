public class Test1 {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        int left = 0;
        int right = array.length-1;
       int number =  binarySearch(array,5,left,right);
        System.out.println("下标是"+number);
    }
    public static int binarySearch(int[] array,int key,int left,int right){
       if(left>right) {
           return -1;
       }
         int mid = (right+left)/2;
            if(key<array[mid]){
               return binarySearch(array,key,left,mid-1);
            }else if(key>array[mid]){
                return binarySearch(array,key,mid+1,right);
            }else{
           return mid;
        }
    }
}

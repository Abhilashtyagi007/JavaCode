public class IsSortedArray {
    public static void main(String[] args) {
        int arr[] = { 1 , 3 ,7,4 ,6};
        boolean res = isArraySorted(arr, 1);
        System.out.println(res);
    }
    public static boolean isArraySorted(int arr[],int index){
        if(index == arr.length) return true;
        if(arr[index] < arr[index-1]) return false;

        return isArraySorted(arr, index+1);
    }
}

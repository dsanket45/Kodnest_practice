public class Sor {
    public static void main(String[] args) {
        int[] arr = {2,8,5,3,4,8,9,1};
        // int[] arr2 = new int[arr.length];
        System.out.print( "UnSorted array : ");
        for(int x : arr){
        System.out.print(x + " ");}
        
        for(int j=0;j<arr.length-1;j++){
        for(int i=0;i<arr.length-1-j;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }}
System.err.println("");
        System.out.print( "Sorted array : ");
        for(int x : arr)
        System.out.print(x + " ");
    }
}
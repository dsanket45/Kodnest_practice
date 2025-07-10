public class Search {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "fig", "grape"};
        String target = "cherry";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println(target + " Found at index: " + i);
                break;
            }
            else{
                System.out.println("Not found at index: " + i);
            }
        }
    }
}


import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class ShiftZero {
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);

        int[] ar = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new TreeSet<>();
        for(int num : ar) {
            set.add(num);
        }
        System.out.println("After removing duplicates:");
        for(int num : set) {
            System.out.print(num + " ");
        }
        int a = 5;
        a++;
        System.out.println(a++ * 2);
        String s = "hello";
        s.concat("world");
        System.out.println(s);

        int[] a4 = {7,1,3,4,5,6,2};
        int mini = a4[0],profit=0;
        for(int i=1;i<a4.length;i++){
            int cost = a4[i] - mini;
            profit = Math.max(cost,profit);
            mini = Math.min(mini,a4[i]);
        }
        System.out.println(profit);



        System.out.println("enter names");
        
        // String s1 = sc.next().toLowerCase();
        // String s2 = sc.next().toLowerCase();

        String s1  = "listen";
        String s2  = "silent";
        if(s1.length()!=s2.length()){
            System.out.println("not anagrams");
        }
        else {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2)){
                System.out.println("anagrams");
            }
            else{
                System.out.println("not anagrams");

            }
        }




        System.err.println("hello");
        int[] arr = {1,2,0,3,0,4,0,5,6,0};
        int j=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if (j==-1) return;
        for(int i=j+1;i<arr.length;i++){
        if(arr[i]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
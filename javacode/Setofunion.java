
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Setofunion {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,5,5,6};
        int[] b = {1,2,3,5,6,7,8};
        TreeSet<Integer> st = new TreeSet<>(); 
        for(int i=0;i<a.length;i++){
            st.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            st.add(b[i]);
        }
        System.err.println(st);
        System.err.println("intersection");

        int i=0;
        int j=0;
        List<Integer> al = new ArrayList<>();
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }
            else if (a[i] > b[j]){
                j++;
            }
            else {
                al.add(a[i]);
                i++;
                j++;
            }
        }
        System.out.println(al);

    }

    
}
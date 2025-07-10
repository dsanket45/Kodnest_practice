
import java.util.Arrays;

public class TwoSum {
    
    public static void main(String[] args) {
        System.out.println("rearrange by thier sign");
        int[] a3 = {3,-2,-4,-5,5,4,1,-3,2,-2};
        int[] a4 = new int[a3.length];
        int positiveindex = 0,negativeindex=1;
        for(int i=0;i<a3.length-1;i++){
            if(a3[i]<0){
                a4[negativeindex] = a3[i];
                negativeindex+=2;
            }
            else {
                a4[positiveindex] = a3[i];
                positiveindex+=2;
            }
        }
        System.out.println(Arrays.toString(a4));




        System.out.println("maximum subaarray using kadane algorithm");
        int[] a2 = {1,-2,3,-4,5,3,-2,1,-2,3,4};
        System.out.println(maximumsubarray(a2));
        
        
        int[] ar = {1,0,2,0,0,2,0,2,0,8,0,1,0,2,0,9,7};
    
        System.out.println(findMajority(ar));
        Arrays.sort(ar);
        System.err.println(Arrays.toString(ar));


        int[] a = {1,2,3,2,6,7,4,9,8,4,5,6};
        Arrays.sort(a);
        int i=0;
        int j=a.length-1;
        int k = 10;
        while(i<j){
            int sum = a[i]+a[j];
            if(sum==k){
                System.out.print(a[i]+","+a[j]+"\n");
                i++;
                j--;
            }
            else if(sum < k){
                i++;
            }
            else {
                j--;
            }
        }
    }


public static int findMajority(int[] a) {
    int count = 0;
    int candidate = 0;

    for (int num : a) {
        if (count == 0) {
            candidate = num; // Choose current num as a new candidate
        }

        if (num == candidate) {
            count++; // Found the same as candidate
        } else {
            count--; // Different → reduce confidence
        }
    }

    return candidate;
}

public static int maximumsubarray(int [] a){
    int maxi = 0;
    int sum= 0;
    for(int i=0;i<a.length;i++){
        sum +=a[i];

        if(sum>maxi){
            maxi = sum;
        }

        if(sum<0){
            sum=0;
        }
    }
    return maxi;
}
    
}

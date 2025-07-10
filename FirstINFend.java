import java.util.Scanner;

public class FirstINFend {
    public static void main(String[] args){
        int a = 'A';
        System.out.println(a);
        System.out.println("Enter number to check prime or not range u want, position: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(primechecker(n))
            System.out.println("Hey "+n+" is a prime number");
        else
            System.out.println("Hey "+n+" is not a prime number");
        
        int start = sc.nextInt();
        int stop = sc.nextInt();
        for (int i=start;i<=stop;i++){
            if(primechecker(i))
                System.out.println(i+" ");
        }

        int count = 0;
        int num = 2;
        while (count<n){
            if(primechecker(num)){
            count++;
            System.out.print(count + " : " + num + " , ") ;
            if(count==n){ // stops at the index if u want only one number index wise  
            System.out.println(count + "th position prime : " + num);}
            }
            num++;
        }
    }
    public static boolean primechecker(int n){
        if(n<2) 
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
}
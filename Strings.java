public class Strings {

    public static void main(String[] args) {
        

        String a = "sanket";
        String b =new String("sanket") ;

        System.out.println(a.equals(b));

        String s = "banana";
        String s2 = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!s2.contains(ch+"")){
                s2 = s2+ch;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if(c==ch)
                    count++;
            }
            System.out.print(c+""+count);
            
        }System.out.println();
        System.out.println("original " + s);
        System.out.println("duplicate " + s2);
    }
}
package DSA_BOOTCAMP.Array.Day16;

public class AnagramChracter {
    public static int range(String s1){
        int sum1=0;
        for(int i=0;i<s1.length();i++){
         sum1+=s1.charAt(i);
        }
        //System.out.println(sum1);
return sum1;
    }

    public static int range2(String s2){
        int sum2=0;
        for(int i=0;i<s2.length();i++){
            sum2+=s2.charAt(i);
        }
     //   System.out.println(sum2);
        return sum2;
    }
    public static void main(String[] args) {
        String s1 = "anagram";
      String  s2 = "nagaram";
        int n=range(s1);
        int m=range(s2);

        if(n==m){
            System.out.println("true");
        }
        else{
            System.out.println("flase");
        }
    }
}

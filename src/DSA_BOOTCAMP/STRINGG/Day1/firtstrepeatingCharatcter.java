package DSA_BOOTCAMP.STRINGG.Day1;

public class firtstrepeatingCharatcter {
    public static void main(String[] args) {
        String s="programing";
        int count=0;
        for(int i=0;i<s.length();i++){
            //count=1;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>=2){
                System.out.println(s.charAt(i));
                return;
            }
        }
    }
}

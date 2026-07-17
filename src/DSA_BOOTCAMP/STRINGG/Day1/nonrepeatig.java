package DSA_BOOTCAMP.STRINGG.Day1;

public class nonrepeatig {
    public static void main(String[] args) {
        String s="aabbccde";
        int count ;
        for(int i=0;i<s.length();i++){
            count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s.charAt(i));
                return ;
            }
        }
        System.out.println("no repeating character");
    }
}

package TCs.NumberTheory;

public class mostrepeatingcharacter {
    public static void main(String[] args) {
        String s="asdfasdffff";
        int count=0;
        char maxcount=s.charAt(0);
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
                if(count>maxcount){
                     maxcount=s.charAt(i);
                }
            }
        }
        System.out.println(maxcount);
    }
}

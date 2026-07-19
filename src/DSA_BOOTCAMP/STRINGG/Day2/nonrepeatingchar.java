package DSA_BOOTCAMP.STRINGG.Day2;

public class nonrepeatingchar {
    public static void main(String[] args) {
        String str="swiss";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(str.charAt(i)+" ");
                break;
            }
        }
    }
}

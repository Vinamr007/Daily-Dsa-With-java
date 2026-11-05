package DSA_BOOTCAMP.Array.Day21;

public class DuplicateChracter {
    public static void main(String[] args) {
        String chh="jayMaharashtra";
        int count=0;
        for(int i=0;i<chh.length()-1;i++){
            count=1;
            for(int j=i+1;j<chh.length();j++){
                if(chh.charAt(i)==chh.charAt(j)){
                    count++;
                if(count>1){
                    System.out.print(chh.charAt(i));
                    break;
                }
                }

            }
        }
    }
}

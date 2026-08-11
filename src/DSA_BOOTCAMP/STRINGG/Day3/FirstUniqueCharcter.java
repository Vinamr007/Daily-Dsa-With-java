package DSA_BOOTCAMP.STRINGG.Day3;

public class FirstUniqueCharcter {
    public static void main(String[] args) {
        String str="vinamemrcv";
        int count;
        for(int i=0;i<str.length()-1;i++){
            count=1;
            for(int j=i+1;j<str.length()-1;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>1){
                System.out.println(i);
                break;
            }
        }
    }
}

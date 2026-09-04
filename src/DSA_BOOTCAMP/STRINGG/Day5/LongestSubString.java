package DSA_BOOTCAMP.STRINGG.Day5;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcabcbb";

        int maxLength=0;

        for(int i=0;i<str.length();i++){

            int count=0;

            for(int j=i;j<str.length();j++){

                    boolean alreadyFound = false;
                        //cheaking for already found

                         for(int k=i;k<j;k++){
                                if(str.charAt(j)==str.charAt(k)){
                                    alreadyFound=true;
                                        break;
                                     }
                         }
                         if(alreadyFound){
                             break;
                         }
                         count++;
            }

            if(count>maxLength){
                maxLength=count;
            }
        }
        System.out.println(maxLength);
    }
}

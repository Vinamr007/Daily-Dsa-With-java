package TCs.String;

public class Anagram {
    public static boolean isAnagram(String s1,String s2){
        boolean  found=false;
        if(s1.length()!=s2.length()){
            System.out.println("Not an Anagram");
            return false;
        }
       // boolean  found=false;
        for(int i=0;i<s1.length();i++){

            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                  //  System.out.println("Not an Anagram");
                    found=true;
                        break;
                }


            }
            if(found==false){
                System.out.println("Not an Anagram");
                break;
            }

        }
        if(found==true){
            System.out.println("Anagram");
        }
        return false;

    }
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
isAnagram(s1,s2);
    }
}

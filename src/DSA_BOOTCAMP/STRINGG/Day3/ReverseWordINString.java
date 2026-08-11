package DSA_BOOTCAMP.STRINGG.Day3;

public class ReverseWordINString {
    public static void main(String[] args) {

        String str="my name is vinu";

            int end=str.length()-1;

        for(int i=end;i>=0;i--){

             // where space isfound
            if(str.charAt(i)==' '){

                for(int j=i+1;j<=end;j++){
                    System.out.print(str.charAt(j));
                }
                System.out.print(" ");

                // move end to the previus word
                end=i-1;
            }
            }

        // print the first word
        for(int j=0;j<=end;j++){
            System.out.print(str.charAt(j));
        }
    }
}

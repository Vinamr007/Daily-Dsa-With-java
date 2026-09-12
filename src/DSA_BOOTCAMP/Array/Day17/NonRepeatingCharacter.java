package DSA_BOOTCAMP.Array.Day17;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s="swiss";
        char ch=s.charAt(0);

        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){

                 count++;
                }

            }
            if(count==1){
                System.out.println("non repeating chracter :"+s.charAt(i));
                return;
            }
        }
        System.out.println(" no non repeating chracter");
    }
}

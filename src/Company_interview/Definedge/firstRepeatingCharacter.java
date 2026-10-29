package Company_interview.Definedge;

public class firstRepeatingCharacter {
    public static void main(String[] args) {
        String s="vinamr";
        boolean repeat=false;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    repeat=true;
                    System.out.println("first repeating chracter"+s.charAt(i));

                    return;
                }
            }
        }
        if(repeat==false){
            System.out.println("there is no any repeating chracter");
        }
    }
}

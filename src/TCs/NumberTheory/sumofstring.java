package TCs.NumberTheory;

public class sumofstring {
    public static void main(String[] args) {
        String str="qwe1234";
        int sum=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (Character.isDigit(c)) {

                sum += Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
    }
}

package DSA_BOOTCAMP.STRINGG.Day2;

public class LongestWord {
    public static void main(String[] args) {
        String str="I love programming in Java";


        int maxWord=0;
        int count=0;
for(int i=0;i<str.length();i++){

    if(str.charAt(i)!=' '){
        count++;
    }
}
if(count>maxWord){
    maxWord=count;
}

        System.out.println(maxWord);
    }
}

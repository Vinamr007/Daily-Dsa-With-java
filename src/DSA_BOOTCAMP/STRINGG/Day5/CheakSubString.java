package DSA_BOOTCAMP.STRINGG.Day5;

import java.util.HashSet;

public class CheakSubString {
    public static void main(String[] args) {
        String s = "abc";
      String  t = "ahbgdc";

      int i=0;
      for(int j=0;j<t.length();j++){
          if(i<s.length() && s.charAt(j)==t.charAt(j)){
              i++;
          }
      }
      if(i==s.length()){
          System.out.println("true");
      }else{
          System.out.println("false");
      }

    }
}

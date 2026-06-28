package UdemyTelesko.corejava;

class claculator{
    public static void add(int a,int b){

        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){

        System.out.println(a+b+c);
    }
}

public class methodoverloading {
    public static void main(String[] args) {
     claculator.add(1,2);
    }
}

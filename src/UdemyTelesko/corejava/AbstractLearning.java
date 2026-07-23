package UdemyTelesko.corejava;


abstract class Animal{
    Animal(){
        System.out.println("Animal constructor");
    }
    public void  eat(){
        System.out.println("Animal eat");
    }

    static void show(){
        System.out.println("Animal show");
    }
}
class dog extends Animal{

}
public class AbstractLearning {
    public static void main(String[] args) {
Animal.show();
      dog d=new dog();

//        car c=new car();
//
//        c.tyre();
//        c.wheels();
//c.breaking();
    }

}

//abstract class vechical {
//    abstract void tyre();
//
//    abstract void wheels();
//
//} class car extends vechical{
//
//    void tyre(){
//        System.out.println(" black colour of tyre");
//    }
//    void wheels(){
//        System.out.println(" black colour of wheels");
//    }
//
//    public void breaking(){
//        System.out.println(" black colour of break");
//    }
//}
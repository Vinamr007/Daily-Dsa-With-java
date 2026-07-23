package UdemyTelesko.corejava;

public class AbstractLearning {
    public static void main(String[] args) {
        car c=new car();

        c.tyre();
        c.wheels();

    }

}

abstract class vechical {
    abstract void tyre();

    abstract void wheels();

} class car extends vechical{

    void tyre(){
        System.out.println(" black colour of tyre");
    }
    void wheels(){
        System.out.println(" black colour of wheels");
    }
}
package UdemyTelesko.corejava;

interface Animall{
    void eatt();
}

interface humann{
    void say();
}

class dogg implements Animall,humann{

   public void eatt(){
        System.out.println(" dog is eationg ");
    }
    public void say(){
       System.out.println(" dog is say ");
    }
}

public class interface_impelementation {
    public static void main(String[] args) {
        dogg d=new dogg();
        d.say();
        d.eatt();
    }
}

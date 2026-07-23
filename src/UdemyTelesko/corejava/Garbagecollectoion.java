package UdemyTelesko.corejava;

public class Garbagecollectoion {
    public static void main(String[] args) {
        Garbagecollectoion g=new Garbagecollectoion();

        g=null;

        System.gc();
    }
}


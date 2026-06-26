package UdemyTelesko.corejava;

class computer{
    public void musicplay(){
        System.out.println("music playing");
    }
    public String getpen(int cost){
        if(cost>=10) {
            return "pen";
        }
        else {
            return "nothing";
        }
    }
}

public class method
{
    public static void main(String[] args) {
computer c=new computer();
String str=c.getpen(2);
        System.out.println(str);
c.musicplay();
    }
}

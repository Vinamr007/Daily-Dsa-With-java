package UdemyTelesko.corejava;

class human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void SetAge(int a){
        age=a;
    }
    public void SetName(String n){
        name=n;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
human h=new human();
h.SetAge(10);
h.SetName("James");
        System.out.println(h.getAge()+" :"+h.getName());
    }
}

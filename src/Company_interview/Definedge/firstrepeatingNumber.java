package Company_interview.Definedge;

public class firstrepeatingNumber {
    public static void main(String[] args) {
        int[] a={1,2,54,6,4,89,1,8,5};
        boolean isnotrepeated=false;

        for (int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    isnotrepeated=true;
                    System.out.println(a[i]);
                    return ;
                }
            }
        }
        if(isnotrepeated==false){
            System.out.println("there is no repeating number");
        }
    }
}

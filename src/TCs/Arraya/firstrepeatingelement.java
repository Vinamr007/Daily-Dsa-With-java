package TCs.Arraya;

public class firstrepeatingelement {
    public static int count(int[] arr){
        int count=-1;
        for(int i=0;i<arr.length;i++){
            count =1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;

                }

            }
            if(count>1){
                System.out.println(arr[i]);
                break;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};

count(arr);

    }
}

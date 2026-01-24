package practice.Array;

public class movwzerotoend {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,120,0,4,0,5};
        int index=0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]!=0){
              arr[index]=arr[i];
              index++;
          }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }

        for(int num: arr){
            System.out.print(num);
        }

    }
}

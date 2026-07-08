package DSA_BOOTCAMP.Array.day4;

public class majorityelement {
    public static void main(String[] args) {
        int[] a={2,2,1,1,1,2,2,3,4,6,7};

        int vote = 0;
        int candidate = 0;

        for (int i = 0; i < a.length; i++) {

            if (vote == 0) {
                candidate = a[i];
                vote = 1;
            }
            else if (candidate == a[i]) {
                vote++;
            }
            else {
                vote--;
            }
        }

        System.out.println(candidate);
    }
}

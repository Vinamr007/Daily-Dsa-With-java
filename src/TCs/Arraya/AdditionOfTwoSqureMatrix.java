package TCs.Arraya;

public class AdditionOfTwoSqureMatrix {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int[][] B = {
                {5, 4, 3, 2, 1},
                {10, 9, 8, 7, 6},
                {15, 14, 13, 12, 11},
                {20, 19, 18, 17, 16},
                {25, 24, 23, 22, 21}
        };


        int[][] c=new int[5][5];

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                c[i][j]=A[i][j]+B[i][j];
            }
        }


        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}

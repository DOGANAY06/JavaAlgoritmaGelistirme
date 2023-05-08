public class Soru1 {
    public static void main(String[] args) {
        int[][] A = {{3, 6, 2}, {1, 5, 6}, {2, 1, 5}};
        int[][] B = {{1,1, 2}, {3, 3, 3}, {2, 2, 1}};

        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                boolean found = false;
                for(int k = 0; k < B.length; k++) {
                    for(int l = 0; l < B[k].length; l++) {
                        if(A[i][j] == B[k][l]) {
                            found = true;
                            break;
                        }
                    }
                    if(found) break;
                }
                if(!found) {
                    System.out.println(A[i][j]);
                }
            }
        }

    }
}
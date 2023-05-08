import java.util.HashSet;
import java.util.Set;

public class Soru2 {
    public static void main(String[] args) {
        //bir matrisin ortogonal olduğunu kontrol etmek için, matrisin transpozunu alıp kendisi ile çarpıldığında birim matrise eşit olup olmadığını kontrol edebiliriz.
        int[][] B = {{1, 1, 2}, {3, 3, 3}, {2, 2, 1}};
        Set<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i < B.length; i++) {
            for (int j = i + 1; j < B.length; j++) {
                int[] row1 = B[i];
                int[] row2 = B[j];

                // iki satırın iç çarpımını hesapla
                int dotProduct = 0;
                for (int k = 0; k < row1.length; k++) {
                    dotProduct += row1[k] * row2[k];
                }

                // iç çarpımın sıfır olup olmadığını kontrol edin
                if (dotProduct == 0) {
                    //sete benzersiz öğeler ekleyin
                    for (int element : row1) {
                        uniqueElements.add(element);
                    }
                    for (int element : row2) {
                        uniqueElements.add(element);
                    }
                }
            }
        }

        System.out.println("Ortogonal sıralardaki benzersiz öğeler: " + uniqueElements);
    }
}

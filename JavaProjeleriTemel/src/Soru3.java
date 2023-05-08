import java.util.HashMap;
import java.util.Map;

public class Soru3 {
    public static void main(String[] args) {
        int[][] A = {{3, 6, 2}, {1, 5, 6}, {2, 1, 5}};

        // Elemanların kaç defa geçtiğini tutacak bir map oluşturuyoruz
        Map<Integer, Integer> counts = new HashMap<>();
        // A dizisi üzerinde döngü ile elemanları kontrol ediyoruz
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                int element = A[i][j];
                // Eğer bu eleman daha önce map içinde yoksa, 1 ile ekliyoruz
                // Eğer daha önce eklenmişse sayısını bir artırıyoruz
                counts.put(element, counts.getOrDefault(element, 0) + 1);
            }
        }
        // Sonuçları yazdırıyoruz
        System.out.println("Elemanlar ve tekrar sayıları:");
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

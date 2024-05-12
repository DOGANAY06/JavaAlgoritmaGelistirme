public class AlgoritmaCozumu1_array {
    public static void main(String[] args) {
        int[][] array = {{9, 4},{4,3}, {5, 8}}; // [3][2] 3 satır 2 sutün
        int rows = array.length;
        int cols = array[0].length;
        System.out.println("Sütun "+cols);
        System.out.println("Satır "+rows);
        int[][] matrix = new int[rows * cols][rows * cols]; //yeni matrisi oluşturuyorum

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int index = i * cols + j;
                System.out.println("İndexim"+index);
                if (i > 0) { // üst komşu
                    matrix[index][index - cols] = 1;
                }
                if (i < rows - 1) { // alt komşu
                    matrix[index][index + cols] = 1;
                }
                if (j > 0) { // sol komşu
                    matrix[index][index - 1] = 1;
                }
                if (j < cols - 1) { // sağ komşu
                    matrix[index][index + 1] = 1;
                }
            }
        }

        // matriksleri ekrana yazdırma
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

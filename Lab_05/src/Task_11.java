public class Task_11 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int rand = (int) (Math.random() * 2);
                matrix[i][j] = rand;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The largest row index: " + largestRow(matrix));
        System.out.println("The largest column index: " + largestCol(matrix));

//        int count = 0;
//        int flag = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                if (matrix[i][j] == 1) {
//                    count++;
//                }
//            }
//            break;
//        }
//        System.out.println("The largest row index: " + count);
//
//        for (int j = 0; j < matrix.length; j++) {
//            for (int i = 0; i < matrix.length; i++) {
//                if (matrix[i][j] == 1) {
//                    flag++;
//                }
//            }
//            break;
//        }
//        System.out.println("The largest column index: " + flag);

    }

    public static int largestRow(int[][] matrix) {
        int max = 0;
        int maxRow = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }

            }
            if (count > max) {
                max = count;
                maxRow = i;
            }
        }
        return maxRow;
    }

    public static int largestCol(int[][] matrix) {
        int count = 0, max = 0, maxCol = 0;

        for (int j = 0; j < matrix.length; j++) {
            count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                maxCol = j;
            }
        }
        return maxCol;
    }
}

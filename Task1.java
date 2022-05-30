import java.util.Scanner;

public class Task1 {

    public static void MatrixInput(int[][] matrix)
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
    }

    public static void MatrixOutput(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] Task(int[][] matrix)
    {
        int max_i = 0, max_j = 0;
        int max2_i = 0, max2_j = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > matrix[max_i][max_j])
                {
                    max_i = i;
                    max_j = j;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if((matrix[i][j] > matrix[max2_i][max2_j]) && (matrix[i][j] < matrix[max_i][max_j]))
                {
                    max2_i = i;
                    max2_j = j;
                }
            }
        }

        matrix[max_i][max_j] = 0;
        matrix[max2_i][max2_j] = 0;

        return matrix;
    }


    public static void Start() {
        Scanner in = new Scanner(System.in);

        int rows, cols;

        do {
            System.out.print("Кількість рядків матриці: ");
            rows = in.nextInt();
            if(rows < 1) System.out.println("Значення ведене невірно. Спробуйте ще раз");
        }
        while (rows < 1);

        do {
            System.out.print("Кількість стопвчиків матриці: ");
            cols = in.nextInt();
            if(cols < 1) System.out.println("Значення ведене невірно. Спробуйте ще раз");
        }
        while (cols < 1);

        int[][] matrix = new int[rows][cols];
        System.out.println("Введення матриці: ");
        MatrixInput(matrix);

        System.out.println("Матриця:");
        MatrixOutput(matrix);

        System.out.println("Після змін:");
        MatrixOutput(Task(matrix));
    }
}

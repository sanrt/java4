import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void MatrixRandom(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(200) - 100;
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

    public static int TaskFunction(int[][] matrix)
    {
        int max = matrix[0][1];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = i + 1; j < matrix[0].length; j++)
            {
                if(matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.println();

        return max;
    }

    public static void Start() {
        Scanner in = new Scanner(System.in);

        int rows, cols;

        do {
            System.out.print("Кількість рядків матриці:");
            rows = in.nextInt();
            if(rows < 1) System.out.println("Значення ведене невірно. Спробуйте ще раз");
        }
        while (rows < 1);

        do {
            System.out.print("Кількість стопвчиків матриці:");
            cols = in.nextInt();
            if(cols < 1) System.out.println("Значення ведене невірно. Спробуйте ще раз");
        }
        while (cols < 1);

        int[][] matrix = new int[rows][cols];
        MatrixRandom(matrix);
        System.out.println("Матриця:");
        MatrixOutput(matrix);

        try {
            System.out.println("Максимальний елемент серед елементiв, якi знаходяться вище головної дiагоналi:" + TaskFunction(matrix));
            TaskFunction(matrix);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}

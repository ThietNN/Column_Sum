import java.util.Scanner;

public class Column_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of row you want to add: ");
        int row = sc.nextInt();
        System.out.println("Enter number of column you want to add: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("Enter value of row #" + i + ", column #" + j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the # of column you want to calculate (start from #0): ");
        int start = sc.nextInt();
        int sum = 0;
        for (int i=0;i<row;i++){
            sum += arr[i][start];
        }
        System.out.println("Sum of every value in column #" + start + " = " + sum);

    }
}

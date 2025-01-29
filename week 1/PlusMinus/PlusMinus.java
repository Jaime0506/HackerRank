package PlusMinus;
import java.util.List;

public class PlusMinus {

    public void ResultPlusMinus(List<Integer> arr) {

        // positivos, negativos, 0
        int[] values = new int[3];
        double size = (double) arr.size();

        for (int num : arr) {
            if (num > 0) {
                values[0]++;
            } else if (num < 0) {
                values[1]++;
            } else {
                values[2]++;
            }
        }

        for (int value : values) {
            String result = String.format("%.6f", value / size);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        PlusMinus problem = new PlusMinus();

        problem.ResultPlusMinus(List.of(-4, 3, -9, 0, 4, 1));
    }
}
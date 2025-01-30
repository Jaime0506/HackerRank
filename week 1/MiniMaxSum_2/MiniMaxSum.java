package MiniMaxSum_2;

import java.util.List;

public class MiniMaxSum {
    public void ResultMiniMaxSum(List<Integer> arr) {
        Integer min = arr.get(0);
        Integer max = arr.get(0);
        long sum = 0;

        for (Integer num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;

            sum += num;
        }

        System.out.print((sum - max) + " ");
        System.out.print((sum - min) + " ");
    }

    public static void main(String[] args) {
        MiniMaxSum result = new MiniMaxSum();

        result.ResultMiniMaxSum(List.of(256741038, 623958417, 467905213, 714532089, 938071625));
    }
}

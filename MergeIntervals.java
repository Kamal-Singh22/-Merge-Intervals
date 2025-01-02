import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        // If intervals array is empty, return an empty array
        if (intervals.length == 0) {
            return new int[0][0];
        }

        // Sort intervals based on the start of each interval
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Use a LinkedList to store the merged intervals
        List<int[]> merged = new LinkedList<>();

        for (int[] interval : intervals) {
            // If merged list is empty or current interval does not overlap with the last merged interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Merge the intervals by updating the end of the last merged interval
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Convert the List to an array and return
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals2 = {{1, 4}, {4, 5}};

        System.out.println("Merged intervals 1: " + Arrays.deepToString(merge(intervals1)));
        System.out.println("Merged intervals 2: " + Arrays.deepToString(merge(intervals2)));
    }
}

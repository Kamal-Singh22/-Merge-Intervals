# -Merge-Intervals
Given an array of intervals where intervals[i] = [start_i, end_i], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
Explanation:
Sorting: The intervals are sorted based on their start values. This ensures that overlapping intervals are adjacent to each other in the sorted array.
Merging: Iterate through the sorted intervals:
If the merged list is empty or the current interval doesn't overlap with the last merged one, add the current interval to the merged list.
If the current interval overlaps with the last merged interval, merge them by updating the end of the last merged interval to the maximum end of both intervals.
Returning the Result: Finally, the merged intervals are converted into an array and returned.

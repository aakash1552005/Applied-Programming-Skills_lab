import java.util.*;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        // Sort by end
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            // If no overlap
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }

        return arrows;
    }
}
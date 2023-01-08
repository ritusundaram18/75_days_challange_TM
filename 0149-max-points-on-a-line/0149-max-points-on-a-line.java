// class Solution {
//     public int maxPoints(int[][] points) {
        
//     }
// }
class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n < 2) return n;
        Set<String> set = new HashSet<>();
        int max = 1;

        for (int i = 0; i < n; i++) {
            int[] a = points[i];
            int same = 0;
            Map<Double, Integer> map = new HashMap<>();
            int localMax = 1;

            for (int j = i + 1; j < n; j++) {
                if (isSame(a, points[j])) {
                    same++;
                    continue;
                }

                double slope = getSlope(a, points[j]);
                map.put(slope, map.getOrDefault(slope, 1) + 1);
                localMax = Math.max(localMax, map.get(slope));
            }

            set.add(a[0] + "-" + a[1]);
            max = Math.max(max, localMax + same);
        }

        return max;
    }

    private boolean isSame(int[] a, int[] b) {
        return a[0] == b[0] && a[1] == b[1];
    }

    private double getSlope(int[] a, int[] b) {
        if (a[0] == b[0]) return Double.MAX_VALUE;
        if (a[1] == b[1]) return 0;
        return ((double) b[0] - a[0]) / ((double) b[1] - a[1]);
    }
}
            


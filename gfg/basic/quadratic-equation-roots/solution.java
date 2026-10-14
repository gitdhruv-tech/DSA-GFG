
class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        int d = (b * b) - (4 * a * c);

        if (d < 0) {
           return new ArrayList<>(List.of(-1));
        }

        int x1 = (int) Math.floor((-b + Math.sqrt(d)) / (2.0 * a));
        int x2 = (int) Math.floor((-b - Math.sqrt(d)) / (2.0 * a));

        if (x1 > x2) {
            return new ArrayList<>(List.of(x1, x2));
        }

        return new ArrayList<>(List.of(x2, x1));
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                    continue;
                }
                if (i > 1) {
                    List<Integer> prerow = triangle.get(i - 1);
                    row.add(prerow.get(j - 1) + prerow.get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}
class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        long curr = 1;
        List<Integer> row = new ArrayList<>();
        row.add((int)curr);

        for (int k = 0; k < rowIndex; k++) {
            if (k == rowIndex - 1) {
                row.add(1);
                continue;
            }
            curr = curr * (rowIndex - k) / (k + 1);
            row.add((int)curr);
        }
        return row;
    }
}
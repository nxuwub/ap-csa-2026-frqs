public int getPointsForRow(int targetRow) {
    int sum = 0;
    String firstColor = board[targetRow][0].getColor();
    boolean allSame = true;

    for (int c = 0; c < board[targetRow].length; c++) {
        Space s = board[targetRow][c];
        sum += s.getPoints();
        if (!s.getColor().equals(firstColor)) {
            allSame = false; 
        }
    }
    if (allSame) {
        return sum * 2;
    }
    return sum;
}

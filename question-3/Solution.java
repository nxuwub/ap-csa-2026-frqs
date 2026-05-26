public int moreHistoryThanMathAbsences() {
    int count = 0;

    for (CourseRecord h : historyList) {
        String id = h.getStudentID();
        int hA = h.getAbsences();

        for (CourseRecord m : mathList) {
            if (m.getStudentID().equals(id)) {
                if (hA > m.getAbsences()) {
                    count = count + 1;
                }
            }
        }
    }
    return count;
}

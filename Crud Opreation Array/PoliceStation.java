class PoliceStation {
    String caseNames[] = new String[16];
    int index;

    public boolean addCase(String caseName) {
        boolean isAdded = false;

        if (index < caseNames.length) {
            if (caseName != null && !caseName.isEmpty()) {
                caseNames[index++] = caseName;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getCases() {
        for (String caseName : caseNames) {
            System.out.println(caseName);
        }
    }
}
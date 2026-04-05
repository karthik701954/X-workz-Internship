class PoliceStation {
    String caseNames[] = new String[16];
    int index;

    public boolean addCase(String caseName) {
        boolean isAdded = false;

        if (index < caseNames.length) {
            if (caseName != null && !caseName.isEmpty()) {
                caseNames[index++] = caseName;
                isAdded = true;
                System.out.println("Total cases added: " + index);
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

    public String getCaseByName(String caseName) {
        String name = null;
        for (String c : caseNames) {
            if (c != null && c.equals(caseName)) {
                name = c;
                break;
            }
        }
        if (name == null)
            System.out.println(caseName + " is not available");

        return name;
    }

    public boolean updateCaseName(String existingCaseName, String updatedCaseName) {
        boolean isUpdated = false;
        for (int i = 0; i < caseNames.length; i++) {
            if (caseNames[i] != null && caseNames[i].equals(existingCaseName)) {
                caseNames[i] = updatedCaseName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingCaseName + " is not updated");

        return isUpdated;
    }

    public boolean deleteCase(String caseName) {
        boolean isDeleted = false;
        for (int i = 0; i < caseNames.length; i++) {
            if (caseNames[i] != null && caseNames[i].equals(caseName)) {
                caseNames[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(caseName + " is not deleted");

        return isDeleted;
    }
}
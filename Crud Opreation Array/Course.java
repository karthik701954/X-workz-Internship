class Course {
    String technologyNames[] = new String[15];
    int index;

    public boolean addTechnology(String tech) {
        boolean isAdded = false;

        if (index < technologyNames.length) {
            if (tech != null && !tech.isEmpty()) {
                technologyNames[index++] = tech;
                isAdded = true;
                System.out.println("Total technologies added: " + index);
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getTechnologies() {
        for (String tech : technologyNames) {
            System.out.println(tech);
        }
    }

    public String getTechnologyByName(String techName) {
        String name = null;
        for (String tech : technologyNames) {
            if (tech == techName) {
                name = tech;
                break;
            }
        }
        if (name == null)
            System.out.println(techName + " is not available");

        return name;
    }

    public boolean updateTechnologyName(String existingTechName, String updatedTechName) {
        boolean isUpdated = false;
        for (int i = 0; i < technologyNames.length; i++) {
            if (existingTechName == technologyNames[i]) {
                technologyNames[i] = updatedTechName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingTechName + " is not updated");

        return isUpdated;
    }

    public boolean deleteTechnology(String techName) {
        boolean isDeleted = false;
        for (int i = 0; i < technologyNames.length; i++) {
            if (techName == technologyNames[i]) {
                technologyNames[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(techName + " is not deleted");

        return isDeleted;
    }
}
class Course {
    String technologyNames[] = new String[15];
    int index;

    public boolean addTechnology(String tech) {
        boolean isAdded = false;

        if (index < technologyNames.length) {
            if (tech != null && !tech.isEmpty()) {
                technologyNames[index++] = tech;
                isAdded = true;
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
}
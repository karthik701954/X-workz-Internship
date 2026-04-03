class Amazon {
    String categoryNames[] = new String[21];
    int index;

    public boolean addCategory(String category) {
        boolean isAdded = false;

        if (index < categoryNames.length) {
            if (category != null && !category.isEmpty()) {
                categoryNames[index++] = category;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getCategories() {
        for (String category : categoryNames) {
            System.out.println(category);
        }
    }
}
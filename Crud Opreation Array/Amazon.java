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

    public String getCategoryByName(String categoryName) {
        String name = null;
        for (String category : categoryNames) {
            if (category == categoryName) {
                name = category;
                break;
            }
        }
        if (name == null)
            System.out.println(categoryName + " is not available");

        return name;
    }

    public boolean updateCategoryName(String existingCategoryName, String updatedCategoryName) {
        boolean isUpdated = false;
        for (int i = 0; i < categoryNames.length; i++) {
            if (existingCategoryName == categoryNames[i]) {
                categoryNames[i] = updatedCategoryName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingCategoryName + " is not updated");

        return isUpdated;
    }

    public boolean deleteCategory(String categoryName) {
        boolean isDeleted = false;
        for (int i = 0; i < categoryNames.length; i++) {
            if (categoryName == categoryNames[i]) {
                categoryNames[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(categoryName + " is not deleted");

        return isDeleted;
    }
}
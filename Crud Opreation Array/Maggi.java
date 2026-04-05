class Maggi {
    String ingredients[] = new String[12];
    int index;

    public boolean addIngredient(String ingredient) {
        boolean isAdded = false;

        if (index < ingredients.length) {
            if (ingredient != null && !ingredient.isEmpty()) {
                ingredients[index++] = ingredient;
                isAdded = true;
                System.out.println("Total ingredients added: " + index);
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getIngredients() {
        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }

    public String getIngredientByName(String ingredientName) {
        String name = null;
        for (String ingredient : ingredients) {
            if (ingredient == ingredientName) {
                name = ingredient;
                break;
            }
        }
        if (name == null)
            System.out.println(ingredientName + " is not available");

        return name;
    }

    public boolean updateIngredientName(String existingIngredientName, String updatedIngredientName) {
        boolean isUpdated = false;
        for (int i = 0; i < ingredients.length; i++) {
            if (existingIngredientName == ingredients[i]) {
                ingredients[i] = updatedIngredientName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingIngredientName + " is not updated");

        return isUpdated;
    }

    public boolean deleteIngredient(String ingredientName) {
        boolean isDeleted = false;
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredientName == ingredients[i]) {
                ingredients[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(ingredientName + " is not deleted");

        return isDeleted;
    }
}
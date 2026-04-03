class Maggi {
    String ingredients[] = new String[12];
    int index;

    public boolean addIngredient(String ingredient) {
        boolean isAdded = false;

        if (index < ingredients.length) {
            if (ingredient != null && !ingredient.isEmpty()) {
                ingredients[index++] = ingredient;
                isAdded = true;
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
}
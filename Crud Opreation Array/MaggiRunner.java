class MaggiRunner {
    public static void main(String[] args) {

        Maggi maggi = new Maggi();

        boolean added = maggi.addIngredient("Noodles");
        System.out.println(added);
        added = maggi.addIngredient("Masala");
        System.out.println(added);
        added = maggi.addIngredient("Salt");
        System.out.println(added);
        added = maggi.addIngredient("Water");
        System.out.println(added);
        added = maggi.addIngredient("Vegetables");
        System.out.println(added);
        added = maggi.addIngredient("Oil");
        System.out.println(added);
        added = maggi.addIngredient("Chilli Powder");
        System.out.println(added);
        added = maggi.addIngredient("Turmeric");
        System.out.println(added);
        added = maggi.addIngredient("Pepper");
        System.out.println(added);
        added = maggi.addIngredient("Garlic");
        System.out.println(added);
        added = maggi.addIngredient("Onion");
        System.out.println(added);
        added = maggi.addIngredient("Tomato");
        System.out.println(added);

        maggi.getIngredients();

        String name = maggi.getIngredientByName("Masala");
        System.out.println(name + " is available");

        boolean updated = maggi.updateIngredientName("Salt", "Rock Salt");
        System.out.println(updated);

        maggi.getIngredients();

        boolean deleted = maggi.deleteIngredient("Oil");
        System.out.println(deleted);

        maggi.getIngredients();
    }
}
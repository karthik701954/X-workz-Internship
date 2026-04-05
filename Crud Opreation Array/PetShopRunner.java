class PetShopRunner {
    public static void main(String[] args) {

        PetShop petShop = new PetShop();

        boolean added = petShop.addAccessory("Dog Food");
        System.out.println(added);
        added = petShop.addAccessory("Cat Food");
        System.out.println(added);
        added = petShop.addAccessory("Bird Cage");
        System.out.println(added);
        added = petShop.addAccessory("Fish Tank");
        System.out.println(added);
        added = petShop.addAccessory("Dog Leash");
        System.out.println(added);
        added = petShop.addAccessory("Cat Toy");
        System.out.println(added);
        added = petShop.addAccessory("Pet Shampoo");
        System.out.println(added);
        added = petShop.addAccessory("Pet Bed");
        System.out.println(added);
        added = petShop.addAccessory("Food Bowl");
        System.out.println(added);
        added = petShop.addAccessory("Water Bowl");
        System.out.println(added);
        added = petShop.addAccessory("Pet Brush");
        System.out.println(added);
        added = petShop.addAccessory("Pet Clothes");
        System.out.println(added);
        added = petShop.addAccessory("Pet Carrier");
        System.out.println(added);
        added = petShop.addAccessory("Training Pad");
        System.out.println(added);
        added = petShop.addAccessory("Chew Toy");
        System.out.println(added);
        added = petShop.addAccessory("Pet Blanket");
        System.out.println(added);

        petShop.getAccessories();

        String name = petShop.getAccessoryByName("Fish Tank");
        System.out.println(name + " is available");

        boolean updated = petShop.updateAccessoryName("Dog Food", "Premium Dog Food");
        System.out.println(updated);

        petShop.getAccessories();

        boolean deleted = petShop.deleteAccessory("Cat Toy");
        System.out.println(deleted);

        petShop.getAccessories();
    }
}
class Chef {

    int chefId;
    String chefName;
    int experience;
    String specialty;
    String shift;

    Person person;

    public void getChefDetails() {
        System.out.println("The chefId is: " + chefId);
        System.out.println("The chefName is: " + chefName);
        System.out.println("The experience is: " + experience);
        System.out.println("The specialty is: " + specialty);
        System.out.println("The shift is: " + shift);

        person.getPersonDetails();
    }
}

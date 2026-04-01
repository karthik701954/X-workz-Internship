class Gym {

    int gymId;
    String gymName;
    String location;
    int members;
    String type;

    Trainer trainer;

    public void getGymDetails() {
        System.out.println("The gymId is: " + gymId);
        System.out.println("The gymName is: " + gymName);
        System.out.println("The location is: " + location);
        System.out.println("The members is: " + members);
        System.out.println("The type is: " + type);

        trainer.getTrainerDetails();
    }
}
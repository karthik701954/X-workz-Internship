class Freelancer {

    int freelancerId;
    String name;
    String skill;
    int experience;
    String platform;

    Client client;

    public void getFreelancerDetails() {
        System.out.println("The freelancerId is: " + freelancerId);
        System.out.println("The name is: " + name);
        System.out.println("The skill is: " + skill);
        System.out.println("The experience is: " + experience);
        System.out.println("The platform is: " + platform);

        client.getClientDetails();
    }
}

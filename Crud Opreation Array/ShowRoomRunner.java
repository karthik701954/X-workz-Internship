class ShowRoomRunner {
    public static void main(String[] args) {

        ShowRoom sr = new ShowRoom();

        sr.addManager("Ravi");
        sr.addManager("Suresh");
        sr.addManager("Anita");
        sr.addManager("Kiran");
        sr.addManager("Meena");
        sr.addManager("Arjun");
        sr.addManager("Priya");
        sr.addManager("Vikram");

        sr.getManagers();
    }
}
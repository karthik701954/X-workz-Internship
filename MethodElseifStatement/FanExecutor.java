class FanExecutor {

    public static void main(String[] args) {

        Fan.FanOn();
        System.out.println("Current Speed: " + Fan.getSpeed());

        Fan.FanOff();
        System.out.println("Current Speed: " + Fan.getSpeed());
    }
}
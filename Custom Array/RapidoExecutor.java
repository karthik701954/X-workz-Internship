class RapidoExecutor {

    public static void main(String args[]) {

        Rapido rides[] = new Rapido[15];

        Rapido rapido1 = new Rapido();
        rapido1.rideId = 1;
        rapido1.customerName = "Karthik";
        rapido1.pickupLocation = "BTM";
        rapido1.dropLocation = "Silk Board";
        rapido1.fare = 80;
        rides[0] = rapido1;

        Rapido rapido2 = new Rapido();
        rapido2.rideId = 2;
        rapido2.customerName = "Rahul";
        rapido2.pickupLocation = "Indiranagar";
        rapido2.dropLocation = "MG Road";
        rapido2.fare = 120;
        rides[1] = rapido2;

        Rapido rapido3 = new Rapido();
        rapido3.rideId = 3;
        rapido3.customerName = "Anjali";
        rapido3.pickupLocation = "Whitefield";
        rapido3.dropLocation = "Marathahalli";
        rapido3.fare = 150;
        rides[2] = rapido3;

        Rapido rapido4 = new Rapido();
        rapido4.rideId = 4;
        rapido4.customerName = "Priya";
        rapido4.pickupLocation = "Yelahanka";
        rapido4.dropLocation = "Hebbal";
        rapido4.fare = 100;
        rides[3] = rapido4;

        Rapido rapido5 = new Rapido();
        rapido5.rideId = 5;
        rapido5.customerName = "Arjun";
        rapido5.pickupLocation = "Electronic City";
        rapido5.dropLocation = "BTM";
        rapido5.fare = 130;
        rides[4] = rapido5;

        Rapido rapido6 = new Rapido();
        rapido6.rideId = 6;
        rapido6.customerName = "Sneha";
        rapido6.pickupLocation = "Banashankari";
        rapido6.dropLocation = "Jayanagar";
        rapido6.fare = 90;
        rides[5] = rapido6;

        Rapido rapido7 = new Rapido();
        rapido7.rideId = 7;
        rapido7.customerName = "Vikram";
        rapido7.pickupLocation = "KR Puram";
        rapido7.dropLocation = "Whitefield";
        rapido7.fare = 110;
        rides[6] = rapido7;

        Rapido rapido8 = new Rapido();
        rapido8.rideId = 8;
        rapido8.customerName = "Meena";
        rapido8.pickupLocation = "Rajajinagar";
        rapido8.dropLocation = "Malleshwaram";
        rapido8.fare = 70;
        rides[7] = rapido8;

        Rapido rapido9 = new Rapido();
        rapido9.rideId = 9;
        rapido9.customerName = "Ramesh";
        rapido9.pickupLocation = "Majestic";
        rapido9.dropLocation = "Yeshwanthpur";
        rapido9.fare = 85;
        rides[8] = rapido9;

        Rapido rapido10 = new Rapido();
        rapido10.rideId = 10;
        rapido10.customerName = "Suresh";
        rapido10.pickupLocation = "Koramangala";
        rapido10.dropLocation = "HSR Layout";
        rapido10.fare = 95;
        rides[9] = rapido10;

        Rapido rapido11 = new Rapido();
        rapido11.rideId = 11;
        rapido11.customerName = "Divya";
        rapido11.pickupLocation = "Hebbal";
        rapido11.dropLocation = "Yelahanka";
        rapido11.fare = 100;
        rides[10] = rapido11;

        Rapido rapido12 = new Rapido();
        rapido12.rideId = 12;
        rapido12.customerName = "Amit";
        rapido12.pickupLocation = "MG Road";
        rapido12.dropLocation = "Indiranagar";
        rapido12.fare = 110;
        rides[11] = rapido12;

        Rapido rapido13 = new Rapido();
        rapido13.rideId = 13;
        rapido13.customerName = "Neha";
        rapido13.pickupLocation = "BTM";
        rapido13.dropLocation = "Jayanagar";
        rapido13.fare = 75;
        rides[12] = rapido13;

        Rapido rapido14 = new Rapido();
        rapido14.rideId = 14;
        rapido14.customerName = "Kiran";
        rapido14.pickupLocation = "Silk Board";
        rapido14.dropLocation = "Electronic City";
        rapido14.fare = 120;
        rides[13] = rapido14;

        Rapido rapido15 = new Rapido();
        rapido15.rideId = 15;
        rapido15.customerName = "Pooja";
        rapido15.pickupLocation = "HSR Layout";
        rapido15.dropLocation = "Koramangala";
        rapido15.fare = 85;
        rides[14] = rapido15;


        for (Rapido ref : rides) {

            System.out.println("Ride Id is :" + ref.rideId);
            System.out.println("Customer Name is :" + ref.customerName);
            System.out.println("Pickup Location is :" + ref.pickupLocation);
            System.out.println("Drop Location is :" + ref.dropLocation);
            System.out.println("Fare is :" + ref.fare);
            System.out.println("----------------------------------");
        }
    }
}
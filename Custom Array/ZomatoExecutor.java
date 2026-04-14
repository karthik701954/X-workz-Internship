class ZomatoExecutor {

    public static void main(String args[]) {

        Zomato orders[] = new Zomato[15];

        Zomato zomato1 = new Zomato();
        zomato1.orderId = 1;
        zomato1.customerName = "Karthik";
        zomato1.foodName = "Chicken Biryani";
        zomato1.price = 250;
        zomato1.restaurantName = "Meghana Foods";
        orders[0] = zomato1;

        Zomato zomato2 = new Zomato();
        zomato2.orderId = 2;
        zomato2.customerName = "Rahul";
        zomato2.foodName = "Pizza";
        zomato2.price = 300;
        zomato2.restaurantName = "Dominos";
        orders[1] = zomato2;

        Zomato zomato3 = new Zomato();
        zomato3.orderId = 3;
        zomato3.customerName = "Anjali";
        zomato3.foodName = "Burger";
        zomato3.price = 150;
        zomato3.restaurantName = "McDonalds";
        orders[2] = zomato3;

        Zomato zomato4 = new Zomato();
        zomato4.orderId = 4;
        zomato4.customerName = "Priya";
        zomato4.foodName = "Masala Dosa";
        zomato4.price = 80;
        zomato4.restaurantName = "Udupi Hotel";
        orders[3] = zomato4;

        Zomato zomato5 = new Zomato();
        zomato5.orderId = 5;
        zomato5.customerName = "Arjun";
        zomato5.foodName = "Paneer Butter Masala";
        zomato5.price = 220;
        zomato5.restaurantName = "Empire";
        orders[4] = zomato5;

        Zomato zomato6 = new Zomato();
        zomato6.orderId = 6;
        zomato6.customerName = "Sneha";
        zomato6.foodName = "Fried Rice";
        zomato6.price = 180;
        zomato6.restaurantName = "Chung Wah";
        orders[5] = zomato6;

        Zomato zomato7 = new Zomato();
        zomato7.orderId = 7;
        zomato7.customerName = "Vikram";
        zomato7.foodName = "Chicken Noodles";
        zomato7.price = 200;
        zomato7.restaurantName = "Beijing Bites";
        orders[6] = zomato7;

        Zomato zomato8 = new Zomato();
        zomato8.orderId = 8;
        zomato8.customerName = "Meena";
        zomato8.foodName = "Ice Cream";
        zomato8.price = 120;
        zomato8.restaurantName = "Ibaco";
        orders[7] = zomato8;

        Zomato zomato9 = new Zomato();
        zomato9.orderId = 9;
        zomato9.customerName = "Ramesh";
        zomato9.foodName = "Gulab Jamun";
        zomato9.price = 90;
        zomato9.restaurantName = "Anand Sweets";
        orders[8] = zomato9;

        Zomato zomato10 = new Zomato();
        zomato10.orderId = 10;
        zomato10.customerName = "Suresh";
        zomato10.foodName = "Sandwich";
        zomato10.price = 100;
        zomato10.restaurantName = "Subway";
        orders[9] = zomato10;

        Zomato zomato11 = new Zomato();
        zomato11.orderId = 11;
        zomato11.customerName = "Divya";
        zomato11.foodName = "Chole Bhature";
        zomato11.price = 140;
        zomato11.restaurantName = "Haldirams";
        orders[10] = zomato11;

        Zomato zomato12 = new Zomato();
        zomato12.orderId = 12;
        zomato12.customerName = "Amit";
        zomato12.foodName = "Idli Vada";
        zomato12.price = 70;
        zomato12.restaurantName = "MTR";
        orders[11] = zomato12;

        Zomato zomato13 = new Zomato();
        zomato13.orderId = 13;
        zomato13.customerName = "Neha";
        zomato13.foodName = "Fish Curry";
        zomato13.price = 320;
        zomato13.restaurantName = "Coastal Kitchen";
        orders[12] = zomato13;

        Zomato zomato14 = new Zomato();
        zomato14.orderId = 14;
        zomato14.customerName = "Kiran";
        zomato14.foodName = "Pasta";
        zomato14.price = 280;
        zomato14.restaurantName = "Pizza Hut";
        orders[13] = zomato14;

        Zomato zomato15 = new Zomato();
        zomato15.orderId = 15;
        zomato15.customerName = "Pooja";
        zomato15.foodName = "Mutton Biryani";
        zomato15.price = 350;
        zomato15.restaurantName = "Nandhini";
        orders[14] = zomato15;


        for (Zomato ref : orders) {

            System.out.println("Order Id is :" + ref.orderId);
            System.out.println("Customer Name is :" + ref.customerName);
            System.out.println("Food Name is :" + ref.foodName);
            System.out.println("Price is :" + ref.price);
            System.out.println("Restaurant Name is :" + ref.restaurantName);
            System.out.println("----------------------------------");
        }
    }
}
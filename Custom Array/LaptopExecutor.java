class LaptopExecutor {

    public static void main(String args[]) {

        Laptop laptops[] = new Laptop[15];

        Laptop laptop1 = new Laptop();
        laptop1.laptopId = 1;
        laptop1.laptopName = "Inspiron 15";
        laptop1.brand = "Dell";
        laptop1.price = 55000;
        laptop1.ramSize = 8;
        laptops[0] = laptop1;

        Laptop laptop2 = new Laptop();
        laptop2.laptopId = 2;
        laptop2.laptopName = "Pavilion";
        laptop2.brand = "HP";
        laptop2.price = 60000;
        laptop2.ramSize = 16;
        laptops[1] = laptop2;

        Laptop laptop3 = new Laptop();
        laptop3.laptopId = 3;
        laptop3.laptopName = "ThinkPad E14";
        laptop3.brand = "Lenovo";
        laptop3.price = 65000;
        laptop3.ramSize = 8;
        laptops[2] = laptop3;

        Laptop laptop4 = new Laptop();
        laptop4.laptopId = 4;
        laptop4.laptopName = "MacBook Air";
        laptop4.brand = "Apple";
        laptop4.price = 95000;
        laptop4.ramSize = 8;
        laptops[3] = laptop4;

        Laptop laptop5 = new Laptop();
        laptop5.laptopId = 5;
        laptop5.laptopName = "Aspire 7";
        laptop5.brand = "Acer";
        laptop5.price = 58000;
        laptop5.ramSize = 16;
        laptops[4] = laptop5;

        Laptop laptop6 = new Laptop();
        laptop6.laptopId = 6;
        laptop6.laptopName = "ROG Strix";
        laptop6.brand = "Asus";
        laptop6.price = 85000;
        laptop6.ramSize = 16;
        laptops[5] = laptop6;

        Laptop laptop7 = new Laptop();
        laptop7.laptopId = 7;
        laptop7.laptopName = "Swift 3";
        laptop7.brand = "Acer";
        laptop7.price = 62000;
        laptop7.ramSize = 8;
        laptops[6] = laptop7;

        Laptop laptop8 = new Laptop();
        laptop8.laptopId = 8;
        laptop8.laptopName = "VivoBook";
        laptop8.brand = "Asus";
        laptop8.price = 50000;
        laptop8.ramSize = 8;
        laptops[7] = laptop8;

        Laptop laptop9 = new Laptop();
        laptop9.laptopId = 9;
        laptop9.laptopName = "IdeaPad Slim 5";
        laptop9.brand = "Lenovo";
        laptop9.price = 55000;
        laptop9.ramSize = 16;
        laptops[8] = laptop9;

        Laptop laptop10 = new Laptop();
        laptop10.laptopId = 10;
        laptop10.laptopName = "Latitude 7420";
        laptop10.brand = "Dell";
        laptop10.price = 90000;
        laptop10.ramSize = 16;
        laptops[9] = laptop10;

        Laptop laptop11 = new Laptop();
        laptop11.laptopId = 11;
        laptop11.laptopName = "Envy x360";
        laptop11.brand = "HP";
        laptop11.price = 88000;
        laptop11.ramSize = 16;
        laptops[10] = laptop11;

        Laptop laptop12 = new Laptop();
        laptop12.laptopId = 12;
        laptop12.laptopName = "MacBook Pro";
        laptop12.brand = "Apple";
        laptop12.price = 150000;
        laptop12.ramSize = 16;
        laptops[11] = laptop12;

        Laptop laptop13 = new Laptop();
        laptop13.laptopId = 13;
        laptop13.laptopName = "Nitro 5";
        laptop13.brand = "Acer";
        laptop13.price = 75000;
        laptop13.ramSize = 16;
        laptops[12] = laptop13;

        Laptop laptop14 = new Laptop();
        laptop14.laptopId = 14;
        laptop14.laptopName = "TUF Gaming";
        laptop14.brand = "Asus";
        laptop14.price = 70000;
        laptop14.ramSize = 16;
        laptops[13] = laptop14;

        Laptop laptop15 = new Laptop();
        laptop15.laptopId = 15;
        laptop15.laptopName = "Galaxy Book";
        laptop15.brand = "Samsung";
        laptop15.price = 80000;
        laptop15.ramSize = 8;
        laptops[14] = laptop15;


        for (Laptop ref : laptops) {

            System.out.println("Laptop Id is :" + ref.laptopId);
            System.out.println("Laptop Name is :" + ref.laptopName);
            System.out.println("Brand is :" + ref.brand);
            System.out.println("Price is :" + ref.price);
            System.out.println("RAM Size is :" + ref.ramSize + "GB");
            System.out.println("----------------------------------");
        }
    }
}
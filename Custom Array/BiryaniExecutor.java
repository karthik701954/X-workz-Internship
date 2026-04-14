class BiryaniExecutor {

    public static void main(String args[]) {

        Biryani biryanis[] = new Biryani[15];

        Biryani biryani1 = new Biryani();
        biryani1.biryaniId = 1;
        biryani1.biryaniName = "Hyderabadi Biryani";
        biryani1.type = "Non-Veg";
        biryani1.price = 250;
        biryani1.restaurantName = "Paradise";
        biryanis[0] = biryani1;

        Biryani biryani2 = new Biryani();
        biryani2.biryaniId = 2;
        biryani2.biryaniName = "Chicken Biryani";
        biryani2.type = "Non-Veg";
        biryani2.price = 220;
        biryani2.restaurantName = "Meghana Foods";
        biryanis[1] = biryani2;

        Biryani biryani3 = new Biryani();
        biryani3.biryaniId = 3;
        biryani3.biryaniName = "Mutton Biryani";
        biryani3.type = "Non-Veg";
        biryani3.price = 320;
        biryani3.restaurantName = "Empire";
        biryanis[2] = biryani3;

        Biryani biryani4 = new Biryani();
        biryani4.biryaniId = 4;
        biryani4.biryaniName = "Veg Biryani";
        biryani4.type = "Veg";
        biryani4.price = 180;
        biryani4.restaurantName = "Udupi Hotel";
        biryanis[3] = biryani4;

        Biryani biryani5 = new Biryani();
        biryani5.biryaniId = 5;
        biryani5.biryaniName = "Egg Biryani";
        biryani5.type = "Non-Veg";
        biryani5.price = 200;
        biryani5.restaurantName = "Nandhini";
        biryanis[4] = biryani5;

        Biryani biryani6 = new Biryani();
        biryani6.biryaniId = 6;
        biryani6.biryaniName = "Fish Biryani";
        biryani6.type = "Non-Veg";
        biryani6.price = 300;
        biryani6.restaurantName = "Coastal Kitchen";
        biryanis[5] = biryani6;

        Biryani biryani7 = new Biryani();
        biryani7.biryaniId = 7;
        biryani7.biryaniName = "Prawn Biryani";
        biryani7.type = "Non-Veg";
        biryani7.price = 350;
        biryani7.restaurantName = "SeaFood Hub";
        biryanis[6] = biryani7;

        Biryani biryani8 = new Biryani();
        biryani8.biryaniId = 8;
        biryani8.biryaniName = "Donne Biryani";
        biryani8.type = "Non-Veg";
        biryani8.price = 220;
        biryani8.restaurantName = "Shivaji Military Hotel";
        biryanis[7] = biryani8;

        Biryani biryani9 = new Biryani();
        biryani9.biryaniId = 9;
        biryani9.biryaniName = "Kolkata Biryani";
        biryani9.type = "Non-Veg";
        biryani9.price = 260;
        biryani9.restaurantName = "Aminia";
        biryanis[8] = biryani9;

        Biryani biryani10 = new Biryani();
        biryani10.biryaniId = 10;
        biryani10.biryaniName = "Lucknowi Biryani";
        biryani10.type = "Non-Veg";
        biryani10.price = 270;
        biryani10.restaurantName = "Tunday Kababi";
        biryanis[9] = biryani10;

        Biryani biryani11 = new Biryani();
        biryani11.biryaniId = 11;
        biryani11.biryaniName = "Ambur Biryani";
        biryani11.type = "Non-Veg";
        biryani11.price = 230;
        biryani11.restaurantName = "Star Biryani";
        biryanis[10] = biryani11;

        Biryani biryani12 = new Biryani();
        biryani12.biryaniId = 12;
        biryani12.biryaniName = "Malabar Biryani";
        biryani12.type = "Non-Veg";
        biryani12.price = 280;
        biryani12.restaurantName = "Kerala Kitchen";
        biryanis[11] = biryani12;

        Biryani biryani13 = new Biryani();
        biryani13.biryaniId = 13;
        biryani13.biryaniName = "Paneer Biryani";
        biryani13.type = "Veg";
        biryani13.price = 210;
        biryani13.restaurantName = "Veg Delight";
        biryanis[12] = biryani13;

        Biryani biryani14 = new Biryani();
        biryani14.biryaniId = 14;
        biryani14.biryaniName = "Mushroom Biryani";
        biryani14.type = "Veg";
        biryani14.price = 200;
        biryani14.restaurantName = "Green Leaf";
        biryanis[13] = biryani14;

        Biryani biryani15 = new Biryani();
        biryani15.biryaniId = 15;
        biryani15.biryaniName = "Beef Biryani";
        biryani15.type = "Non-Veg";
        biryani15.price = 300;
        biryani15.restaurantName = "Malabar Restaurant";
        biryanis[14] = biryani15;


        for (Biryani ref : biryanis) {

            System.out.println("Biryani Id is :" + ref.biryaniId);
            System.out.println("Biryani Name is :" + ref.biryaniName);
            System.out.println("Type is :" + ref.type);
            System.out.println("Price is :" + ref.price);
            System.out.println("Restaurant Name is :" + ref.restaurantName);
            System.out.println("----------------------------------");
        }
    }
}
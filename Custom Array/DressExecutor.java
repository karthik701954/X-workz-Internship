class DressExecutor {

    public static void main(String args[]) {

        Dress dresses[] = new Dress[15];

        Dress dress1 = new Dress();
        dress1.dressId = 1;
        dress1.dressName = "T-Shirt";
        dress1.brand = "Zara";
        dress1.price = 1200;
        dress1.size = "M";
        dresses[0] = dress1;

        Dress dress2 = new Dress();
        dress2.dressId = 2;
        dress2.dressName = "Jeans";
        dress2.brand = "Levis";
        dress2.price = 2500;
        dress2.size = "L";
        dresses[1] = dress2;

        Dress dress3 = new Dress();
        dress3.dressId = 3;
        dress3.dressName = "Shirt";
        dress3.brand = "H&M";
        dress3.price = 1800;
        dress3.size = "M";
        dresses[2] = dress3;

        Dress dress4 = new Dress();
        dress4.dressId = 4;
        dress4.dressName = "Kurta";
        dress4.brand = "FabIndia";
        dress4.price = 1500;
        dress4.size = "XL";
        dresses[3] = dress4;

        Dress dress5 = new Dress();
        dress5.dressId = 5;
        dress5.dressName = "Saree";
        dress5.brand = "Kalanjali";
        dress5.price = 3500;
        dress5.size = "Free Size";
        dresses[4] = dress5;

        Dress dress6 = new Dress();
        dress6.dressId = 6;
        dress6.dressName = "Jacket";
        dress6.brand = "Nike";
        dress6.price = 4000;
        dress6.size = "L";
        dresses[5] = dress6;

        Dress dress7 = new Dress();
        dress7.dressId = 7;
        dress7.dressName = "Hoodie";
        dress7.brand = "Puma";
        dress7.price = 3000;
        dress7.size = "M";
        dresses[6] = dress7;

        Dress dress8 = new Dress();
        dress8.dressId = 8;
        dress8.dressName = "Shorts";
        dress8.brand = "Adidas";
        dress8.price = 1200;
        dress8.size = "S";
        dresses[7] = dress8;

        Dress dress9 = new Dress();
        dress9.dressId = 9;
        dress9.dressName = "Blazer";
        dress9.brand = "Allen Solly";
        dress9.price = 5000;
        dress9.size = "XL";
        dresses[8] = dress9;

        Dress dress10 = new Dress();
        dress10.dressId = 10;
        dress10.dressName = "Formal Pant";
        dress10.brand = "Peter England";
        dress10.price = 2000;
        dress10.size = "L";
        dresses[9] = dress10;

        Dress dress11 = new Dress();
        dress11.dressId = 11;
        dress11.dressName = "Skirt";
        dress11.brand = "Forever 21";
        dress11.price = 1600;
        dress11.size = "M";
        dresses[10] = dress11;

        Dress dress12 = new Dress();
        dress12.dressId = 12;
        dress12.dressName = "Salwar Suit";
        dress12.brand = "Biba";
        dress12.price = 2800;
        dress12.size = "L";
        dresses[11] = dress12;

        Dress dress13 = new Dress();
        dress13.dressId = 13;
        dress13.dressName = "Tracksuit";
        dress13.brand = "Reebok";
        dress13.price = 3200;
        dress13.size = "M";
        dresses[12] = dress13;

        Dress dress14 = new Dress();
        dress14.dressId = 14;
        dress14.dressName = "Sweater";
        dress14.brand = "UCB";
        dress14.price = 2200;
        dress14.size = "L";
        dresses[13] = dress14;

        Dress dress15 = new Dress();
        dress15.dressId = 15;
        dress15.dressName = "Night Dress";
        dress15.brand = "Jockey";
        dress15.price = 1500;
        dress15.size = "M";
        dresses[14] = dress15;


        for (Dress ref : dresses) {

            System.out.println("Dress Id is :" + ref.dressId);
            System.out.println("Dress Name is :" + ref.dressName);
            System.out.println("Brand is :" + ref.brand);
            System.out.println("Price is :" + ref.price);
            System.out.println("Size is :" + ref.size);
            System.out.println("----------------------------------");
        }
    }
}
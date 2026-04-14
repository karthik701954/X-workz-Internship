class FlipkartExecutor {

    public static void main(String args[]) {

        Flipkart products[] = new Flipkart[15];

        Flipkart flipkart1 = new Flipkart();
        flipkart1.productId = 1;
        flipkart1.productName = "iPhone 13";
        flipkart1.category = "Mobile";
        flipkart1.price = 65000;
        flipkart1.sellerName = "RetailNet";
        products[0] = flipkart1;

        Flipkart flipkart2 = new Flipkart();
        flipkart2.productId = 2;
        flipkart2.productName = "Samsung Galaxy S22";
        flipkart2.category = "Mobile";
        flipkart2.price = 55000;
        flipkart2.sellerName = "SuperComNet";
        products[1] = flipkart2;

        Flipkart flipkart3 = new Flipkart();
        flipkart3.productId = 3;
        flipkart3.productName = "Dell Laptop";
        flipkart3.category = "Electronics";
        flipkart3.price = 60000;
        flipkart3.sellerName = "DellStore";
        products[2] = flipkart3;

        Flipkart flipkart4 = new Flipkart();
        flipkart4.productId = 4;
        flipkart4.productName = "HP Laptop";
        flipkart4.category = "Electronics";
        flipkart4.price = 58000;
        flipkart4.sellerName = "HPWorld";
        products[3] = flipkart4;

        Flipkart flipkart5 = new Flipkart();
        flipkart5.productId = 5;
        flipkart5.productName = "Sony Headphones";
        flipkart5.category = "Accessories";
        flipkart5.price = 5000;
        flipkart5.sellerName = "SonyCenter";
        products[4] = flipkart5;

        Flipkart flipkart6 = new Flipkart();
        flipkart6.productId = 6;
        flipkart6.productName = "Boat Earbuds";
        flipkart6.category = "Accessories";
        flipkart6.price = 2000;
        flipkart6.sellerName = "BoatStore";
        products[5] = flipkart6;

        Flipkart flipkart7 = new Flipkart();
        flipkart7.productId = 7;
        flipkart7.productName = "LG Smart TV";
        flipkart7.category = "Electronics";
        flipkart7.price = 45000;
        flipkart7.sellerName = "LGStore";
        products[6] = flipkart7;

        Flipkart flipkart8 = new Flipkart();
        flipkart8.productId = 8;
        flipkart8.productName = "Mi Smart TV";
        flipkart8.category = "Electronics";
        flipkart8.price = 30000;
        flipkart8.sellerName = "MiStore";
        products[7] = flipkart8;

        Flipkart flipkart9 = new Flipkart();
        flipkart9.productId = 9;
        flipkart9.productName = "Nike Shoes";
        flipkart9.category = "Fashion";
        flipkart9.price = 4000;
        flipkart9.sellerName = "NikeIndia";
        products[8] = flipkart9;

        Flipkart flipkart10 = new Flipkart();
        flipkart10.productId = 10;
        flipkart10.productName = "Adidas T-Shirt";
        flipkart10.category = "Fashion";
        flipkart10.price = 1500;
        flipkart10.sellerName = "AdidasStore";
        products[9] = flipkart10;

        Flipkart flipkart11 = new Flipkart();
        flipkart11.productId = 11;
        flipkart11.productName = "Refrigerator";
        flipkart11.category = "Appliances";
        flipkart11.price = 25000;
        flipkart11.sellerName = "Whirlpool";
        products[10] = flipkart11;

        Flipkart flipkart12 = new Flipkart();
        flipkart12.productId = 12;
        flipkart12.productName = "Washing Machine";
        flipkart12.category = "Appliances";
        flipkart12.price = 20000;
        flipkart12.sellerName = "SamsungStore";
        products[11] = flipkart12;

        Flipkart flipkart13 = new Flipkart();
        flipkart13.productId = 13;
        flipkart13.productName = "Backpack";
        flipkart13.category = "Accessories";
        flipkart13.price = 1200;
        flipkart13.sellerName = "Skybags";
        products[12] = flipkart13;

        Flipkart flipkart14 = new Flipkart();
        flipkart14.productId = 14;
        flipkart14.productName = "Office Chair";
        flipkart14.category = "Furniture";
        flipkart14.price = 7000;
        flipkart14.sellerName = "UrbanLadder";
        products[13] = flipkart14;

        Flipkart flipkart15 = new Flipkart();
        flipkart15.productId = 15;
        flipkart15.productName = "Study Table";
        flipkart15.category = "Furniture";
        flipkart15.price = 9000;
        flipkart15.sellerName = "HomeTown";
        products[14] = flipkart15;


        for (Flipkart ref : products) {

            System.out.println("Product Id is :" + ref.productId);
            System.out.println("Product Name is :" + ref.productName);
            System.out.println("Category is :" + ref.category);
            System.out.println("Price is :" + ref.price);
            System.out.println("Seller Name is :" + ref.sellerName);
            System.out.println("----------------------------------");
        }
    }
}
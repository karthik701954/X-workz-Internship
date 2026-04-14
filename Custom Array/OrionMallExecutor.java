class OrionMallExecutor {

    public static void main(String args[]) {

        OrionMall shops[] = new OrionMall[15];

        OrionMall mall1 = new OrionMall();
        mall1.shopId = 1;
        mall1.shopName = "Zudio";
        mall1.category = "Clothing";
        mall1.noOfEmployees = 10;
        mall1.shopOwnerName = "Ramesh";
        shops[0] = mall1;

        OrionMall mall2 = new OrionMall();
        mall2.shopId = 2;
        mall2.shopName = "Reliance Trends";
        mall2.category = "Fashion";
        mall2.noOfEmployees = 12;
        mall2.shopOwnerName = "Suresh";
        shops[1] = mall2;

        OrionMall mall3 = new OrionMall();
        mall3.shopId = 3;
        mall3.shopName = "Puma";
        mall3.category = "Sportswear";
        mall3.noOfEmployees = 8;
        mall3.shopOwnerName = "Anil";
        shops[2] = mall3;

        OrionMall mall4 = new OrionMall();
        mall4.shopId = 4;
        mall4.shopName = "Nike";
        mall4.category = "Sportswear";
        mall4.noOfEmployees = 9;
        mall4.shopOwnerName = "Kiran";
        shops[3] = mall4;

        OrionMall mall5 = new OrionMall();
        mall5.shopId = 5;
        mall5.shopName = "Levis";
        mall5.category = "Clothing";
        mall5.noOfEmployees = 7;
        mall5.shopOwnerName = "Rahul";
        shops[4] = mall5;

        OrionMall mall6 = new OrionMall();
        mall6.shopId = 6;
        mall6.shopName = "Dominos";
        mall6.category = "Food";
        mall6.noOfEmployees = 15;
        mall6.shopOwnerName = "Amit";
        shops[5] = mall6;

        OrionMall mall7 = new OrionMall();
        mall7.shopId = 7;
        mall7.shopName = "KFC";
        mall7.category = "Food";
        mall7.noOfEmployees = 14;
        mall7.shopOwnerName = "Vikram";
        shops[6] = mall7;

        OrionMall mall8 = new OrionMall();
        mall8.shopId = 8;
        mall8.shopName = "Burger King";
        mall8.category = "Food";
        mall8.noOfEmployees = 13;
        mall8.shopOwnerName = "Arjun";
        shops[7] = mall8;

        OrionMall mall9 = new OrionMall();
        mall9.shopId = 9;
        mall9.shopName = "Samsung Store";
        mall9.category = "Electronics";
        mall9.noOfEmployees = 6;
        mall9.shopOwnerName = "Manoj";
        shops[8] = mall9;

        OrionMall mall10 = new OrionMall();
        mall10.shopId = 10;
        mall10.shopName = "Apple Store";
        mall10.category = "Electronics";
        mall10.noOfEmployees = 5;
        mall10.shopOwnerName = "Ravi";
        shops[9] = mall10;

        OrionMall mall11 = new OrionMall();
        mall11.shopId = 11;
        mall11.shopName = "Croma";
        mall11.category = "Electronics";
        mall11.noOfEmployees = 11;
        mall11.shopOwnerName = "Deepak";
        shops[10] = mall11;

        OrionMall mall12 = new OrionMall();
        mall12.shopId = 12;
        mall12.shopName = "Pantaloons";
        mall12.category = "Fashion";
        mall12.noOfEmployees = 10;
        mall12.shopOwnerName = "Naveen";
        shops[11] = mall12;

        OrionMall mall13 = new OrionMall();
        mall13.shopId = 13;
        mall13.shopName = "Shoppers Stop";
        mall13.category = "Fashion";
        mall13.noOfEmployees = 12;
        mall13.shopOwnerName = "Harish";
        shops[12] = mall13;

        OrionMall mall14 = new OrionMall();
        mall14.shopId = 14;
        mall14.shopName = "Spar";
        mall14.category = "Supermarket";
        mall14.noOfEmployees = 20;
        mall14.shopOwnerName = "Mahesh";
        shops[13] = mall14;

        OrionMall mall15 = new OrionMall();
        mall15.shopId = 15;
        mall15.shopName = "INOX";
        mall15.category = "Entertainment";
        mall15.noOfEmployees = 25;
        mall15.shopOwnerName = "Sunil";
        shops[14] = mall15;


        for (OrionMall ref : shops) {

            System.out.println("Shop Id is :" + ref.shopId);
            System.out.println("Shop Name is :" + ref.shopName);
            System.out.println("Category is :" + ref.category);
            System.out.println("No Of Employees is :" + ref.noOfEmployees);
            System.out.println("Shop Owner Name is :" + ref.shopOwnerName);
            System.out.println("----------------------------------");
        }
    }
}
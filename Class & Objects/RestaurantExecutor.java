class RestaurantExecutor {

    public static void main(String args[]) {

        Restaurant ref1 = new Restaurant();
        ref1.restaurantId = 1;
        ref1.restaurantName = "Restaurant1";
        ref1.location = "City1";
        ref1.cuisine = "Indian";
        ref1.rating = 4;

        Chef c1 = new Chef();
        c1.chefId = 101;
        c1.chefName = "Chef1";
        c1.experience = 5;
        c1.specialty = "Biryani";
        c1.shift = "Morning";

        Person p1 = new Person();
        p1.personId = 1001;
        p1.name = "Person1";
        p1.age = 30;
        p1.gender = "Male";
        p1.city = "City1";

        c1.person = p1;
        ref1.chef = c1;
        ref1.getRestaurantDetails();


        Restaurant ref2 = new Restaurant();
        ref2.restaurantId = 2;
        ref2.restaurantName = "Restaurant2";
        ref2.location = "City2";
        ref2.cuisine = "Chinese";
        ref2.rating = 5;

        Chef c2 = new Chef();
        c2.chefId = 102;
        c2.chefName = "Chef2";
        c2.experience = 6;
        c2.specialty = "Noodles";
        c2.shift = "Evening";

        Person p2 = new Person();
        p2.personId = 1002;
        p2.name = "Person2";
        p2.age = 35;
        p2.gender = "Male";
        p2.city = "City2";

        c2.person = p2;
        ref2.chef = c2;
        ref2.getRestaurantDetails();


        Restaurant ref3 = new Restaurant();
        ref3.restaurantId = 3;
        ref3.restaurantName = "Restaurant3";
        ref3.location = "City3";
        ref3.cuisine = "Italian";
        ref3.rating = 4;

        Chef c3 = new Chef();
        c3.chefId = 103;
        c3.chefName = "Chef3";
        c3.experience = 4;
        c3.specialty = "Pizza";
        c3.shift = "Morning";

        Person p3 = new Person();
        p3.personId = 1003;
        p3.name = "Person3";
        p3.age = 28;
        p3.gender = "Female";
        p3.city = "City3";

        c3.person = p3;
        ref3.chef = c3;
        ref3.getRestaurantDetails();


        Restaurant ref4 = new Restaurant();
        ref4.restaurantId = 4;
        ref4.restaurantName = "Restaurant4";
        ref4.location = "City4";
        ref4.cuisine = "Mexican";
        ref4.rating = 3;

        Chef c4 = new Chef();
        c4.chefId = 104;
        c4.chefName = "Chef4";
        c4.experience = 7;
        c4.specialty = "Tacos";
        c4.shift = "Evening";

        Person p4 = new Person();
        p4.personId = 1004;
        p4.name = "Person4";
        p4.age = 40;
        p4.gender = "Male";
        p4.city = "City4";

        c4.person = p4;
        ref4.chef = c4;
        ref4.getRestaurantDetails();


        Restaurant ref5 = new Restaurant();
        ref5.restaurantId = 5;
        ref5.restaurantName = "Restaurant5";
        ref5.location = "City5";
        ref5.cuisine = "Thai";
        ref5.rating = 5;

        Chef c5 = new Chef();
        c5.chefId = 105;
        c5.chefName = "Chef5";
        c5.experience = 8;
        c5.specialty = "Curry";
        c5.shift = "Morning";

        Person p5 = new Person();
        p5.personId = 1005;
        p5.name = "Person5";
        p5.age = 32;
        p5.gender = "Female";
        p5.city = "City5";

        c5.person = p5;
        ref5.chef = c5;
        ref5.getRestaurantDetails();
		
		        Restaurant ref6 = new Restaurant();
        ref6.restaurantId = 6;
        ref6.restaurantName = "Restaurant6";
        ref6.location = "City6";
        ref6.cuisine = "Indian";
        ref6.rating = 4;

        Chef c6 = new Chef();
        c6.chefId = 106;
        c6.chefName = "Chef6";
        c6.experience = 5;
        c6.specialty = "Biryani";
        c6.shift = "Evening";

        Person p6 = new Person();
        p6.personId = 1006;
        p6.name = "Person6";
        p6.age = 31;
        p6.gender = "Male";
        p6.city = "City6";

        c6.person = p6;
        ref6.chef = c6;
        ref6.getRestaurantDetails();


        Restaurant ref7 = new Restaurant();
        ref7.restaurantId = 7;
        ref7.restaurantName = "Restaurant7";
        ref7.location = "City7";
        ref7.cuisine = "Chinese";
        ref7.rating = 5;

        Chef c7 = new Chef();
        c7.chefId = 107;
        c7.chefName = "Chef7";
        c7.experience = 6;
        c7.specialty = "Noodles";
        c7.shift = "Morning";

        Person p7 = new Person();
        p7.personId = 1007;
        p7.name = "Person7";
        p7.age = 36;
        p7.gender = "Male";
        p7.city = "City7";

        c7.person = p7;
        ref7.chef = c7;
        ref7.getRestaurantDetails();


        Restaurant ref8 = new Restaurant();
        ref8.restaurantId = 8;
        ref8.restaurantName = "Restaurant8";
        ref8.location = "City8";
        ref8.cuisine = "Italian";
        ref8.rating = 4;

        Chef c8 = new Chef();
        c8.chefId = 108;
        c8.chefName = "Chef8";
        c8.experience = 4;
        c8.specialty = "Pizza";
        c8.shift = "Evening";

        Person p8 = new Person();
        p8.personId = 1008;
        p8.name = "Person8";
        p8.age = 29;
        p8.gender = "Female";
        p8.city = "City8";

        c8.person = p8;
        ref8.chef = c8;
        ref8.getRestaurantDetails();


        Restaurant ref9 = new Restaurant();
        ref9.restaurantId = 9;
        ref9.restaurantName = "Restaurant9";
        ref9.location = "City9";
        ref9.cuisine = "Mexican";
        ref9.rating = 3;

        Chef c9 = new Chef();
        c9.chefId = 109;
        c9.chefName = "Chef9";
        c9.experience = 7;
        c9.specialty = "Tacos";
        c9.shift = "Morning";

        Person p9 = new Person();
        p9.personId = 1009;
        p9.name = "Person9";
        p9.age = 41;
        p9.gender = "Male";
        p9.city = "City9";

        c9.person = p9;
        ref9.chef = c9;
        ref9.getRestaurantDetails();


        Restaurant ref10 = new Restaurant();
        ref10.restaurantId = 10;
        ref10.restaurantName = "Restaurant10";
        ref10.location = "City10";
        ref10.cuisine = "Thai";
        ref10.rating = 5;

        Chef c10 = new Chef();
        c10.chefId = 110;
        c10.chefName = "Chef10";
        c10.experience = 8;
        c10.specialty = "Curry";
        c10.shift = "Evening";

        Person p10 = new Person();
        p10.personId = 1010;
        p10.name = "Person10";
        p10.age = 33;
        p10.gender = "Female";
        p10.city = "City10";

        c10.person = p10;
        ref10.chef = c10;
        ref10.getRestaurantDetails();


        Restaurant ref11 = new Restaurant();
        ref11.restaurantId = 11;
        ref11.restaurantName = "Restaurant11";
        ref11.location = "City11";
        ref11.cuisine = "Indian";
        ref11.rating = 4;

        Chef c11 = new Chef();
        c11.chefId = 111;
        c11.chefName = "Chef11";
        c11.experience = 6;
        c11.specialty = "Biryani";
        c11.shift = "Morning";

        Person p11 = new Person();
        p11.personId = 1011;
        p11.name = "Person11";
        p11.age = 34;
        p11.gender = "Male";
        p11.city = "City11";

        c11.person = p11;
        ref11.chef = c11;
        ref11.getRestaurantDetails();


        Restaurant ref12 = new Restaurant();
        ref12.restaurantId = 12;
        ref12.restaurantName = "Restaurant12";
        ref12.location = "City12";
        ref12.cuisine = "Chinese";
        ref12.rating = 5;

        Chef c12 = new Chef();
        c12.chefId = 112;
        c12.chefName = "Chef12";
        c12.experience = 7;
        c12.specialty = "Noodles";
        c12.shift = "Evening";

        Person p12 = new Person();
        p12.personId = 1012;
        p12.name = "Person12";
        p12.age = 37;
        p12.gender = "Male";
        p12.city = "City12";

        c12.person = p12;
        ref12.chef = c12;
        ref12.getRestaurantDetails();


        Restaurant ref13 = new Restaurant();
        ref13.restaurantId = 13;
        ref13.restaurantName = "Restaurant13";
        ref13.location = "City13";
        ref13.cuisine = "Italian";
        ref13.rating = 4;

        Chef c13 = new Chef();
        c13.chefId = 113;
        c13.chefName = "Chef13";
        c13.experience = 5;
        c13.specialty = "Pizza";
        c13.shift = "Morning";

        Person p13 = new Person();
        p13.personId = 1013;
        p13.name = "Person13";
        p13.age = 30;
        p13.gender = "Female";
        p13.city = "City13";

        c13.person = p13;
        ref13.chef = c13;
        ref13.getRestaurantDetails();


        Restaurant ref14 = new Restaurant();
        ref14.restaurantId = 14;
        ref14.restaurantName = "Restaurant14";
        ref14.location = "City14";
        ref14.cuisine = "Mexican";
        ref14.rating = 3;

        Chef c14 = new Chef();
        c14.chefId = 114;
        c14.chefName = "Chef14";
        c14.experience = 8;
        c14.specialty = "Tacos";
        c14.shift = "Evening";

        Person p14 = new Person();
        p14.personId = 1014;
        p14.name = "Person14";
        p14.age = 42;
        p14.gender = "Male";
        p14.city = "City14";

        c14.person = p14;
        ref14.chef = c14;
        ref14.getRestaurantDetails();


        Restaurant ref15 = new Restaurant();
        ref15.restaurantId = 15;
        ref15.restaurantName = "Restaurant15";
        ref15.location = "City15";
        ref15.cuisine = "Thai";
        ref15.rating = 5;

        Chef c15 = new Chef();
        c15.chefId = 115;
        c15.chefName = "Chef15";
        c15.experience = 9;
        c15.specialty = "Curry";
        c15.shift = "Morning";

        Person p15 = new Person();
        p15.personId = 1015;
        p15.name = "Person15";
        p15.age = 35;
        p15.gender = "Female";
        p15.city = "City15";

        c15.person = p15;
        ref15.chef = c15;
        ref15.getRestaurantDetails();

        Restaurant ref29 = new Restaurant();
        ref29.restaurantId = 29;
        ref29.restaurantName = "Restaurant29";
        ref29.location = "City29";
        ref29.cuisine = "Italian";
        ref29.rating = 4;

        Chef c29 = new Chef();
        c29.chefId = 129;
        c29.chefName = "Chef29";
        c29.experience = 10;
        c29.specialty = "Pasta";
        c29.shift = "Evening";

        Person p29 = new Person();
        p29.personId = 1029;
        p29.name = "Person29";
        p29.age = 38;
        p29.gender = "Male";
        p29.city = "City29";

        c29.person = p29;
        ref29.chef = c29;
        ref29.getRestaurantDetails();
    }
}
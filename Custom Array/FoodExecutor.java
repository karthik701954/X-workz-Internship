class FoodExecutor {

    public static void main(String args[]) {

        Food foods[] = new Food[15];

        Food food1 = new Food();
        food1.foodId = 1;
        food1.foodName = "Biryani";
        food1.category = "Non-Veg";
        food1.price = 250;
        food1.restaurantName = "Meghana Foods";
        foods[0] = food1;

        Food food2 = new Food();
        food2.foodId = 2;
        food2.foodName = "Masala Dosa";
        food2.category = "Veg";
        food2.price = 80;
        food2.restaurantName = "Udupi Hotel";
        foods[1] = food2;

        Food food3 = new Food();
        food3.foodId = 3;
        food3.foodName = "Paneer Butter Masala";
        food3.category = "Veg";
        food3.price = 220;
        food3.restaurantName = "Empire Restaurant";
        foods[2] = food3;

        Food food4 = new Food();
        food4.foodId = 4;
        food4.foodName = "Chicken Fry";
        food4.category = "Non-Veg";
        food4.price = 300;
        food4.restaurantName = "Nandhini Hotel";
        foods[3] = food4;

        Food food5 = new Food();
        food5.foodId = 5;
        food5.foodName = "Veg Fried Rice";
        food5.category = "Veg";
        food5.price = 150;
        food5.restaurantName = "Chung Wah";
        foods[4] = food5;

        Food food6 = new Food();
        food6.foodId = 6;
        food6.foodName = "Chicken Noodles";
        food6.category = "Non-Veg";
        food6.price = 180;
        food6.restaurantName = "Beijing Bites";
        foods[5] = food6;

        Food food7 = new Food();
        food7.foodId = 7;
        food7.foodName = "Burger";
        food7.category = "Fast Food";
        food7.price = 120;
        food7.restaurantName = "McDonalds";
        foods[6] = food7;

        Food food8 = new Food();
        food8.foodId = 8;
        food8.foodName = "Pizza";
        food8.category = "Fast Food";
        food8.price = 250;
        food8.restaurantName = "Dominos";
        foods[7] = food8;

        Food food9 = new Food();
        food9.foodId = 9;
        food9.foodName = "Pasta";
        food9.category = "Italian";
        food9.price = 300;
        food9.restaurantName = "Pizza Hut";
        foods[8] = food9;

        Food food10 = new Food();
        food10.foodId = 10;
        food10.foodName = "Ice Cream";
        food10.category = "Dessert";
        food10.price = 100;
        food10.restaurantName = "Ibaco";
        foods[9] = food10;

        Food food11 = new Food();
        food11.foodId = 11;
        food11.foodName = "Gulab Jamun";
        food11.category = "Dessert";
        food11.price = 60;
        food11.restaurantName = "Anand Sweets";
        foods[10] = food11;

        Food food12 = new Food();
        food12.foodId = 12;
        food12.foodName = "Sandwich";
        food12.category = "Fast Food";
        food12.price = 90;
        food12.restaurantName = "Subway";
        foods[11] = food12;

        Food food13 = new Food();
        food13.foodId = 13;
        food13.foodName = "Chole Bhature";
        food13.category = "North Indian";
        food13.price = 140;
        food13.restaurantName = "Haldirams";
        foods[12] = food13;

        Food food14 = new Food();
        food14.foodId = 14;
        food14.foodName = "Idli Vada";
        food14.category = "South Indian";
        food14.price = 70;
        food14.restaurantName = "MTR";
        foods[13] = food14;

        Food food15 = new Food();
        food15.foodId = 15;
        food15.foodName = "Fish Curry";
        food15.category = "Non-Veg";
        food15.price = 320;
        food15.restaurantName = "Coastal Kitchen";
        foods[14] = food15;


        for (Food ref : foods) {

            System.out.println("Food Id is :" + ref.foodId);
            System.out.println("Food Name is :" + ref.foodName);
            System.out.println("Category is :" + ref.category);
            System.out.println("Price is :" + ref.price);
            System.out.println("Restaurant Name is :" + ref.restaurantName);
            System.out.println("----------------------------------");
        }
    }
}
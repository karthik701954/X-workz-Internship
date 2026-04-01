class CartExecutor {

    public static void main(String args[]) {

        Cart ref1 = new Cart();
        ref1.cartId = 1;
        ref1.userName = "User1";
        ref1.itemCount = 2;
        ref1.totalPrice = 2000;
        ref1.status = "Active";

        Order o1 = new Order();
        o1.orderId = 101;
        o1.productName = "Product1";
        o1.quantity = 2;
        o1.price = 2000;
        o1.deliveryDate = "2026-01-01";

        ref1.order = o1;
        ref1.getCartDetails();


        Cart ref2 = new Cart();
        ref2.cartId = 2;
        ref2.userName = "User2";
        ref2.itemCount = 1;
        ref2.totalPrice = 1500;
        ref2.status = "Ordered";

        Order o2 = new Order();
        o2.orderId = 102;
        o2.productName = "Product2";
        o2.quantity = 1;
        o2.price = 1500;
        o2.deliveryDate = "2026-01-02";

        ref2.order = o2;
        ref2.getCartDetails();


        Cart ref3 = new Cart();
        ref3.cartId = 3;
        ref3.userName = "User3";
        ref3.itemCount = 3;
        ref3.totalPrice = 3000;
        ref3.status = "Active";

        Order o3 = new Order();
        o3.orderId = 103;
        o3.productName = "Product3";
        o3.quantity = 3;
        o3.price = 3000;
        o3.deliveryDate = "2026-01-03";

        ref3.order = o3;
        ref3.getCartDetails();


        Cart ref4 = new Cart();
        ref4.cartId = 4;
        ref4.userName = "User4";
        ref4.itemCount = 2;
        ref4.totalPrice = 2500;
        ref4.status = "Delivered";

        Order o4 = new Order();
        o4.orderId = 104;
        o4.productName = "Product4";
        o4.quantity = 2;
        o4.price = 2500;
        o4.deliveryDate = "2026-01-04";

        ref4.order = o4;
        ref4.getCartDetails();


        Cart ref5 = new Cart();
        ref5.cartId = 5;
        ref5.userName = "User5";
        ref5.itemCount = 4;
        ref5.totalPrice = 4000;
        ref5.status = "Active";

        Order o5 = new Order();
        o5.orderId = 105;
        o5.productName = "Product5";
        o5.quantity = 4;
        o5.price = 4000;
        o5.deliveryDate = "2026-01-05";

        ref5.order = o5;
        ref5.getCartDetails();
		
		        Cart ref6 = new Cart();
        ref6.cartId = 6;
        ref6.userName = "User6";
        ref6.itemCount = 2;
        ref6.totalPrice = 2200;
        ref6.status = "Ordered";

        Order o6 = new Order();
        o6.orderId = 106;
        o6.productName = "Product6";
        o6.quantity = 2;
        o6.price = 2200;
        o6.deliveryDate = "2026-01-06";

        ref6.order = o6;
        ref6.getCartDetails();


        Cart ref7 = new Cart();
        ref7.cartId = 7;
        ref7.userName = "User7";
        ref7.itemCount = 1;
        ref7.totalPrice = 1200;
        ref7.status = "Active";

        Order o7 = new Order();
        o7.orderId = 107;
        o7.productName = "Product7";
        o7.quantity = 1;
        o7.price = 1200;
        o7.deliveryDate = "2026-01-07";

        ref7.order = o7;
        ref7.getCartDetails();


        Cart ref8 = new Cart();
        ref8.cartId = 8;
        ref8.userName = "User8";
        ref8.itemCount = 3;
        ref8.totalPrice = 3300;
        ref8.status = "Delivered";

        Order o8 = new Order();
        o8.orderId = 108;
        o8.productName = "Product8";
        o8.quantity = 3;
        o8.price = 3300;
        o8.deliveryDate = "2026-01-08";

        ref8.order = o8;
        ref8.getCartDetails();


        Cart ref9 = new Cart();
        ref9.cartId = 9;
        ref9.userName = "User9";
        ref9.itemCount = 2;
        ref9.totalPrice = 2600;
        ref9.status = "Active";

        Order o9 = new Order();
        o9.orderId = 109;
        o9.productName = "Product9";
        o9.quantity = 2;
        o9.price = 2600;
        o9.deliveryDate = "2026-01-09";

        ref9.order = o9;
        ref9.getCartDetails();


        Cart ref10 = new Cart();
        ref10.cartId = 10;
        ref10.userName = "User10";
        ref10.itemCount = 5;
        ref10.totalPrice = 5000;
        ref10.status = "Ordered";

        Order o10 = new Order();
        o10.orderId = 110;
        o10.productName = "Product10";
        o10.quantity = 5;
        o10.price = 5000;
        o10.deliveryDate = "2026-01-10";

        ref10.order = o10;
        ref10.getCartDetails();


        Cart ref11 = new Cart();
        ref11.cartId = 11;
        ref11.userName = "User11";
        ref11.itemCount = 2;
        ref11.totalPrice = 2100;
        ref11.status = "Delivered";

        Order o11 = new Order();
        o11.orderId = 111;
        o11.productName = "Product11";
        o11.quantity = 2;
        o11.price = 2100;
        o11.deliveryDate = "2026-01-11";

        ref11.order = o11;
        ref11.getCartDetails();


        Cart ref12 = new Cart();
        ref12.cartId = 12;
        ref12.userName = "User12";
        ref12.itemCount = 3;
        ref12.totalPrice = 3600;
        ref12.status = "Active";

        Order o12 = new Order();
        o12.orderId = 112;
        o12.productName = "Product12";
        o12.quantity = 3;
        o12.price = 3600;
        o12.deliveryDate = "2026-01-12";

        ref12.order = o12;
        ref12.getCartDetails();


        Cart ref13 = new Cart();
        ref13.cartId = 13;
        ref13.userName = "User13";
        ref13.itemCount = 1;
        ref13.totalPrice = 900;
        ref13.status = "Ordered";

        Order o13 = new Order();
        o13.orderId = 113;
        o13.productName = "Product13";
        o13.quantity = 1;
        o13.price = 900;
        o13.deliveryDate = "2026-01-13";

        ref13.order = o13;
        ref13.getCartDetails();


        Cart ref14 = new Cart();
        ref14.cartId = 14;
        ref14.userName = "User14";
        ref14.itemCount = 4;
        ref14.totalPrice = 4800;
        ref14.status = "Delivered";

        Order o14 = new Order();
        o14.orderId = 114;
        o14.productName = "Product14";
        o14.quantity = 4;
        o14.price = 4800;
        o14.deliveryDate = "2026-01-14";

        ref14.order = o14;
        ref14.getCartDetails();


        Cart ref15 = new Cart();
        ref15.cartId = 15;
        ref15.userName = "User15";
        ref15.itemCount = 2;
        ref15.totalPrice = 2400;
        ref15.status = "Active";

        Order o15 = new Order();
        o15.orderId = 115;
        o15.productName = "Product15";
        o15.quantity = 2;
        o15.price = 2400;
        o15.deliveryDate = "2026-01-15";

        ref15.order = o15;
        ref15.getCartDetails();


        Cart ref16 = new Cart();
        ref16.cartId = 16;
        ref16.userName = "User16";
        ref16.itemCount = 3;
        ref16.totalPrice = 3900;
        ref16.status = "Ordered";

        Order o16 = new Order();
        o16.orderId = 116;
        o16.productName = "Product16";
        o16.quantity = 3;
        o16.price = 3900;
        o16.deliveryDate = "2026-01-16";

        ref16.order = o16;
        ref16.getCartDetails();


        Cart ref17 = new Cart();
        ref17.cartId = 17;
        ref17.userName = "User17";
        ref17.itemCount = 1;
        ref17.totalPrice = 1100;
        ref17.status = "Delivered";

        Order o17 = new Order();
        o17.orderId = 117;
        o17.productName = "Product17";
        o17.quantity = 1;
        o17.price = 1100;
        o17.deliveryDate = "2026-01-17";

        ref17.order = o17;
        ref17.getCartDetails();


        Cart ref18 = new Cart();
        ref18.cartId = 18;
        ref18.userName = "User18";
        ref18.itemCount = 2;
        ref18.totalPrice = 2700;
        ref18.status = "Active";

        Order o18 = new Order();
        o18.orderId = 118;
        o18.productName = "Product18";
        o18.quantity = 2;
        o18.price = 2700;
        o18.deliveryDate = "2026-01-18";

        ref18.order = o18;
        ref18.getCartDetails();


        Cart ref19 = new Cart();
        ref19.cartId = 19;
        ref19.userName = "User19";
        ref19.itemCount = 5;
        ref19.totalPrice = 5500;
        ref19.status = "Ordered";

        Order o19 = new Order();
        o19.orderId = 119;
        o19.productName = "Product19";
        o19.quantity = 5;
        o19.price = 5500;
        o19.deliveryDate = "2026-01-19";

        ref19.order = o19;
        ref19.getCartDetails();


        Cart ref20 = new Cart();
        ref20.cartId = 20;
        ref20.userName = "User20";
        ref20.itemCount = 3;
        ref20.totalPrice = 3600;
        ref20.status = "Delivered";

        Order o20 = new Order();
        o20.orderId = 120;
        o20.productName = "Product20";
        o20.quantity = 3;
        o20.price = 3600;
        o20.deliveryDate = "2026-01-20";

        ref20.order = o20;
        ref20.getCartDetails();


        Cart ref21 = new Cart();
        ref21.cartId = 21;
        ref21.userName = "User21";
        ref21.itemCount = 2;
        ref21.totalPrice = 2500;
        ref21.status = "Active";

        Order o21 = new Order();
        o21.orderId = 121;
        o21.productName = "Product21";
        o21.quantity = 2;
        o21.price = 2500;
        o21.deliveryDate = "2026-01-21";

        ref21.order = o21;
        ref21.getCartDetails();


        Cart ref22 = new Cart();
        ref22.cartId = 22;
        ref22.userName = "User22";
        ref22.itemCount = 4;
        ref22.totalPrice = 4800;
        ref22.status = "Ordered";

        Order o22 = new Order();
        o22.orderId = 122;
        o22.productName = "Product22";
        o22.quantity = 4;
        o22.price = 4800;
        o22.deliveryDate = "2026-01-22";

        ref22.order = o22;
        ref22.getCartDetails();


        Cart ref23 = new Cart();
        ref23.cartId = 23;
        ref23.userName = "User23";
        ref23.itemCount = 1;
        ref23.totalPrice = 800;
        ref23.status = "Delivered";

        Order o23 = new Order();
        o23.orderId = 123;
        o23.productName = "Product23";
        o23.quantity = 1;
        o23.price = 800;
        o23.deliveryDate = "2026-01-23";

        ref23.order = o23;
        ref23.getCartDetails();


        Cart ref24 = new Cart();
        ref24.cartId = 24;
        ref24.userName = "User24";
        ref24.itemCount = 3;
        ref24.totalPrice = 3300;
        ref24.status = "Active";

        Order o24 = new Order();
        o24.orderId = 124;
        o24.productName = "Product24";
        o24.quantity = 3;
        o24.price = 3300;
        o24.deliveryDate = "2026-01-24";

        ref24.order = o24;
        ref24.getCartDetails();


        Cart ref25 = new Cart();
        ref25.cartId = 25;
        ref25.userName = "User25";
        ref25.itemCount = 2;
        ref25.totalPrice = 2600;
        ref25.status = "Ordered";

        Order o25 = new Order();
        o25.orderId = 125;
        o25.productName = "Product25";
        o25.quantity = 2;
        o25.price = 2600;
        o25.deliveryDate = "2026-01-25";

        ref25.order = o25;
        ref25.getCartDetails();


        Cart ref26 = new Cart();
        ref26.cartId = 26;
        ref26.userName = "User26";
        ref26.itemCount = 5;
        ref26.totalPrice = 5200;
        ref26.status = "Delivered";

        Order o26 = new Order();
        o26.orderId = 126;
        o26.productName = "Product26";
        o26.quantity = 5;
        o26.price = 5200;
        o26.deliveryDate = "2026-01-26";

        ref26.order = o26;
        ref26.getCartDetails();


        Cart ref27 = new Cart();
        ref27.cartId = 27;
        ref27.userName = "User27";
        ref27.itemCount = 3;
        ref27.totalPrice = 3900;
        ref27.status = "Active";

        Order o27 = new Order();
        o27.orderId = 127;
        o27.productName = "Product27";
        o27.quantity = 3;
        o27.price = 3900;
        o27.deliveryDate = "2026-01-27";

        ref27.order = o27;
        ref27.getCartDetails();


        Cart ref28 = new Cart();
        ref28.cartId = 28;
        ref28.userName = "User28";
        ref28.itemCount = 2;
        ref28.totalPrice = 2400;
        ref28.status = "Ordered";

        Order o28 = new Order();
        o28.orderId = 128;
        o28.productName = "Product28";
        o28.quantity = 2;
        o28.price = 2400;
        o28.deliveryDate = "2026-01-28";

        ref28.order = o28;
        ref28.getCartDetails();


        Cart ref29 = new Cart();
        ref29.cartId = 29;
        ref29.userName = "User29";
        ref29.itemCount = 4;
        ref29.totalPrice = 4800;
        ref29.status = "Delivered";

        Order o29 = new Order();
        o29.orderId = 129;
        o29.productName = "Product29";
        o29.quantity = 4;
        o29.price = 4800;
        o29.deliveryDate = "2026-01-29";

        ref29.order = o29;
        ref29.getCartDetails();
		
    }
}
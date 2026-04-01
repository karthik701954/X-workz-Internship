class DoorExecution {

    public static void main(String args[]) {

        Door ref1 = new Door();
        ref1.doorId = 1;
        ref1.material = "Wood";
        ref1.color = "Brown";
        ref1.type = "Main";
        ref1.height = 7.0;

        Lock l1 = new Lock();
        l1.lockId = 101;
        l1.brand = "Godrej";
        l1.lockType = "Deadbolt";
        l1.securityLevel = "High";
        l1.keyType = "Manual";

        ref1.lock = l1;
        ref1.getDoorDetails();


        Door ref2 = new Door();
        ref2.doorId = 2;
        ref2.material = "Steel";
        ref2.color = "Black";
        ref2.type = "Security";
        ref2.height = 7.5;

        Lock l2 = new Lock();
        l2.lockId = 102;
        l2.brand = "Europa";
        l2.lockType = "Smart Lock";
        l2.securityLevel = "Very High";
        l2.keyType = "Digital";

        ref2.lock = l2;
        ref2.getDoorDetails();


        Door ref3 = new Door();
        ref3.doorId = 3;
        ref3.material = "PVC";
        ref3.color = "White";
        ref3.type = "Bathroom";
        ref3.height = 6.5;

        Lock l3 = new Lock();
        l3.lockId = 103;
        l3.brand = "Yale";
        l3.lockType = "Latch";
        l3.securityLevel = "Medium";
        l3.keyType = "Manual";

        ref3.lock = l3;
        ref3.getDoorDetails();


        Door ref4 = new Door();
        ref4.doorId = 4;
        ref4.material = "Glass";
        ref4.color = "Transparent";
        ref4.type = "Sliding";
        ref4.height = 6.8;

        Lock l4 = new Lock();
        l4.lockId = 104;
        l4.brand = "Godrej";
        l4.lockType = "Magnetic";
        l4.securityLevel = "Low";
        l4.keyType = "Digital";

        ref4.lock = l4;
        ref4.getDoorDetails();


        Door ref5 = new Door();
        ref5.doorId = 5;
        ref5.material = "Wood";
        ref5.color = "Dark Brown";
        ref5.type = "Bedroom";
        ref5.height = 7.0;

        Lock l5 = new Lock();
        l5.lockId = 105;
        l5.brand = "Yale";
        l5.lockType = "Deadbolt";
        l5.securityLevel = "High";
        l5.keyType = "Manual";

        ref5.lock = l5;
        ref5.getDoorDetails();
		
		        Door ref6 = new Door();
        ref6.doorId = 6;
        ref6.material = "Wood";
        ref6.color = "Light Brown";
        ref6.type = "Main";
        ref6.height = 7.2;

        Lock l6 = new Lock();
        l6.lockId = 106;
        l6.brand = "Godrej";
        l6.lockType = "Deadbolt";
        l6.securityLevel = "High";
        l6.keyType = "Manual";

        ref6.lock = l6;
        ref6.getDoorDetails();


        Door ref7 = new Door();
        ref7.doorId = 7;
        ref7.material = "Steel";
        ref7.color = "Grey";
        ref7.type = "Security";
        ref7.height = 7.5;

        Lock l7 = new Lock();
        l7.lockId = 107;
        l7.brand = "Europa";
        l7.lockType = "Smart Lock";
        l7.securityLevel = "Very High";
        l7.keyType = "Digital";

        ref7.lock = l7;
        ref7.getDoorDetails();


        Door ref8 = new Door();
        ref8.doorId = 8;
        ref8.material = "PVC";
        ref8.color = "White";
        ref8.type = "Bathroom";
        ref8.height = 6.5;

        Lock l8 = new Lock();
        l8.lockId = 108;
        l8.brand = "Yale";
        l8.lockType = "Latch";
        l8.securityLevel = "Medium";
        l8.keyType = "Manual";

        ref8.lock = l8;
        ref8.getDoorDetails();


        Door ref9 = new Door();
        ref9.doorId = 9;
        ref9.material = "Glass";
        ref9.color = "Transparent";
        ref9.type = "Sliding";
        ref9.height = 6.8;

        Lock l9 = new Lock();
        l9.lockId = 109;
        l9.brand = "Godrej";
        l9.lockType = "Magnetic";
        l9.securityLevel = "Low";
        l9.keyType = "Digital";

        ref9.lock = l9;
        ref9.getDoorDetails();


        Door ref10 = new Door();
        ref10.doorId = 10;
        ref10.material = "Wood";
        ref10.color = "Dark Brown";
        ref10.type = "Bedroom";
        ref10.height = 7.0;

        Lock l10 = new Lock();
        l10.lockId = 110;
        l10.brand = "Yale";
        l10.lockType = "Deadbolt";
        l10.securityLevel = "High";
        l10.keyType = "Manual";

        ref10.lock = l10;
        ref10.getDoorDetails();


        Door ref11 = new Door();
        ref11.doorId = 11;
        ref11.material = "Steel";
        ref11.color = "Black";
        ref11.type = "Main";
        ref11.height = 7.4;

        Lock l11 = new Lock();
        l11.lockId = 111;
        l11.brand = "Europa";
        l11.lockType = "Smart Lock";
        l11.securityLevel = "Very High";
        l11.keyType = "Digital";

        ref11.lock = l11;
        ref11.getDoorDetails();


        Door ref12 = new Door();
        ref12.doorId = 12;
        ref12.material = "PVC";
        ref12.color = "Cream";
        ref12.type = "Bathroom";
        ref12.height = 6.6;

        Lock l12 = new Lock();
        l12.lockId = 112;
        l12.brand = "Godrej";
        l12.lockType = "Latch";
        l12.securityLevel = "Medium";
        l12.keyType = "Manual";

        ref12.lock = l12;
        ref12.getDoorDetails();


        Door ref13 = new Door();
        ref13.doorId = 13;
        ref13.material = "Glass";
        ref13.color = "Transparent";
        ref13.type = "Sliding";
        ref13.height = 6.9;

        Lock l13 = new Lock();
        l13.lockId = 113;
        l13.brand = "Yale";
        l13.lockType = "Magnetic";
        l13.securityLevel = "Low";
        l13.keyType = "Digital";

        ref13.lock = l13;
        ref13.getDoorDetails();


        Door ref14 = new Door();
        ref14.doorId = 14;
        ref14.material = "Wood";
        ref14.color = "Brown";
        ref14.type = "Bedroom";
        ref14.height = 7.1;

        Lock l14 = new Lock();
        l14.lockId = 114;
        l14.brand = "Godrej";
        l14.lockType = "Deadbolt";
        l14.securityLevel = "High";
        l14.keyType = "Manual";

        ref14.lock = l14;
        ref14.getDoorDetails();


        Door ref15 = new Door();
        ref15.doorId = 15;
        ref15.material = "Steel";
        ref15.color = "Silver";
        ref15.type = "Security";
        ref15.height = 7.6;

        Lock l15 = new Lock();
        l15.lockId = 115;
        l15.brand = "Europa";
        l15.lockType = "Smart Lock";
        l15.securityLevel = "Very High";
        l15.keyType = "Digital";

        ref15.lock = l15;
        ref15.getDoorDetails();


        Door ref16 = new Door();
        ref16.doorId = 16;
        ref16.material = "PVC";
        ref16.color = "White";
        ref16.type = "Bathroom";
        ref16.height = 6.4;

        Lock l16 = new Lock();
        l16.lockId = 116;
        l16.brand = "Yale";
        l16.lockType = "Latch";
        l16.securityLevel = "Medium";
        l16.keyType = "Manual";

        ref16.lock = l16;
        ref16.getDoorDetails();


        Door ref17 = new Door();
        ref17.doorId = 17;
        ref17.material = "Glass";
        ref17.color = "Transparent";
        ref17.type = "Sliding";
        ref17.height = 6.7;

        Lock l17 = new Lock();
        l17.lockId = 117;
        l17.brand = "Godrej";
        l17.lockType = "Magnetic";
        l17.securityLevel = "Low";
        l17.keyType = "Digital";

        ref17.lock = l17;
        ref17.getDoorDetails();


        Door ref18 = new Door();
        ref18.doorId = 18;
        ref18.material = "Wood";
        ref18.color = "Dark Brown";
        ref18.type = "Main";
        ref18.height = 7.3;

        Lock l18 = new Lock();
        l18.lockId = 118;
        l18.brand = "Yale";
        l18.lockType = "Deadbolt";
        l18.securityLevel = "High";
        l18.keyType = "Manual";

        ref18.lock = l18;
        ref18.getDoorDetails();


        Door ref19 = new Door();
        ref19.doorId = 19;
        ref19.material = "Steel";
        ref19.color = "Black";
        ref19.type = "Security";
        ref19.height = 7.5;

        Lock l19 = new Lock();
        l19.lockId = 119;
        l19.brand = "Europa";
        l19.lockType = "Smart Lock";
        l19.securityLevel = "Very High";
        l19.keyType = "Digital";

        ref19.lock = l19;
        ref19.getDoorDetails();


        Door ref20 = new Door();
        ref20.doorId = 20;
        ref20.material = "PVC";
        ref20.color = "Cream";
        ref20.type = "Bathroom";
        ref20.height = 6.6;

        Lock l20 = new Lock();
        l20.lockId = 120;
        l20.brand = "Godrej";
        l20.lockType = "Latch";
        l20.securityLevel = "Medium";
        l20.keyType = "Manual";

        ref20.lock = l20;
        ref20.getDoorDetails();


        Door ref21 = new Door();
        ref21.doorId = 21;
        ref21.material = "Glass";
        ref21.color = "Transparent";
        ref21.type = "Sliding";
        ref21.height = 6.8;

        Lock l21 = new Lock();
        l21.lockId = 121;
        l21.brand = "Yale";
        l21.lockType = "Magnetic";
        l21.securityLevel = "Low";
        l21.keyType = "Digital";

        ref21.lock = l21;
        ref21.getDoorDetails();


        Door ref22 = new Door();
        ref22.doorId = 22;
        ref22.material = "Wood";
        ref22.color = "Brown";
        ref22.type = "Bedroom";
        ref22.height = 7.0;

        Lock l22 = new Lock();
        l22.lockId = 122;
        l22.brand = "Godrej";
        l22.lockType = "Deadbolt";
        l22.securityLevel = "High";
        l22.keyType = "Manual";

        ref22.lock = l22;
        ref22.getDoorDetails();


        Door ref23 = new Door();
        ref23.doorId = 23;
        ref23.material = "Steel";
        ref23.color = "Silver";
        ref23.type = "Security";
        ref23.height = 7.6;

        Lock l23 = new Lock();
        l23.lockId = 123;
        l23.brand = "Europa";
        l23.lockType = "Smart Lock";
        l23.securityLevel = "Very High";
        l23.keyType = "Digital";

        ref23.lock = l23;
        ref23.getDoorDetails();


        Door ref24 = new Door();
        ref24.doorId = 24;
        ref24.material = "PVC";
        ref24.color = "White";
        ref24.type = "Bathroom";
        ref24.height = 6.5;

        Lock l24 = new Lock();
        l24.lockId = 124;
        l24.brand = "Yale";
        l24.lockType = "Latch";
        l24.securityLevel = "Medium";
        l24.keyType = "Manual";

        ref24.lock = l24;
        ref24.getDoorDetails();


        Door ref25 = new Door();
        ref25.doorId = 25;
        ref25.material = "Glass";
        ref25.color = "Transparent";
        ref25.type = "Sliding";
        ref25.height = 6.9;

        Lock l25 = new Lock();
        l25.lockId = 125;
        l25.brand = "Godrej";
        l25.lockType = "Magnetic";
        l25.securityLevel = "Low";
        l25.keyType = "Digital";

        ref25.lock = l25;
        ref25.getDoorDetails();


        Door ref26 = new Door();
        ref26.doorId = 26;
        ref26.material = "Wood";
        ref26.color = "Dark Brown";
        ref26.type = "Main";
        ref26.height = 7.2;

        Lock l26 = new Lock();
        l26.lockId = 126;
        l26.brand = "Yale";
        l26.lockType = "Deadbolt";
        l26.securityLevel = "High";
        l26.keyType = "Manual";

        ref26.lock = l26;
        ref26.getDoorDetails();


        Door ref27 = new Door();
        ref27.doorId = 27;
        ref27.material = "Steel";
        ref27.color = "Black";
        ref27.type = "Security";
        ref27.height = 7.5;

        Lock l27 = new Lock();
        l27.lockId = 127;
        l27.brand = "Europa";
        l27.lockType = "Smart Lock";
        l27.securityLevel = "Very High";
        l27.keyType = "Digital";

        ref27.lock = l27;
        ref27.getDoorDetails();


        Door ref28 = new Door();
        ref28.doorId = 28;
        ref28.material = "PVC";
        ref28.color = "Cream";
        ref28.type = "Bathroom";
        ref28.height = 6.6;

        Lock l28 = new Lock();
        l28.lockId = 128;
        l28.brand = "Godrej";
        l28.lockType = "Latch";
        l28.securityLevel = "Medium";
        l28.keyType = "Manual";

        ref28.lock = l28;
        ref28.getDoorDetails();


        Door ref29 = new Door();
        ref29.doorId = 29;
        ref29.material = "Glass";
        ref29.color = "Transparent";
        ref29.type = "Sliding";
        ref29.height = 6.8;

        Lock l29 = new Lock();
        l29.lockId = 129;
        l29.brand = "Yale";
        l29.lockType = "Magnetic";
        l29.securityLevel = "Low";
        l29.keyType = "Digital";

        ref29.lock = l29;
        ref29.getDoorDetails();
    }
}
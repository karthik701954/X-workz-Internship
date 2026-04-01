class FactoryExecutor {

    public static void main(String args[]) {

        Factory ref1 = new Factory();
        ref1.factoryId = 1;
        ref1.factoryName = "Factory1";
        ref1.location = "Bangalore";
        ref1.workers = 100;
        ref1.type = "Manufacturing";

        Machine m1 = new Machine();
        m1.machineId = 101;
        m1.machineName = "Machine1";
        m1.function = "Cutting";
        m1.capacity = 50;
        m1.status = "Active";

        ref1.machine = m1;
        ref1.getFactoryDetails();


        Factory ref2 = new Factory();
        ref2.factoryId = 2;
        ref2.factoryName = "Factory2";
        ref2.location = "Chennai";
        ref2.workers = 120;
        ref2.type = "Assembly";

        Machine m2 = new Machine();
        m2.machineId = 102;
        m2.machineName = "Machine2";
        m2.function = "Welding";
        m2.capacity = 60;
        m2.status = "Active";

        ref2.machine = m2;
        ref2.getFactoryDetails();


        Factory ref3 = new Factory();
        ref3.factoryId = 3;
        ref3.factoryName = "Factory3";
        ref3.location = "Hyderabad";
        ref3.workers = 90;
        ref3.type = "Production";

        Machine m3 = new Machine();
        m3.machineId = 103;
        m3.machineName = "Machine3";
        m3.function = "Drilling";
        m3.capacity = 40;
        m3.status = "Inactive";

        ref3.machine = m3;
        ref3.getFactoryDetails();


        Factory ref4 = new Factory();
        ref4.factoryId = 4;
        ref4.factoryName = "Factory4";
        ref4.location = "Mumbai";
        ref4.workers = 150;
        ref4.type = "Manufacturing";

        Machine m4 = new Machine();
        m4.machineId = 104;
        m4.machineName = "Machine4";
        m4.function = "Molding";
        m4.capacity = 70;
        m4.status = "Active";

        ref4.machine = m4;
        ref4.getFactoryDetails();


        Factory ref5 = new Factory();
        ref5.factoryId = 5;
        ref5.factoryName = "Factory5";
        ref5.location = "Pune";
        ref5.workers = 110;
        ref5.type = "Assembly";

        Machine m5 = new Machine();
        m5.machineId = 105;
        m5.machineName = "Machine5";
        m5.function = "Packaging";
        m5.capacity = 80;
        m5.status = "Active";

        ref5.machine = m5;
        ref5.getFactoryDetails();
		
		        Factory ref6 = new Factory();
        ref6.factoryId = 6;
        ref6.factoryName = "Factory6";
        ref6.location = "Delhi";
        ref6.workers = 130;
        ref6.type = "Production";

        Machine m6 = new Machine();
        m6.machineId = 106;
        m6.machineName = "Machine6";
        m6.function = "Cutting";
        m6.capacity = 55;
        m6.status = "Active";

        ref6.machine = m6;
        ref6.getFactoryDetails();


        Factory ref7 = new Factory();
        ref7.factoryId = 7;
        ref7.factoryName = "Factory7";
        ref7.location = "Kolkata";
        ref7.workers = 140;
        ref7.type = "Assembly";

        Machine m7 = new Machine();
        m7.machineId = 107;
        m7.machineName = "Machine7";
        m7.function = "Welding";
        m7.capacity = 65;
        m7.status = "Active";

        ref7.machine = m7;
        ref7.getFactoryDetails();


        Factory ref8 = new Factory();
        ref8.factoryId = 8;
        ref8.factoryName = "Factory8";
        ref8.location = "Jaipur";
        ref8.workers = 95;
        ref8.type = "Manufacturing";

        Machine m8 = new Machine();
        m8.machineId = 108;
        m8.machineName = "Machine8";
        m8.function = "Drilling";
        m8.capacity = 45;
        m8.status = "Inactive";

        ref8.machine = m8;
        ref8.getFactoryDetails();


        Factory ref9 = new Factory();
        ref9.factoryId = 9;
        ref9.factoryName = "Factory9";
        ref9.location = "Ahmedabad";
        ref9.workers = 160;
        ref9.type = "Production";

        Machine m9 = new Machine();
        m9.machineId = 109;
        m9.machineName = "Machine9";
        m9.function = "Molding";
        m9.capacity = 75;
        m9.status = "Active";

        ref9.machine = m9;
        ref9.getFactoryDetails();


        Factory ref10 = new Factory();
        ref10.factoryId = 10;
        ref10.factoryName = "Factory10";
        ref10.location = "Surat";
        ref10.workers = 115;
        ref10.type = "Assembly";

        Machine m10 = new Machine();
        m10.machineId = 110;
        m10.machineName = "Machine10";
        m10.function = "Packaging";
        m10.capacity = 85;
        m10.status = "Active";

        ref10.machine = m10;
        ref10.getFactoryDetails();


        Factory ref11 = new Factory();
        ref11.factoryId = 11;
        ref11.factoryName = "Factory11";
        ref11.location = "Lucknow";
        ref11.workers = 125;
        ref11.type = "Manufacturing";

        Machine m11 = new Machine();
        m11.machineId = 111;
        m11.machineName = "Machine11";
        m11.function = "Cutting";
        m11.capacity = 60;
        m11.status = "Active";

        ref11.machine = m11;
        ref11.getFactoryDetails();


        Factory ref12 = new Factory();
        ref12.factoryId = 12;
        ref12.factoryName = "Factory12";
        ref12.location = "Nagpur";
        ref12.workers = 135;
        ref12.type = "Production";

        Machine m12 = new Machine();
        m12.machineId = 112;
        m12.machineName = "Machine12";
        m12.function = "Welding";
        m12.capacity = 70;
        m12.status = "Active";

        ref12.machine = m12;
        ref12.getFactoryDetails();


        Factory ref13 = new Factory();
        ref13.factoryId = 13;
        ref13.factoryName = "Factory13";
        ref13.location = "Indore";
        ref13.workers = 105;
        ref13.type = "Assembly";

        Machine m13 = new Machine();
        m13.machineId = 113;
        m13.machineName = "Machine13";
        m13.function = "Drilling";
        m13.capacity = 50;
        m13.status = "Inactive";

        ref13.machine = m13;
        ref13.getFactoryDetails();


        Factory ref14 = new Factory();
        ref14.factoryId = 14;
        ref14.factoryName = "Factory14";
        ref14.location = "Bhopal";
        ref14.workers = 145;
        ref14.type = "Manufacturing";

        Machine m14 = new Machine();
        m14.machineId = 114;
        m14.machineName = "Machine14";
        m14.function = "Molding";
        m14.capacity = 80;
        m14.status = "Active";

        ref14.machine = m14;
        ref14.getFactoryDetails();


        Factory ref15 = new Factory();
        ref15.factoryId = 15;
        ref15.factoryName = "Factory15";
        ref15.location = "Patna";
        ref15.workers = 100;
        ref15.type = "Production";

        Machine m15 = new Machine();
        m15.machineId = 115;
        m15.machineName = "Machine15";
        m15.function = "Packaging";
        m15.capacity = 90;
        m15.status = "Active";

        ref15.machine = m15;
        ref15.getFactoryDetails();


        Factory ref16 = new Factory();
        ref16.factoryId = 16;
        ref16.factoryName = "Factory16";
        ref16.location = "Ranchi";
        ref16.workers = 110;
        ref16.type = "Assembly";

        Machine m16 = new Machine();
        m16.machineId = 116;
        m16.machineName = "Machine16";
        m16.function = "Cutting";
        m16.capacity = 65;
        m16.status = "Active";

        ref16.machine = m16;
        ref16.getFactoryDetails();


        Factory ref17 = new Factory();
        ref17.factoryId = 17;
        ref17.factoryName = "Factory17";
        ref17.location = "Chandigarh";
        ref17.workers = 120;
        ref17.type = "Manufacturing";

        Machine m17 = new Machine();
        m17.machineId = 117;
        m17.machineName = "Machine17";
        m17.function = "Welding";
        m17.capacity = 75;
        m17.status = "Active";

        ref17.machine = m17;
        ref17.getFactoryDetails();


        Factory ref18 = new Factory();
        ref18.factoryId = 18;
        ref18.factoryName = "Factory18";
        ref18.location = "Goa";
        ref18.workers = 95;
        ref18.type = "Production";

        Machine m18 = new Machine();
        m18.machineId = 118;
        m18.machineName = "Machine18";
        m18.function = "Drilling";
        m18.capacity = 55;
        m18.status = "Inactive";

        ref18.machine = m18;
        ref18.getFactoryDetails();


        Factory ref19 = new Factory();
        ref19.factoryId = 19;
        ref19.factoryName = "Factory19";
        ref19.location = "Mysore";
        ref19.workers = 130;
        ref19.type = "Assembly";

        Machine m19 = new Machine();
        m19.machineId = 119;
        m19.machineName = "Machine19";
        m19.function = "Molding";
        m19.capacity = 85;
        m19.status = "Active";

        ref19.machine = m19;
        ref19.getFactoryDetails();


        Factory ref20 = new Factory();
        ref20.factoryId = 20;
        ref20.factoryName = "Factory20";
        ref20.location = "Coimbatore";
        ref20.workers = 140;
        ref20.type = "Manufacturing";

        Machine m20 = new Machine();
        m20.machineId = 120;
        m20.machineName = "Machine20";
        m20.function = "Packaging";
        m20.capacity = 95;
        m20.status = "Active";

        ref20.machine = m20;
        ref20.getFactoryDetails();


        Factory ref21 = new Factory();
        ref21.factoryId = 21;
        ref21.factoryName = "Factory21";
        ref21.location = "Trichy";
        ref21.workers = 115;
        ref21.type = "Production";

        Machine m21 = new Machine();
        m21.machineId = 121;
        m21.machineName = "Machine21";
        m21.function = "Cutting";
        m21.capacity = 70;
        m21.status = "Active";

        ref21.machine = m21;
        ref21.getFactoryDetails();


        Factory ref22 = new Factory();
        ref22.factoryId = 22;
        ref22.factoryName = "Factory22";
        ref22.location = "Madurai";
        ref22.workers = 125;
        ref22.type = "Assembly";

        Machine m22 = new Machine();
        m22.machineId = 122;
        m22.machineName = "Machine22";
        m22.function = "Welding";
        m22.capacity = 80;
        m22.status = "Active";

        ref22.machine = m22;
        ref22.getFactoryDetails();


        Factory ref23 = new Factory();
        ref23.factoryId = 23;
        ref23.factoryName = "Factory23";
        ref23.location = "Vizag";
        ref23.workers = 135;
        ref23.type = "Manufacturing";

        Machine m23 = new Machine();
        m23.machineId = 123;
        m23.machineName = "Machine23";
        m23.function = "Drilling";
        m23.capacity = 60;
        m23.status = "Inactive";

        ref23.machine = m23;
        ref23.getFactoryDetails();


        Factory ref24 = new Factory();
        ref24.factoryId = 24;
        ref24.factoryName = "Factory24";
        ref24.location = "Vijayawada";
        ref24.workers = 145;
        ref24.type = "Production";

        Machine m24 = new Machine();
        m24.machineId = 124;
        m24.machineName = "Machine24";
        m24.function = "Molding";
        m24.capacity = 90;
        m24.status = "Active";

        ref24.machine = m24;
        ref24.getFactoryDetails();


        Factory ref25 = new Factory();
        ref25.factoryId = 25;
        ref25.factoryName = "Factory25";
        ref25.location = "Warangal";
        ref25.workers = 100;
        ref25.type = "Assembly";

        Machine m25 = new Machine();
        m25.machineId = 125;
        m25.machineName = "Machine25";
        m25.function = "Packaging";
        m25.capacity = 85;
        m25.status = "Active";

        ref25.machine = m25;
        ref25.getFactoryDetails();


        Factory ref26 = new Factory();
        ref26.factoryId = 26;
        ref26.factoryName = "Factory26";
        ref26.location = "Hubli";
        ref26.workers = 110;
        ref26.type = "Manufacturing";

        Machine m26 = new Machine();
        m26.machineId = 126;
        m26.machineName = "Machine26";
        m26.function = "Cutting";
        m26.capacity = 75;
        m26.status = "Active";

        ref26.machine = m26;
        ref26.getFactoryDetails();


        Factory ref27 = new Factory();
        ref27.factoryId = 27;
        ref27.factoryName = "Factory27";
        ref27.location = "Belgaum";
        ref27.workers = 120;
        ref27.type = "Production";

        Machine m27 = new Machine();
        m27.machineId = 127;
        m27.machineName = "Machine27";
        m27.function = "Welding";
        m27.capacity = 85;
        m27.status = "Active";

        ref27.machine = m27;
        ref27.getFactoryDetails();


        Factory ref28 = new Factory();
        ref28.factoryId = 28;
        ref28.factoryName = "Factory28";
        ref28.location = "Mangalore";
        ref28.workers = 130;
        ref28.type = "Assembly";

        Machine m28 = new Machine();
        m28.machineId = 128;
        m28.machineName = "Machine28";
        m28.function = "Drilling";
        m28.capacity = 65;
        m28.status = "Inactive";

        ref28.machine = m28;
        ref28.getFactoryDetails();


        Factory ref29 = new Factory();
        ref29.factoryId = 29;
        ref29.factoryName = "Factory29";
        ref29.location = "Bangalore";
        ref29.workers = 150;
        ref29.type = "Manufacturing";

        Machine m29 = new Machine();
        m29.machineId = 129;
        m29.machineName = "Machine29";
        m29.function = "Molding";
        m29.capacity = 95;
        m29.status = "Active";

        ref29.machine = m29;
        ref29.getFactoryDetails();
    }
}
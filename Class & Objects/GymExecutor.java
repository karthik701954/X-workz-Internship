class GymExecutor {

    public static void main(String args[]) {

        Gym ref1 = new Gym();
        ref1.gymId = 1;
        ref1.gymName = "Gym1";
        ref1.location = "City1";
        ref1.members = 100;
        ref1.type = "Fitness";

        Trainer t1 = new Trainer();
        t1.trainerId = 101;
        t1.trainerName = "Trainer1";
        t1.experience = 2;
        t1.specialization = "Weight Training";
        t1.shift = "Morning";

        ref1.trainer = t1;
        ref1.getGymDetails();


        Gym ref2 = new Gym();
        ref2.gymId = 2;
        ref2.gymName = "Gym2";
        ref2.location = "City2";
        ref2.members = 120;
        ref2.type = "CrossFit";

        Trainer t2 = new Trainer();
        t2.trainerId = 102;
        t2.trainerName = "Trainer2";
        t2.experience = 3;
        t2.specialization = "Cardio";
        t2.shift = "Evening";

        ref2.trainer = t2;
        ref2.getGymDetails();


        Gym ref3 = new Gym();
        ref3.gymId = 3;
        ref3.gymName = "Gym3";
        ref3.location = "City3";
        ref3.members = 150;
        ref3.type = "Yoga";

        Trainer t3 = new Trainer();
        t3.trainerId = 103;
        t3.trainerName = "Trainer3";
        t3.experience = 5;
        t3.specialization = "Yoga";
        t3.shift = "Morning";

        ref3.trainer = t3;
        ref3.getGymDetails();


        Gym ref4 = new Gym();
        ref4.gymId = 4;
        ref4.gymName = "Gym4";
        ref4.location = "City4";
        ref4.members = 180;
        ref4.type = "Fitness";

        Trainer t4 = new Trainer();
        t4.trainerId = 104;
        t4.trainerName = "Trainer4";
        t4.experience = 4;
        t4.specialization = "Strength Training";
        t4.shift = "Evening";

        ref4.trainer = t4;
        ref4.getGymDetails();


        Gym ref5 = new Gym();
        ref5.gymId = 5;
        ref5.gymName = "Gym5";
        ref5.location = "City5";
        ref5.members = 200;
        ref5.type = "CrossFit";

        Trainer t5 = new Trainer();
        t5.trainerId = 105;
        t5.trainerName = "Trainer5";
        t5.experience = 6;
        t5.specialization = "HIIT";
        t5.shift = "Morning";

        ref5.trainer = t5;
        ref5.getGymDetails();
		
		        Gym ref6 = new Gym();
        ref6.gymId = 6;
        ref6.gymName = "Gym6";
        ref6.location = "City6";
        ref6.members = 210;
        ref6.type = "Fitness";

        Trainer t6 = new Trainer();
        t6.trainerId = 106;
        t6.trainerName = "Trainer6";
        t6.experience = 3;
        t6.specialization = "Cardio";
        t6.shift = "Morning";

        ref6.trainer = t6;
        ref6.getGymDetails();


        Gym ref7 = new Gym();
        ref7.gymId = 7;
        ref7.gymName = "Gym7";
        ref7.location = "City7";
        ref7.members = 220;
        ref7.type = "CrossFit";

        Trainer t7 = new Trainer();
        t7.trainerId = 107;
        t7.trainerName = "Trainer7";
        t7.experience = 4;
        t7.specialization = "Weight Training";
        t7.shift = "Evening";

        ref7.trainer = t7;
        ref7.getGymDetails();


        Gym ref8 = new Gym();
        ref8.gymId = 8;
        ref8.gymName = "Gym8";
        ref8.location = "City8";
        ref8.members = 230;
        ref8.type = "Yoga";

        Trainer t8 = new Trainer();
        t8.trainerId = 108;
        t8.trainerName = "Trainer8";
        t8.experience = 5;
        t8.specialization = "Yoga";
        t8.shift = "Morning";

        ref8.trainer = t8;
        ref8.getGymDetails();


        Gym ref9 = new Gym();
        ref9.gymId = 9;
        ref9.gymName = "Gym9";
        ref9.location = "City9";
        ref9.members = 240;
        ref9.type = "Fitness";

        Trainer t9 = new Trainer();
        t9.trainerId = 109;
        t9.trainerName = "Trainer9";
        t9.experience = 6;
        t9.specialization = "Strength Training";
        t9.shift = "Evening";

        ref9.trainer = t9;
        ref9.getGymDetails();


        Gym ref10 = new Gym();
        ref10.gymId = 10;
        ref10.gymName = "Gym10";
        ref10.location = "City10";
        ref10.members = 250;
        ref10.type = "CrossFit";

        Trainer t10 = new Trainer();
        t10.trainerId = 110;
        t10.trainerName = "Trainer10";
        t10.experience = 2;
        t10.specialization = "HIIT";
        t10.shift = "Morning";

        ref10.trainer = t10;
        ref10.getGymDetails();


        Gym ref11 = new Gym();
        ref11.gymId = 11;
        ref11.gymName = "Gym11";
        ref11.location = "City11";
        ref11.members = 260;
        ref11.type = "Yoga";

        Trainer t11 = new Trainer();
        t11.trainerId = 111;
        t11.trainerName = "Trainer11";
        t11.experience = 7;
        t11.specialization = "Yoga";
        t11.shift = "Evening";

        ref11.trainer = t11;
        ref11.getGymDetails();


        Gym ref12 = new Gym();
        ref12.gymId = 12;
        ref12.gymName = "Gym12";
        ref12.location = "City12";
        ref12.members = 270;
        ref12.type = "Fitness";

        Trainer t12 = new Trainer();
        t12.trainerId = 112;
        t12.trainerName = "Trainer12";
        t12.experience = 5;
        t12.specialization = "Cardio";
        t12.shift = "Morning";

        ref12.trainer = t12;
        ref12.getGymDetails();


        Gym ref13 = new Gym();
        ref13.gymId = 13;
        ref13.gymName = "Gym13";
        ref13.location = "City13";
        ref13.members = 280;
        ref13.type = "CrossFit";

        Trainer t13 = new Trainer();
        t13.trainerId = 113;
        t13.trainerName = "Trainer13";
        t13.experience = 4;
        t13.specialization = "Weight Training";
        t13.shift = "Evening";

        ref13.trainer = t13;
        ref13.getGymDetails();


        Gym ref14 = new Gym();
        ref14.gymId = 14;
        ref14.gymName = "Gym14";
        ref14.location = "City14";
        ref14.members = 290;
        ref14.type = "Yoga";

        Trainer t14 = new Trainer();
        t14.trainerId = 114;
        t14.trainerName = "Trainer14";
        t14.experience = 6;
        t14.specialization = "Meditation";
        t14.shift = "Morning";

        ref14.trainer = t14;
        ref14.getGymDetails();


        Gym ref15 = new Gym();
        ref15.gymId = 15;
        ref15.gymName = "Gym15";
        ref15.location = "City15";
        ref15.members = 300;
        ref15.type = "Fitness";

        Trainer t15 = new Trainer();
        t15.trainerId = 115;
        t15.trainerName = "Trainer15";
        t15.experience = 3;
        t15.specialization = "Strength Training";
        t15.shift = "Evening";

        ref15.trainer = t15;
        ref15.getGymDetails();


        Gym ref16 = new Gym();
        ref16.gymId = 16;
        ref16.gymName = "Gym16";
        ref16.location = "City16";
        ref16.members = 310;
        ref16.type = "CrossFit";

        Trainer t16 = new Trainer();
        t16.trainerId = 116;
        t16.trainerName = "Trainer16";
        t16.experience = 5;
        t16.specialization = "HIIT";
        t16.shift = "Morning";

        ref16.trainer = t16;
        ref16.getGymDetails();


        Gym ref17 = new Gym();
        ref17.gymId = 17;
        ref17.gymName = "Gym17";
        ref17.location = "City17";
        ref17.members = 320;
        ref17.type = "Yoga";

        Trainer t17 = new Trainer();
        t17.trainerId = 117;
        t17.trainerName = "Trainer17";
        t17.experience = 8;
        t17.specialization = "Yoga";
        t17.shift = "Evening";

        ref17.trainer = t17;
        ref17.getGymDetails();


        Gym ref18 = new Gym();
        ref18.gymId = 18;
        ref18.gymName = "Gym18";
        ref18.location = "City18";
        ref18.members = 330;
        ref18.type = "Fitness";

        Trainer t18 = new Trainer();
        t18.trainerId = 118;
        t18.trainerName = "Trainer18";
        t18.experience = 6;
        t18.specialization = "Cardio";
        t18.shift = "Morning";

        ref18.trainer = t18;
        ref18.getGymDetails();


        Gym ref19 = new Gym();
        ref19.gymId = 19;
        ref19.gymName = "Gym19";
        ref19.location = "City19";
        ref19.members = 340;
        ref19.type = "CrossFit";

        Trainer t19 = new Trainer();
        t19.trainerId = 119;
        t19.trainerName = "Trainer19";
        t19.experience = 4;
        t19.specialization = "Weight Training";
        t19.shift = "Evening";

        ref19.trainer = t19;
        ref19.getGymDetails();


        Gym ref20 = new Gym();
        ref20.gymId = 20;
        ref20.gymName = "Gym20";
        ref20.location = "City20";
        ref20.members = 350;
        ref20.type = "Yoga";

        Trainer t20 = new Trainer();
        t20.trainerId = 120;
        t20.trainerName = "Trainer20";
        t20.experience = 7;
        t20.specialization = "Meditation";
        t20.shift = "Morning";

        ref20.trainer = t20;
        ref20.getGymDetails();


        Gym ref21 = new Gym();
        ref21.gymId = 21;
        ref21.gymName = "Gym21";
        ref21.location = "City21";
        ref21.members = 360;
        ref21.type = "Fitness";

        Trainer t21 = new Trainer();
        t21.trainerId = 121;
        t21.trainerName = "Trainer21";
        t21.experience = 5;
        t21.specialization = "Strength Training";
        t21.shift = "Evening";

        ref21.trainer = t21;
        ref21.getGymDetails();


        Gym ref22 = new Gym();
        ref22.gymId = 22;
        ref22.gymName = "Gym22";
        ref22.location = "City22";
        ref22.members = 370;
        ref22.type = "CrossFit";

        Trainer t22 = new Trainer();
        t22.trainerId = 122;
        t22.trainerName = "Trainer22";
        t22.experience = 6;
        t22.specialization = "HIIT";
        t22.shift = "Morning";

        ref22.trainer = t22;
        ref22.getGymDetails();


        Gym ref23 = new Gym();
        ref23.gymId = 23;
        ref23.gymName = "Gym23";
        ref23.location = "City23";
        ref23.members = 380;
        ref23.type = "Yoga";

        Trainer t23 = new Trainer();
        t23.trainerId = 123;
        t23.trainerName = "Trainer23";
        t23.experience = 9;
        t23.specialization = "Yoga";
        t23.shift = "Evening";

        ref23.trainer = t23;
        ref23.getGymDetails();


        Gym ref24 = new Gym();
        ref24.gymId = 24;
        ref24.gymName = "Gym24";
        ref24.location = "City24";
        ref24.members = 390;
        ref24.type = "Fitness";

        Trainer t24 = new Trainer();
        t24.trainerId = 124;
        t24.trainerName = "Trainer24";
        t24.experience = 7;
        t24.specialization = "Cardio";
        t24.shift = "Morning";

        ref24.trainer = t24;
        ref24.getGymDetails();


        Gym ref25 = new Gym();
        ref25.gymId = 25;
        ref25.gymName = "Gym25";
        ref25.location = "City25";
        ref25.members = 400;
        ref25.type = "CrossFit";

        Trainer t25 = new Trainer();
        t25.trainerId = 125;
        t25.trainerName = "Trainer25";
        t25.experience = 5;
        t25.specialization = "Weight Training";
        t25.shift = "Evening";

        ref25.trainer = t25;
        ref25.getGymDetails();


        Gym ref26 = new Gym();
        ref26.gymId = 26;
        ref26.gymName = "Gym26";
        ref26.location = "City26";
        ref26.members = 410;
        ref26.type = "Yoga";

        Trainer t26 = new Trainer();
        t26.trainerId = 126;
        t26.trainerName = "Trainer26";
        t26.experience = 8;
        t26.specialization = "Meditation";
        t26.shift = "Morning";

        ref26.trainer = t26;
        ref26.getGymDetails();


        Gym ref27 = new Gym();
        ref27.gymId = 27;
        ref27.gymName = "Gym27";
        ref27.location = "City27";
        ref27.members = 420;
        ref27.type = "Fitness";

        Trainer t27 = new Trainer();
        t27.trainerId = 127;
        t27.trainerName = "Trainer27";
        t27.experience = 6;
        t27.specialization = "Strength Training";
        t27.shift = "Evening";

        ref27.trainer = t27;
        ref27.getGymDetails();


        Gym ref28 = new Gym();
        ref28.gymId = 28;
        ref28.gymName = "Gym28";
        ref28.location = "City28";
        ref28.members = 430;
        ref28.type = "CrossFit";

        Trainer t28 = new Trainer();
        t28.trainerId = 128;
        t28.trainerName = "Trainer28";
        t28.experience = 7;
        t28.specialization = "HIIT";
        t28.shift = "Morning";

        ref28.trainer = t28;
        ref28.getGymDetails();


        Gym ref29 = new Gym();
        ref29.gymId = 29;
        ref29.gymName = "Gym29";
        ref29.location = "City29";
        ref29.members = 440;
        ref29.type = "Yoga";

        Trainer t29 = new Trainer();
        t29.trainerId = 129;
        t29.trainerName = "Trainer29";
        t29.experience = 10;
        t29.specialization = "Yoga";
        t29.shift = "Evening";

        ref29.trainer = t29;
        ref29.getGymDetails();
    }
}
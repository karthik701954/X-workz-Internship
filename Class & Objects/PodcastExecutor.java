class PodcastExecutor {

    public static void main(String args[]) {

        Podcast ref1 = new Podcast();
        ref1.podcastId = 1;
        ref1.podcastName = "Podcast1";
        ref1.category = "Technology";
        ref1.duration = 45;
        ref1.host = "Host1";

        Guest g1 = new Guest();
        g1.guestId = 101;
        g1.guestName = "Guest1";
        g1.profession = "Developer";
        g1.experience = 5;
        g1.topic = "AI";

        ref1.guest = g1;
        ref1.getPodcastDetails();


        Podcast ref2 = new Podcast();
        ref2.podcastId = 2;
        ref2.podcastName = "Podcast2";
        ref2.category = "Business";
        ref2.duration = 50;
        ref2.host = "Host2";

        Guest g2 = new Guest();
        g2.guestId = 102;
        g2.guestName = "Guest2";
        g2.profession = "Entrepreneur";
        g2.experience = 10;
        g2.topic = "Startups";

        ref2.guest = g2;
        ref2.getPodcastDetails();


        Podcast ref3 = new Podcast();
        ref3.podcastId = 3;
        ref3.podcastName = "Podcast3";
        ref3.category = "Health";
        ref3.duration = 40;
        ref3.host = "Host3";

        Guest g3 = new Guest();
        g3.guestId = 103;
        g3.guestName = "Guest3";
        g3.profession = "Doctor";
        g3.experience = 8;
        g3.topic = "Fitness";

        ref3.guest = g3;
        ref3.getPodcastDetails();


        Podcast ref4 = new Podcast();
        ref4.podcastId = 4;
        ref4.podcastName = "Podcast4";
        ref4.category = "Education";
        ref4.duration = 55;
        ref4.host = "Host4";

        Guest g4 = new Guest();
        g4.guestId = 104;
        g4.guestName = "Guest4";
        g4.profession = "Teacher";
        g4.experience = 12;
        g4.topic = "Learning";

        ref4.guest = g4;
        ref4.getPodcastDetails();


        Podcast ref5 = new Podcast();
        ref5.podcastId = 5;
        ref5.podcastName = "Podcast5";
        ref5.category = "Entertainment";
        ref5.duration = 60;
        ref5.host = "Host5";

        Guest g5 = new Guest();
        g5.guestId = 105;
        g5.guestName = "Guest5";
        g5.profession = "Actor";
        g5.experience = 15;
        g5.topic = "Movies";

        ref5.guest = g5;
        ref5.getPodcastDetails();
		
		        Podcast ref6 = new Podcast();
        ref6.podcastId = 6;
        ref6.podcastName = "Podcast6";
        ref6.category = "Technology";
        ref6.duration = 48;
        ref6.host = "Host6";

        Guest g6 = new Guest();
        g6.guestId = 106;
        g6.guestName = "Guest6";
        g6.profession = "Engineer";
        g6.experience = 6;
        g6.topic = "Cloud";

        ref6.guest = g6;
        ref6.getPodcastDetails();


        Podcast ref7 = new Podcast();
        ref7.podcastId = 7;
        ref7.podcastName = "Podcast7";
        ref7.category = "Business";
        ref7.duration = 52;
        ref7.host = "Host7";

        Guest g7 = new Guest();
        g7.guestId = 107;
        g7.guestName = "Guest7";
        g7.profession = "Investor";
        g7.experience = 9;
        g7.topic = "Finance";

        ref7.guest = g7;
        ref7.getPodcastDetails();


        Podcast ref8 = new Podcast();
        ref8.podcastId = 8;
        ref8.podcastName = "Podcast8";
        ref8.category = "Health";
        ref8.duration = 42;
        ref8.host = "Host8";

        Guest g8 = new Guest();
        g8.guestId = 108;
        g8.guestName = "Guest8";
        g8.profession = "Trainer";
        g8.experience = 7;
        g8.topic = "Workout";

        ref8.guest = g8;
        ref8.getPodcastDetails();


        Podcast ref9 = new Podcast();
        ref9.podcastId = 9;
        ref9.podcastName = "Podcast9";
        ref9.category = "Education";
        ref9.duration = 55;
        ref9.host = "Host9";

        Guest g9 = new Guest();
        g9.guestId = 109;
        g9.guestName = "Guest9";
        g9.profession = "Professor";
        g9.experience = 15;
        g9.topic = "Research";

        ref9.guest = g9;
        ref9.getPodcastDetails();


        Podcast ref10 = new Podcast();
        ref10.podcastId = 10;
        ref10.podcastName = "Podcast10";
        ref10.category = "Entertainment";
        ref10.duration = 60;
        ref10.host = "Host10";

        Guest g10 = new Guest();
        g10.guestId = 110;
        g10.guestName = "Guest10";
        g10.profession = "Singer";
        g10.experience = 10;
        g10.topic = "Music";

        ref10.guest = g10;
        ref10.getPodcastDetails();


        Podcast ref11 = new Podcast();
        ref11.podcastId = 11;
        ref11.podcastName = "Podcast11";
        ref11.category = "Technology";
        ref11.duration = 50;
        ref11.host = "Host11";

        Guest g11 = new Guest();
        g11.guestId = 111;
        g11.guestName = "Guest11";
        g11.profession = "Developer";
        g11.experience = 8;
        g11.topic = "AI";

        ref11.guest = g11;
        ref11.getPodcastDetails();


        Podcast ref12 = new Podcast();
        ref12.podcastId = 12;
        ref12.podcastName = "Podcast12";
        ref12.category = "Business";
        ref12.duration = 53;
        ref12.host = "Host12";

        Guest g12 = new Guest();
        g12.guestId = 112;
        g12.guestName = "Guest12";
        g12.profession = "CEO";
        g12.experience = 18;
        g12.topic = "Leadership";

        ref12.guest = g12;
        ref12.getPodcastDetails();


        Podcast ref13 = new Podcast();
        ref13.podcastId = 13;
        ref13.podcastName = "Podcast13";
        ref13.category = "Health";
        ref13.duration = 44;
        ref13.host = "Host13";

        Guest g13 = new Guest();
        g13.guestId = 113;
        g13.guestName = "Guest13";
        g13.profession = "Doctor";
        g13.experience = 12;
        g13.topic = "Nutrition";

        ref13.guest = g13;
        ref13.getPodcastDetails();


        Podcast ref14 = new Podcast();
        ref14.podcastId = 14;
        ref14.podcastName = "Podcast14";
        ref14.category = "Education";
        ref14.duration = 56;
        ref14.host = "Host14";

        Guest g14 = new Guest();
        g14.guestId = 114;
        g14.guestName = "Guest14";
        g14.profession = "Teacher";
        g14.experience = 10;
        g14.topic = "Online Learning";

        ref14.guest = g14;
        ref14.getPodcastDetails();


        Podcast ref15 = new Podcast();
        ref15.podcastId = 15;
        ref15.podcastName = "Podcast15";
        ref15.category = "Entertainment";
        ref15.duration = 62;
        ref15.host = "Host15";

        Guest g15 = new Guest();
        g15.guestId = 115;
        g15.guestName = "Guest15";
        g15.profession = "Actor";
        g15.experience = 20;
        g15.topic = "Cinema";

        ref15.guest = g15;
        ref15.getPodcastDetails();


        Podcast ref16 = new Podcast();
        ref16.podcastId = 16;
        ref16.podcastName = "Podcast16";
        ref16.category = "Technology";
        ref16.duration = 49;
        ref16.host = "Host16";

        Guest g16 = new Guest();
        g16.guestId = 116;
        g16.guestName = "Guest16";
        g16.profession = "Engineer";
        g16.experience = 7;
        g16.topic = "Cybersecurity";

        ref16.guest = g16;
        ref16.getPodcastDetails();


        Podcast ref17 = new Podcast();
        ref17.podcastId = 17;
        ref17.podcastName = "Podcast17";
        ref17.category = "Business";
        ref17.duration = 54;
        ref17.host = "Host17";

        Guest g17 = new Guest();
        g17.guestId = 117;
        g17.guestName = "Guest17";
        g17.profession = "Manager";
        g17.experience = 11;
        g17.topic = "Marketing";

        ref17.guest = g17;
        ref17.getPodcastDetails();


        Podcast ref18 = new Podcast();
        ref18.podcastId = 18;
        ref18.podcastName = "Podcast18";
        ref18.category = "Health";
        ref18.duration = 43;
        ref18.host = "Host18";

        Guest g18 = new Guest();
        g18.guestId = 118;
        g18.guestName = "Guest18";
        g18.profession = "Trainer";
        g18.experience = 9;
        g18.topic = "Yoga";

        ref18.guest = g18;
        ref18.getPodcastDetails();


        Podcast ref19 = new Podcast();
        ref19.podcastId = 19;
        ref19.podcastName = "Podcast19";
        ref19.category = "Education";
        ref19.duration = 57;
        ref19.host = "Host19";

        Guest g19 = new Guest();
        g19.guestId = 119;
        g19.guestName = "Guest19";
        g19.profession = "Professor";
        g19.experience = 16;
        g19.topic = "Science";

        ref19.guest = g19;
        ref19.getPodcastDetails();


        Podcast ref20 = new Podcast();
        ref20.podcastId = 20;
        ref20.podcastName = "Podcast20";
        ref20.category = "Entertainment";
        ref20.duration = 63;
        ref20.host = "Host20";

        Guest g20 = new Guest();
        g20.guestId = 120;
        g20.guestName = "Guest20";
        g20.profession = "Comedian";
        g20.experience = 14;
        g20.topic = "Comedy";

        ref20.guest = g20;
        ref20.getPodcastDetails();


        Podcast ref21 = new Podcast();
        ref21.podcastId = 21;
        ref21.podcastName = "Podcast21";
        ref21.category = "Technology";
        ref21.duration = 51;
        ref21.host = "Host21";

        Guest g21 = new Guest();
        g21.guestId = 121;
        g21.guestName = "Guest21";
        g21.profession = "Developer";
        g21.experience = 10;
        g21.topic = "Blockchain";

        ref21.guest = g21;
        ref21.getPodcastDetails();


        Podcast ref22 = new Podcast();
        ref22.podcastId = 22;
        ref22.podcastName = "Podcast22";
        ref22.category = "Business";
        ref22.duration = 55;
        ref22.host = "Host22";

        Guest g22 = new Guest();
        g22.guestId = 122;
        g22.guestName = "Guest22";
        g22.profession = "Entrepreneur";
        g22.experience = 13;
        g22.topic = "Startups";

        ref22.guest = g22;
        ref22.getPodcastDetails();


        Podcast ref23 = new Podcast();
        ref23.podcastId = 23;
        ref23.podcastName = "Podcast23";
        ref23.category = "Health";
        ref23.duration = 45;
        ref23.host = "Host23";

        Guest g23 = new Guest();
        g23.guestId = 123;
        g23.guestName = "Guest23";
        g23.profession = "Doctor";
        g23.experience = 11;
        g23.topic = "Mental Health";

        ref23.guest = g23;
        ref23.getPodcastDetails();


        Podcast ref24 = new Podcast();
        ref24.podcastId = 24;
        ref24.podcastName = "Podcast24";
        ref24.category = "Education";
        ref24.duration = 58;
        ref24.host = "Host24";

        Guest g24 = new Guest();
        g24.guestId = 124;
        g24.guestName = "Guest24";
        g24.profession = "Teacher";
        g24.experience = 9;
        g24.topic = "Skills";

        ref24.guest = g24;
        ref24.getPodcastDetails();


        Podcast ref25 = new Podcast();
        ref25.podcastId = 25;
        ref25.podcastName = "Podcast25";
        ref25.category = "Entertainment";
        ref25.duration = 65;
        ref25.host = "Host25";

        Guest g25 = new Guest();
        g25.guestId = 125;
        g25.guestName = "Guest25";
        g25.profession = "Actor";
        g25.experience = 18;
        g25.topic = "Movies";

        ref25.guest = g25;
        ref25.getPodcastDetails();


        Podcast ref26 = new Podcast();
        ref26.podcastId = 26;
        ref26.podcastName = "Podcast26";
        ref26.category = "Technology";
        ref26.duration = 52;
        ref26.host = "Host26";

        Guest g26 = new Guest();
        g26.guestId = 126;
        g26.guestName = "Guest26";
        g26.profession = "Engineer";
        g26.experience = 7;
        g26.topic = "IoT";

        ref26.guest = g26;
        ref26.getPodcastDetails();


        Podcast ref27 = new Podcast();
        ref27.podcastId = 27;
        ref27.podcastName = "Podcast27";
        ref27.category = "Business";
        ref27.duration = 56;
        ref27.host = "Host27";

        Guest g27 = new Guest();
        g27.guestId = 127;
        g27.guestName = "Guest27";
        g27.profession = "Manager";
        g27.experience = 12;
        g27.topic = "Sales";

        ref27.guest = g27;
        ref27.getPodcastDetails();


        Podcast ref28 = new Podcast();
        ref28.podcastId = 28;
        ref28.podcastName = "Podcast28";
        ref28.category = "Health";
        ref28.duration = 46;
        ref28.host = "Host28";

        Guest g28 = new Guest();
        g28.guestId = 128;
        g28.guestName = "Guest28";
        g28.profession = "Trainer";
        g28.experience = 8;
        g28.topic = "Diet";

        ref28.guest = g28;
        ref28.getPodcastDetails();


        Podcast ref29 = new Podcast();
        ref29.podcastId = 29;
        ref29.podcastName = "Podcast29";
        ref29.category = "Education";
        ref29.duration = 60;
        ref29.host = "Host29";

        Guest g29 = new Guest();
        g29.guestId = 129;
        g29.guestName = "Guest29";
        g29.profession = "Professor";
        g29.experience = 15;
        g29.topic = "Technology";

        ref29.guest = g29;
        ref29.getPodcastDetails();
    }
}
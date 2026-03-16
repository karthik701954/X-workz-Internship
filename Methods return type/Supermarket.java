class Supermarket {

    public static String[] searchBrandByProduct(String productName) {

        if(productName=="biscuit") {
            String[] brands = {
                "Oreo","Parle-G","GoodDay","DarkFantasy","Sunfeast",
                "MarieGold","HideAndSeek","Tiger","KrackJack","Bourbon",
                "50-50","MilkBikis","Treat","LittleHearts","JimJam",
                "NiceTime","Monaco","DreamCream","Milano","NutriChoice",
                "Unibic","Britannia","Priyagold","Anmol","Cremica",
                "McVities","Digestive","SaltedCracker","ChocoFills"
            };
            return brands;
        }

        if(productName=="shampoo"){
            String[] brands = {
                "ClinicPlus","Chik","Sunsilk","HeadAndShoulders","Pantene",
                "Dove","Loreal","Tresemme","Indulekha","Karthika",
                "Himalaya","Meera","Garnier","Vatika","Biotique",
                "Mamaearth","Wow","Nyle","Clear","Fiama",
                "JohnsonBaby","Ayush","HerbalEssence","Kerastase","Matrix",
                "Schwarzkopf","Sebamed","ParkAvenue","SetWet"
            };
            return brands;
        }

        if(productName=="soap") {
            String[] brands = {
                "Lux","Lifebuoy","Dove","Pears","Santoor",
                "Medimix","Cinthol","Dettol","Hamam","MysoreSandal",
                "GodrejNo1","Fiama","Vivel","Rexona","Palmolive",
                "Liril","Himalaya","Patanjali","Khadi","Biotique",
                "JohnsonBaby","Chandrika","Margo","Neem","Ayush",
                "Power","Nirma","ParkAvenue","Aramusk"
            };
            return brands;
        }
		        if(productName=="tv") {
            String[] brands = {
                "Samsung","LG","Sony","Panasonic","TCL",
                "Mi","OnePlus","Vu","Realme","Philips",
                "Haier","Onida","Kodak","Thomson","Hisense",
                "Sharp","Sansui","BPL","Toshiba","Skyworth",
                "Motorola","Nokia","Blaupunkt","JVC","Weston",
                "Intex","Micromax","Lloyd","Acer"
            };
            return brands;
        }

        if(productName=="refrigerator") {
            String[] brands = {
                "LG","Samsung","Whirlpool","Godrej","Haier",
                "Bosch","Siemens","Panasonic","Hitachi","Voltas",
                "Lloyd","Electrolux","Kelvinator","Onida","Sharp",
                "Videocon","BPL","Toshiba","Hisense","Midea",
                "IFB","Candy","Croma","Mitashi","Intex",
                "Micromax","Acer","Blaupunkt","Weston"
            };
            return brands;
        }

        if(productName=="ac") {
            String[] brands = {
                "Daikin","Voltas","LG","Samsung","Hitachi",
                "BlueStar","Panasonic","Carrier","Whirlpool","Lloyd",
                "Godrej","Haier","Mitsubishi","OGeneral","Sharp",
                "Onida","Toshiba","IFB","Hisense","Bosch",
                "Electrolux","Kelvinator","Croma","Mitashi","Intex",
                "Acer","Westinghouse","BluestarPro","ClimateCool"
            };
            return brands;
        }

        if(productName=="car") {
            String[] brands = {
                "Maruti","Hyundai","Tata","Honda","Toyota",
                "Mahindra","Kia","MG","Skoda","Volkswagen",
                "Renault","Nissan","Ford","Chevrolet","Jeep",
                "BMW","Audi","Mercedes","Volvo","Jaguar",
                "LandRover","Porsche","Ferrari","Lamborghini","Bentley",
                "RollsRoyce","Mini","Citroen","BYD"
            };
            return brands;
        }

        if(productName=="bike") {
            String[] brands = {
                "Hero","Honda","Yamaha","Bajaj","TVS",
                "RoyalEnfield","KTM","Suzuki","Kawasaki","BMW",
                "Ducati","Triumph","HarleyDavidson","Benelli","Jawa",
                "Yezdi","Aprilia","Vespa","Mahindra","Hyosung",
                "Indian","CFMoto","Husqvarna","Norton","MotoGuzzi",
                "Zero","Ather","Ola","Ultraviolette"
            };
            return brands;
        }

        if(productName=="camera") {
            String[] brands = {
                "Canon","Nikon","Sony","Fujifilm","Panasonic",
                "Olympus","Leica","GoPro","Kodak","Pentax",
                "Sigma","Hasselblad","Ricoh","Casio","DJI",
                "Polaroid","Blackmagic","Red","YI","Insta360",
                "Sanyo","Sharp","Minolta","Tamron","Zeiss",
                "Viltrox","Samyang","Meike","Tokina"
            };
            return brands;
        }

        if(productName=="headphones") {
            String[] brands = {
                "Sony","JBL","Boat","Skullcandy","Sennheiser",
                "Bose","AKG","Beats","Philips","Panasonic",
                "Noise","Zebronics","Realme","OnePlus","Apple",
                "Samsung","Anker","Marshall","BangOlufsen","Logitech",
                "Razer","HyperX","Corsair","Edifier","Harman",
                "Portronics","Boult","Mivi","Blaupunkt"
            };
            return brands;
        }

        if(productName=="tablet") {
            String[] brands = {
                "Apple","Samsung","Lenovo","Xiaomi","Realme",
                "Huawei","Honor","Microsoft","Amazon","Asus",
                "Acer","Dell","HP","Nokia","Panasonic",
                "TCL","Alcatel","Micromax","iBall","Intex",
                "Lava","Karbonn","ZTE","Chuwi","Teclast",
                "Onida","Croma","Blaupunkt","Motorola"
            };
            return brands;
        }

        if(productName=="printer") {
            String[] brands = {
                "HP","Canon","Epson","Brother","Samsung",
                "Xerox","Ricoh","Lexmark","Pantum","Dell",
                "Kyocera","Sharp","Konica","Oki","Panasonic",
                "Toshiba","Fujitsu","Zebra","Honeywell","Polaroid",
                "Kodak","Compuprint","TVSE","Wipro","LG",
                "Acer","Lenovo","Croma","Intex"
            };
            return brands;
        }

        if(productName=="router") {
            String[] brands = {
                "TPLink","DLink","Netgear","Asus","Cisco",
                "Tenda","Linksys","Huawei","Xiaomi","Jio",
                "Airtel","Nokia","ZTE","Mercusys","Belkin",
                "Ubiquiti","MikroTik","Google","Motorola","Arris",
                "Buffalo","Edimax","Netis","Digisol","Binatone",
                "iBall","Cudy","TENDAPro","Zyxel"
            };
            return brands;
        }
		        if(productName=="washingmachine") {
            String[] brands = {
                "LG","Samsung","Whirlpool","Bosch","IFB",
                "Godrej","Haier","Panasonic","Onida","Lloyd",
                "Voltas","Siemens","Electrolux","Sharp","Toshiba",
                "Hitachi","Kelvinator","Midea","Croma","Mitashi",
                "Intex","Micromax","Acer","Weston","BPL",
                "Videocon","Candy","Hisense","Thomson"
            };
            return brands;
        }

        if(productName=="microwave") {
            String[] brands = {
                "LG","Samsung","IFB","Whirlpool","Panasonic",
                "Godrej","Haier","Bosch","Siemens","Sharp",
                "Toshiba","Electrolux","Onida","Lloyd","Voltas",
                "MorphyRichards","Bajaj","Prestige","Usha","Philips",
                "Croma","Mitashi","Intex","Acer","Weston",
                "BPL","Videocon","Midea","Hisense"
            };
            return brands;
        }

        if(productName=="waterpurifier") {
            String[] brands = {
                "Kent","Aquaguard","Pureit","Livpure","BlueStar",
                "AO Smith","HUL","Tata","LG","Havells",
                "EurekaForbes","Prestige","Panasonic","Whirlpool","ZeroB",
                "Kinsco","VGuard","Faber","Croma","Nasaka",
                "UrbanCompany","DoctorFresh","Wave","AquaFresh","Aquasure",
                "Hindware","Voltas","Ionix","Amway"
            };
            return brands;
        }

        if(productName=="geyser") {
            String[] brands = {
                "Racold","Bajaj","Havells","AO Smith","VGuard",
                "Crompton","Orient","Usha","Kenstar","Venus",
                "Jaquar","Hindware","Lifelong","Longway","Sunflame",
                "Faber","Panasonic","LG","Samsung","Whirlpool",
                "Voltas","Godrej","Haier","Siemens","Bosch",
                "Croma","Intex","Acer","Weston"
            };
            return brands;
        }

        if(productName=="fan") {
            String[] brands = {
                "Usha","Crompton","Havells","Orient","Bajaj",
                "Atomberg","VGuard","Khaitan","Luminous","Polycab",
                "Anchor","Surya","Panasonic","LG","Samsung",
                "Philips","Syska","Faber","Kenstar","Maharaja",
                "Longway","Lifelong","Inalsa","MorphyRichards","Croma",
                "Intex","Westinghouse","Acer","Mitashi"
            };
            return brands;
        }

        if(productName=="mixer") {
            String[] brands = {
                "Preethi","Bajaj","Philips","Butterfly","Sujata",
                "Maharaja","Havells","Usha","Kenstar","Prestige",
                "Panasonic","Bosch","MorphyRichards","Inalsa","Lifelong",
                "Longway","Crompton","Orient","VGuard","Jaipan",
                "Pigeon","Wonderchef","Sunflame","Faber","Croma",
                "Intex","Acer","Mitashi","Weston"
            };
            return brands;
        }

        if(productName=="ironbox") {
            String[] brands = {
                "Philips","Bajaj","Usha","Havells","Crompton",
                "Panasonic","MorphyRichards","Orient","Kenstar","Maharaja",
                "Inalsa","Lifelong","Longway","VGuard","Prestige",
                "Sunflame","Pigeon","Butterfly","Jaipan","Faber",
                "Croma","Intex","Acer","Mitashi","Weston",
                "Bosch","Siemens","LG","Samsung"
            };
            return brands;
        }

        if(productName=="keyboard") {
            String[] brands = {
                "Logitech","HP","Dell","Lenovo","Microsoft",
                "Asus","Acer","Redragon","Razer","Corsair",
                "HyperX","Zebronics","AntEsports","TVS","Quantum",
                "Circle","Fingers","Amkette","Portronics","Boat",
                "Samsung","Apple","iBall","Intex","Croma",
                "Gigabyte","MSI","CoolerMaster","Rapoo"
            };
            return brands;
        }

        if(productName=="mouse") {
            String[] brands = {
                "Logitech","HP","Dell","Lenovo","Microsoft",
                "Asus","Acer","Razer","Corsair","Redragon",
                "Zebronics","AntEsports","TVS","Quantum","Circle",
                "Fingers","Amkette","Portronics","Boat","Samsung",
                "Apple","iBall","Intex","Croma","Gigabyte",
                "MSI","CoolerMaster","Rapoo","HyperX"
            };
            return brands;
        }

        if(productName=="speaker") {
            String[] brands = {
                "JBL","Sony","Boat","Bose","Philips",
                "Marshall","HarmanKardon","Zebronics","Portronics","Mivi",
                "Anker","Skullcandy","BangOlufsen","Logitech","Panasonic",
                "LG","Samsung","Blaupunkt","Realme","OnePlus",
                "Noise","Boult","Edifier","UltimateEars","iBall",
                "Intex","Croma","Acer","Mitashi"
            };
            return brands;
        }
		        if(productName=="powerbank") {
            String[] brands = {
                "Mi","Realme","Samsung","Ambrane","Syska",
                "Portronics","Boat","Anker","Philips","Sony",
                "Lenovo","Intex","iBall","Croma","Zebronics",
                "URBN","Redmi","OnePlus","Spigen","Belkin",
                "Stuffcool","Callmate","Lapcare","Amkette","Energizer",
                "Acer","Asus","Dell","HP"
            };
            return brands;
        }

        if(productName=="pendrive") {
            String[] brands = {
                "SanDisk","HP","Kingston","Sony","Samsung",
                "Toshiba","Transcend","PNY","Strontium","Adata",
                "Verbatim","Lexar","Patriot","Corsair","Integral",
                "iBall","Intex","Croma","Amkette","Microware",
                "EVM","Digisol","Zebronics","Lapcare","Dell",
                "Asus","Acer","Lenovo","Netac"
            };
            return brands;
        }

        if(productName=="harddisk") {
            String[] brands = {
                "Seagate","WesternDigital","Toshiba","Samsung","HGST",
                "Transcend","Adata","LaCie","Buffalo","Lenovo",
                "Dell","HP","Asus","Acer","Sony",
                "Hitachi","WD","GTechnology","SiliconPower","Netac",
                "EVM","Zebronics","iBall","Intex","Croma",
                "Patriot","PNY","Lexar","Verbatim"
            };
            return brands;
        }

        if(productName=="smartwatch") {
            String[] brands = {
                "Apple","Samsung","Boat","Noise","FireBoltt",
                "Realme","OnePlus","Amazfit","Fitbit","Garmin",
                "Fossil","Huawei","Honor","Xiaomi","Oppo",
                "Vivo","Titan","Fastrack","Casio","Pebble",
                "Boult","Crossbeats","Zebronics","Syska","Portronics",
                "Timex","MichaelKors","TagHeuer","Suunto"
            };
            return brands;
        }

        if(productName=="bag") {
            String[] brands = {
                "Skybags","AmericanTourister","VIP","Wildcraft","Safari",
                "Samsonite","TommyHilfiger","Puma","Adidas","Nike",
                "Woodland","Lavie","Caprese","Baggit","Fastrack",
                "Aristocrat","Carlton","Delsey","Targus","Lenovo",
                "HP","Dell","Asus","Gear","Zouk",
                "AllenSolly","Hidesign","Guess","MichaelKors"
            };
            return brands;
        }

        if(productName=="wallet") {
            String[] brands = {
                "WildHorn","TommyHilfiger","Fossil","Woodland","Titan",
                "Hidesign","AllenSolly","Puma","Adidas","Nike",
                "Levis","UCB","PeterEngland","LouisPhilippe","VanHeusen",
                "Baggit","Caprese","Lavie","Guess","MichaelKors",
                "Gucci","Prada","Armani","Montblanc","Police",
                "UnitedColors","Fasttrack","Skybags","RedTape"
            };
            return brands;
        }

        if(productName=="belt") {
            String[] brands = {
                "Levis","Woodland","AllenSolly","LouisPhilippe","VanHeusen",
                "PeterEngland","TommyHilfiger","Fossil","Hidesign","Gucci",
                "Prada","Armani","Puma","Adidas","Nike",
                "UnitedColors","Police","RedTape","WildHorn","Titan",
                "Baggit","Caprese","Lavie","Guess","MichaelKors",
                "Montblanc","UCB","Fasttrack","Skybags"
            };
            return brands;
        }

        if(productName=="helmet") {
            String[] brands = {
                "Studds","Vega","Steelbird","LS2","MT",
                "Axor","SMK","Arai","Shoei","HJC",
                "RoyalEnfield","TVS","Hero","Honda","Yamaha",
                "KTM","Suzuki","Bajaj","Mahindra","BMW",
                "HarleyDavidson","Kawasaki","Ducati","Triumph","Benelli",
                "Jawa","Yezdi","Ola","Ather"
            };
            return brands;
        }

        if(productName=="sunglasses") {
            String[] brands = {
                "RayBan","Fastrack","Oakley","Vogue","Gucci",
                "Prada","Armani","Police","TommyHilfiger","Carrera",
                "IDEE","VincentChase","Titan","JohnJacobs","Revo",
                "Persol","MauiJim","CalvinKlein","Diesel","Guess",
                "MichaelKors","Puma","Adidas","Nike","LeeCooper",
                "LouisPhilippe","UnitedColors","Fossil","Bvlgari"
            };
            return brands;
        }

        if(productName=="perfume") {
            String[] brands = {
                "Fogg","Axe","Denver","WildStone","ParkAvenue",
                "Engage","BellaVita","Skinn","Titan","CalvinKlein",
                "Gucci","Prada","Armani","Dior","Chanel",
                "Versace","Burberry","HugoBoss","Davidoff","Jaguar",
                "Ferrari","Yardley","LayerR","SetWet","Nike",
                "Adidas","Police","Montblanc","Bvlgari"
            };
            return brands;
        }
		        if(productName=="shirt") {
            String[] brands = {
                "AllenSolly","LouisPhilippe","VanHeusen","PeterEngland","Levis",
                "UCB","Wrangler","Mufti","Arrow","Blackberrys",
                "Zara","H&M","Roadster","Highlander","FlyingMachine",
                "JackJones","TommyHilfiger","CalvinKlein","Puma","Adidas",
                "Nike","USPA","MonteCarlo","Raymond","ParkAvenue",
                "ColorPlus","Spykar","PepeJeans","MarksSpencer"
            };
            return brands;
        }

        if(productName=="tshirt") {
            String[] brands = {
                "Nike","Adidas","Puma","Reebok","USPA",
                "Levis","Wrangler","UCB","TommyHilfiger","CalvinKlein",
                "JackJones","Roadster","HRX","Zara","H&M",
                "FlyingMachine","Spykar","PepeJeans","MonteCarlo","AllenSolly",
                "PeterEngland","VanHeusen","LouisPhilippe","CampusSutra","Bewakoof",
                "SouledStore","Max","Pantaloons","MarksSpencer"
            };
            return brands;
        }

        if(productName=="jeans") {
            String[] brands = {
                "Levis","Wrangler","Spykar","PepeJeans","FlyingMachine",
                "UCB","Lee","JackJones","Roadster","Highlander",
                "CalvinKlein","TommyHilfiger","Diesel","GAP","Mufti",
                "AllenSolly","PeterEngland","VanHeusen","USPA","Zara",
                "H&M","MonteCarlo","NumeroUno","Killer","JohnPlayers",
                "Blackberrys","MarksSpencer","Pantaloons","Max"
            };
            return brands;
        }

        if(productName=="jacket") {
            String[] brands = {
                "Woodland","Puma","Adidas","Nike","USPA",
                "Levis","TommyHilfiger","CalvinKlein","JackJones","Roadster",
                "MonteCarlo","FlyingMachine","PepeJeans","Spykar","Zara",
                "H&M","Columbia","NorthFace","Wildcraft","Decathlon",
                "HRX","AllenSolly","PeterEngland","VanHeusen","Campus",
                "Reebok","UnderArmour","Superdry","MarksSpencer"
            };
            return brands;
        }

        if(productName=="saree") {
            String[] brands = {
                "Nalli","Pothys","RMKV","Kalanjali","ChennaiSilks",
                "Manyavar","MeenaBazaar","Biba","WforWoman","GlobalDesi",
                "Sabyasachi","ManishMalhotra","FabIndia","Soch","Aurelia",
                "Libas","Indya","Rangriti","Jaypore","Taneira",
                "Sudarshan","Mimosa","Kalini","Vastranand","Sangria",
                "Shaily","Kashvi","Mitera","Anouk"
            };
            return brands;
        }

        if(productName=="kurti") {
            String[] brands = {
                "Biba","WforWoman","GlobalDesi","Aurelia","Libas",
                "Indya","Rangriti","Soch","FabIndia","Jaypore",
                "Anouk","Sangria","Varanga","Shaily","Kashvi",
                "Kalini","Vastranand","Mitera","RituKumar","Manyavar",
                "MeenaBazaar","Zara","H&M","Pantaloons","Max",
                "Lifestyle","RelianceTrends","Aachho","Okhai"
            };
            return brands;
        }

        if(productName=="sandals") {
            String[] brands = {
                "Bata","Metro","Mochi","HushPuppies","Clarks",
                "Liberty","RedTape","Woodland","Puma","Adidas",
                "Nike","Skechers","Crocs","LeeCooper","Paragon",
                "Relaxo","Khadims","Action","Campus","ASICS",
                "UnderArmour","Vans","Converse","Gucci","Prada",
                "Armani","LouisPhilippe","TommyHilfiger","UCB"
            };
            return brands;
        }

        if(productName=="slippers") {
            String[] brands = {
                "Paragon","Relaxo","Bata","Puma","Adidas",
                "Nike","Sparx","Campus","Crocs","Woodland",
                "Liberty","Khadims","Action","Metro","Mochi",
                "LeeCooper","RedTape","HushPuppies","Clarks","USPA",
                "TommyHilfiger","CalvinKlein","Gucci","Prada","Armani",
                "Vans","Converse","Skechers","ASICS"
            };
            return brands;
        }

        if(productName=="blender") {
            String[] brands = {
                "Philips","Bajaj","Preethi","Butterfly","Sujata",
                "Maharaja","Havells","Usha","Kenstar","Prestige",
                "Panasonic","Bosch","MorphyRichards","Inalsa","Lifelong",
                "Longway","Crompton","Orient","VGuard","Jaipan",
                "Pigeon","Wonderchef","Sunflame","Faber","Croma",
                "Intex","Acer","Mitashi","Weston"
            };
            return brands;
        }

        if(productName=="toaster") {
            String[] brands = {
                "Philips","Bajaj","MorphyRichards","Prestige","Pigeon",
                "Usha","Havells","Panasonic","Bosch","Kenstar",
                "Inalsa","Lifelong","Longway","Jaipan","Butterfly",
                "Crompton","Orient","VGuard","Wonderchef","Sunflame",
                "Faber","Croma","Intex","Acer","Mitashi",
                "Weston","Siemens","LG","Samsung"
            };
            return brands;
        }
		        if(productName=="sofa") {
            String[] brands = {
                "UrbanLadder","Pepperfry","Ikea","Nilkamal","GodrejInterio",
                "Durian","HomeTown","WoodenStreet","Wakefit","RoyalOak",
                "Evok","FabIndia","Zuari","Damro","HomeCentre",
                "Duroflex","Sleepyhead","FlipkartPerfectHomes","AmazonBasics","WestElm",
                "PotteryBarn","Ashley","LaZBoy","Stanley","Script",
                "LivingSpaces","Bantia","Century","Spacewood"
            };
            return brands;
        }

        if(productName=="bed") {
            String[] brands = {
                "Wakefit","Sleepyhead","Duroflex","Nilkamal","GodrejInterio",
                "UrbanLadder","Pepperfry","Ikea","Durian","HomeTown",
                "RoyalOak","WoodenStreet","Evok","Zuari","Damro",
                "HomeCentre","Century","Spacewood","Ashley","LaZBoy",
                "Stanley","Script","FlipkartPerfectHomes","AmazonBasics","WestElm",
                "PotteryBarn","Bantia","FabIndia","Springtek"
            };
            return brands;
        }

        if(productName=="mattress") {
            String[] brands = {
                "Sleepyhead","Wakefit","Duroflex","Kurlon","Sleepwell",
                "Peps","Springtek","Nilkamal","Centuary","Coirfit",
                "Sunday","Flo","TheSleepCompany","Emma","Tempur",
                "Serta","Sealy","KingKoil","SpringAir","Magniflex",
                "UrbanLadder","Pepperfry","Ikea","AmazonBasics","FlipkartPerfectHomes",
                "HomeTown","RoyalOak","Damro","GodrejInterio"
            };
            return brands;
        }

        if(productName=="curtain") {
            String[] brands = {
                "DDecor","Spaces","BombayDyeing","Portico","StoryHome",
                "HomeCentre","Ikea","UrbanLadder","Pepperfry","Nilkamal",
                "AmazonBasics","FlipkartPerfectHomes","Cortina","DekorWorld","Trident",
                "Welspun","Arrabi","Aura","Vista","Swayam",
                "Dreamscape","HomeSizzler","Soumya","Status","RaymondHome",
                "BellaCasa","SwissRepublic","Maspar","LivingBasics"
            };
            return brands;
        }

        if(productName=="tiles") {
            String[] brands = {
                "Kajaria","Somany","Nitco","OrientBell","AsianGranito",
                "Cera","Simpolo","Varmora","Johnson","RAK",
                "Hindware","AGL","Sunhearrt","Qutone","Bell",
                "Euro","BajajTiles","Restile","KajariaPremium","SomanyDuragres",
                "VitrifiedPro","GraniteKing","MarbleWorld","TileHouse","CeramicPlus",
                "TileMaster","StoneCraft","FloorArt","WallStyle"
            };
            return brands;
        }

        if(productName=="cement") {
            String[] brands = {
                "UltraTech","ACC","Ambuja","Ramco","Dalmia",
                "Birla","JKCement","ShreeCement","IndiaCements","Priya",
                "Bangur","Coromandel","Penna","Sagar","Mycem",
                "Zuari","StarCement","OrientCement","Sankalp","Parasakti",
                "Bharathi","Deccan","Jaypee","Chettinad","Hemadri",
                "Sree","Maha","PrimeCement","PowerBuild"
            };
            return brands;
        }

        if(productName=="paint") {
            String[] brands = {
                "AsianPaints","Nerolac","Berger","Dulux","Indigo",
                "Shalimar","JensonNicholson","Snowcem","JSWPaints","BritishPaints",
                "Sheenlac","MrfPaints","Walplast","Sikens","Kansai",
                "SherwinWilliams","PPG","AkzoNobel","BenjaminMoore","Crown",
                "Spectrum","Vibrant","ColorPro","PaintPlus","HomeColor",
                "WallCare","PrimePaint","EliteCoat","MasterShade"
            };
            return brands;
        }

        if(productName=="switch") {
            String[] brands = {
                "Anchor","Havells","Legrand","GM","Schneider",
                "Crabtree","Roma","Panasonic","Polycab","VGuard",
                "L&T","Goldmedal","MK","Simon","Wipro",
                "Philips","Orient","Bajaj","Crompton","Syska",
                "Honeywell","ABB","Siemens","HPL","Finolex",
                "GreatWhite","Cona","HiFi","PowerTech"
            };
            return brands;
        }

        if(productName=="bulb") {
            String[] brands = {
                "Philips","Syska","Havells","Wipro","Bajaj",
                "Orient","Crompton","Panasonic","Eveready","Halogenix",
                "GE","Osram","Surya","Polycab","Anchor",
                "Goldmedal","Legrand","VGuard","Finolex","HPL",
                "Murphy","BrightLite","GlowPro","ShineStar","PowerLight",
                "Luma","EliteGlow","SparkLite","NovaLight"
            };
            return brands;
        }

        if(productName=="inverter") {
            String[] brands = {
                "Luminous","Microtek","VGuard","Exide","Amaron",
                "SuKam","Genus","Livguard","Okaya","SF",
                "Havells","APC","Delta","Eaton","Schneider",
                "PowerZone","BrightStar","PrimePower","EnergyPro","BackupPlus",
                "SecureVolt","VoltMaster","HomePower","PowerSafe","EcoEnergy",
                "UltraBackup","MegaVolt","ProEnergy","GridGuard"
            };
            return brands;
        }
		        if(productName=="battery") {
            String[] brands = {
                "Exide","Amaron","SF","Okaya","Luminous",
                "Microtek","Genus","Livguard","Havells","APC",
                "Panasonic","Eveready","Duracell","Nippo","VGuard",
                "Bosch","TataGreen","PowerZone","BrightStar","VoltMaster",
                "SecureVolt","EnergyPro","MegaPower","UltraCell","PrimeVolt",
                "HomeCharge","GridPower","ProCell","MaxLife"
            };
            return brands;
        }

        if(productName=="charger") {
            String[] brands = {
                "Samsung","Apple","Mi","Realme","OnePlus",
                "Oppo","Vivo","Anker","Boat","Portronics",
                "Belkin","Spigen","Ambrane","Syska","Zebronics",
                "Philips","Sony","Lenovo","Dell","HP",
                "Asus","Acer","Intex","iBall","Croma",
                "Stuffcool","URBN","Callmate","Energizer"
            };
            return brands;
        }

        if(productName=="notebook") {
            String[] brands = {
                "Classmate","Navneet","Camlin","Apsara","Natraj",
                "Sundaram","Solo","Luxor","Paperkraft","Oddy",
                "Nightingale","JKPaper","Bindal","Mead","Kokuyo",
                "FiveStar","AmazonBasics","FlipkartSmartBuy","Scholar","Pioneer",
                "Lotus","Unicorn","Matrix","Royal","StudentPro",
                "NotePlus","BrightPages","EduBook","SmartNotes"
            };
            return brands;
        }

        if(productName=="pen") {
            String[] brands = {
                "Reynolds","Cello","Parker","Pilot","Linc",
                "Luxor","Camlin","AddGel","Montex","Hauser",
                "PierreCardin","Classmate","Nataraj","Flair","Unomax",
                "FaberCastell","Pentel","Sheaffer","Cross","Hero",
                "Trimax","Butterflow","Technotip","GelMaster","WritePro",
                "InkFlow","SmoothLine","QuickWrite","ElitePen"
            };
            return brands;
        }

        if(productName=="pencil") {
            String[] brands = {
                "Nataraj","Apsara","Camlin","FaberCastell","Doms",
                "Classmate","Staedtler","Luxor","Kokuyo","Pentel",
                "Maped","PaperMate","AmazonBasics","Scholar","Bindal",
                "Unicorn","Bright","EduWrite","GraphitePro","LeadMaster",
                "SharpLine","SmoothLead","StudyMate","WriteRight","ArtLine",
                "SketchPro","DrawPlus","ColorLead","HBPro"
            };
            return brands;
        }

        if(productName=="eraser") {
            String[] brands = {
                "Nataraj","Apsara","Camlin","FaberCastell","Doms",
                "Classmate","Staedtler","Maped","Pentel","Kokuyo",
                "Scholar","Bindal","AmazonBasics","EduMate","CleanRub",
                "SoftErase","SmoothRub","ArtClean","WhiteErase","BrightRub",
                "StudyPlus","ProErase","QuickClean","ClearMark","NeatRub",
                "GraphiteClean","SharpErase","EasyRub","UltraClean"
            };
            return brands;
        }

        if(productName=="sharpener") {
            String[] brands = {
                "Nataraj","Apsara","Camlin","FaberCastell","Doms",
                "Classmate","Staedtler","Maped","Pentel","Kokuyo",
                "Scholar","Bindal","AmazonBasics","SharpPro","EasySharp",
                "SmoothCut","QuickPoint","LeadSharp","ArtSharp","BrightEdge",
                "StudySharp","ProPoint","UltraSharp","CleanCut","FinePoint",
                "GraphiteSharp","Precision","EdgePro","CutMaster"
            };
            return brands;
        }

        if(productName=="glue") {
            String[] brands = {
                "Fevicol","Fevistick","Pidilite","Camlin","Doms",
                "Classmate","Scotch","Elmers","UHU","Kores",
                "Bostik","Gorilla","Araldite","Vamicol","StickFast",
                "BondTite","SuperBond","QuickFix","UltraStick","PowerGlue",
                "StrongBond","AdherePro","CraftStick","GlueMaster","FixAll",
                "InstantBond","MegaStick","PrimeGlue","MaxAdhesive"
            };
            return brands;
        }

        if(productName=="scissors") {
            String[] brands = {
                "Maped","Fiskars","Camlin","Doms","Classmate",
                "Kokuyo","AmazonBasics","Scholar","Bindal","Oddy",
                "NightOwl","ArtLine","SharpCut","SmoothEdge","CutPro",
                "Precision","UltraCut","QuickSnip","FineEdge","CraftCut",
                "ProScissor","BrightCut","SafeCut","SteelEdge","EdgeMaster",
                "OfficePro","PaperCut","SharpMaster","MaxCut"
            };
            return brands;
        }

        if(productName=="calculator") {
            String[] brands = {
                "Casio","Citizen","Canon","Sharp","TexasInstruments",
                "HP","Aurora","Rebell","Deli","Orpat",
                "Bambalio","Genius","AmazonBasics","OfficePro","CalcMaster",
                "QuickCalc","SmartCalc","ProCalc","UltraCalc","StudyCalc",
                "EduCalc","BrightCalc","PrimeCalc","MegaCalc","EasyCalc",
                "SimpleCalc","FinancePro","MathMaster","CalcPlus"
            };
            return brands;
        }
		        if(productName=="diningtable") {
            String[] brands = {
                "UrbanLadder","Pepperfry","Ikea","Nilkamal","GodrejInterio",
                "Durian","HomeTown","WoodenStreet","RoyalOak","Evok",
                "Zuari","Damro","HomeCentre","Century","Spacewood",
                "Ashley","Stanley","Script","FlipkartPerfectHomes","AmazonBasics",
                "WestElm","PotteryBarn","Bantia","FabIndia","Duroflex",
                "Sleepyhead","Wakefit","LaZBoy","LivingSpaces"
            };
            return brands;
        }

        if(productName=="wardrobe") {
            String[] brands = {
                "GodrejInterio","Nilkamal","UrbanLadder","Pepperfry","Ikea",
                "Durian","RoyalOak","WoodenStreet","Evok","HomeTown",
                "Zuari","Damro","HomeCentre","Century","Spacewood",
                "Ashley","Stanley","Script","FlipkartPerfectHomes","AmazonBasics",
                "WestElm","PotteryBarn","Bantia","FabIndia","Duroflex",
                "Sleepyhead","Wakefit","LaZBoy","LivingSpaces"
            };
            return brands;
        }

        if(productName=="bookshelf") {
            String[] brands = {
                "UrbanLadder","Pepperfry","Ikea","Nilkamal","GodrejInterio",
                "Durian","RoyalOak","WoodenStreet","Evok","HomeTown",
                "Zuari","Damro","HomeCentre","Century","Spacewood",
                "Ashley","Stanley","Script","FlipkartPerfectHomes","AmazonBasics",
                "WestElm","PotteryBarn","Bantia","FabIndia","Duroflex",
                "Sleepyhead","Wakefit","LaZBoy","LivingSpaces"
            };
            return brands;
        }

        if(productName=="mirror") {
            String[] brands = {
                "HomeCentre","Ikea","UrbanLadder","Pepperfry","Nilkamal",
                "GodrejInterio","Durian","RoyalOak","WoodenStreet","Evok",
                "Zuari","Damro","Century","Spacewood","Ashley",
                "Stanley","Script","FlipkartPerfectHomes","AmazonBasics","WestElm",
                "PotteryBarn","Bantia","FabIndia","Duroflex","Sleepyhead",
                "Wakefit","LaZBoy","LivingSpaces","DecorWorld"
            };
            return brands;
        }

        if(productName=="clock") {
            String[] brands = {
                "Ajanta","Titan","Casio","Seiko","Citizen",
                "Sonata","Timex","Fastrack","Omega","Rolex",
                "Swatch","Maxima","Orpat","Kadio","Opal",
                "Random","CitizenWall","TimePro","ClockMaster","TickTock",
                "HourMark","WallTime","PrimeClock","EliteTime","TimePlus",
                "ClassicTick","ModernClock","RoyalTime","QuartzPro"
            };
            return brands;
        }

        if(productName=="pressurecooker") {
            String[] brands = {
                "Prestige","Hawkins","Butterfly","Pigeon","Bajaj",
                "Usha","Havells","Panasonic","TTK","Vinod",
                "Wonderchef","Futura","Stahl","Bergner","Milton",
                "Cello","Sunflame","Jaipan","Crompton","Orient",
                "VGuard","Lifelong","Longway","Inalsa","MorphyRichards",
                "Faber","Croma","AmazonBasics","PrimeCook"
            };
            return brands;
        }

        if(productName=="gasstove") {
            String[] brands = {
                "Prestige","Sunflame","Butterfly","Pigeon","Bajaj",
                "Havells","Usha","Faber","Glen","Elica",
                "Whirlpool","Bosch","Siemens","Panasonic","Crompton",
                "Orient","VGuard","Jaipan","Lifelong","Longway",
                "Inalsa","MorphyRichards","Wonderchef","Milton","Cello",
                "TTK","AmazonBasics","Croma","PrimeFlame"
            };
            return brands;
        }

        if(productName=="chimney") {
            String[] brands = {
                "Faber","Elica","Glen","Hindware","Whirlpool",
                "Bosch","Siemens","Sunflame","Prestige","Havells",
                "Crompton","Orient","VGuard","Inalsa","MorphyRichards",
                "Jaipan","Lifelong","Longway","Butterfly","Pigeon",
                "Panasonic","Samsung","LG","Croma","AmazonBasics",
                "PrimeAir","KitchenPro","SmokeFree","CleanAir"
            };
            return brands;
        }

        if(productName=="cookware") {
            String[] brands = {
                "Prestige","Hawkins","Butterfly","Pigeon","Bajaj",
                "TTK","Wonderchef","Stahl","Vinod","Bergner",
                "Milton","Cello","Sunflame","Jaipan","Crompton",
                "Orient","VGuard","Lifelong","Longway","Inalsa",
                "MorphyRichards","Faber","Croma","AmazonBasics","PrimeCook",
                "KitchenPro","CookMaster","EliteWare","HomeChef"
            };
            return brands;
        }

        if(productName=="waterbottle") {
            String[] brands = {
                "Milton","Cello","Tupperware","Signoraware","Borosil",
                "Pigeon","Prestige","Camelbak","Nalgene","HydroFlask",
                "Thermos","KleanKanteen","HomeCentre","AmazonBasics","Croma",
                "PrimeBottle","CoolSip","HydraPro","SteelSip","PureBottle",
                "FreshFlow","EcoSip","SafeDrink","WaterPlus","AquaStore",
                "DrinkMate","BottlePro","SipMaster","HydraMax"
            };
            return brands;
        }
		        if(productName=="plate") {
            String[] brands = {
                "Cello","Milton","Borosil","Signoraware","Tupperware",
                "Prestige","Pigeon","Wonderchef","LaOpala","Corelle",
                "HomeCentre","Ikea","AmazonBasics","Croma","PrimeServe",
                "EliteWare","KitchenPro","HomeChef","DinnerSetPro","TableKing",
                "ServeMaster","ClassicPlate","RoyalServe","FineDine","FoodPlus",
                "PureServe","SmartTable","ModernServe","SteelCraft"
            };
            return brands;
        }

        if(productName=="cup") {
            String[] brands = {
                "Borosil","Cello","Milton","LaOpala","Corelle",
                "Prestige","Pigeon","Wonderchef","HomeCentre","Ikea",
                "AmazonBasics","Croma","PrimeCup","EliteSip","CoffeePro",
                "TeaMaster","HotServe","DrinkPlus","RoyalCup","ClassicMug",
                "FineSip","ModernCup","SteelSip","PureDrink","CupKing",
                "TablePro","SmartSip","DailyCup","HomeSip"
            };
            return brands;
        }

        if(productName=="spoon") {
            String[] brands = {
                "Cello","Milton","Borosil","Prestige","Pigeon",
                "Wonderchef","Vinod","Stahl","Bergner","LaOpala",
                "Corelle","HomeCentre","Ikea","AmazonBasics","Croma",
                "PrimeCutlery","EliteSteel","KitchenPro","HomeChef","RoyalServe",
                "FineDine","ModernKitchen","SmartServe","SteelKing","PureSteel",
                "TablePro","DailyUse","ClassicServe","FoodCraft"
            };
            return brands;
        }

        if(productName=="fork") {
            String[] brands = {
                "Cello","Milton","Borosil","Prestige","Pigeon",
                "Wonderchef","Vinod","Stahl","Bergner","LaOpala",
                "Corelle","HomeCentre","Ikea","AmazonBasics","Croma",
                "PrimeCutlery","EliteSteel","KitchenPro","HomeChef","RoyalServe",
                "FineDine","ModernKitchen","SmartServe","SteelKing","PureSteel",
                "TablePro","DailyUse","ClassicServe","FoodCraft"
            };
            return brands;
        }

        if(productName=="knife") {
            String[] brands = {
                "Prestige","Pigeon","Wonderchef","Vinod","Stahl",
                "Bergner","Cello","Milton","Borosil","HomeCentre",
                "Ikea","AmazonBasics","Croma","PrimeKnife","SharpEdge",
                "CutMaster","EliteCut","KitchenPro","RoyalBlade","SteelEdge",
                "FineCut","ChefPro","SmartCut","UltraBlade","PureSteel",
                "ModernKnife","FoodCraft","DailyCut","ClassicBlade"
            };
            return brands;
        }

        if(productName=="bucket") {
            String[] brands = {
                "Cello","Milton","Supreme","Nilkamal","Prince",
                "Sintex","Signoraware","Tupperware","Prestige","Pigeon",
                "HomeCentre","Ikea","AmazonBasics","Croma","PrimeBucket",
                "WaterStore","PurePlastic","HomePlus","DailyUse","AquaKing",
                "SmartHome","CleanPro","ModernHome","FreshStore","UtilityPro",
                "HouseMate","StrongHold","ClassicHome","MegaStore"
            };
            return brands;
        }

        if(productName=="mug") {
            String[] brands = {
                "Borosil","Cello","Milton","LaOpala","Corelle",
                "Prestige","Pigeon","Wonderchef","HomeCentre","Ikea",
                "AmazonBasics","Croma","PrimeMug","EliteSip","CoffeeKing",
                "TeaTime","HotCup","RoyalMug","ClassicSip","FineDrink",
                "ModernMug","SteelSip","PureCup","DailyMug","SmartSip",
                "HomeDrink","CupPro","DrinkMate","FreshSip"
            };
            return brands;
        }

        if(productName=="mat") {
            String[] brands = {
                "Nilkamal","HomeCentre","Ikea","UrbanLadder","Pepperfry",
                "AmazonBasics","FlipkartPerfectHomes","RoyalOak","Durian","GodrejInterio",
                "PrimeHome","FloorPro","ComfortStep","SoftTouch","EliteFloor",
                "ModernHome","ClassicDecor","HomeStyle","FreshFloor","CozyStep",
                "DecorWorld","SmartLiving","HousePlus","HomeCraft","FloorKing",
                "StylePro","ComfortPlus","DreamHome","LivingPro"
            };
            return brands;
        }

        if(productName=="pillow") {
            String[] brands = {
                "Wakefit","Sleepyhead","Duroflex","Kurlon","Sleepwell",
                "Peps","Springtek","Nilkamal","Centuary","Coirfit",
                "Sunday","Flo","Emma","Tempur","Serta",
                "Sealy","KingKoil","UrbanLadder","Pepperfry","Ikea",
                "AmazonBasics","HomeTown","RoyalOak","GodrejInterio","PrimeSleep",
                "ComfortRest","SoftDream","DreamPro","CozySleep"
            };
            return brands;
        }

        if(productName=="blanket") {
            String[] brands = {
                "BombayDyeing","Spaces","Portico","StoryHome","Trident",
                "Welspun","HomeCentre","Ikea","AmazonBasics","FlipkartPerfectHomes",
                "PrimeWarm","CozyComfort","SoftTouch","EliteBlanket","WarmNest",
                "DreamWarm","HomeStyle","FreshCozy","RoyalWarm","ClassicComfort",
                "ModernWarm","HousePlus","ComfortPro","WarmPlus","WinterKing",
                "SnugHome","SleepWarm","UltraWarm","CozyNest"
            };
            return brands;
        }
		        if(productName=="toothpaste") {
            String[] brands = {
                "Colgate","Pepsodent","Closeup","Sensodyne","DaburRed",
                "Patanjali","Meswak","OralB","Himalaya","Vicco",
                "Promise","Babool","Aquafresh","Anchor","Cibaca",
                "Ajanta","Glister","Thermoseal","ColgateMax","ColgateActive",
                "PepsodentGermicheck","CloseupEverfresh","SensodyneRapid","DantKanti","MeswakPlus",
                "OralFresh","WhiteGlow","SparkleWhite","TotalCare"
            };
            return brands;
        }

        if(productName=="shampoo") {
            String[] brands = {
                "ClinicPlus","Chik","Sunsilk","HeadAndShoulders","Pantene",
                "Dove","Loreal","Tresemme","Indulekha","Karthika",
                "Himalaya","Meera","Garnier","Vatika","Biotique",
                "Mamaearth","Wow","Nyle","Clear","Fiama",
                "JohnsonBaby","Ayush","HerbalEssence","Kerastase","Matrix",
                "Schwarzkopf","Sebamed","ParkAvenue","SetWet"
            };
            return brands;
        }

        if(productName=="soap") {
            String[] brands = {
                "Lux","Lifebuoy","Dove","Pears","Santoor",
                "Medimix","Cinthol","Dettol","Hamam","MysoreSandal",
                "GodrejNo1","Fiama","Vivel","Rexona","Palmolive",
                "Liril","Himalaya","Patanjali","Khadi","Biotique",
                "JohnsonBaby","Chandrika","Margo","Neem","Ayush",
                "Power","Nirma","ParkAvenue","Aramusk"
            };
            return brands;
        }

        if(productName=="facewash") {
            String[] brands = {
                "CleanAndClear","Himalaya","Garnier","Ponds","Mamaearth",
                "Wow","Biotique","Lotus","Lakme","Neutrogena",
                "Simple","Plum","Minimalist","Cetaphil","Olay",
                "Vaseline","Nivea","VLCC","Everyuth","Joy",
                "UrbanBotanics","Khadi","Indulekha","Ayush","TheDermaCo",
                "AromaMagic","FacesCanada","SwissBeauty","Colorbar"
            };
            return brands;
        }

        if(productName=="biscuit") {
            String[] brands = {
                "Oreo","ParleG","GoodDay","DarkFantasy","Sunfeast",
                "MarieGold","HideAndSeek","Tiger","KrackJack","Bourbon",
                "5050","MilkBikis","Treat","LittleHearts","JimJam",
                "NiceTime","Monaco","DreamCream","Milano","NutriChoice",
                "Unibic","Britannia","Priyagold","Anmol","Cremica",
                "McVities","Digestive","SaltedCracker","ChocoFills"
            };
            return brands;
        }

        if(productName=="chocolate") {
            String[] brands = {
                "DairyMilk","KitKat","FiveStar","Munch","Perk",
                "Snickers","Mars","Bounty","FerreroRocher","Toblerone",
                "Lindt","Galaxy","Hershey","AmulChocolate","Milkybar",
                "Silk","Fuse","Temptations","KinderJoy","KinderBueno",
                "Gems","BarOne","Crunch","MilanoChoco","ChocoPie",
                "KitKatDark","AlpenliebeChoco","ChocoDelight","SweetBite"
            };
            return brands;
        }

        if(productName=="rice") {
            String[] brands = {
                "IndiaGate","Daawat","Fortune","Kohinoor","Aashirvaad",
                "Ponni","SonaMasoori","Basmati","24Mantra","OrganicTattva",
                "ShaktiBhog","LalQilla","Tilda","Amira","SriLalitha",
                "DoubleHorse","RoyalRice","ClassicGrain","GoldenHarvest","PureBasmati",
                "RiceKing","DailyRice","FarmFresh","Annapurna","HeritageRice",
                "GreenFarm","PremiumPonni","SelectRice","NaturalGrain"
            };
            return brands;
        }

        if(productName=="oil") {
            String[] brands = {
                "Fortune","Saffola","Gemini","Dhara","Sunrich",
                "Freedom","GoldWinner","Sundrop","NatureFresh","Emami",
                "Engine","VVD","Oleev","Figaro","DelMonte",
                "HealthyHeart","PureDrop","ClassicOil","DailyUseOil","FarmGold",
                "LiteOil","RefinedPlus","NaturalPress","FreshHarvest","PremiumBlend",
                "GoodLife","SunGold","VitalOil","PrimeCook"
            };
            return brands;
        }

        if(productName=="milk") {
            String[] brands = {
                "Amul","Nandini","Arokya","Heritage","MotherDairy",
                "Dodla","MilkyMist","Thirumala","Vijaya","Cavin",
                "Jersey","Hatsun","Nestle","Kwality","Akshayakalpa",
                "Parag","Gokul","Sanchi","Verka","Sudha",
                "Vita","Ananda","Creamline","CountryFresh","Dynamix",
                "NamasteIndia","Govardhan","FarmFresh","DairyPure"
            };
            return brands;
        }

        if(productName=="tea") {
            String[] brands = {
                "TataTea","RedLabel","BrookeBond","TajMahal","WaghBakri",
                "Society","Lipton","Tetley","AVT","Girnar",
                "3Roses","ChakraGold","PremiumLeaf","Marvel","OrganicIndia",
                "Goodricke","Twinings","Typhoo","Teabox","Vahdam",
                "GoldenTips","AssamGold","NilgiriTea","MasalaChai","GreenLeaf",
                "HerbalBrew","RoyalTea","ClassicBlend","DailyChai"
            };
            return brands;
        }
		        if(productName=="coffee") {
            String[] brands = {
                "Bru","Nescafe","Continental","Leo","TataCoffee",
                "ColombianBrew","Lavazza","Davidoff","SevenBeans","BlueTokai",
                "SleepyOwl","Rage","CountryBean","Cothas","Narasu",
                "MalabarGold","Araku","BlackBaza","Sidapur","Bayars",
                "MysoreConcern","ClassicBrew","StrongBlend","RichRoast","DarkAroma",
                "MorningFresh","RoyalCup","BeanMaster","CafePlus"
            };
            return brands;
        }

        if(productName=="noodles") {
            String[] brands = {
                "Maggi","Yippee","TopRamen","ChingSecret","Knorr",
                "Sunfeast","WaiWai","Nissin","Koka","Samyang",
                "Patanjali","SmithJones","Bambino","Veeba","NestleAtta",
                "CupNoodles","InstantFun","SpicyTwirl","MasalaMagic","QuickBite",
                "TastePro","DailyNoodles","HotBowl","SnackNoodles","YumYum",
                "ChefNoodles","DesiTwist","UrbanBowl","FoodieNoodles"
            };
            return brands;
        }

        if(productName=="icecream") {
            String[] brands = {
                "Amul","KwalityWalls","Arun","Vadilal","MotherDairy",
                "CreamBell","Havmor","BaskinRobbins","Naturals","Ibaco",
                "PolarBear","DairyDay","Scoops","GelatoVinto","TopNtown",
                "ColdStone","LondonDairy","MilkyWay","Frosty","SnowCream",
                "SweetCone","ChillCup","IceDelight","CoolCream","FruityBar",
                "ClassicCone","RoyalScoop","FunStick","DreamCream"
            };
            return brands;
        }

        if(productName=="juice") {
            String[] brands = {
                "Real","Tropicana","MinuteMaid","PaperBoat","BNatural",
                "Maaza","Slice","Frooti","Appy","DelMonte",
                "OceanSpray","RawPressery","24Mantra","OrganicIndia","Rasna",
                "Tang","SunTop","Mapro","Patanjali","Coolberg",
                "DailyJuice","FreshSip","FruitPlus","NaturalDrop","JuiceKing",
                "PrimeFruit","HealthySip","VitalJuice","PurePress"
            };
            return brands;
        }

        if(productName=="softdrink") {
            String[] brands = {
                "CocaCola","Pepsi","Sprite","Fanta","ThumbsUp",
                "Limca","7Up","Mirinda","MountainDew","Maaza",
                "Slice","AppyFizz","RCCola","Bovonto","CampaCola",
                "CoolCola","SparkDrink","FizzUp","ChillSoda","ColaKing",
                "FreshFizz","LimeBlast","OrangePop","SodaPlus","SparkleSip",
                "DailyFizz","RoyalCola","ClassicSoda","FunDrink"
            };
            return brands;
        }

        if(productName=="water") {
            String[] brands = {
                "Bisleri","Aquafina","Kinley","Bailey","Himalayan",
                "RailNeer","Kingfisher","Catch","TataCopper","Qua",
                "Evian","Perrier","SmartWater","ClearDrop","FreshPure",
                "AquaBlue","PrimeWater","CrystalClear","PureLife","HydraPlus",
                "DailyDrop","MountainFresh","NaturalSpring","VitalWater","CoolPure",
                "BlueWave","WaterKing","HealthyHydra","SafeSip"
            };
            return brands;
        }

        if(productName=="chips") {
            String[] brands = {
                "Lays","Kurkure","Bingo","Doritos","Haldirams",
                "Balaji","TooYumm","Pringles","UncleChips","Crax",
                "YellowDiamond","Tasties","TagZ","Popchips","Cornitos",
                "Ruffles","MadAngles","Oyes","Puffcorn","Cheetos",
                "FunFlips","TakaTak","Masti","ChatakaPataka","NamkeenMix",
                "AlooBhujia","MoongDal","ClassicSalted","MagicMasala"
            };
            return brands;
        }

        if(productName=="salt") {
            String[] brands = {
                "TataSalt","Aashirvaad","Catch","CaptainCook","Annapurna",
                "NirmaSalt","SaffolaSalt","OrganicIndia","Patanjali","iShakti",
                "HealthySalt","RockSalt","SeaSalt","PinkSalt","PureSalt",
                "CrystalSalt","DailySalt","PrimeSalt","FreshSalt","NaturalSalt",
                "LiteSalt","IodizedPlus","SmartSalt","FoodSalt","ChefSalt",
                "RoyalSalt","FarmSalt","FineGrain","TableSalt"
            };
            return brands;
        }

        if(productName=="sugar") {
            String[] brands = {
                "Madhur","Dhampure","Uttam","Trust","Dalmia",
                "EIDParry","Mawana","BajajSugar","ShreeSugar","Balrampur",
                "OrganicIndia","Patanjali","NaturalSweet","DailySugar","PrimeSweet",
                "CrystalSweet","FineSugar","LiteSweet","HealthySweet","FarmSugar",
                "RoyalSugar","WhiteCrystal","PureCane","SmartSweet","FoodSugar",
                "GoldenSugar","ChefSweet","TableSweet","SweetPlus"
            };
            return brands;
        }

        if(productName=="atta") {
            String[] brands = {
                "Aashirvaad","Pillsbury","Fortune","NatureFresh","ShaktiBhog",
                "24Mantra","OrganicTattva","Patanjali","Annapurna","Rajdhani",
                "ClassicAtta","DailyFlour","PrimeWheat","FarmFresh","HealthyGrain",
                "PureChakki","GoldenWheat","SmartFlour","FineAtta","RoyalChakki",
                "NaturalHarvest","GrainPlus","ChefFlour","FoodWheat","WholeGrain",
                "VitalAtta","SelectWheat","PremiumChakki","HomeFlour"
            };
            return brands;
        }
		        if(productName=="maida") {
            String[] brands = {
                "Aashirvaad","Pillsbury","Fortune","NatureFresh","ShaktiBhog",
                "Rajdhani","24Mantra","OrganicTattva","Patanjali","Annapurna",
                "ClassicMaida","DailyFlour","PrimeWhite","FarmFresh","HealthyGrain",
                "PureRefined","GoldenFlour","SmartBake","FineMaida","RoyalWhite",
                "NaturalHarvest","GrainPlus","ChefChoice","FoodFlour","HomeBake",
                "SelectRefined","PremiumWhite","BakePro","KitchenFlour"
            };
            return brands;
        }

        if(productName=="rava") {
            String[] brands = {
                "Aashirvaad","Patanjali","24Mantra","OrganicTattva","ShaktiBhog",
                "Rajdhani","Annapurna","Fortune","NatureFresh","DoubleHorse",
                "ClassicRava","DailyGrain","PrimeSooji","FarmFresh","HealthyGrain",
                "PureSooji","GoldenRava","SmartCook","FineRava","RoyalGrain",
                "NaturalHarvest","GrainPlus","ChefChoice","FoodSooji","HomeCook",
                "SelectGrain","PremiumRava","KitchenPlus","FreshSooji"
            };
            return brands;
        }

        if(productName=="dal") {
            String[] brands = {
                "TataSampann","24Mantra","OrganicTattva","Aashirvaad","Fortune",
                "Rajdhani","NatureLand","Patanjali","Annapurna","ShaktiBhog",
                "ClassicDal","DailyPulse","PrimeToor","FarmFresh","HealthyPulse",
                "PureDal","GoldenHarvest","SmartGrain","FinePulse","RoyalDal",
                "NaturalHarvest","GrainPlus","ChefChoice","FoodPulse","HomeSelect",
                "SelectDal","PremiumPulse","KitchenPlus","FreshHarvest"
            };
            return brands;
        }

        if(productName=="honey") {
            String[] brands = {
                "Dabur","Patanjali","Himalaya","Apis","Zandu",
                "OrganicIndia","24Mantra","Lion","Hitkari","NatureLand",
                "PureHoney","GoldenDrop","FarmFresh","HealthyBee","NaturalSweet",
                "PrimeHoney","RoyalBee","ForestHoney","WildHarvest","BeeNatural",
                "DailyHoney","SmartSweet","FineHoney","HomeHarvest","VitalBee",
                "SelectHoney","PremiumDrop","KitchenHoney","SweetGold"
            };
            return brands;
        }

        if(productName=="jam") {
            String[] brands = {
                "Kissan","Mapro","Bhuira","Saffola","UrbanPlatter",
                "OrganicIndia","24Mantra","Patanjali","DelMonte","Tops",
                "FruitJam","BerryFresh","GoldenSpread","FarmHarvest","SweetSpread",
                "PrimeJam","RoyalFruit","NaturalSpread","ClassicJam","HomeSpread",
                "DailyFruit","SmartSpread","FineJam","KitchenFruit","VitalSpread",
                "SelectJam","PremiumFruit","FreshBerry","SweetHarvest"
            };
            return brands;
        }

        if(productName=="butter") {
            String[] brands = {
                "Amul","Nandini","MotherDairy","Heritage","MilkyMist",
                "Vijaya","Dodla","Nestle","Kwality","Akshayakalpa",
                "PureButter","GoldenCream","FarmFresh","HealthyDairy","NaturalCream",
                "PrimeButter","RoyalDairy","ClassicCream","HomeButter","DailyDairy",
                "SmartCream","FineButter","KitchenCream","VitalDairy","SelectButter",
                "PremiumCream","FreshSpread","CreamyDelight","MilkGold"
            };
            return brands;
        }

        if(productName=="cheese") {
            String[] brands = {
                "Amul","Britannia","MotherDairy","Go","MilkyMist",
                "Vijaya","Heritage","Dynamix","Akshayakalpa","President",
                "CheddarPro","MozzaFresh","FarmCheese","HealthySlice","NaturalCheese",
                "PrimeCheese","RoyalDairy","ClassicSlice","HomeCheese","DailyDairy",
                "SmartCheese","FineSlice","KitchenCheese","VitalDairy","SelectSlice",
                "PremiumBlock","FreshCube","CheesePlus","MilkDelight"
            };
            return brands;
        }

        if(productName=="paneer") {
            String[] brands = {
                "Amul","MotherDairy","MilkyMist","Heritage","Vijaya",
                "Dodla","Nandini","Akshayakalpa","Go","Britannia",
                "FreshPaneer","FarmFresh","HealthyDairy","NaturalPaneer","PrimePaneer",
                "RoyalDairy","ClassicCube","HomePaneer","DailyDairy","SmartPaneer",
                "FinePaneer","KitchenFresh","VitalDairy","SelectPaneer","PremiumCube",
                "FreshDelight","MilkCube","PaneerPlus","DairyGold"
            };
            return brands;
        }

        if(productName=="curd") {
            String[] brands = {
                "Amul","Nandini","MotherDairy","Heritage","MilkyMist",
                "Vijaya","Dodla","Akshayakalpa","Go","Nestle",
                "FreshCurd","FarmFresh","HealthyDairy","NaturalCurd","PrimeCurd",
                "RoyalDairy","ClassicCup","HomeCurd","DailyDairy","SmartCurd",
                "FineCurd","KitchenFresh","VitalDairy","SelectCurd","PremiumCup",
                "FreshDelight","MilkCup","CurdPlus","DairyPure"
            };
            return brands;
        }

        if(productName=="bread") {
            String[] brands = {
                "Britannia","HarvestGold","Modern","EnglishOven","Fresho",
                "Perfect","Spencer","MilkyMist","Elite","HomeBake",
                "FreshBread","GoldenSlice","FarmLoaf","HealthyBake","NaturalBread",
                "PrimeLoaf","RoyalBake","ClassicSlice","DailyBread","SmartBake",
                "FineLoaf","KitchenBake","VitalLoaf","SelectBread","PremiumSlice",
                "FreshHarvest","BreadPlus","LoafMaster","BakeFresh"
            };
            return brands;
        }
		
		        if(productName=="eggs") {
            String[] brands = {
                "Suguna","Venky","Skylark","BestEgg","FarmFresh",
                "GoldenEgg","HealthyHen","NaturalEgg","PrimeEgg","RoyalFarm",
                "DailyEgg","SmartProtein","FineEgg","HomeFarm","VitalHen",
                "SelectEgg","PremiumHen","FreshNest","ProteinPlus","NutriEgg",
                "PureFarm","CountryEgg","HappyHen","EggMaster","FreshProtein",
                "ClassicEgg","MorningFarm","EliteEgg","NestFresh"
            };
            return brands;
        }

        if(productName=="chicken") {
            String[] brands = {
                "Suguna","Venky","GodrejRealGood","FreshToHome","Licious",
                "TenderCuts","Zorabian","Skylark","FarmFresh","PrimeMeat",
                "RoyalChicken","DailyFresh","HealthyMeat","NaturalCuts","SmartProtein",
                "FineMeat","HomeFarm","VitalCuts","SelectChicken","PremiumFarm",
                "FreshHarvest","MeatMaster","PurePoultry","CountryChicken","HappyFarm",
                "ProteinPlus","EliteMeat","ClassicCuts","NutriChicken"
            };
            return brands;
        }

        if(productName=="mutton") {
            String[] brands = {
                "Licious","FreshToHome","TenderCuts","Meatigo","Zappfresh",
                "FarmFresh","PrimeMeat","RoyalMutton","DailyFresh","HealthyCuts",
                "NaturalMeat","SmartProtein","FineCuts","HomeFarm","VitalMeat",
                "SelectMutton","PremiumFarm","FreshHarvest","MeatMaster","PureMeat",
                "CountryMeat","HappyFarm","ProteinPlus","EliteMeat","ClassicCuts",
                "NutriMeat","FreshProtein","RoyalCuts","PrimeFarm"
            };
            return brands;
        }

        if(productName=="fish") {
            String[] brands = {
                "FreshToHome","Licious","TenderCuts","Zappfresh","Meatigo",
                "CaptainFresh","CoastalCatch","SeaFresh","OceanHarvest","PrimeSea",
                "RoyalFish","DailyCatch","HealthySea","NaturalFish","SmartProtein",
                "FineCatch","HomeSea","VitalFish","SelectSea","PremiumCatch",
                "FreshHarbor","FishMaster","PureSeafood","CountryCatch","HappyOcean",
                "ProteinPlus","EliteSea","ClassicFish","NutriCatch"
            };
            return brands;
        }

        if(productName=="toiletcleaner") {
            String[] brands = {
                "Harpic","Domex","Lizol","Colin","Vim",
                "Dettol","Savlon","PhenylPlus","CleanMate","SparkleClean",
                "PrimeClean","RoyalFresh","DailyShine","HealthyHome","NaturalClean",
                "SmartWash","FineClean","HomeCare","VitalClean","SelectShine",
                "PremiumWash","FreshGlow","CleanMaster","PureShine","HygienePlus",
                "UltraClean","PowerWash","ActiveClean","MaxShine"
            };
            return brands;
        }

        if(productName=="floorcleaner") {
            String[] brands = {
                "Lizol","Domex","Harpic","Vim","Colin",
                "Dettol","Savlon","PhenylPlus","CleanMate","SparkleClean",
                "PrimeClean","RoyalFresh","DailyShine","HealthyHome","NaturalClean",
                "SmartWash","FineClean","HomeCare","VitalClean","SelectShine",
                "PremiumWash","FreshGlow","CleanMaster","PureShine","HygienePlus",
                "UltraClean","PowerWash","ActiveClean","MaxShine"
            };
            return brands;
        }

        if(productName=="dishwash") {
            String[] brands = {
                "Vim","Pril","Exo","Genteel","VimBar",
                "ScrubMate","CleanDrop","SparkleWash","PrimeDish","RoyalClean",
                "DailyWash","HealthyHome","NaturalShine","SmartClean","FineWash",
                "HomeCare","VitalWash","SelectClean","PremiumDish","FreshFoam",
                "DishMaster","PureWash","HygienePlus","UltraFoam","PowerDish",
                "ActiveWash","MaxFoam","KitchenClean","ShinePlus"
            };
            return brands;
        }

        if(productName=="handwash") {
            String[] brands = {
                "Dettol","Savlon","Lifebuoy","GodrejProtekt","Palmolive",
                "Himalaya","Pears","Fiama","Lux","Dove",
                "CleanHands","PrimeWash","RoyalCare","DailyClean","HealthyTouch",
                "NaturalWash","SmartHygiene","FineCare","HomeWash","VitalCare",
                "SelectWash","PremiumCare","FreshHands","PureTouch","HygienePlus",
                "UltraCare","ActiveWash","SoftClean","MaxHygiene"
            };
            return brands;
        }

        if(productName=="sanitizer") {
            String[] brands = {
                "Dettol","Savlon","Lifebuoy","GodrejProtekt","Himalaya",
                "BoroPlus","Dabur","Sterillium","PureHands","CleanDrop",
                "PrimeCare","RoyalSafe","DailyProtect","HealthyGuard","NaturalShield",
                "SmartHygiene","FineProtect","HomeGuard","VitalSafe","SelectShield",
                "PremiumCare","FreshProtect","PureGuard","HygienePlus","UltraSafe",
                "ActiveShield","MaxProtect","SafeTouch","HandGuard"
            };
            return brands;
        }

        if(productName=="tissue") {
            String[] brands = {
                "Origami","Premier","Bella","SoftTouch","CleanMate",
                "PrimeSoft","RoyalTissue","DailySoft","HealthyHome","NaturalCare",
                "SmartSoft","FineTissue","HomeCare","VitalSoft","SelectTissue",
                "PremiumSoft","FreshTouch","PureTissue","HygienePlus","UltraSoft",
                "ActiveCare","MaxSoft","KitchenTissue","ComfortSoft","EliteTissue",
                "ClassicSoft","WhiteCare","GentleTouch","SoftPlus"
            };
            return brands;
        }
		        if(productName=="detergent") {
            String[] brands = {
                "SurfExcel","Ariel","Tide","Rin","Wheel",
                "Ghadi","Nirma","Henko","Fena","MrWhite",
                "Ujala","Sunlight","Ezee","Comfort","Breeze",
                "CleanPro","WashMate","BrightWash","PowerClean","UltraWash",
                "FreshClean","SparkWash","MaxClean","RoyalWash","PrimeWash",
                "DailyWash","SmartWash","PureWash","ActiveClean"
            };
            return brands;
        }

        if(productName=="fabricsoftener") {
            String[] brands = {
                "Comfort","Ezee","Lenor","Bounce","Snuggle",
                "SoftPlus","FreshSoft","RoyalSoft","PrimeSoft","UltraSoft",
                "SmoothCare","SilkyTouch","GentleSoft","DailySoft","SmartSoft",
                "PureSoft","ActiveSoft","MaxSoft","FreshTouch","SoftCare",
                "CleanSoft","BrightSoft","EcoSoft","HomeSoft","SilkFresh",
                "SoftMaster","SoftGlow","SoftWave","SoftShine"
            };
            return brands;
        }

        if(productName=="airfreshener") {
            String[] brands = {
                "Odonil","GodrejAer","AmbiPur","Airwick","Glade",
                "FreshAir","RoyalFresh","PrimeAir","UltraFresh","CoolBreeze",
                "HomeFresh","SmartFresh","PureAir","ActiveAir","MaxFresh",
                "EcoFresh","DailyFresh","SparkAir","BrightAir","AromaPlus",
                "FreshWave","FreshGlow","CleanAir","SoftAroma","AirCare",
                "FreshMist","RoomFresh","AirMaster","AirShine"
            };
            return brands;
        }

        if(productName=="mosquitorepellent") {
            String[] brands = {
                "AllOut","GoodKnight","Mortein","Odomos","Hit",
                "MosqAway","BugFree","SafeGuard","PrimeShield","UltraProtect",
                "HomeShield","SmartGuard","PureProtect","ActiveShield","MaxShield",
                "EcoGuard","DailyProtect","FreshShield","NightGuard","MosqCare",
                "InsectFree","PowerShield","BrightGuard","BugShield","MosqMaster",
                "SafeNight","ShieldPlus","ShieldCare","MosqSafe"
            };
            return brands;
        }

        if(productName=="batterycell") {
            String[] brands = {
                "Duracell","Eveready","Panasonic","Nippo","Energizer",
                "PowerCell","PrimeCell","UltraCell","MaxCell","RoyalCell",
                "HomeCell","SmartCell","PureCell","ActiveCell","EcoCell",
                "DailyCell","BrightCell","CellMaster","CellPlus","EnergyCell",
                "StrongCell","LongLife","CellPower","CellSafe","CellPro",
                "PowerPlus","BatteryMax","BatteryPro","CellShine"
            };
            return brands;
        }
		        if(productName=="toys") {
            String[] brands = {
                "Funskool","Lego","Mattel","Hasbro","Barbie",
                "HotWheels","FisherPrice","Nerf","Hamleys","Disney",
                "Marvel","DC","PlayNation","ToyZone","Kiddo",
                "ToyMaster","HappyKids","SmartPlay","FunTime","ToyWorld",
                "PrimeToys","UltraPlay","BrightKids","JoyToys","ToyHouse",
                "ActivePlay","CreativeKids","PlayMate","KidZone"
            };
            return brands;
        }

        if(productName=="gamingconsole") {
            String[] brands = {
                "Sony","Microsoft","Nintendo","Asus","Lenovo",
                "HP","Dell","Alienware","MSI","Razer",
                "Acer","Logitech","HyperX","Corsair","Zebronics",
                "AntEsports","Boat","Realme","Samsung","LG",
                "PrimeGame","UltraPlay","GameMaster","ConsolePro","PlayNext",
                "GameZone","PowerPlay","ProGamer","NextGen"
            };
            return brands;
        }

        if(productName=="trimmer") {
            String[] brands = {
                "Philips","Nova","Syska","Mi","Realme",
                "Panasonic","Braun","Havells","Vega","Ustraa",
                "Beardo","Wahl","Remington","Andis","Conair",
                "PrimeTrim","UltraTrim","TrimMaster","SmartTrim","ProTrim",
                "ActiveTrim","StylePro","GroomPlus","TrimCare","SharpTrim",
                "EasyTrim","FreshTrim","CleanTrim","MaxTrim"
            };
            return brands;
        }

        if(productName=="laptopbag") {
            String[] brands = {
                "Skybags","AmericanTourister","VIP","Wildcraft","Safari",
                "Samsonite","Targus","Lenovo","HP","Dell",
                "Asus","Gear","Zouk","Aristocrat","Carlton",
                "PrimeBag","UltraCarry","BagMaster","TravelPro","OfficePlus",
                "SmartCarry","PackMate","DailyBag","ComfortCarry","StyleBag",
                "UrbanCarry","ProPack","SafeBag","EliteCarry"
            };
            return brands;
        }

        if(productName=="suitcase") {
            String[] brands = {
                "VIP","Safari","Skybags","AmericanTourister","Samsonite",
                "Aristocrat","Carlton","Delsey","Wildcraft","Lavie",
                "TommyHilfiger","Puma","Adidas","Nike","Woodland",
                "PrimeTravel","UltraCase","TravelMate","BagMaster","TourPro",
                "SmartCase","PackPlus","JourneyPro","TripMate","SafeTravel",
                "UrbanTrip","ProTour","EliteTravel","ComfortTrip"
            };
            return brands;
        }

        if(productName=="umbrella") {
            String[] brands = {
                "Johns","Popy","Citizen","Sun","RainMaster",
                "Fendo","Destinio","FabSeasons","Teconica","PrimeUmbrella",
                "UltraRain","RainGuard","StormSafe","AquaShield","DryPro",
                "SafeRain","BrightUmbrella","SmartRain","DailyDry","RoyalRain",
                "WeatherPro","StormPlus","RainCare","UrbanRain","EasyDry",
                "ClassicRain","EliteShield","TravelRain","MaxDry"
            };
            return brands;
        }

        if(productName=="cycle") {
            String[] brands = {
                "Hero","Hercules","Atlas","Firefox","Montra",
                "Btwin","Trek","Giant","Merida","Scott",
                "Cannondale","Polygon","Avon","Kross","MachCity",
                "PrimeCycle","UltraRide","SpeedPro","RoadMaster","UrbanRide",
                "SmartCycle","DailyRide","TrailPro","HillMaster","EcoRide",
                "CityPro","SportRide","EliteCycle","PowerRide"
            };
            return brands;
        }

        if(productName=="skincare") {
            String[] brands = {
                "Lakme","Lotus","Mamaearth","Wow","Plum",
                "Minimalist","Biotique","Himalaya","Nivea","Ponds",
                "Olay","Neutrogena","Cetaphil","Garnier","Simple",
                "PrimeGlow","UltraCare","SkinPro","DermaPlus","GlowMaster",
                "BrightSkin","FreshCare","SoftTouch","ClearSkin","RoyalGlow",
                "BeautyPro","PureCare","SkinPlus","EliteCare"
            };
            return brands;
        }

        if(productName=="makeup") {
            String[] brands = {
                "Lakme","Maybelline","L'Oreal","Colorbar","SwissBeauty",
                "FacesCanada","Sugar","Nykaa","MAC","HudaBeauty",
                "Chambor","Revlon","Insight","BlueHeaven","Elle18",
                "PrimeBeauty","UltraMakeup","GlowPro","StyleMaster","BeautyPlus",
                "RoyalMakeup","FreshLook","SmartBeauty","ProGlam","EliteStyle",
                "GlamPro","BeautyShine","PerfectLook","MakeupPlus"
            };
            return brands;
        }

        if(productName=="deodorant") {
            String[] brands = {
                "Axe","Fogg","Denver","WildStone","ParkAvenue",
                "Engage","BellaVita","Nivea","Adidas","Nike",
                "Police","Jaguar","Skinn","LayerR","SetWet",
                "PrimeDeo","UltraFresh","DeoPro","ActiveFresh","CoolMist",
                "FreshPro","RoyalDeo","DailyFresh","SmartDeo","MaxFresh",
                "PowerMist","EliteFresh","FreshPlus","AromaDeo"
            };
            return brands;
        }
		        if(productName=="shavingcream") {
            String[] brands = {
                "Gillette","OldSpice","ParkAvenue","Nivea","BombayShaving",
                "Beardo","Ustraa","Vasmol","Godrej","SuperMax",
                "PrimeShave","UltraFoam","SmoothShave","FreshFoam","RoyalShave",
                "SmartFoam","DailyShave","ProGlide","MaxFoam","CleanShave",
                "ActiveFoam","ShaveCare","SoftShave","EasyGlide","CoolShave",
                "FoamPlus","EliteShave","FreshGlide","SharpFoam"
            };
            return brands;
        }

        if(productName=="facecream") {
            String[] brands = {
                "Ponds","Nivea","Lakme","Olay","Garnier",
                "Himalaya","Mamaearth","Wow","Lotus","Biotique",
                "Cetaphil","Neutrogena","Simple","Plum","Minimalist",
                "PrimeGlow","UltraMoist","RoyalCream","DailyCare","SkinPro",
                "BrightCare","FreshMoist","GlowPlus","SoftTouch","EliteCare",
                "DermaGlow","BeautyCare","PureMoist","SmartCream"
            };
            return brands;
        }

        if(productName=="bodylotion") {
            String[] brands = {
                "Nivea","Vaseline","Ponds","Parachute","Joy",
                "Himalaya","Mamaearth","Wow","Biotique","Lotus",
                "Cetaphil","Neutrogena","Olay","Lakme","Dove",
                "PrimeLotion","UltraMoist","SoftCare","DailyMoist","SkinPlus",
                "RoyalCare","FreshLotion","GlowCare","SmartMoist","PureLotion",
                "EliteMoist","BeautyLotion","HydraCare","SmoothSkin"
            };
            return brands;
        }

        if(productName=="hairoil") {
            String[] brands = {
                "Parachute","Dabur","Indulekha","Himalaya","Bajaj",
                "Navratna","KeshKing","Vatika","Meera","Nihar",
                "WOW","Mamaearth","Biotique","Khadi","Patanjali",
                "PrimeOil","UltraCare","HairPro","RoyalOil","FreshCare",
                "SmartOil","DailyOil","HerbalPlus","StrongHair","PureOil",
                "EliteCare","NaturalOil","HairGlow","MaxOil"
            };
            return brands;
        }

        if(productName=="conditioner") {
            String[] brands = {
                "Dove","Pantene","Sunsilk","Loreal","Tresemme",
                "HeadAndShoulders","Garnier","Mamaearth","WOW","Biotique",
                "Himalaya","Matrix","Schwarzkopf","Kerastase","Indulekha",
                "PrimeCondition","UltraSoft","SmoothCare","DailyCare","HairPro",
                "RoyalSoft","FreshCare","SmartCondition","SilkPlus","PureSoft",
                "EliteCare","NaturalSoft","ShinePro","HairPlus"
            };
            return brands;
        }

        if(productName=="bottlecleaner") {
            String[] brands = {
                "Milton","Cello","Prestige","Pigeon","Wonderchef",
                "PrimeClean","UltraBrush","CleanMate","BottleCare","RoyalClean",
                "SmartClean","DailyBrush","FreshClean","PureBrush","BrightClean",
                "EcoClean","BottlePro","ActiveClean","MaxClean","CleanPlus",
                "HomeClean","KitchenCare","BrushPro","BottlePlus","CleanMaster",
                "SafeClean","StrongBrush","EasyClean","CleanShine"
            };
            return brands;
        }

        if(productName=="plantfertilizer") {
            String[] brands = {
                "Ugaoo","TrustBasket","IFFCO","GreenGrow","EcoFarm",
                "GardenPro","PrimePlant","UltraGrow","PlantPlus","NatureBoost",
                "SmartGrow","DailyPlant","FreshSoil","PureGrow","BrightPlant",
                "OrganicPro","PlantCare","GardenPlus","FarmBoost","SoilMaster",
                "GrowFast","HealthyPlant","AgroPro","PlantShine","MaxGrow",
                "GreenPlus","BioBoost","PlantElite","EcoBoost"
            };
            return brands;
        }

        if(productName=="seeds") {
            String[] brands = {
                "Ugaoo","TrustBasket","IFFCO","GreenGrow","EcoFarm",
                "GardenPro","PrimeSeeds","UltraSeeds","SeedPlus","NatureSeed",
                "SmartSeed","DailySeed","FreshSeed","PureSeed","BrightSeed",
                "OrganicSeed","SeedCare","GrowSeed","FarmSeed","AgroSeed",
                "HealthySeed","BioSeed","PlantSeed","MaxSeed","GreenSeed",
                "SeedMaster","SeedElite","SeedPro","EcoSeed"
            };
            return brands;
        }

        if(productName=="petfood") {
            String[] brands = {
                "Pedigree","Whiskas","Drools","RoyalCanin","MeO",
                "Farmina","Purepet","JerHigh","Bellotta","SmartHeart",
                "PrimePet","UltraPet","PetPlus","NaturePet","HealthyPet",
                "SmartPet","DailyPet","FreshPet","PurePetFood","RoyalPet",
                "PetCare","MaxPet","PetPro","HappyPet","PetElite",
                "PetMaster","PetShine","PetBoost","PetLife"
            };
            return brands;
        }

        if(productName=="carwash") {
            String[] brands = {
                "3M","Bosch","Formula1","TurtleWax","ArmorAll",
                "PrimeWash","UltraShine","CarCare","RoyalWash","SmartWash",
                "DailyShine","FreshWash","PureClean","BrightCar","AutoPro",
                "CarPlus","CleanDrive","MaxShine","CarElite","AutoCare",
                "ShineMaster","CarBoost","ProDrive","SpeedClean","EcoWash",
                "CarFresh","AutoPlus","DriveCare","WashPro"
            };
            return brands;
        }
		        if(productName=="carpolish") {
            String[] brands = {
                "3M","TurtleWax","ArmorAll","Formula1","Bosch",
                "PrimePolish","UltraShine","CarCare","RoyalGloss","SmartPolish",
                "DailyShine","FreshGloss","PurePolish","BrightCar","AutoPro",
                "CarPlus","GlossMaster","MaxShine","CarElite","AutoCare",
                "ShinePro","CarBoost","ProDrive","SpeedGloss","EcoPolish",
                "CarFresh","AutoPlus","DriveCare","GlossPro"
            };
            return brands;
        }

        if(productName=="tyre") {
            String[] brands = {
                "MRF","CEAT","Apollo","Bridgestone","Michelin",
                "JKTyre","Goodyear","Yokohama","Continental","Pirelli",
                "PrimeTyre","UltraGrip","RoadMaster","SpeedPro","DrivePlus",
                "SafeRide","GripMax","TyreCare","PowerDrive","RoyalRide",
                "SmartTyre","EcoDrive","HighGrip","StrongRide","WheelPro",
                "AutoTyre","MaxGrip","TyreElite","RoadElite"
            };
            return brands;
        }

        if(productName=="engineoil") {
            String[] brands = {
                "Castrol","Shell","Mobil","Servo","Valvoline",
                "Total","Gulf","Motul","HP","Exxon",
                "PrimeOil","UltraLube","EnginePro","RoyalOil","SmartLube",
                "DailyOil","PureLube","MaxOil","DriveCare","AutoPro",
                "PowerLube","EcoOil","StrongEngine","SpeedOil","HighPro",
                "AutoLube","EnginePlus","OilElite","ProEngine"
            };
            return brands;
        }

        if(productName=="helmetvisor") {
            String[] brands = {
                "Studds","Vega","Steelbird","LS2","MT",
                "Axor","SMK","Arai","Shoei","HJC",
                "PrimeVisor","UltraClear","VisionPro","RoyalShield","SmartGuard",
                "ClearView","MaxVision","SafeRide","ProShield","BrightVisor",
                "SpeedShield","RoadGuard","EliteVisor","DriveShield","AutoShield",
                "ClearPlus","VisionElite","RideSafe","VisorPro"
            };
            return brands;
        }

        if(productName=="watchstrap") {
            String[] brands = {
                "Titan","Fastrack","Casio","Sonata","Timex",
                "Rolex","Omega","Seiko","Citizen","Tissot",
                "PrimeStrap","UltraBand","StylePro","RoyalStrap","SmartBand",
                "DailyWear","LeatherPro","SteelBand","FitStrap","WatchCare",
                "BandPlus","EliteStrap","ComfortBand","ProWear","FashionBand",
                "ClassicStrap","ModernBand","MaxStrap","StrapElite"
            };
            return brands;
        }

        if(productName=="bedsheet") {
            String[] brands = {
                "BombayDyeing","Spaces","Portico","Trident","Welspun",
                "StoryHome","HomeCentre","Ikea","AmazonBasics","FlipkartPerfectHomes",
                "PrimeSheet","UltraSoft","RoyalSheet","SmartHome","DailyComfort",
                "FreshFabric","PureCotton","SoftTouch","EliteHome","CozyNest",
                "DreamHome","ComfortPlus","HomeStyle","SleepPro","FabricCare",
                "ClassicSheet","ModernHome","WarmNest","SheetPro"
            };
            return brands;
        }

        if(productName=="curtainrod") {
            String[] brands = {
                "HomeCentre","Ikea","UrbanLadder","Pepperfry","Nilkamal",
                "GodrejInterio","Durian","RoyalOak","WoodenStreet","Evok",
                "PrimeRod","UltraHold","StrongFit","RoyalDecor","SmartHome",
                "DailyUse","MetalPro","WoodFit","EliteDecor","DecorPlus",
                "HomeCraft","StylePro","ModernDecor","SecureFit","RodMaster",
                "ClassicRod","BrightDecor","MaxFit","DecorElite"
            };
            return brands;
        }

        if(productName=="doormat") {
            String[] brands = {
                "Nilkamal","HomeCentre","Ikea","UrbanLadder","Pepperfry",
                "AmazonBasics","RoyalOak","Durian","GodrejInterio","PrimeMat",
                "UltraStep","ComfortWalk","SoftStep","EliteFloor","SmartHome",
                "DailyUse","FreshFloor","PureStep","DecorWorld","HomeStyle",
                "ModernStep","ClassicHome","CleanWalk","MatPro","FloorPlus",
                "StepCare","WelcomePro","BrightHome","MatElite"
            };
            return brands;
        }

        if(productName=="hanger") {
            String[] brands = {
                "Nilkamal","HomeCentre","Ikea","UrbanLadder","Pepperfry",
                "AmazonBasics","RoyalOak","Durian","GodrejInterio","PrimeHang",
                "UltraHold","StrongGrip","EliteHome","SmartHang","DailyUse",
                "FreshHome","PureGrip","DecorPlus","HomeCraft","StylePro",
                "ModernHome","ClassicHang","SecureFit","HangPro","ClosetCare",
                "BrightHome","MaxGrip","HangElite","WardrobePro"
            };
            return brands;
        }

        if(productName=="dustbin") {
            String[] brands = {
                "Cello","Milton","Nilkamal","HomeCentre","Ikea",
                "AmazonBasics","Croma","Supreme","Prince","Signoraware",
                "PrimeBin","UltraClean","RoyalHome","SmartBin","DailyUse",
                "FreshHome","PureClean","BrightHome","EcoBin","WastePro",
                "CleanPlus","HomeCare","ModernHome","StrongBin","SafeBin",
                "MaxClean","BinElite","UtilityPro","HomePlus"
            };
            return brands;
        }
		        if(productName=="laundrybasket") {
            String[] brands = {
                "Nilkamal","Cello","Milton","HomeCentre","Ikea",
                "AmazonBasics","Croma","Supreme","Prince","Signoraware",
                "PrimeBasket","UltraStore","RoyalHome","SmartBasket","DailyUse",
                "FreshHome","PureStore","BrightHome","EcoBasket","LaundryPro",
                "CleanPlus","HomeCare","ModernHome","StrongBasket","SafeStore",
                "MaxHome","BasketElite","UtilityPro","HomePlus"
            };
            return brands;
        }

        if(productName=="storagebox") {
            String[] brands = {
                "Nilkamal","Cello","Milton","HomeCentre","Ikea",
                "AmazonBasics","Supreme","Prince","Signoraware","Tupperware",
                "PrimeBox","UltraStore","RoyalHome","SmartBox","DailyUse",
                "FreshHome","PureStore","BrightHome","EcoBox","StoragePro",
                "CleanPlus","HomeCare","ModernHome","StrongBox","SafeStore",
                "MaxHome","BoxElite","UtilityPro","HomePlus"
            };
            return brands;
        }

        if(productName=="toolkit") {
            String[] brands = {
                "Bosch","Stanley","BlackDecker","Taparia","JKFiles",
                "TataAgrico","Ingco","Makita","Dewalt","Hitachi",
                "PrimeTools","UltraKit","ToolMaster","RoyalTools","SmartKit",
                "DailyUse","StrongGrip","PowerTools","FixPro","ToolCare",
                "MaxTools","ProFix","EliteKit","HandyPro","HomeFix",
                "BuildPro","MegaTools","CraftPro","ToolElite"
            };
            return brands;
        }

        if(productName=="drillmachine") {
            String[] brands = {
                "Bosch","BlackDecker","Makita","Dewalt","Hitachi",
                "Stanley","Ingco","TataAgrico","JKFiles","PrimeDrill",
                "UltraPower","DrillMaster","RoyalTools","SmartDrill","PowerPro",
                "DailyUse","StrongGrip","FixPro","ToolCare","MaxDrill",
                "ProFix","EliteDrill","HandyPro","BuildPro","MegaDrill",
                "CraftPro","DrillElite","HomeFix","SpeedDrill"
            };
            return brands;
        }

        if(productName=="screwdriver") {
            String[] brands = {
                "Bosch","Stanley","Taparia","JKFiles","TataAgrico",
                "BlackDecker","Ingco","Makita","Dewalt","Hitachi",
                "PrimeTools","UltraGrip","ToolMaster","RoyalTools","SmartKit",
                "DailyUse","StrongGrip","PowerTools","FixPro","ToolCare",
                "MaxTools","ProFix","EliteKit","HandyPro","HomeFix",
                "BuildPro","MegaTools","CraftPro","ToolElite"
            };
            return brands;
        }

        if(productName=="ladder") {
            String[] brands = {
                "Bathla","Prime","StepUp","Nilkamal","Supreme",
                "Prince","HomeCentre","Ikea","AmazonBasics","Croma",
                "PrimeLadder","UltraStep","StrongHold","RoyalHome","SmartStep",
                "DailyUse","SafeClimb","HomeCare","MaxStep","ProClimb",
                "EliteStep","HandyPro","BuildPro","MegaClimb","CraftPro",
                "StepElite","UtilityPro","HomePlus","ClimbPro"
            };
            return brands;
        }

        if(productName=="waterpump") {
            String[] brands = {
                "Kirloskar","Crompton","Havells","VGuard","Texmo",
                "CRI","Sharp","Grundfos","Lubi","KSB",
                "PrimePump","UltraFlow","WaterPro","RoyalPump","SmartFlow",
                "DailyUse","PowerPump","MaxFlow","ProWater","EcoPump",
                "StrongFlow","PumpMaster","AquaPro","WaterElite","FlowPlus",
                "HydroPro","SafeFlow","MegaPump","FlowElite"
            };
            return brands;
        }

        if(productName=="pressurewasher") {
            String[] brands = {
                "Bosch","BlackDecker","Karcher","Makita","Dewalt",
                "Stanley","Ingco","Hitachi","PrimeWash","UltraJet",
                "WashMaster","RoyalClean","SmartJet","PowerWash","DailyUse",
                "StrongJet","ProClean","EcoWash","MaxJet","JetMaster",
                "CleanPro","WaterPro","JetElite","HydroClean","SpeedWash",
                "MegaJet","BuildPro","CraftWash","WashElite"
            };
            return brands;
        }

        if(productName=="generator") {
            String[] brands = {
                "Honda","Kirloskar","Mahindra","Greaves","Cummins",
                "AshokLeyland","Yamaha","Suzuki","PrimeGen","UltraPower",
                "GenMaster","RoyalPower","SmartGen","PowerPro","DailyUse",
                "StrongGen","ProEnergy","EcoGen","MaxPower","EnergyMaster",
                "BackupPro","GenElite","HydroGen","MegaGen","PowerElite",
                "SafeGen","BuildPro","CraftGen","EnergyPlus"
            };
            return brands;
        }

        if(productName=="stabilizer") {
            String[] brands = {
                "VGuard","Microtek","Luminous","Voltas","BlueStar",
                "Everest","Servokon","PrimeVolt","UltraSafe","PowerGuard",
                "RoyalVolt","SmartVolt","DailyUse","StrongVolt","ProVolt",
                "EcoVolt","MaxVolt","VoltMaster","SecurePro","EnergySafe",
                "VoltElite","HydroVolt","MegaVolt","PowerElite","SafeGuard",
                "BuildPro","CraftVolt","VoltPlus","HomeVolt"
            };
            return brands;
        }
		
		        if(productName=="extensionboard") {
            String[] brands = {
                "Anchor","Havells","GM","Legrand","Schneider",
                "Goldmedal","Crabtree","Wipro","Bajaj","Philips",
                "PrimeBoard","UltraPlug","PowerStrip","RoyalSwitch","SmartPlug",
                "DailyUse","StrongHold","SafePlug","VoltPro","EnergyPlus",
                "PlugMaster","HomeCare","ModernPlug","SecureBoard","MaxPower",
                "PlugElite","BuildPro","CraftPlug","BoardPlus"
            };
            return brands;
        }

        if(productName=="electrickettle") {
            String[] brands = {
                "Philips","Prestige","Bajaj","Pigeon","Butterfly",
                "Havells","Usha","MorphyRichards","Panasonic","Kenstar",
                "PrimeKettle","UltraBoil","HeatPro","RoyalKettle","SmartBoil",
                "DailyUse","QuickHeat","HotPlus","MaxBoil","TeaPro",
                "BoilMaster","KitchenCare","EliteHeat","WaterPro","SafeBoil",
                "MegaHeat","BuildPro","CraftHeat","KettlePlus"
            };
            return brands;
        }

        if(productName=="inductionstove") {
            String[] brands = {
                "Prestige","Philips","Pigeon","Butterfly","Bajaj",
                "Havells","Usha","Panasonic","Kenstar","MorphyRichards",
                "PrimeCook","UltraHeat","HeatMaster","RoyalCook","SmartCook",
                "DailyUse","QuickCook","HotPlus","MaxHeat","CookPro",
                "KitchenCare","EliteCook","SafeHeat","MegaCook","BuildPro",
                "CraftCook","CookElite","HomeCook","CookPlus"
            };
            return brands;
        }

        if(productName=="ricecooker") {
            String[] brands = {
                "Prestige","Panasonic","Pigeon","Bajaj","Butterfly",
                "Philips","Havells","Usha","MorphyRichards","Kenstar",
                "PrimeRice","UltraCook","RiceMaster","RoyalCook","SmartCook",
                "DailyUse","QuickCook","HotPlus","MaxCook","CookPro",
                "KitchenCare","EliteCook","SafeCook","MegaCook","BuildPro",
                "CraftCook","CookElite","HomeCook","RicePlus"
            };
            return brands;
        }

        if(productName=="vacuumcleaner") {
            String[] brands = {
                "Dyson","Philips","EurekaForbes","Karcher","LG",
                "Samsung","Panasonic","Bosch","Kent","Prestige",
                "PrimeClean","UltraSuction","DustPro","RoyalClean","SmartClean",
                "DailyUse","QuickClean","MaxSuction","CleanMaster","HomeCare",
                "EliteClean","SafeClean","MegaClean","BuildPro","CraftClean",
                "CleanElite","VacPro","PowerClean","CleanPlus"
            };
            return brands;
        }

        if(productName=="hairdryer") {
            String[] brands = {
                "Philips","Panasonic","Havells","Nova","Syska",
                "Vega","Braun","Remington","Conair","Ikonic",
                "PrimeDry","UltraHeat","StylePro","RoyalDry","SmartStyle",
                "DailyUse","QuickDry","MaxHeat","HairPro","BeautyCare",
                "EliteStyle","SafeDry","MegaStyle","BuildPro","CraftStyle",
                "DryElite","SalonPro","HairPlus","StylePlus"
            };
            return brands;
        }

        if(productName=="straightener") {
            String[] brands = {
                "Philips","Nova","Havells","Vega","Panasonic",
                "Remington","Ikonic","Syska","Braun","Conair",
                "PrimeStyle","UltraHeat","SmoothPro","RoyalStyle","SmartStyle",
                "DailyUse","QuickStyle","MaxHeat","HairPro","BeautyCare",
                "EliteStyle","SafeStyle","MegaStyle","BuildPro","CraftStyle",
                "StyleElite","SalonPro","HairPlus","StylePlus"
            };
            return brands;
        }

        if(productName=="weighingmachine") {
            String[] brands = {
                "HealthSense","DrTrust","Omron","Etekcity","Hoffen",
                "Prestige","Havells","Philips","PrimeScale","UltraWeight",
                "WeightPro","RoyalScale","SmartScale","DailyUse","QuickMeasure",
                "MaxScale","HealthPro","FitCare","EliteScale","SafeMeasure",
                "MegaScale","BuildPro","CraftScale","ScaleElite","HomeCare",
                "FitPlus","HealthPlus","MeasurePro","WeightPlus"
            };
            return brands;
        }

        if(productName=="bloodpressuremonitor") {
            String[] brands = {
                "Omron","DrTrust","HealthSense","Beurer","Rossmax",
                "BPL","Diamond","PrimeHealth","UltraCare","RoyalMonitor",
                "SmartHealth","DailyUse","QuickCheck","MaxCare","HealthPro",
                "FitCare","EliteHealth","SafeCheck","MegaHealth","BuildPro",
                "CraftHealth","MonitorElite","HomeCare","BPPro","HealthPlus",
                "CarePlus","CheckPro","PressurePro","VitalCheck"
            };
            return brands;
        }

        if(productName=="thermometer") {
            String[] brands = {
                "Omron","DrTrust","BPL","Beurer","Rossmax",
                "PrimeCare","UltraTemp","RoyalThermo","SmartCheck","DailyUse",
                "QuickTemp","MaxCare","HealthPro","FitCare","EliteHealth",
                "SafeCheck","MegaHealth","BuildPro","CraftHealth","ThermoElite",
                "HomeCare","TempPro","HealthPlus","CarePlus","CheckPro",
                "VitalTemp","ThermoPlus","MeasurePro","TempMaster"
            };
            return brands;
        }        
        return null;
    }
}
class PastaRunner {
    public static void main(String[] args) {

        Pasta pasta = new Pasta();

        boolean added = pasta.addPasta("Spaghetti");
        System.out.println(added);

        added = pasta.addPasta("Penne");
        System.out.println(added);

        added = pasta.addPasta("Fusilli");
        System.out.println(added);

        added = pasta.addPasta("Macaroni");
        System.out.println(added);

        added = pasta.addPasta("Lasagna");
        System.out.println(added);

        added = pasta.addPasta("Ravioli");
        System.out.println(added);

        added = pasta.addPasta("Fettuccine");
        System.out.println(added);

        added = pasta.addPasta("Linguine");
        System.out.println(added);

        added = pasta.addPasta("Rigatoni");
        System.out.println(added);

        added = pasta.addPasta("Tortellini");
        System.out.println(added);

        added = pasta.addPasta("Gnocchi");
        System.out.println(added);

        added = pasta.addPasta("Pappardelle");
        System.out.println(added);

        added = pasta.addPasta("Orzo");
        System.out.println(added);

        added = pasta.addPasta("Tagliatelle");
        System.out.println(added);

        added = pasta.addPasta("Ziti");
        System.out.println(added);

        added = pasta.addPasta("Cannelloni");
        System.out.println(added);

        added = pasta.addPasta("Conchiglie");
        System.out.println(added);

        added = pasta.addPasta("Cavatappi");
        System.out.println(added);

        added = pasta.addPasta("Rotini");
        System.out.println(added);

        added = pasta.addPasta("Manicotti");
        System.out.println(added);

        pasta.getPastas();

        String name = pasta.getPastaByName("Macaroni");
        System.out.println(name + " is available");

        boolean updated = pasta.updatePasta("Ziti", "Whole Wheat Ziti");
        System.out.println(updated);

        pasta.getPastas();

        boolean deleted = pasta.deletePasta("Orzo");
        System.out.println(deleted);

        pasta.getPastas();
    }
}
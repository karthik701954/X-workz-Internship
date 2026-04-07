class TreeRunner {
    public static void main(String[] args) {

        Tree tree = new Tree();

        boolean added = tree.addTree("Neem");
        System.out.println(added);

        added = tree.addTree("Mango");
        System.out.println(added);

        added = tree.addTree("Banyan");
        System.out.println(added);

        added = tree.addTree("Peepal");
        System.out.println(added);

        added = tree.addTree("Coconut");
        System.out.println(added);

        added = tree.addTree("Palm");
        System.out.println(added);

        added = tree.addTree("Oak");
        System.out.println(added);

        added = tree.addTree("Pine");
        System.out.println(added);

        added = tree.addTree("Teak");
        System.out.println(added);

        added = tree.addTree("Eucalyptus");
        System.out.println(added);

        tree.getTrees();

        String name = tree.getTreeByName("Mango");
        System.out.println(name + " is available");

        boolean updated = tree.updateTree("Palm", "Date Palm");
        System.out.println(updated);

        tree.getTrees();

        boolean deleted = tree.deleteTree("Neem");
        System.out.println(deleted);

        tree.getTrees();
    }
}
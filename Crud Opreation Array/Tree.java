class Tree {
    String treeNames[] = new String[10];
    int index;

    public boolean addTree(String tree) {
        boolean isAdded = false;

        if (index < treeNames.length) {
            if (tree != null && !tree.isEmpty()) {
                treeNames[index++] = tree;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getTrees() {
        for (String tree : treeNames) {
            System.out.println(tree);
        }
    }

    public String getTreeByName(String treeName) {
        String name = null;

        for (String tree : treeNames) {
            if (tree == treeName) {   // same style
                name = tree;
                break;
            }
        }

        if (name == null)
            System.out.println(treeName + " is not available");

        return name;
    }

    public boolean updateTree(String existingTree, String updatedTree) {
        boolean isUpdated = false;

        for (int i = 0; i < treeNames.length; i++) {
            if (existingTree == treeNames[i]) {
                treeNames[i] = updatedTree;
                isUpdated = true;
            }
        }

        if (!isUpdated)
            System.out.println(existingTree + " is not updated");

        return isUpdated;
    }

    public boolean deleteTree(String treeName) {
        boolean isDeleted = false;

        for (int i = 0; i < treeNames.length; i++) {
            if (treeName == treeNames[i]) {
                treeNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted)
            System.out.println(treeName + " is not deleted");

        return isDeleted;
    }
}


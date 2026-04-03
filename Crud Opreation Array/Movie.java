class Movie {
    String casts[] = new String[9];
    int index;

    public boolean addCast(String cast) {
        boolean isAdded = false;

        if (index < casts.length) {
            if (cast != null && !cast.isEmpty()) {
                casts[index++] = cast;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getCasts() {
        for (String cast : casts) {
            System.out.println(cast);
        }
    }
}
class Salon {
    String services[] = new String[7];
    int index;

    public boolean addService(String service) {
        boolean isAdded = false;

        if (index < services.length) {
            if (service != null && !service.isEmpty()) {
                services[index++] = service;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getServices() {
        for (String service : services) {
            System.out.println(service);
        }
    }
}
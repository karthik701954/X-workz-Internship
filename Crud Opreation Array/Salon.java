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

    public String getServiceByName(String serviceName) {
        String name = null;

        for (String service : services) {
            if (service == serviceName) {
                name = service;
                break;
            }
        }

        if (name == null)
            System.out.println(serviceName + " is not available");

        return name;
    }

    public boolean updateService(String existingService, String updatedService) {
        boolean isUpdated = false;

        for (int i = 0; i < services.length; i++) {
            if (existingService == services[i]) {
                services[i] = updatedService;
                isUpdated = true;
            }
        }

        if (isUpdated == false)
            System.out.println(existingService + " is not updated");

        return isUpdated;
    }

    public boolean deleteService(String serviceName) {
        boolean isDeleted = false;

        for (int i = 0; i < services.length; i++) {
            if (serviceName == services[i]) {
                services[i] = null;
                isDeleted = true;
            }
        }

        if (isDeleted == false)
            System.out.println(serviceName + " is not deleted");

        return isDeleted;
    }
}


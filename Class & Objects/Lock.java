class Lock {

    int lockId;
    String brand;
    String lockType;
    String securityLevel;
    String keyType;

    public void getLockDetails() {
        System.out.println("The lockId is: " + lockId);
        System.out.println("The brand is: " + brand);
        System.out.println("The lockType is: " + lockType);
        System.out.println("The securityLevel is: " + securityLevel);
        System.out.println("The keyType is: " + keyType);
    }
}

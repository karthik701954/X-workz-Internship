class MilitaryRunner {
    public static void main(String[] args) {

        Military military = new Military();

        boolean added = military.addWeapon("AK-47");
        System.out.println(added);
        added = military.addWeapon("INSAS Rifle");
        System.out.println(added);
        added = military.addWeapon("Sniper Rifle");
        System.out.println(added);
        added = military.addWeapon("Machine Gun");
        System.out.println(added);
        added = military.addWeapon("Pistol");
        System.out.println(added);
        added = military.addWeapon("Grenade");
        System.out.println(added);
        added = military.addWeapon("Rocket Launcher");
        System.out.println(added);
        added = military.addWeapon("Tank");
        System.out.println(added);
        added = military.addWeapon("Fighter Jet");
        System.out.println(added);
        added = military.addWeapon("Submarine");
        System.out.println(added);
        added = military.addWeapon("Aircraft Carrier");
        System.out.println(added);
        added = military.addWeapon("Drone");
        System.out.println(added);
        added = military.addWeapon("Missile");
        System.out.println(added);
        added = military.addWeapon("Radar System");
        System.out.println(added);
        added = military.addWeapon("Helicopter");
        System.out.println(added);
        added = military.addWeapon("Mortar");
        System.out.println(added);
        added = military.addWeapon("Cannon");
        System.out.println(added);
        added = military.addWeapon("Torpedo");
        System.out.println(added);
        added = military.addWeapon("Warship");
        System.out.println(added);
        added = military.addWeapon("Bulletproof Vest");
        System.out.println(added);
        added = military.addWeapon("Night Vision Goggles");
        System.out.println(added);

        military.getWeapons();

        String name = military.getWeaponByName("Tank");
        System.out.println(name + " is available");

        boolean updated = military.updateWeaponName("Drone", "Combat Drone");
        System.out.println(updated);

        military.getWeapons();

        boolean deleted = military.deleteWeapon("Grenade");
        System.out.println(deleted);

        military.getWeapons();
    }
}
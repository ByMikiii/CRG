package com.company;

public class Location {
    private String name;
    private String description;

    private Location up;
    private Location down;
    private Location right;
    private Location left;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Location getDown() {
        return down;
    }

    public void setDown(Location down) {
        this.down = down;
    }

    public Location getUp() {
        return up;
    }

    public void setUp(Location up) {
        this.up = up;
    }

    public Location getLeft() {
        return left;
    }

    public void setLeft(Location left) {
        this.left = left;
    }

    public Location getRight() {
        return right;
    }

    public void setRight(Location right) {
        this.right = right;
    }

    public void getDescription() {
        System.out.println("Nachadzas sa v lokacii: " + this.name);
        System.out.println("Popis lokacie: " + this.description);

        System.out.println("Mozes ist na: ");

        if (this.getDown() != null) {
            System.out.println("Juh - " + this.getDown().name);
        }
        if (this.getUp() != null) {
            System.out.println("Sever - " + this.getUp().name);
        }
        if (this.getRight() != null) {
            System.out.println("Vychod - " + this.getRight().name);
        }
        if (this.getLeft() != null) {
            System.out.println("Zapad - " + this.getLeft().name);
        }
        System.out.println("--------------------------------");
    }
}


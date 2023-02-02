package org.launchcode.studio7;

public abstract class BaseDisc {
    String name;
    Integer capacity;
    String contents;
    String discType;

    public BaseDisc(String name, Integer capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public void reportData() {
        System.out.println("Name: " + this.name +
                ", Capacity: " + this.capacity + "GB" +
                ", Disc Type: " + this.discType +
                ", Contents: " + this.contents);
    }
}



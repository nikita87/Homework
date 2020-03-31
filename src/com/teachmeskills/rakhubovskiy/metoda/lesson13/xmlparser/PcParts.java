package com.teachmeskills.rakhubovskiy.metoda.lesson13.xmlparser;

public class PcParts {

    private String name;
    private String origin;
    private Double price;
    private String type;
    private Double energyConsumption;
    private Boolean isCooler;
    private String groupParts;
    private String port;
    private Boolean isCritical;

    public PcParts(String name, String origin, Double price, String type, Double energyConsumption, Boolean isCooler, String groupParts, String port, Boolean isCritical) {
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.type = type;
        this.energyConsumption = energyConsumption;
        this.isCooler = isCooler;
        this.groupParts = groupParts;
        this.port = port;
        this.isCritical = isCritical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Boolean getCooler() {
        return isCooler;
    }

    public void setCooler(Boolean cooler) {
        isCooler = cooler;
    }

    public String getGroupParts() {
        return groupParts;
    }

    public void setGroupParts(String groupParts) {
        this.groupParts = groupParts;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Boolean getCritical() {
        return isCritical;
    }

    public void setCritical(Boolean critical) {
        isCritical = critical;
    }

    @Override
    public String toString() {
        return "PcParts{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", energyConsumption=" + energyConsumption +
                ", isCooler=" + isCooler +
                ", groupParts='" + groupParts + '\'' +
                ", port='" + port + '\'' +
                ", isCritical=" + isCritical +
                '}';
    }
}

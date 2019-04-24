package com.qf.withmycar.pojo;


public class CarIntelligence {
    private int id;
    private String carName;
    private String carUrl;
    private String carDesr;
    private String carSpan;
    private String carPrice;
    private String desrUrl;

    public String getDesrUrl() {
        return desrUrl;
    }

    public void setDesrUrl(String desrUrl) {
        this.desrUrl = desrUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarUrl() {
        return carUrl;
    }

    public void setCarUrl(String carUrl) {
        this.carUrl = carUrl;
    }

    public String getCarDesr() {
        return carDesr;
    }

    public void setCarDesr(String carDesr) {
        this.carDesr = carDesr;
    }

    public String getCarSpan() {
        return carSpan;
    }

    public void setCarSpan(String carSpan) {
        this.carSpan = carSpan;
    }

    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "CarIntelligence{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", carUrl='" + carUrl + '\'' +
                ", carDesr='" + carDesr + '\'' +
                ", carSpan='" + carSpan + '\'' +
                ", carPrice='" + carPrice + '\'' +
                ", desrUrl='" + desrUrl + '\'' +
                '}';
    }
}

package com.lab.cdc;

public class CDC {
    private String sent;
    private String headline;
    private String description;
    private String alert_disease;
    private String areaDesc;
    private String circle;
    // 加值資料
    private double distance; // 距離

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAlert_disease() {
        return alert_disease;
    }

    public void setAlert_disease(String alert_disease) {
        this.alert_disease = alert_disease;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "CDC{" + "sent=" + sent + ", headline=" + headline + ", description=" + description + ", alert_disease=" + alert_disease + ", areaDesc=" + areaDesc + ", circle=" + circle + ", distance=" + distance + '}';
    }
    
}

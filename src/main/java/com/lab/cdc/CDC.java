package com.lab.cdc;

public class CDC {
    private String sent;
    private String headline;
    private String description;
    private String alert_disease;
    private String areaDesc;
    private String circle;

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

    @Override
    public String toString() {
        return "CDC{" + "sent=" + sent + ", headline=" + headline + ", description=" + description + ", alert_disease=" + alert_disease + ", areaDesc=" + areaDesc + ", circle=" + circle + '}';
    }
    
}

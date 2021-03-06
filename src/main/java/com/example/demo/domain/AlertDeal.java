package com.example.demo.domain;

import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("alertDeal")
public class AlertDeal {
     private Integer id;
     private Alert alertId;
     private String username;
     private Integer type;
     private float normal;
     private float unormal;
     private LocalDateTime time;
     private String content;

    public AlertDeal() {
    }

    public AlertDeal(Integer id, Alert alertId, String username, Integer type, float normal, float unormal, LocalDateTime time, String content) {
        this.id = id;
        this.alertId = alertId;
        this.username = username;
        this.type = type;
        this.normal = normal;
        this.unormal = unormal;
        this.time = time;
        this.content = content;
    }

    public AlertDeal(Alert alertId, String username, Integer type, float normal, float unormal, LocalDateTime time, String content) {
        this.alertId = alertId;
        this.username = username;
        this.type = type;
        this.normal = normal;
        this.unormal = unormal;
        this.time = time;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName(int type){
        switch (type){
            case 1:
                return "值异常";
            case 2:
                return "值丢失";
            case 3:
                return "值无效";
            default:
                return null;
        }
    }

    public Alert getAlertId() {
        return alertId;
    }

    public void setAlertId(Alert alertId) {
        this.alertId = alertId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public float getNormal() {
        return normal;
    }

    public void setNormal(float normal) {
        this.normal = normal;
    }

    public float getUnormal() {
        return unormal;
    }

    public void setUnormal(float unormal) {
        this.unormal = unormal;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

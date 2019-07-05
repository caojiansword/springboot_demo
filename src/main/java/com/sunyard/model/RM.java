package com.sunyard.model;

public class RM {
    private String id;

    private String ziyuanbaoshi;

    private String fenleijineng;

    private String suoshufenlei;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getZiyuanbaoshi() {
        return ziyuanbaoshi;
    }

    public void setZiyuanbaoshi(String ziyuanbaoshi) {
        this.ziyuanbaoshi = ziyuanbaoshi == null ? null : ziyuanbaoshi.trim();
    }

    public String getFenleijineng() {
        return fenleijineng;
    }

    public void setFenleijineng(String fenleijineng) {
        this.fenleijineng = fenleijineng == null ? null : fenleijineng.trim();
    }

    public String getSuoshufenlei() {
        return suoshufenlei;
    }

    public void setSuoshufenlei(String suoshufenlei) {
        this.suoshufenlei = suoshufenlei == null ? null : suoshufenlei.trim();
    }
}
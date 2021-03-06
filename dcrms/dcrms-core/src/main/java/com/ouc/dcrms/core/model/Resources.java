package com.ouc.dcrms.core.model;

import java.io.Serializable;
import java.util.Date;

public class Resources implements Serializable {

    private static final long serialVersionUID = 8169168311556858264L;

    private Integer resid;

    private String name;

    private String url;

    private Byte type;

    private Byte visible;

    private String description;
    
    private Date gmtCreate; 
    
    private Date gmtModified;

    private Integer parentId;

    public Integer getResid() {
        return resid;
    }

    public void setResid(Integer resid) {
        this.resid = resid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getVisible() {
        return visible;
    }

    public void setVisible(Byte visible) {
        this.visible = visible;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getGmtCreate() {
	return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
	this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
	return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
	this.gmtModified = gmtModified;
    }

    public Integer getParentId() {
	return parentId;
    }

    public void setParentId(Integer parentId) {
	this.parentId = parentId;
    }
}
package com.love.fun_entity.user;

import java.io.Serializable;

public class StrAction implements Serializable {
    private Integer id;

    private String name;

    private String picture;

    private Integer actionnum;

    private String whilenum;

    private Integer time;

    private String level;

    private Integer placeid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getActionnum() {
        return actionnum;
    }

    public void setActionnum(Integer actionnum) {
        this.actionnum = actionnum;
    }

    public String getWhilenum() {
        return whilenum;
    }

    public void setWhilenum(String whilenum) {
        this.whilenum = whilenum == null ? null : whilenum.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Integer getPlaceid() {
        return placeid;
    }

    public void setPlaceid(Integer placeid) {
        this.placeid = placeid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StrAction other = (StrAction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
            && (this.getActionnum() == null ? other.getActionnum() == null : this.getActionnum().equals(other.getActionnum()))
            && (this.getWhilenum() == null ? other.getWhilenum() == null : this.getWhilenum().equals(other.getWhilenum()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getPlaceid() == null ? other.getPlaceid() == null : this.getPlaceid().equals(other.getPlaceid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getActionnum() == null) ? 0 : getActionnum().hashCode());
        result = prime * result + ((getWhilenum() == null) ? 0 : getWhilenum().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getPlaceid() == null) ? 0 : getPlaceid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", picture=").append(picture);
        sb.append(", actionnum=").append(actionnum);
        sb.append(", whilenum=").append(whilenum);
        sb.append(", time=").append(time);
        sb.append(", level=").append(level);
        sb.append(", placeid=").append(placeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
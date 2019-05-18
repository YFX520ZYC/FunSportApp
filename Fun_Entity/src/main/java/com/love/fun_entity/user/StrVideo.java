package com.love.fun_entity.user;

import java.io.Serializable;

public class StrVideo implements Serializable {
    private Integer id;

    private String name;

    private String url;

    private String gist;

    private String picturel;

    private String picturer;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getGist() {
        return gist;
    }

    public void setGist(String gist) {
        this.gist = gist == null ? null : gist.trim();
    }

    public String getPicturel() {
        return picturel;
    }

    public void setPicturel(String picturel) {
        this.picturel = picturel == null ? null : picturel.trim();
    }

    public String getPicturer() {
        return picturer;
    }

    public void setPicturer(String picturer) {
        this.picturer = picturer == null ? null : picturer.trim();
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
        StrVideo other = (StrVideo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getGist() == null ? other.getGist() == null : this.getGist().equals(other.getGist()))
            && (this.getPicturel() == null ? other.getPicturel() == null : this.getPicturel().equals(other.getPicturel()))
            && (this.getPicturer() == null ? other.getPicturer() == null : this.getPicturer().equals(other.getPicturer()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getGist() == null) ? 0 : getGist().hashCode());
        result = prime * result + ((getPicturel() == null) ? 0 : getPicturel().hashCode());
        result = prime * result + ((getPicturer() == null) ? 0 : getPicturer().hashCode());
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
        sb.append(", url=").append(url);
        sb.append(", gist=").append(gist);
        sb.append(", picturel=").append(picturel);
        sb.append(", picturer=").append(picturer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
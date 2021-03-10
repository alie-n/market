package org.explosiveworks.market.domain;

import java.util.List;

public class Description {

    private Long id;
    private List<Image> images;
    private String text;

    public Description() {
    }

    @Override
    public String toString() {
        return "Description{" +
                "id=" + id +
                ", images=" + images +
                ", text='" + text + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

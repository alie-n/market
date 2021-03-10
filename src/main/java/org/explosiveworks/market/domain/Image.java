package org.explosiveworks.market.domain;

import java.io.File;

public class Image {

    private Long id;
    private File small;
    private File large;

    public Image() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public File getSmall() {
        return small;
    }

    public void setSmall(File small) {
        this.small = small;
    }

    public File getLarge() {
        return large;
    }

    public void setLarge(File large) {
        this.large = large;
    }
}

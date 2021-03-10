package org.explosiveworks.market.domain;

public class Presentation {

    private Long id;
    private String label;
    private Image image;

    public Presentation() {
    }

    @Override
    public String toString() {
        return "Presentation{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", image=" + image +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}

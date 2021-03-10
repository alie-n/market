package org.explosiveworks.market.domain;

public class Instruction {

    private Long id;
    private Description description;

    public Instruction() {
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "id=" + id +
                ", description=" + description +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}

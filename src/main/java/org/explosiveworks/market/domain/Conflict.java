package org.explosiveworks.market.domain;

import org.explosiveworks.market.domain.enums.Intruder;
import org.explosiveworks.market.domain.enums.Reason;

public class Conflict {

    private Long id;
    private Reason reason;
    private Intruder intruder;

    public Conflict() {
    }

    @Override
    public String toString() {
        return "Conflict{" +
                "id=" + id +
                ", reason=" + reason +
                ", intruder=" + intruder +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public Intruder getIntruder() {
        return intruder;
    }

    public void setIntruder(Intruder intruder) {
        this.intruder = intruder;
    }
}

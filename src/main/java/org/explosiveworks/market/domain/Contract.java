package org.explosiveworks.market.domain;

import org.explosiveworks.market.domain.enums.Phase;

import java.time.LocalDateTime;

public class Contract {

    private Long id;
    private Person dealer;
    private Person buyer;
    private Instruction instruction;
    private int cash;
    private Phase phase;
    private Conflict conflict;
    private LocalDateTime begin;
    private LocalDateTime end;
    private LocalDateTime deadline;

    public Contract() {
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", dealer=" + dealer +
                ", buyer=" + buyer +
                ", instruction=" + instruction +
                ", cash=" + cash +
                ", phase=" + phase +
                ", conflict=" + conflict +
                ", begin=" + begin +
                ", end=" + end +
                ", deadline=" + deadline +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getDealer() {
        return dealer;
    }

    public void setDealer(Person dealer) {
        this.dealer = dealer;
    }

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public Instruction getInstruction() {
        return instruction;
    }

    public void setInstruction(Instruction instruction) {
        this.instruction = instruction;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public Phase getPhase() {
        return phase;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    public Conflict getConflict() {
        return conflict;
    }

    public void setConflict(Conflict conflict) {
        this.conflict = conflict;
    }

    public LocalDateTime getBegin() {
        return begin;
    }

    public void setBegin(LocalDateTime begin) {
        this.begin = begin;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }
}

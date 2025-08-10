package com.springpractice.springpractice.entity;

import jakarta.persistence.*;

@Entity
@Table(name="history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="action_type")
    private String actionType;

    @Column(name="round_id")
    private int roundId;

    @Column(name="action_id")
    private int actionId;

    @Column(name="amount")
    private double amount;

    public History() {}

    public History(String actionType, int roundId, int actionId, double amount) {
        this.actionType = actionType;
        this.roundId = roundId;
        this.actionId = actionId;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public int getRoundId() {
        return roundId;
    }

    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }

    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", actionType='" + actionType + '\'' +
                ", roundId=" + roundId +
                ", actionId=" + actionId +
                ", amount=" + amount +
                '}';
    }
}

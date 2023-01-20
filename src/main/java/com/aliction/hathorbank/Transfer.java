package com.aliction.hathorbank;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Transfer extends PanacheEntity{
    
    private Long id;
    private Date time;
    private UUID accountFrom;
    private UUID accountTo;
    private Long amount;

    public Transfer(){}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public UUID getAccountFrom() {
        return accountFrom;
    }
    public void setAccountFrom(UUID from) {
        this.accountFrom = from;
    }
    public UUID getAccountTo() {
        return accountTo;
    }
    public void setAccountTo(UUID to) {
        this.accountTo = to;
    }
    public Long getAmount() {
        return amount;
    }
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    

    
}

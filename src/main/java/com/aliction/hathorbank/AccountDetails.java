package com.aliction.hathorbank;

import java.util.Date;
import java.util.UUID;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class AccountDetails extends PanacheEntity{

    private Long id;
    private UUID accountId;
    private String transactionType;
    private Long amount;
    private Date time;

    public AccountDetails(){}

    public AccountDetails(Long id, UUID accountId, String transactionType, Long amount,
            Date time) {
        this.id = id;
        this.accountId = accountId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
    
}
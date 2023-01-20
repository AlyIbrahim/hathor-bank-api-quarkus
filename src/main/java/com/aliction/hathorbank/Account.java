package com.aliction.hathorbank;

import java.util.UUID;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Account extends PanacheEntity{

    private Long id;
    private UUID accountId;
    private String owner;
    private String accountType;
    private Long balance;

    public Account(){}

    public Account(Long id, UUID accountId, String owner, String accountType, Long balance) {
        this.id = id;
        this.accountId = accountId;
        this.owner = owner;
        this.accountType = accountType;
        this.balance = balance;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    
    
    

}

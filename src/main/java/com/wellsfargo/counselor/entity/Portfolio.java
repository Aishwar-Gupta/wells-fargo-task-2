package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long portfolioId;

    @OneToOne
    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private String creationDate;


    protected Portfolio(){
    }

    public Portfolio(String creationDate){
        this.creationDate = creationDate;
    }

    public long getClientId(){
        return clientId;
    }

    public long getPortfolioId(){
        return portfolioId;
    }

    public void setCreationDate(String creationDate){
        this.creationDate = creationDate;
    }

    public String getCreationDate(){
        return creationDate;
    }
}

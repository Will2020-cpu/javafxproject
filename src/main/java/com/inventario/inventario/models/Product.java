package com.inventario.inventario.models;

import java.math.BigDecimal;

public class Product {
    private Long id;
    private String name;
    private String referency;
    private int quantitiesS;
    private int quanitiesM;
    private int quanitiesL;
    private BigDecimal priceSold;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferency() {
        return referency;
    }

    public void setReferency(String referency) {
        this.referency = referency;
    }

    public int getQuantitiesS() {
        return quantitiesS;
    }

    public void setQuantitiesS(int quantitiesS) {
        this.quantitiesS = quantitiesS;
    }

    public int getQuanitiesM() {
        return quanitiesM;
    }

    public void setQuanitiesM(int quanitiesM) {
        this.quanitiesM = quanitiesM;
    }

    public int getQuanitiesL() {
        return quanitiesL;
    }

    public void setQuanitiesL(int quanitiesL) {
        this.quanitiesL = quanitiesL;
    }

    public BigDecimal getPriceSold() {
        return priceSold;
    }

    public void setPriceSold(BigDecimal priceSold) {
        this.priceSold = priceSold;
    }
}

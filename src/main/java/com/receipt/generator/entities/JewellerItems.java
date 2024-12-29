package com.receipt.generator.entities;

import com.receipt.generator.enums.ItemType;
import lombok.Data;

@Data
public class JewellerItems {
    private ItemType type;
    private String description;
    private String gWt;
    private String sWt;
    private String sRate;
    private String lWt;
    private String nWt;
    private String tunch;
    private String rate;
    private String gold;
    private String silver;
    private String labour;
    private String amount;

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getsWt() {
        return sWt;
    }

    public void setsWt(String sWt) {
        this.sWt = sWt;
    }

    public String getsRate() {
        return sRate;
    }

    public void setsRate(String sRate) {
        this.sRate = sRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getgWt() {
        return gWt;
    }

    public void setgWt(String gWt) {
        this.gWt = gWt;
    }

    public String getlWt() {
        return lWt;
    }

    public void setlWt(String lWt) {
        this.lWt = lWt;
    }

    public String getnWt() {
        return nWt;
    }

    public void setnWt(String nWt) {
        this.nWt = nWt;
    }

    public String getTunch() {
        return tunch;
    }

    public void setTunch(String tunch) {
        this.tunch = tunch;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getSilver() {
        return silver;
    }

    public void setSilver(String silver) {
        this.silver = silver;
    }

    public String getLabour() {
        return labour;
    }

    public void setLabour(String labour) {
        this.labour = labour;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public JewellerItems() {
    }

    public JewellerItems(ItemType type, String description, String gWt, String sWt, String lWt, String sRate, String nWt, String tunch, String rate, String gold, String silver, String labour, String amount) {
        this.type = type;
        this.description = description;
        this.gWt = gWt;
        this.sWt = sWt;
        this.lWt = lWt;
        this.sRate = sRate;
        this.nWt = nWt;
        this.tunch = tunch;
        this.rate = rate;
        this.gold = gold;
        this.silver = silver;
        this.labour = labour;
        this.amount = amount;
    }
}

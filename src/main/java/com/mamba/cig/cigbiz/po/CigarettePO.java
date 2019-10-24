package com.mamba.cig.cigbiz.po;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/10/24 16:35
 */
public class CigarettePO {

    private int id;
    private String cigName;
    private String cigType;
    private String tarContent;
    private String nicotineContent;
    private String co;
    private String packageType;
    private String cigSpecification;
    private String smallPrice;
    private String barPrice;
    private String timeMarket;
    private String smallBarCode;
    private String barBarCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCigName() {
        return cigName;
    }

    public void setCigName(String cigName) {
        this.cigName = cigName;
    }

    public String getCigType() {
        return cigType;
    }

    public void setCigType(String cigType) {
        this.cigType = cigType;
    }

    public String getTarContent() {
        return tarContent;
    }

    public void setTarContent(String tarContent) {
        this.tarContent = tarContent;
    }

    public String getNicotineContent() {
        return nicotineContent;
    }

    public void setNicotineContent(String nicotineContent) {
        this.nicotineContent = nicotineContent;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getCigSpecification() {
        return cigSpecification;
    }

    public void setCigSpecification(String cigSpecification) {
        this.cigSpecification = cigSpecification;
    }

    public String getSmallPrice() {
        return smallPrice;
    }

    public void setSmallPrice(String smallPrice) {
        this.smallPrice = smallPrice;
    }

    public String getBarPrice() {
        return barPrice;
    }

    public void setBarPrice(String barPrice) {
        this.barPrice = barPrice;
    }

    public String getTimeMarket() {
        return timeMarket;
    }

    public void setTimeMarket(String timeMarket) {
        this.timeMarket = timeMarket;
    }

    public String getSmallBarCode() {
        return smallBarCode;
    }

    public void setSmallBarCode(String smallBarCode) {
        this.smallBarCode = smallBarCode;
    }

    public String getBarBarCode() {
        return barBarCode;
    }

    public void setBarBarCode(String barBarCode) {
        this.barBarCode = barBarCode;
    }
}

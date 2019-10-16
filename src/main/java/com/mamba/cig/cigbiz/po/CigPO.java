package com.mamba.cig.cigbiz.po;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/10/8 10:13
 */
public class CigPO {

    private int id;
    private String productCode;
    private String productName;
    private String brandOwner;
    private String barCode;
    private String priceClass;
    private String tradePrice;
    private String retailPrice;
    private String tarContent;
    private String category;
    private String packagedForm;
    private String specification;
    private boolean isThin;
    private boolean isAbnormal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandOwner() {
        return brandOwner;
    }

    public void setBrandOwner(String brandOwner) {
        this.brandOwner = brandOwner;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getPriceClass() {
        return priceClass;
    }

    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }

    public String getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(String tradePrice) {
        this.tradePrice = tradePrice;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getTarContent() {
        return tarContent;
    }

    public void setTarContent(String tarContent) {
        this.tarContent = tarContent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPackagedForm() {
        return packagedForm;
    }

    public void setPackagedForm(String packagedForm) {
        this.packagedForm = packagedForm;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public boolean isThin() {
        return isThin;
    }

    public void setThin(boolean thin) {
        isThin = thin;
    }

    public boolean isAbnormal() {
        return isAbnormal;
    }

    public void setAbnormal(boolean abnormal) {
        isAbnormal = abnormal;
    }
}

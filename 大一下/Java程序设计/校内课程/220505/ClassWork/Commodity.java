package ClassWork;

import java.util.Objects;

public class Commodity {
    private String productName; //商品名称
    private String classification; //分类
    private String describe; //描述

    public Commodity() {
    }

    public Commodity(String productName, String classification, String describe) {
        this.productName = productName;
        this.classification = classification;
        this.describe = describe;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "productName='" + productName + '\'' +
                ", classification='" + classification + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commodity)) return false;
        Commodity commodity = (Commodity) o;
        return Objects.equals(getProductName(), commodity.getProductName()) &&
                Objects.equals(getClassification(), commodity.getClassification()) &&
                Objects.equals(getDescribe(), commodity.getDescribe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getClassification(), getDescribe());
    }
}

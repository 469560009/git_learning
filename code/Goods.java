package com.example.model;

import java.io.Serializable;
import org.joda.money.Money;

public class Goods implements Serializable {
    private Long id;

    private String corpId;

    private String goodsId;

    private String goodsName;

    private Money price;

    private Long total;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public Goods withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorpId() {
        return corpId;
    }

    public Goods withCorpId(String corpId) {
        this.setCorpId(corpId);
        return this;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public Goods withGoodsId(String goodsId) {
        this.setGoodsId(goodsId);
        return this;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public Goods withGoodsName(String goodsName) {
        this.setGoodsName(goodsName);
        return this;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Money getPrice() {
        return price;
    }

    public Goods withPrice(Money price) {
        this.setPrice(price);
        return this;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public Long getTotal() {
        return total;
    }

    public Goods withTotal(Long total) {
        this.setTotal(total);
        return this;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", corpId=").append(corpId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", price=").append(price);
        sb.append(", total=").append(total);
        sb.append("]");
        return sb.toString();
    }
}
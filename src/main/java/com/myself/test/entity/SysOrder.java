package com.myself.test.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 类名称：SysOrder<br>
 * 类描述：<br>
 * 创建时间：2020年01月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Entity
@Table(name = "sys_order", schema = "test", catalog = "")
public class SysOrder {
    private Long id;
    private Long productId;
    private BigDecimal productPrice;
    private Timestamp createTime;
    private Long createBy;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "order-id")
    @GenericGenerator(name = "order-id", strategy = "com.myself.test.common.CustomIDGenerator")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_id", nullable = true)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_price", nullable = true, precision = 2)
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_by", nullable = true)
    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysOrder sysOrder = (SysOrder) o;
        return id == sysOrder.id &&
                Objects.equals(productId, sysOrder.productId) &&
                Objects.equals(productPrice, sysOrder.productPrice) &&
                Objects.equals(createTime, sysOrder.createTime) &&
                Objects.equals(createBy, sysOrder.createBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, productPrice, createTime, createBy);
    }
}

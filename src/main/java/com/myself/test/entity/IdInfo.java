package com.myself.test.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 类名称：IdInfo<br>
 * 类描述：<br>
 * 创建时间：2020年01月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Entity
@Table(name = "id_info", schema = "test", catalog = "")
public class IdInfo {
    private int id;
    private String name;
    private String num;
    private Timestamp createTime;
    private Integer createBy;
    private Timestamp updateTime;
    private Integer updateBy;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "num")
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_by")
    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "update_by")
    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdInfo idInfo = (IdInfo) o;
        return id == idInfo.id &&
                Objects.equals(name, idInfo.name) &&
                Objects.equals(num, idInfo.num) &&
                Objects.equals(createTime, idInfo.createTime) &&
                Objects.equals(createBy, idInfo.createBy) &&
                Objects.equals(updateTime, idInfo.updateTime) &&
                Objects.equals(updateBy, idInfo.updateBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, num, createTime, createBy, updateTime, updateBy);
    }
}

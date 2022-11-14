package com.texonic.empsystm.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "sa_client")
public class SaClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sa_client_id", nullable = false)
    private Integer id;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

    @Column(name = "created", nullable = false)
    private Instant created;

    @Column(name = "name", length = 150)
    private String name;

    @Column(name = "phone_no", length = 15)
    private String phoneNo;

    @Column(name = "remark", length = 250)
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
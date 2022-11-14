package com.texonic.empsystm.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "sa_contact_number")
public class SaContactNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sa_contact_number_id", nullable = false)
    private Integer id;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

    @Column(name = "created", nullable = false)
    private Instant created;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "sa_employeer_id")
//    private SaEmployee saEmployeer;

    @Column(name = "contact_number", length = 15)
    private String contactNumber;

    @Column(name = "is_default")
    private Boolean isDefault;

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

//    public SaEmployee getSaEmployeer() {
//        return saEmployeer;
//    }
//
//    public void setSaEmployeer(SaEmployee saEmployeer) {
//        this.saEmployeer = saEmployeer;
//    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
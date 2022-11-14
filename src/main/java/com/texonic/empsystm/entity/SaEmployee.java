package com.texonic.empsystm.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Data
@Table(name = "sa_employee")
public class SaEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sa_employeer_id", nullable = false)
    private Integer id;

    public SaEmployee() {
    }

    public SaEmployee(Integer id, SaClient saClient, Boolean isActive, Instant created, String firstName, String lastName, String nicNo, LocalDate dateOfBirth, String email, String remark) {
        this.id = id;
        this.saClient = saClient;
        this.isActive = isActive;
        this.created = created;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nicNo = nicNo;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.remark = remark;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sa_client_id", nullable = false)
    private SaClient saClient;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

    @Column(name = "created", nullable = false)
    private Instant created;

    @Column(name = "first_name", length = 250)
    private String firstName;

    @Column(name = "last_name", length = 250)
    private String lastName;

    @Column(name = "nic_no", length = 20)
    private String nicNo;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "remark", length = 250)
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SaClient getSaClient() {
        return saClient;
    }

    public void setSaClient(SaClient saClient) {
        this.saClient = saClient;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

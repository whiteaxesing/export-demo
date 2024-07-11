package com.export.export_demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.LocalDate;

@Entity
public class Exporter {

    @Id
    private String identification;

    private String status;
    private String identificationType;
    private String name;

    @Version
    private int version;

    private LocalDate acceptance;
    private LocalDate expiration;
    private int province;
    private int canton;
    private int district;
    private String email;
    private String sector;

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public LocalDate getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(LocalDate acceptance) {
        this.acceptance = acceptance;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getCanton() {
        return canton;
    }

    public void setCanton(int canton) {
        this.canton = canton;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}

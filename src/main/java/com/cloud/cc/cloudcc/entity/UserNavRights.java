package com.cloud.cc.cloudcc.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserNavRights {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean fileImportMaster;
    private boolean processMaster;
    private boolean campaignMaster;
    private boolean monitoringPanel;
    private boolean billingMaster;
}

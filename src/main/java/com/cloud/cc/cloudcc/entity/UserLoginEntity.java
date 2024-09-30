package com.cloud.cc.cloudcc.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_login")
public class UserLoginEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String uname;
    private String upass;
    private String uid;
    private String name;
    private String phoneno;
    private String emailId;
    private String company;
    private String city;
    private String address;
    private String profile;
    private String role;
    private String pic;
    private String gender;
    private String resellerId;
    private String adminId;
    private String subAdminId;
    private String agentId;
    private boolean status;
    private String createdDate;
    private String createdBy;
    private String modifiedDate;
    private String modifiedBy;
    private String modifyCount;
    @OneToOne(cascade = CascadeType.ALL)
    private UserRights uRights;
    @OneToOne(cascade = CascadeType.ALL)
    private UserNavRights uNavRights;
}

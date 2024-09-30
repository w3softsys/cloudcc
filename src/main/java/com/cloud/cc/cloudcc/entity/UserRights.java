package com.cloud.cc.cloudcc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class UserRights {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean canView;
    private boolean canDelete;
    private boolean canEdit;
    private boolean canCreate;
    private String rightsBy;
    private String rightsDate;
   


}

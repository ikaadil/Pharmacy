package com.example.Pharmacy.model;

import com.example.Pharmacy.enums.Status;
import com.sun.corba.se.spi.ior.ObjectId;



import java.io.Serializable;


public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 8571261118900116242L;


    private ObjectId id;
    private Status status = Status.V;
    private String createDate;
    private String updateDate;
    private String createdBy = "system";
    private String updatedBy;
    private ObjectId createActionId;
    private ObjectId lastUpdateActionId;

    public BaseEntity() {
    }


    public ObjectId getObjectId() {
        return id;
    }

    public void setId(final ObjectId id) {
        this.id = id;
    }




    public boolean isValid() {
        return status == Status.V ? true : false;
    }


    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }


    public ObjectId getCreateActionId() {
        return createActionId;
    }

    public void setCreateActionId(ObjectId createActionId) {
        this.createActionId = createActionId;
    }

    public ObjectId getLastUpdateActionId() {
        return lastUpdateActionId;
    }

    public void setLastUpdateActionId(ObjectId lastUpdateActionId) {
        this.lastUpdateActionId = lastUpdateActionId;
    }
}


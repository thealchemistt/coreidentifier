package com.example.coreidentifier.model;

public class PreSignRequest {

    private String uniqueIdentifier;
    private String templateId;
    private TypeOfModification typeOfModification;
    private String oldData;
    private String newModifiedData;

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TypeOfModification getTypeOfModification() {
        return typeOfModification;
    }

    public void setTypeOfModification(TypeOfModification typeOfModification) {
        this.typeOfModification = typeOfModification;
    }

    public String getOldData() {
        return oldData;
    }

    public void setOldData(String oldData) {
        this.oldData = oldData;
    }

    public String getNewModifiedData() {
        return newModifiedData;
    }

    public void setNewModifiedData(String newModifiedData) {
        this.newModifiedData = newModifiedData;
    }
}

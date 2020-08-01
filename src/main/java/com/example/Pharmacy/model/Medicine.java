package com.example.Pharmacy.model;

public class Medicine extends BaseEntity {
    private String name;
    private String companyName;
    private String description;
    private String groupName;
    private int rowNumber;
    private int columnNumber;
    private int count;

    public Medicine() {
    }

    public Medicine(String name, String companyName, String description, String groupName, int rowNumber, int columnNumber, int count) {
        this.name = name;
        this.companyName = companyName;
        this.description = description;
        this.groupName = groupName;
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

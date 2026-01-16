package com.equipapp.model;

import java.time.LocalDate;

public class EquipmentModel {

    private int equipmentId;
    private String equipmentName;
    private String category;
    private String condition;
    private boolean available;

    private int borrowerStudentId;
    private String borrowerName;
    private String borrowerPhone;
    private String borrowerDepartment;

    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public EquipmentModel() {
        this.available = true;
    }

    public EquipmentModel(int equipmentId, String equipmentName, String category, String condition, boolean available,
                          int borrowerStudentId, String borrowerName, String borrowerPhone, String borrowerDepartment,
                          LocalDate issueDate, LocalDate dueDate, LocalDate returnDate) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.category = category;
        this.condition = condition;
        this.available = available;
        this.borrowerStudentId = borrowerStudentId;
        this.borrowerName = borrowerName;
        this.borrowerPhone = borrowerPhone;
        this.borrowerDepartment = borrowerDepartment;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getBorrowerStudentId() {
        return borrowerStudentId;
    }

    public void setBorrowerStudentId(int borrowerStudentId) {
        this.borrowerStudentId = borrowerStudentId;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getBorrowerPhone() {
        return borrowerPhone;
    }

    public void setBorrowerPhone(String borrowerPhone) {
        this.borrowerPhone = borrowerPhone;
    }

    public String getBorrowerDepartment() {
        return borrowerDepartment;
    }

    public void setBorrowerDepartment(String borrowerDepartment) {
        this.borrowerDepartment = borrowerDepartment;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}

package com.equipapp.util;

import java.util.regex.Pattern;

public class ValidationUtil {

    private static final Pattern ID_PATTERN =
            Pattern.compile("^\\d+$");

    private static final Pattern NAME_PATTERN =
            Pattern.compile("^[a-zA-Z\\s]+$");

    private static final Pattern CATEGORY_PATTERN =
            Pattern.compile("^[a-zA-Z\\s]+$");

    private static final Pattern CONDITION_PATTERN =
            Pattern.compile("^[a-zA-Z\\s]+$");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("^\\+?[0-9]{7,15}$");

    private static final Pattern DEPARTMENT_PATTERN =
            Pattern.compile("^[a-zA-Z\\s]+$");

    private static final Pattern DATE_PATTERN =
            Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean isValidEquipmentId(String equipmentId) {
        return !isNullOrEmpty(equipmentId)
                && ID_PATTERN.matcher(equipmentId).matches()
                && Integer.parseInt(equipmentId) > 0;
    }

    public static boolean isValidEquipmentName(String equipmentName) {
        return !isNullOrEmpty(equipmentName)
                && NAME_PATTERN.matcher(equipmentName).matches();
    }

    public static boolean isValidCategory(String category) {
        return !isNullOrEmpty(category)
                && CATEGORY_PATTERN.matcher(category).matches();
    }

    public static boolean isValidCondition(String condition) {
        return !isNullOrEmpty(condition)
                && CONDITION_PATTERN.matcher(condition).matches();
    }

    public static boolean isValidBorrowerStudentId(String studentId) {
        return !isNullOrEmpty(studentId)
                && ID_PATTERN.matcher(studentId).matches()
                && Integer.parseInt(studentId) > 0;
    }

    public static boolean isValidBorrowerName(String borrowerName) {
        return !isNullOrEmpty(borrowerName)
                && NAME_PATTERN.matcher(borrowerName).matches();
    }

    public static boolean isValidBorrowerPhone(String phone) {
        return !isNullOrEmpty(phone)
                && PHONE_PATTERN.matcher(phone).matches();
    }

    public static boolean isValidBorrowerDepartment(String department) {
        return !isNullOrEmpty(department)
                && DEPARTMENT_PATTERN.matcher(department).matches();
    }

    public static boolean isValidDate(String yyyyMmDd) {
        return !isNullOrEmpty(yyyyMmDd)
                && DATE_PATTERN.matcher(yyyyMmDd).matches();
    }

    public static boolean isValidProductId(String text) {
        return isValidEquipmentId(text);
    }

    public static boolean isValidCustomerName(String text) {
        return isValidBorrowerName(text);
    }

    public static boolean isValidAddress(String text) {
        return !isNullOrEmpty(text);
    }
}

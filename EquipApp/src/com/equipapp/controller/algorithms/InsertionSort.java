package com.equipapp.controller.algorithms;

import com.equipapp.model.EquipmentModel;
import java.util.List;

public class InsertionSort {

    public static void sortByBorrowerStudentIdAscending(List<EquipmentModel> list) {
        int n = list.size();

        for (int i = 1; i < n; i++) {
            EquipmentModel key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).getBorrowerStudentId() > key.getBorrowerStudentId()) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    public static void sortByBorrowerStudentIdDescending(List<EquipmentModel> list) {
        int n = list.size();

        for (int i = 1; i < n; i++) {
            EquipmentModel key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).getBorrowerStudentId() < key.getBorrowerStudentId()) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
}

package com.equipapp.controller.algorithms;

import com.equipapp.model.EquipmentModel;
import java.util.List;

public class SelectionSort {

    public static void sortByEquipmentIdAscending(List<EquipmentModel> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getEquipmentId() < list.get(minIndex).getEquipmentId()) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                EquipmentModel temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }

    public static void sortByEquipmentIdDescending(List<EquipmentModel> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getEquipmentId() > list.get(maxIndex).getEquipmentId()) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                EquipmentModel temp = list.get(i);
                list.set(i, list.get(maxIndex));
                list.set(maxIndex, temp);
            }
        }
    }
}

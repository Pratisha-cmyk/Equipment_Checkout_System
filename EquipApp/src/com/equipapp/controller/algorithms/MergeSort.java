package com.equipapp.controller.algorithms;

import com.equipapp.model.EquipmentModel;
import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void sortByEquipmentName(List<EquipmentModel> list) {
        if (list.size() < 2) {
            return;
        }

        int mid = list.size() / 2;

        List<EquipmentModel> left = new ArrayList<>(list.subList(0, mid));
        List<EquipmentModel> right = new ArrayList<>(list.subList(mid, list.size()));

        sortByEquipmentName(left);
        sortByEquipmentName(right);

        merge(list, left, right);
    }

    private static void merge(List<EquipmentModel> list, List<EquipmentModel> left, List<EquipmentModel> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {

            String leftName = left.get(i).getEquipmentName();
            String rightName = right.get(j).getEquipmentName();

            if (leftName.compareToIgnoreCase(rightName) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }
}

package com.equipapp.controller.algorithms;

import com.equipapp.model.EquipmentModel;
import java.util.List;

public class BinarySearch {

    public static EquipmentModel searchByEquipmentName(
            List<EquipmentModel> equipmentList,
            String equipmentName) {

        int left = 0;
        int right = equipmentList.size() - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            String midName = equipmentList.get(mid).getEquipmentName();

            int compare = midName.compareToIgnoreCase(equipmentName);

            if (compare == 0) {
                return equipmentList.get(mid);
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}

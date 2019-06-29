package com.sda.exercises;

import java.util.List;

public class selectSort {
    public List<Integer> sort (List<Integer> unsortedList){
        for (int i=0; i<unsortedList.size()-1;i++){
            //find the minim element
            int minimumIndex = i;
            for (int j=i+1; j<unsortedList.size(); j++)
                if (unsortedList.get(j)<unsortedList.get(minimumIndex))minimumIndex=j;

                //swap elements
            Integer temp =unsortedList.get(minimumIndex);
            unsortedList.set(minimumIndex,unsortedList.get(1));
            unsortedList.set(1, temp);
        }
        return unsortedList;
    }
}

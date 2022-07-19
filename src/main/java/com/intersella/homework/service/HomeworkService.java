package com.intersella.homework.service;

import com.intersella.homework.controller.HomeworkForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

@Service
public class HomeworkService {
    public String calculation(HomeworkForm form) {
        StringBuilder sb = new StringBuilder();

        int bill = form.getBillAmount();
        ArrayList<Integer> amountList = (ArrayList<Integer>) form.getAmountList();
        ArrayList<Integer> countList = (ArrayList<Integer>) form.getCountList();

        TreeMap<Integer, Integer> amountCountMap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < amountList.size(); i++) {
            amountCountMap.put(amountList.get(i), countList.get(i));
        }

        return "4";
    }
}

package com.intersella.homework.controller;

import java.util.List;

public class HomeworkForm {
    Integer billAmount;
    List<Integer> amountList;
    List<Integer> countList;

    public Integer getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Integer billAmount) {
        this.billAmount = billAmount;
    }

    public List<Integer> getAmountList() {
        return amountList;
    }

    public void setAmountList(List<Integer> amountList) {
        this.amountList = amountList;
    }

    public List<Integer> getCountList() {
        return countList;
    }

    public void setCountList(List<Integer> countList) {
        this.countList = countList;
    }
}

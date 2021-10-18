package com.company1.Day11AndDay12Problems.stock;

public class NodeForCompanyShare {
    int data;
    String companyName;
    NodeForCompanyShare next;

    public NodeForCompanyShare(int data, String companyName) {
        this.data=data;
        this.next=null;
        this.companyName=companyName;
    }
}

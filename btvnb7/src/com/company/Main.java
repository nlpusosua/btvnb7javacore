package com.company;

public class Main {

    public static void main(String[] args) {
        SvBiz svBiz = new SvBiz("THANG","bán hàng",8,9);
        SvIt svIt = new SvIt("tu","it",5,6,7);
        svBiz.printInfor();
        svIt.printInfor();


    }
}

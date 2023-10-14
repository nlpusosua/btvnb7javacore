package com.company;

public class SvBiz extends SinhVienTechMaster{
    private double marketing;
    private double sale;
    @Override
    public double getScore() {
        return (2*marketing + sale)/3;
    }

    public SvBiz(String name, String major, double marketing, double sale) {
        super(name, major);
        this.marketing = marketing;
        this.sale = sale;
    }
}

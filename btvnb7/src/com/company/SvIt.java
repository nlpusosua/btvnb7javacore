package com.company;

public class SvIt extends SinhVienTechMaster{
    private double html;
    private double css;
    private double java;

    @Override
    public double getScore() {
        return (2*java +html+css)/4;
    }

    public SvIt(String name, String major, double html, double css, double java) {
        super(name, major);
        this.html = html;
        this.css = css;
        this.java = java;
    }
}

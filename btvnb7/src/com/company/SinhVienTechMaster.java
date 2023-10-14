package com.company;

public abstract class SinhVienTechMaster {
    private String name;
    private String major;

    public abstract double getScore();
    public String classification(){
        if  (getScore()<5)
            return "Yeu";
        else if(getScore()<6.5 && getScore()>=5)
            return "TB";
        else if (getScore()>6.5 && getScore()<8)
            return "Khá";
        else return "Gioi";
    }

    public SinhVienTechMaster(String name, String major) {
        this.name = name;
        this.major = major;
    }
    public void printInfor(){
        System.out.println("học sinh: "+name+" chuyên nghành: "+major+" score: "+getScore()+" classify: "+classification());
    }
}

package com.example.attendance;

public class DataShop {
    private String txt1,txt2,txt3,txtMonHoc;

    public DataShop(String txt1, String txt2, String txt3, String txtMonHoc) {
        this.txt1 = txt1;
        this.txt2 = txt2;
        this.txt3 = txt3;
        this.txtMonHoc = txtMonHoc;
    }

    public String getTxtMonHoc() {
        return txtMonHoc;
    }

    public void setTxtMonHoc(String txtMonHoc) {
        this.txtMonHoc = txtMonHoc;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }
}

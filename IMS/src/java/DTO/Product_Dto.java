
package DTO;

public class Product_Dto
{
    int pcode, pprice, pquanity, kitcode;
    String pname, pimg;

    public Product_Dto( int pcode, int pprice, int pquanity, int kitcode, String pname, String pimg) {
        this.pcode = pcode;
        this.pprice = pprice;
        this.pquanity = pquanity;
        this.kitcode = kitcode;
        this.pname = pname;
        this.pimg = pimg;
    }

    public Product_Dto(String pname, int pcode, String pimg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public int getPprice() {
        return pprice;
    }

    public void setPprice(int pprice) {
        this.pprice = pprice;
    }

    public int getPquanity() {
        return pquanity;
    }

    public void setPquanity(int pquanity) {
        this.pquanity = pquanity;
    }

    public int getKitcode() {
        return kitcode;
    }

    public void setKitcode(int kitcode) {
        this.kitcode = kitcode;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg;
    }
    
    
    
}

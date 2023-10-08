package DTO;

public class Supplier_Dto 
{
    String sname, mobile, email, address;
    int sid;

    public Supplier_Dto() {
    }

    public Supplier_Dto(String sname, String mobile, String email, String address, int sid) {
        this.sname = sname;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.sid = sid;
    }

    public Supplier_Dto(String sname, int scode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
    
    
    
}

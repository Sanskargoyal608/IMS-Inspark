package DTO;

public class Customer_Dto
{
    String cname, mobile, email, address;
    int ccode;

    public Customer_Dto() {
    }

    public Customer_Dto(String cname, String mobile, String email, String address, int ccode) {
        this.cname = cname;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.ccode = ccode;
    }

    public Customer_Dto(String cname, int ccode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
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

    public int getCcode() {
        return ccode;
    }

    public void setCcode(int ccode) {
        this.ccode = ccode;
    }
    

    
}

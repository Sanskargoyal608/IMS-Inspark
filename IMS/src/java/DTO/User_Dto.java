package DTO;

public class User_Dto
{
    String uname,uimg,upass,mobile,email,position,address;
    int uid,type;

    public User_Dto() {
    }

    public User_Dto(String uname, String uimg, String upass, String mobile, String email, String position, String address, int uid, int type) {
        this.uname = uname;
        this.uimg = uimg;
        this.upass = upass;
        this.mobile = mobile;
        this.email = email;
        this.position = position;
        this.address = address;
        this.uid = uid;
        this.type = type;
    }
    
    

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    
    
}

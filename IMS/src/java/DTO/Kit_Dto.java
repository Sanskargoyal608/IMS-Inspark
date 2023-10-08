package DTO;

public class Kit_Dto 
{
    int kitcode;
    String kitname;

    public Kit_Dto() {
    }

    public Kit_Dto(int kitcode, String kitname) {
        this.kitcode = kitcode;
        this.kitname = kitname;
    }

    public int getKitcode() {
        return kitcode;
    }

    public void setKitcode(int kitcode) {
        this.kitcode = kitcode;
    }

    public String getKitname() {
        return kitname;
    }

    public void setKitname(String kitname) {
        this.kitname = kitname;
    }
    
}

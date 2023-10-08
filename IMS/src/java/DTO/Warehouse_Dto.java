package DTO;

public class Warehouse_Dto
{
    String wname, location;
    int wcode;

    public Warehouse_Dto() {
    }

    public Warehouse_Dto(String wname, String location, int wcode) {
        this.wname = wname;
        this.location = location;
        this.wcode = wcode;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWcode() {
        return wcode;
    }

    public void setWcode(int wcode) {
        this.wcode = wcode;
    }
    
}

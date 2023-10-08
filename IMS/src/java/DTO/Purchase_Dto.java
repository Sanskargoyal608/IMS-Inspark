package DTO;

import java.sql.Date;

public class Purchase_Dto 
{
    int purchaseid, scode, pcode, purchase_quantity, price;
    Date pdate;

    public Purchase_Dto() {
    }

    public Purchase_Dto(int purchaseid, int scode, int pcode, int purchase_quantity, int price, Date pdate) {
        this.purchaseid = purchaseid;
        this.scode = scode;
        this.pcode = pcode;
        this.purchase_quantity = purchase_quantity;
        this.pdate = pdate;
        this.price = price;
    }

    public int getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(int purchaseid) {
        this.purchaseid = purchaseid;
    }

    public int getScode() {
        return scode;
    }

    public void setScode(int scode) {
        this.scode = scode;
    }

    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public int getPurchase_quantity() {
        return purchase_quantity;
    }

    public void setPurchase_quantity(int purchase_quantity) {
        this.purchase_quantity = purchase_quantity;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
        
}

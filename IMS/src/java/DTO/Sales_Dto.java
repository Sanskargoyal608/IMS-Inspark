package DTO;

import java.sql.Date;

public class Sales_Dto
{
    int salescode, pcode, ccode, sales_quantity, revenue;
    Date sdate;

    public Sales_Dto() {
    }

    public Sales_Dto(int salescode, int pcode, int ccode, int sales_quantity,int revenue, Date sdate) {
        this.salescode = salescode;
        this.pcode = pcode;
        this.ccode = ccode;
        this.sales_quantity = sales_quantity;
        this.sdate = sdate;
        this.revenue = revenue;
    }

    public int getSalescode() {
        return salescode;
    }

    public void setSalescode(int salescode) {
        this.salescode = salescode;
    }

    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public int getCcode() {
        return ccode;
    }

    public void setCcode(int ccode) {
        this.ccode = ccode;
    }

    public int getSales_quantity() {
        return sales_quantity;
    }

    public void setSales_quantity(int sales_quantity) {
        this.sales_quantity = sales_quantity;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ACER
 */
public class Voucher{
    
    private Integer id;
    
    private String nameVoucher;
    
    private Integer price;

    public Voucher(String nameVoucher, Integer price) {
        this.nameVoucher = nameVoucher;
        this.price = price;
    }

        public Voucher(int id,String nameVoucher, Integer price) {
        this.id = id;
        this.nameVoucher = nameVoucher;
        this.price = price;
    }
    public Voucher() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameVoucher() {
        return nameVoucher;
    }

    public void setNameVoucher(String nameVoucher) {
        this.nameVoucher = nameVoucher;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

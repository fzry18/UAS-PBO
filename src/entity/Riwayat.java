/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ACER
 */
public class Riwayat{
    
    private Integer id;
    private String nameRiwayat;
    private Integer price;
    private String date;

    public Riwayat(String nameRiwayat, Integer price) {
        this.nameRiwayat = nameRiwayat;
        this.price = price;
    }

    public Riwayat(int id,String nameRiwayat, Integer price) {
        this.id = id;
        this.nameRiwayat = nameRiwayat;
        this.price = price;
    }
    
    public Riwayat() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameRiwayat() {
        return nameRiwayat;
    }

    public void setNameRiwayat(String nameRiwayat) {
        this.nameRiwayat = nameRiwayat;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    
    public String getDate() {
        return date;
    }
}

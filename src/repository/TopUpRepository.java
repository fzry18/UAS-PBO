/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Voucher;

/**
 *
 * @author ACER
 */
public interface TopUpRepository {
   
   public Voucher[] getAll();
   
   public void add(Voucher voucher);
   
   public void change(Voucher voucher);
   
   public boolean remove(Integer number);
//    boolean isExists(Integer number);
}

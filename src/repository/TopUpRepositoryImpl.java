/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Voucher;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import util.DatabaseUtil;

/**
 *
 * @author ACER
 */
public class TopUpRepositoryImpl implements TopUpRepository{

    private static DatabaseUtil DatabaseUtil;

    public TopUpRepositoryImpl(DatabaseUtil DatabaseUtil) {
        this.DatabaseUtil = DatabaseUtil;
    }
    
   

    @Override
    public void add(Voucher voucher) {
        String sql = "INSERT INTO voucher(nama, harga) VALUES (?,?)";

        try {
            Connection connection = DatabaseUtil.connect();
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, voucher.getNameVoucher());
            statement.setInt(2, voucher.getPrice());
            statement.executeUpdate();
        } catch (SQLException exception) {
          throw new RuntimeException(exception);
        }
    }
  
    @Override
    public void change(Voucher voucher) {
        String sql = "UPDATE `voucher` SET `nama`= ?, `harga`=? WHERE id = ?";
        
        try {
            Connection connection = DatabaseUtil.connect();
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, voucher.getNameVoucher());
            statement.setInt(2, voucher.getPrice());
            statement.setInt(3, voucher.getId());
            statement.executeUpdate();
        } catch (SQLException exception) {
          throw new RuntimeException(exception);
        }
    }   
    
    public boolean isExists(Integer number) {
        String sql = "SELECT id FROM voucher WHERE id = ?";
    try (Connection connection = DatabaseUtil.connect();
         PreparedStatement statement = connection.prepareStatement(sql)) {
         statement.setInt(1, number);

      try (ResultSet resultSet = statement.executeQuery()) {
        if (resultSet.next()) {
          return true;
        } else {
          return false;
        }
      }

    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
    }
    
    @Override
    public boolean remove(Integer number) {
        if (isExists(number)) {
        String sql = "DELETE FROM voucher WHERE id = ?";
      try (Connection connection = DatabaseUtil.connect();
           PreparedStatement statement = connection.prepareStatement(sql)) {
           statement.setInt(1, number);
           statement.executeUpdate();

           return true;
      } catch (SQLException exception) {
        throw new RuntimeException(exception);
      }
    } else {
      return false;
    }
  }

    @Override
    public Voucher[] getAll() {
    
        String sql = "SELECT id, nama, harga FROM voucher";
    try (Connection connection = DatabaseUtil.connect();
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(sql)) {

      List<Voucher> list = new ArrayList<>();
      while(resultSet.next()){
        Voucher voucher = new Voucher();
        voucher.setId(resultSet.getInt("id"));
        voucher.setNameVoucher(resultSet.getString("nama"));
        voucher.setPrice(resultSet.getInt("harga"));

        list.add(voucher);
      }

      return list.toArray(new Voucher[]{});
    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lasalle.services.controller;
import org.lasalle.services.model.Car;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControllerCar {
    
    public void saveCar(Car car) throws SQLException{
        String query = "INSERT INTO car VALUES (?,?,?,?,?,?,?)";
        ConexionMysql connMysql = new ConexionMysql();
        Connection conn = connMysql.open();
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setInt(1,0);
        pstm.setString(2, car.getColor());
        pstm.setString(3, car.getModel());
        pstm.setString(4, car.getBrand());
        pstm.setString(5, car.getPlate());
        pstm.setInt(6, car.getYear());
        pstm.setInt(7, car.getOwner().getIdOwner());
        pstm.execute();
        pstm.close();
        connMysql.close();
        conn.close();
    }
}

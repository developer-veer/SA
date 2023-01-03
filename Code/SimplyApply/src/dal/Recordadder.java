/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.dto.InstitueDTO;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;
/**
 *
 * @author laiba
 */
public class Recordadder {

    
    void SaveInstitute(InstitueDTO ins, Response objResponse,Connection dbConnection){
     try{
            PreparedStatement p = dbConnection.prepareStatement("INSERT INTO EMployees (NameOFInstitute,OenerName ,Address,ContactNO,Email,InstituteType)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?);");
            p.setString(1, ins.NameOfInstitute);
            p.setString(2, ins.OwnerName);
            p.setString(3, ins.Address);
            p.setString(4, ins.ContactNo);
            p.setString(5, ins.Email);
            p.setString(6, ins.InstituteType);
          
            
            int rowsInserted = p.executeUpdate();
            if(rowsInserted > 0){
               objResponse.messagesList.add(new Message("Employee added successfully.", MessageType.Information));
            }
        }catch(SQLException e){
            objResponse.messagesList.add(new Message(" Failed to add Institute, Please try again.", MessageType.Error));
    
        }
    }

    void saveInstitute(InstitueDTO ins, Response objResponse, Connection dbConnection) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


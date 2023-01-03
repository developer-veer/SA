/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.DALManager;
import dal.RecordMapper;
import dal.Recordadder;
import dal.RecordsModifier;
import model.dto.Response;

/**
 *
 * @author mc
 */
public class SAFactory {
    
  public  static RecordsModifier getInstanceOfModifier()
    {
        return new RecordsModifier();
    }
  
   public static SAController getInstanceOfSMSController() {
        return new SAController();
    }

    
static Response getResponseInstance() {
        return new Response();
    }

    static objDAL getInstanceOfDALManager() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    public static Recordadder getInstanceOfAdder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.DALManager;
import dal.RecordMapper;
import dal.RecordsModifier;

/**
 *
 * @author mc
 */
public class SAFactory {
    
  public  static RecordsModifier getInstanceOfModifier()
    {
        return new RecordsModifier();
    }
    
}

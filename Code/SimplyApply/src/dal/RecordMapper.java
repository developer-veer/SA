/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.dto.InstitueDTO;

/**
 *
 * @author mc
 */
public class RecordMapper {
    
      ArrayList<InstitueDTO> getEmployees(ResultSet rs) {
        ArrayList<InstitueDTO> emplist = new ArrayList<>();
        try{
            
        while (rs.next())
            {
                InstitueDTO objInstitute=new InstitueDTO();                
              
                objInstitute.Id = rs.getString(1);
                 objInstitute.Name = rs.getString(2);
                  objInstitute.OwnerName = rs.getString(4);
                  objInstitute.Type = rs.getString(3);
                   objInstitute.RegKey = rs.getString(5);
                
                emplist.add(objInstitute);
            }
        }catch (Exception e){
        }
        return emplist;
    }
}

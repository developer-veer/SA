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
              
                objInstitute.Address = rs.getString(1);
                 objInstitute.NameOfInstitute = rs.getString(2);
                  objInstitute.OwnerName = rs.getString(4);
                  objInstitute.InstituteType = rs.getString(3);
                   objInstitute.ContactNo = rs.getString(5);
                   objInstitute.Email = rs.getString(6);
                   
                
                emplist.add(objInstitute);
            }
        }catch (Exception e){
        }
        return emplist;
    }
}

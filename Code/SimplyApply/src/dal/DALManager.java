/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.Connection;
import java.util.ArrayList;
import model.dto.InstitueDTO;
import dal.DBReader;
import dal.RecordMapper;
import dal.RecordsModifier;
import java.sql.ResultSet;
import model.SAFactory;
/**
 *
 * @author mc
 */
public class DALManager {
    
    IConnection objConnection ;
    DBReader objReader;
    RecordMapper objMapper;
    RecordsModifier objModifier;
    
    public DALManager(RecordMapper mapper)
    {
        objConnection = new SQLConnection("sa","master", "sa","root048");
        objReader = new DBReader();
         this.objMapper=mapper;
       objModifier = SAFactory.getInstanceOfModifier();
    } 
    
    public ArrayList<InstitueDTO> getEmployeesList(String searchKey)
    {
            Connection  dbConnection = objConnection.getConnection();
           String viewEmployeesQuery = "Select * from Employees";
           
            if(searchKey == null || searchKey.length() > 0)
        {
            viewEmployeesQuery += " where FirstName LIKE '%"+searchKey+"%' OR LastName LIKE '%"+searchKey+"%' OR Title LIKE '%"+searchKey+"%';";
        }
            
            ResultSet rs = objReader.getRecords(viewEmployeesQuery, dbConnection);
           
           
        return objMapper.getEmployees(rs); 
    }    
    

    
    
}

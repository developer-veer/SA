/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.SAFactory;
import model.dto.InstitueDTO;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;

/**
 *
 * @author Mukhtiar
 */
public class DALManager {
    IConnection objConnection;
    DBReader objReader;
    RecordMapper objMapper;
    Recordadder objAdder;
    RecordsModifier objModifier;

    public DALManager(RecordMapper mapper){
    objConnection = new SQLConnection("sa","SimplyApply", "sa","123");
    objReader = new DBReader();
    objAdder = SAFactory.getInstanceOfAdder();
    this.objMapper=mapper;
    objModifier = SAFactory.getInstanceOfModifier();
    }
    public ArrayList<InstitueDTO> getEmployeesList(String searchKey) {
                
        Connection  dbConnection = objConnection.getConnection();
        String viewEmployeesQuery = "Select * from Employees";
        if(searchKey == null || searchKey.length() > 0)
        {
            viewEmployeesQuery += " where FirstName LIKE '%"+searchKey+"%' OR LastName LIKE '%"+searchKey+"%' OR Title LIKE '%"+searchKey+"%';";
        }
        ResultSet rs = objReader.getRecords(viewEmployeesQuery, dbConnection);
        return objMapper.getEmployees(rs);        
    }  

    public void saveInstitute(InstitueDTO ins, Response objResponse) {
        try{
            Connection  dbConnection = objConnection.getConnection();
            objAdder.saveInstitute(ins,objResponse,dbConnection);            
        }catch(Exception e){
        objResponse.messagesList.add(new Message("Ooops! Failed to create employee, Please contact support that there an issue while saving new employee.", MessageType.Error));
        objResponse.messagesList.add(new Message(e.getMessage() + "\n Stack Track:\n"+e.getStackTrace(), MessageType.Exception));
        }
    }

    

  
    
}

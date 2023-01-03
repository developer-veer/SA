/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import UI.admininterface.addinstitute;
import dal.DALManager;
import model.dto.InstitueDTO;
import model.dto.Response;


public class SAController {
    DALManager  objDAL;
    public SAController(){
    
    }

    
       public Response addEmployee(InstitueDTO objEmp) {
        Response objResponse = SAFactory.getResponseInstance();
        CommonValidator.validateEmployee(objEmp,objResponse);
        if(objResponse.isSuccessfull()){
            objDAL.saveInstitute(objEmp,objResponse);
        }
        return objResponse;
    }

    public static Response addInstituteins() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response addInstituteins(InstitueDTO ins) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    addinstitute uiInstitute;
    SAController objController;
    
    SAController(addinstitute aThis, SAController oController) {
        initComponents();
        this.uiInstitute = aThis;
        this.objController = oController;
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class CommonValidator {

        private static void validateEmployee(InstitueDTO objEmp, Response objResponse) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    
    }
  
    
    }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dto;

/**
 *
 * @author mc
 */
public class Message {

    public String Message;
    public MessageType Type;

    public Message(String errorMessage, MessageType messageType) {
        this.Message = errorMessage;
        this.Type = messageType;
    }

    public Message(String ooops_Failed_to_add_institute, boolean Error) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}

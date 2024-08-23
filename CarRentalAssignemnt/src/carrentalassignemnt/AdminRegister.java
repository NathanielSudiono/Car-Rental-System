/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalassignemnt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class AdminRegister {
    private String Username;
    private String Password;
    
    
    private String address;
    
    public AdminRegister(String username1, String password1){
        this.Username = username1;
        this.Password = password1;
        
    }
    public boolean verifyRegister(){
        boolean exist = false;
        try{                       
            BufferedWriter reg = new BufferedWriter( new FileWriter("RegisterAdmin.txt",true));
            reg.write(Username + ":" + Password + "\n");
            reg.close();
            exist = true;
            
        }catch(IOException e){
            
        }
        return exist;
    }
}

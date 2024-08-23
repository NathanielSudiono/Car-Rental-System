/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalassignemnt;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AdminLogin {
    private String Username, Password;
    
    public AdminLogin(String Username,String Password){
        this.Username = Username;
        this.Password = Password;
    }
    public Boolean verification(){
        boolean exist = false;
        if(Username.equals("Nathan")&&Password.equals("Bakmi")){
            exist = true;
        }
        
        return exist;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalassignemnt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ReadAdmin {
    private String username;
    private String password;
    
    public ReadAdmin(String Username1, String Password1){
        
    this.username = Username1;
    this.password = Password1;
    }
    
public boolean verifyAdmin(){
    boolean verify = false;
    File logn = new File("D:\\My APU stuff\\Year 2 APU sem 1\\assignment\\OODJ\\CarRentalAssignemnt\\CarRentalAssignemnt\\RegisterAdmin.txt");
    
    try(Scanner myReader = new Scanner(logn))
    {
        while(myReader.hasNextLine())
        {
            String[] data = myReader.nextLine().split(":");
            if(username.equals(data[0])&& password.equals(data[1]))
                verify = true;
            }
    }catch(FileNotFoundException ex){
        java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);   
    }
    return verify;
}
}

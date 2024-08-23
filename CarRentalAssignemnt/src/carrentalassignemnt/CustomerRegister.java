/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalassignemnt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CustomerRegister {
   private String Username;
    private String Password;
    private String Email;
    private String Phone;
    private String birth;
    private String address;
    
    public CustomerRegister(String username1, String password1, String Email1, String phone1,String birth1,String address1){
        this.Username = username1;
        this.Password = password1;
        this.Email = Email1;
        this.Phone = phone1;
        this.birth = birth1;        
        this.address = address1;
    }
    public boolean verifyRegister(){
        boolean exist = false;
        BufferedReader input;
        String filePath;
        
        
        try {
            filePath = new File("").getAbsolutePath();
            filePath = filePath.concat("\\RegisterCustomer.txt");
            //"D:\My APU stuff\Year 2 APU sem 1\assignment\OODJ\CarRentalAssignemnt\CarRentalAssignemnt\RegisterCustomer.txt"
            input = new BufferedReader(new FileReader(filePath));
            //validate if username exist in Customer.txt
            String record;
            String[] attributes;
            while((record = input.readLine()) != null){//`record` will be empty str after reading last record, have a look at "CarTable.java > CarTable()" to handle this problem
                attributes = record.split(":",6);
        
                if (Username.equals(attributes[0])){
                    //display warning msg if userName is duplicated
                    JOptionPane.showMessageDialog(null, "Username has been used by others!", "Duplicate username", JOptionPane.INFORMATION_MESSAGE);
                    exist = false;
                    return exist;
                }
            }
            input.close();
        } catch(IOException ex){
            System.out.println("Failed to check if username existed.");
            return false;
        } 
        try{            
                BufferedWriter reg = new BufferedWriter( new FileWriter("RegisterCustomer.txt",true));
            reg.write(Username + ":" + Password + ":" + Email + ":" + Phone + ":" + birth + ":" + address + "\n");
                reg.close();
            exist = true;
            
        }catch(IOException e){
            
        }
        

        return exist;
    }
}

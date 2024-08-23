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
public class CarBooking {
    private String CarNo;
    private String Brand;
    private String Startdate;
    private String Endday;
    private String Price;
    
    public CarBooking(String CarNo1, String Brand1, String startdate1,String endday1,String Price1){
        this.CarNo = CarNo1;
        this.Brand = Brand1;
        this.Startdate = startdate1;
        this.Endday = endday1;
        this.Price = Price1;
    }
    public boolean verifyBooking(){
        boolean exist = false;
        BufferedReader input;
        String filePath;
        
        try{
            filePath = new File("").getAbsolutePath();
            filePath = filePath.concat("\\BookCar.txt");
            input = new BufferedReader(new FileReader(filePath));
            String record;
            String[] attributes;
            while((record = input.readLine()) != null){
//`record` will be empty str after reading last record, have a look at "CarTable.java > CarTable()" to handle this problem
                attributes = record.split(":",5);
                //cari tau cara validasi bahwa datenya itu betulan date (validation if the date is date)
//                if (Startdate.equals(attributes[0])){
//                    //display warning msg if userName is duplicated
//                    JOptionPane.showMessageDialog(null, "Username has been used by others!", "Duplicate username", JOptionPane.INFORMATION_MESSAGE);
//                    exist = false;
//                    return exist;
//                }
                }
                input.close();
        }catch(IOException ex){
               System.out.println("Failed to check if username existed.");
            return false;
        }try{            
                BufferedWriter reg = new BufferedWriter( new FileWriter("BookCar.txt",true));
            reg.write(CarNo + ":" + Brand + ":" + Startdate + ":" + Endday + ":" + Price + ":" + "\n");
                reg.close();
            exist = true;
            
        }catch(IOException e){
            
         }
        return exist;
    }
}

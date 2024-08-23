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

/**
 *
 * @author HP
 */
public class RegisterCar {
    private String NumCar;
    private String Brand;
    private String Status;
    private String Price;
    
    public RegisterCar(String NumCar1, String Brand1, String Status1,String Price1){
        this.NumCar = NumCar1;
        this.Brand = Brand1;
        this.Status = Status1;
        this.Price = Price1;
    }
    public boolean verifyCarReg(){
        boolean exist = false;
        try{
            FileWriter reg = new FileWriter("CarRegister.txt",true);
            reg.write(NumCar);
                reg.write(":");
                reg.write(Brand);
                reg.write(":");
                reg.write(Status);
                reg.write(":");
                reg.write(Price);                
                reg.write("\n");
                reg.close();
        }catch(IOException e){
            
        }
        return exist;
    }
    
    
}

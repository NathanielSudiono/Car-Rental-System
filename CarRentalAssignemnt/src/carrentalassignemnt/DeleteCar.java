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
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DeleteCar {
    private String NumCar;
    private String Name;
    private String Brand;
    private String Status;
    private String Price;
    
    public DeleteCar(String NumCar1, String Name1, String Brand1, String Status1,String Price1){
        this.NumCar = NumCar1;
        this.Name = Name1;
        this.Brand = Brand1;
        this.Status = Status1;
        this.Price = Price1;
    }
    public boolean deleteCar(){
        boolean exist = false; 
        try {
            File file = new File("CarRegister.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String [] rec;
            Object [] allRec = br.lines().toArray();
            for (int i =0;i < allRec.length;i++){
                rec = allRec[i].toString().trim().split(":");
                
            }
            PrintWriter bw = new PrintWriter(new FileWriter(file));
            for(int i=0;i<allRec.length;i++){
                System.out.println("Rec["+i+"], "+allRec[i]);
                bw.write(allRec[i]+"\n");
            }
            bw.close();
            br.close();

        }    catch (Exception ex) {
            
        }
        return exist;
    }
    }
        
    
//String filepath,int positionTerm,String removeTerm
//        boolean exist = false; 
//        int position = positionTerm - 1;
//        String file = "RegisterCustomer.txt";
//        
//        String currentLine;
//        String data[];
//        try{
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw);
//            
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            
//            while((currentLine = br.readLine()) !=null){
//                data = currentLine.split(":");
//                if(!(data[position].equalsIgnoreCase(removeTerm))){
//                    pw.println(currentLine);
//                }
//            }
//            pw.flush();
//            pw.close();
//            fr.close();
//            br.close();
//            bw.close();
//            fw.close();
//        }
//        catch(Exception ex){
//            
//        }
//        return exist;
//    }    
//
//}

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
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class EditCar {
    private String NumCar;
    private String Brand;
    private String Status;
    private String Price;
    
    public EditCar(String NumCar1, String Brand1, String Status1,String Price1){
        this.NumCar = NumCar1;
        this.Brand = Brand1;
        this.Status = Status1;
        this.Price = Price1;
    }
    public boolean editCar(){
        boolean exist = false; 
        try {
            File file = new File("CarRegister.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String [] rec;
            Object [] allRec = br.lines().toArray();
            for (int i =0;i < allRec.length;i++){
                rec = allRec[i].toString().trim().split(":");
                
                if (rec[0].equals(NumCar)){
                    JOptionPane.showMessageDialog(null, "success");
                    rec[1] = Brand;
                    rec[2] = Status;
                    rec[3] = Price;
                    
                    String newrec="";
                    for(int j=0;j<rec.length;j++){
                        newrec = newrec+rec[j]+":";
                    }
                    allRec[i]= newrec;
                }
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

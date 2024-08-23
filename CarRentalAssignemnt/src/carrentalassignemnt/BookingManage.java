/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalassignemnt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class BookingManage {
    private String NumCar;
    private String Brand;
    private String StartDate;
    private String EndDate;
    private String Price;
    
    public BookingManage(String NumCar1, String brand1, String startdate1, String enddate1,String Price1){
        this.NumCar = NumCar1;
        this.Brand = brand1;
        this.StartDate = startdate1;
        this.EndDate = enddate1;
        this.Price = Price1;
    }
    public boolean editBooking(){
        boolean exist = false; 
        try {
            File file = new File("BookCar.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String [] rec;
            Object [] allRec = br.lines().toArray();
            for (int i =0;i < allRec.length;i++){
                rec = allRec[i].toString().trim().split(":");
                
                if (rec[0].equals(NumCar)){
                    JOptionPane.showMessageDialog(null, "success");
                    rec[1] = Brand;
                    rec[2] = StartDate;
                    rec[3] = EndDate;
                    rec[4] = Price;
                    
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
            exist = true;
            bw.close();
            br.close();

        }    catch (Exception ex) {
            
        }
        return exist;
    }
}

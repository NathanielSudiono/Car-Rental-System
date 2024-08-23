package carrentalassignemnt;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CustomerEdit {
    private String username;
    private String password;
    private String Email;
    private String Phone;
    private String birth;
    private String Address;
    public static ArrayList<CustomerEdit> allRec = new ArrayList<CustomerEdit>();
    
    public CustomerEdit(String Username1, String Password1,String Email1,String Phone1,String birth1,String Address1){
        
    this.username = Username1;
    this.password = Password1;
    this.Email = Email1;
    this.Phone = Phone1;
    this.birth = birth1;
    this.Address = Address1;
    
    }
    
    public static CustomerEdit verifyECustomer(){
        CustomerEdit d = null;
        try {
            Scanner scan = new Scanner(new File("RegisterCustomer.txt"));
            while (scan.hasNext()){
                String recs = scan.nextLine();
                String [] rec = recs.split(":");
                String username = rec[0];
                String password = rec[1];
                String Email = rec[2];
                String Phone = rec[3];
                String Birth = rec[4];
                String Address = rec[5];
                d = new CustomerEdit(username,password,Email,Phone,Birth,Address);
                System.out.println(username);
                allRec.add(d);
            }
        }    
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "File read error");
        }
        return d;
    }

    public void writeCustomer(){
        try{
            PrintWriter print = new PrintWriter("RegisterCustomer.txt");
            for(CustomerEdit d : allRec){
                print.write(d.getUsername());
                print.write(":");
                print.write(d.getPassword());
                print.write(":");
                print.write(d.getEmail());
                print.write(":");
                print.write(d.getPhone());
                print.write(":");
                print.write(d.getBirth());
                print.write(":");
                print.write(d.getAddress());
                print.println();    
            }
            print.close();
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Data Write Failed");
        }
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getBirth() {
        return birth;
    }

    public String getAddress() {
        return Address;
    }
    public static void setAllRec(ArrayList<CustomerEdit> allRec) {
        CustomerEdit.allRec = allRec;
    }
    public static ArrayList<String> getAllRec() {
        ArrayList<String> username = new ArrayList<String>();
        for (CustomerEdit d: allRec){
            username.add(d.getUsername());
        }
        return username;
    }
    public static CustomerEdit findUser(String Username){
        CustomerEdit found = null;
        for (CustomerEdit d: allRec){
            if (Username.equals(d.getUsername())){
                found = d;
                break;
            }
        }
        return found;
    }
}

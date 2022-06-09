/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelmanagementsystem;

/**
 *
 * @author pelintunc
 */
public class HotelManagementSystem {

    /**
     * @param args the command line arguments
     */
    static CustomerFrame cf;
    static ManagementFrame mf;
    static GUIFrame loginFrame;
    
    public static void main(String[] args) {
        GUIFrame gui = new GUIFrame();
        gui.setVisible(true);
    }
    
    public static void authenticate(String userType) {
        if (userType.equals("customer")) {
            cf = new CustomerFrame();
            cf.setVisible(true);
        }
        else if (userType.equals("staff"))
            System.out.println("Staff has not been implemented yet.");
        else if (userType.equals("admin")) {
            mf = new ManagementFrame();
            mf.setVisible(true);
        }
        
    }
    
    public static void logout() {
        loginFrame = new GUIFrame();
        loginFrame.setVisible(true); 
    }
    
}

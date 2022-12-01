/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author yanyanchen
 */
public class UserDao {
    public static void save(User user){
        String query = "insert into user(name,email,password,city,organization,role,carrier,mobileNumber,location,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"','"+user.getCity()+"','"+user.getOrganization()+"','"+user.getRole()+"','"+user.getCarrier()+"','"+user.getMobileNumber()+"','"+user.getLocation()+"','false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin Approval!");
    }
    
    public static User login(String name,String password){
        User user = null;
        try{
            ResultSet rs4 = DbOperations.getData("select *from user where name='"+name+"' and password='"+password+"'");
            while(rs4.next()){
                user = new User();
                user.setStatus(rs4.getString("status"));
                user.setRole(rs4.getString("role"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
//    public static ArrayList<User> getAllRecords(String email){
//        ArrayList<User> arrayList = new ArrayList<>();
//        try{
//            ResultSet rs3 = DbOperations.getData("select *from user where email like '%"+email+"%'");
//            while(rs3.next()){
//                User user = new User();
//                user.setId(rs3.getString("id"));
//                user.setName(rs3.getString("name"));
//                user.setEmail(rs3.getString("email"));
//                user.setPassword(rs3.getString("password"));
//                user.setCity(rs3.getString("city"));
//                user.setOrganization(rs3.getString("organization"));
//                user.setRole(rs3.getString("role"));
//                user.setCarrier(rs3.getString("carrier"));
//                user.setMobileNumber(rs3.getString("mobileNumber"));
//                user.setLocation(rs3.getString("location"));
//                user.setStatus(rs3.getString("status"));
//                
//            }
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return arrayList;
//    }
    
    public static ArrayList<User> getAllRecords(){
        ArrayList<User> arrayList = new ArrayList<>();
        try{
            ResultSet rs0 = DbOperations.getData("select *from user");
            while(rs0.next()){
                User user = new User();
                user.setId(rs0.getString("id"));
                user.setName(rs0.getString("name"));
                user.setEmail(rs0.getString("email"));
                user.setPassword(rs0.getString("password"));
                user.setCity(rs0.getString("city"));
                user.setOrganization(rs0.getString("organization"));
                user.setRole(rs0.getString("role"));
                user.setCarrier(rs0.getString("carrier"));
                user.setMobileNumber(rs0.getString("mobileNumber"));
                user.setLocation(rs0.getString("location"));
                user.setStatus(rs0.getString("status"));
                
                arrayList.add(user);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    
    public static ArrayList<User> getAllAssociatedDriver(String organization){
        ArrayList<User> arrayList = new ArrayList<>();
        try{
            ResultSet rs1 = DbOperations.getData("select *from user where role='Driver' and organization='"+organization+"'");
            while(rs1.next()){
                User user = new User();
                user.setId(rs1.getString("id"));
                user.setName(rs1.getString("name"));
                user.setEmail(rs1.getString("email"));
                user.setPassword(rs1.getString("password"));
                user.setCity(rs1.getString("city"));
                user.setOrganization(rs1.getString("organization"));
                user.setRole(rs1.getString("role"));
                user.setCarrier(rs1.getString("carrier"));
                user.setMobileNumber(rs1.getString("mobileNumber"));
                user.setLocation(rs1.getString("location"));
                user.setStatus(rs1.getString("status"));
                
                arrayList.add(user);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    

    
    public static User getDetailInfo(String name){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select *from user where name='"+name+"'");
            while(rs.next()){
                user = new User();
//                name,email,password,city,organization,role,carrier,mobileNumber,location,status
                user.setId(rs.getString("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setCity(rs.getString("city"));
                user.setOrganization(rs.getString("organization"));
                user.setRole(rs.getString("role"));
                user.setCarrier(rs.getString("carrier"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setLocation(rs.getString("location"));
                user.setStatus(rs.getString("status"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    public static void changeStatus(String email,String status){
        String query = "update user set status='"+status+"' where email='"+email+"'";
        DbOperations.setDataOrDelete(query, "Status Changed Successfully!");
    }
    
}

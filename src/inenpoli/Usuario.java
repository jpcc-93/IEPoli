/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inenpoli;

/**
 *
 * @author jpcc-
 */
public class Usuario {
    private String name;
    private String lastName;
    private String id;
    private String mail;
    private String numbrePhone;
    private boolean admin;
    private String user;
    private String pw;

    public Usuario(String name, String lastName, String id, String mail, String numbrePhone, boolean admin, String user, String pw) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.mail = mail;
        this.numbrePhone = numbrePhone;
        this.admin = admin;
        this.user = user;
        this.pw = pw;
    }

    public Usuario() {
    }
    
    



    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumbrePhone() {
        return numbrePhone;
    }

    public void setNumbrePhone(String numbrePhone) {
        this.numbrePhone = numbrePhone;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lasalle.services.model;

/**
 *
 * @author axel_
 */
public class Owner {
    private int idOwner;
    private String name;
    private String lastName;
    private String birthdate;
    
    
    public Owner(){
        
    }
    public Owner(int idOwner, String name, String lastName, String bithdate){
        this.idOwner = idOwner;
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
                
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    

}

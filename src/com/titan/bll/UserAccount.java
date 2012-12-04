/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;

/**
 *
 * @author Nikki
 */
public class UserAccount {
    private String username;
    private String email;
    private String password;
    
    public UserAccount(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}

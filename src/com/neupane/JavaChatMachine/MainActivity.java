/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.JavaChatMachine;

import com.neupane.Command.ChatCommand;
import com.neupane.Command.ChatCommandFactory;
import com.neupane.netity.Entity;
import java.util.Scanner;

/**
 *
 * @author parlad
 */
public class MainActivity {
    
    public static void main(String[] args) {
        
        System.out.println("*******************************************");
        System.out.println("Welcome to the Java Chat Machine");
        System.out.println("********************************************");
        
        System.out.println("Enter the name of user");
        
        Scanner input = new Scanner(System.in);
        
        Entity userName = new Entity();
        userName.setUserName(input.next());
        
        System.out.println("Our user" + userName.getUserName() + "is online !!!!");
        
        while (true) {
            
            System.out.println("Enter the command >>");
            
            String cmd = input.next();
            
            ChatCommand Chatcmd = ChatCommandFactory.get(cmd);
            if (Chatcmd == null) {
                System.out.println("Invalid Command");
            } else {
                Chatcmd.execute(userName);
            }
        }
    }
}

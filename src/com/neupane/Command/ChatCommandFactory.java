/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.Command;

/**
 *
 * @author parlad
 */
public class ChatCommandFactory {

    public static ChatCommand get(String cmd) {

        if (cmd.equalsIgnoreCase("message")) {
            return new Message();
            
        } else if (cmd.equalsIgnoreCase("openChat")) {
            return new OpenChat();
            
        } else if (cmd.equalsIgnoreCase("selectAFriend")) {
            return new SelectAfriend();
            
        } else if (cmd.equalsIgnoreCase("close")) {
            return new Close();
        }

        return null;
    }
}

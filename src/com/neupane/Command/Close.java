/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.Command;

import com.neupane.netity.Entity;

/**
 *
 * @author parlad
 */
public class Close extends ChatCommand {

    @Override
    public void execute(Entity chat) {
        System.out.println(chat.getUserName() +  " " + " is gone offline");
        System.exit(0);
    }

}

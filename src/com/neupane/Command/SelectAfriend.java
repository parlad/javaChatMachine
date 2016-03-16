/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.Command;

import com.neupane.netity.Entity;
import java.util.Scanner;

/**
 *
 * @author parlad
 */
public class SelectAfriend extends ChatCommand {

    @Override
    public void execute(Entity chat) {

        Entity user = new Entity();
        user.getUserName();
        user.setUserName(user.getUserName());

        System.out.println("$$$$$$$$$$$$$$");
        System.out.println("Select a friend to chat");
        System.out.println("1.Ram\n2.Hari\n3.Ramesh\n4.Prakash");
        System.out.println("Choose [1-5]");
        Scanner input = new Scanner(System.in);
        String st = input.next();

        switch (st) {
            case "1":
                System.out.println(user + " " + "chating with ram");
                break;
            case "2":
                System.out.println(user + " " + "chating with hari");
                break;
            case "3":
                System.out.println(user + " " + "chating with ramesh");
                break;
            case "4":
                System.out.println(user + " " + "chating with prakash");
                break;

        }
    }

}

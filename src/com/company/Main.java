package com.company;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        User Petya = new User(1, "Petya", 19);
        User Vasya = new User(2, "Vasya", 29);
        User Gena = new User(3, "Gena", 45);
        List<User> users = new ArrayList<>();
        users.add(Petya);
        users.add(Vasya);
        users.add(Gena);
        try        {

            FileWriter writer = new FileWriter("C:\\Users\\Daulet\\Desktop\\домаха\\json\\note3.json", false);
            for (int i =0; i<users.size();i++) {
                String json = new ObjectMapper().writeValueAsString(users.get(i));
                writer.write(json);
            }
            writer.flush();
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }



    }
}

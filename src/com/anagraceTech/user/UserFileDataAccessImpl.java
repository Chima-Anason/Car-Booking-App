package com.anagraceTech.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

public class UserFileDataAccessImpl implements UserDao{

    @Override
    public User[] getUsers() {
        File file = new File("src/com/anagraceTech/user.csv");

        User[] users = new User[4];

        try {
            Scanner scanner = new Scanner(file);
            int index = 0;
            while(scanner.hasNext()){
                String[] split = scanner.nextLine().split(",");
                users[index] = new User(UUID.fromString(split[0]), split[1]);
                index++;
            }
            return users;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}

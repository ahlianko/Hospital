package model;

import org.mindrot.jbcrypt.BCrypt;

public class Model {
    public void main(){
         String pass = "gjgrf123";
         String hash = Password.hashPassword(pass);
        System.out.println(hash);
        System.out.println(Password.checkPassword(pass,hash));

    }
}


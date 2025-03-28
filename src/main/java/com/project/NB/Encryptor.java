package com.project.NB;


import org.jasypt.util.text.BasicTextEncryptor;

public class Encryptor {
    public static void main(String[] args) {
        BasicTextEncryptor textEncrypor = new BasicTextEncryptor();
        textEncrypor.setPassword("secret-key");
        String encryptedPassword = textEncrypor.encrypt("root1234");
        System.out.println("Encrypted Password: " + encryptedPassword);
    }
}

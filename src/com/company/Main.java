package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone iphone = new Phone();
        iphone.setNumber(4444);

        for (int i = 0; i <= 2 ; i++) {
            System.out.println("введите пароль ");
            int password = scanner.nextInt();
            if (password == iphone.getNumber()){
                System.out.println("добро пожаловать");
                break;
            }
            else {
                System.out.println("вы ввели неправильный пароль");
            }
            if (i==2){
                try {
                    throw new PasswordExeption("устройство заблокировано");
                } catch (PasswordExeption passwordExeption) {
                    passwordExeption.printStackTrace();
                }
            }
        }




    }
}

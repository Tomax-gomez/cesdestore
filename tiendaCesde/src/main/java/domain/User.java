package domain;

import java.util.Scanner;

public class User {

int userId;

String userName;
String userLastName;
String mail;
String password;

Scanner sc = new Scanner(System.in);

    public void createUser(){
        System.out.println("ingreseId");
        userId = sc.nextInt();
        sc.nextLine();

        System.out.println("ingrese el nombre");
        userName = sc.nextLine();

        System.out.println("ingrese el apellido");
        userLastName = sc.nextLine();
        System.out.println("ingrese una contraseña");
        password =sc.nextLine();

        System.out.println("ingrese su correo");
        mail = sc.nextLine();
    }
    public void listUser(){
        System.out.println("id" + userId + "\n" +
                "Nombre"+ userName + "\n"+
                "apellido"+ userLastName + "\n"+
                "correo" + mail + "\n");
    }
    public void updateUser(){}
    public void deleteUser(){}
}


package domain;

import java.util.Scanner;

public class User {

private int userId;

private String userName;
private String userLastName;
private String mail;
private String password;

Scanner sc = new Scanner(System.in);

public int getUserId(){
    return this.userId;
}

public void setUserId(int userId){
    this.userId = userId;
}

public String getUserName(){
    return  this.userName;
}

public void setUserName(String userName){
    this.userName = userName;
}

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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


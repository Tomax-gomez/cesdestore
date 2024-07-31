package domain;

public class admin extends User {
    int superKey;

    @Override
    public void createUser() {
        super.createUser();
        System.out.println("ingrese su contraseña");
        superKey= sc.nextInt();
    }


    @Override
    public void listUser() {
        super.listUser();
        System.out.println("ingrese su contraseña");
         superKey= sc.nextInt();
    }

}

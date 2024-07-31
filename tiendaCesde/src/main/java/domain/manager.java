package domain;

public class manager extends User {

    String auth;

    @Override
    public void listUser() {
        super.listUser();
        System.out.println("ingrese su clave de usuario");
        auth=sc.nextLine();
    }

    @Override
    public void updateUser() {
        super.updateUser();
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    @Override
    public void createUser() {
        super.createUser();
        System.out.println("crear clase de auentificacion");
        auth=sc.nextLine();

    }

    @Override
    public void deleteUser() {

    }
}

package domain;

public class Vendor extends User {

    String vendorType;
    String categoryVendor;

    boolean aciability;

    @Override
    public void createUser()
    {
        super.createUser();

        System.out.println("ingrese el tipo de vendedor");
         vendorType = sc.nextLine();
        System.out.println("ingresar categoria de vendedor");
        categoryVendor = sc.nextLine();

        System.out.println("ingresar aciability");
        aciability = sc.nextBoolean();


    }

    @Override
    public void listUser() {
        super.listUser();
        System.out.println("tipo de vendedor:"+ vendorType + "\n"+
                "categoria de vendedor"+ categoryVendor + "\n"+
                "disponibilidad"+ aciability + "\n");
    }
    @Override
    public void updateUser() {
        super.updateUser();
    }

    @Override
    public void deleteUser() {
        super.deleteUser();
    }

}

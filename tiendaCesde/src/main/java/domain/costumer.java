package domain;

public class costumer extends User {
    String costumerType;

    public String getCostumerType() {
        return costumerType;
    }

    public void setCostumerType(String costumerType) {
        this.costumerType = costumerType;
    }

    @Override
    public void createUser() {

        super.createUser();
        System.out.println("tipo de cliente");
        costumerType = sc.nextLine();


    }

    @Override
    public void listUser() {
        super.listUser();
        System.out.println("tipo cliente"+costumerType);

    }
}




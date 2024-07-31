package Aplication;

import domain.User;
import domain.Vendor;

public class testUser {
    public static void main(String[] args) {
        User user = new User();
        Vendor vendor = new Vendor();

        vendor.setUserName("maria");

        System.out.println(vendor.getUserName())
        ;



    }
}

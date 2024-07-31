package domain;

import java.util.Scanner;

public class category extends purchase{
    private int categoryId;
    private String category_Name;



    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory_Name() {
        return category_Name;
    }

    public void setCategory_Name(String category_Name) {
        this.category_Name = category_Name;
    }

    public category(int categoryId, String category_Name) {
        this.categoryId = categoryId;
        this.category_Name = category_Name;
    }

    public category(){

}
public void createCategory(){
    System.out.println("ingrese ID");

}




}

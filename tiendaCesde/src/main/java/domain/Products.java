package domain;

public class Products extends category {
    private int Product;
    private String productName;
    private String description;
    private category Category;
    private float cost;
    private float profit;
    private float price = cost / 1 - (profit / 100);
    private String state;

    @Override
    public void createCategory() {
        super.createCategory();
    }

    @Override
    public void listCategory() {
        super.listCategory();
    }

    @Override
    public void updateCategory() {
        super.updateCategory();
    }

    @Override
    public void deleteCategory() {
        super.deleteCategory();
    }

    public Products(int product, String productName, String description, category category, float cost, float profit, float price, String state) {
        Product = product;
        this.productName = productName;
        this.description = description;
        Category = category;
        this.cost = cost;
        this.profit = profit;
        this.price = price;
        this.state = state;
    }

    public int getProduct() {
        return Product;
    }

    public void setProduct(int product) {
        Product = product;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public category getCategory() {
        return Category;
    }

    public void setCategory(category category) {
        Category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}



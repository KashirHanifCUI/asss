public class Product {
    private String name;
    private double price;
    private int stockQuantity;
    private double tax;
    private static int counter = 0;
    private int id;
    private int[] monthlySales;
    private int[] weekSales;
    Category category;
    public Product(String name, double price,int stockQuantity, double tax,Category category){
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.name = name;
        this.tax = tax;
        this.category = category;
        id = counter++;
        this.weekSales = new int[52];
        this.monthlySales = new int[12];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

   public int getWeeklySales(int week){
        return weekSales[week - 1];
   }
   public void setWeeklySales(int week, int quantitySold){
        weekSales[week - 1] = quantitySold;
   }
   public int getMonthlySales(int month){
        return monthlySales[month - 1];
   }
   public void setMonthlySales(int quantitySold, int month){
        monthlySales[month - 1] = quantitySold;
   }
    public String toString(){
        String result = String.format("%s \t %.2f \t %d \t %.2f",name,price,stockQuantity,tax);
        return result;
    }
}

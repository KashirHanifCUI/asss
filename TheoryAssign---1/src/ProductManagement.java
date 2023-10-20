public class ProductManagement {
    Product[] products;
    int counter = 0;
    int outCounter = 0;
    Product[] outOfStock;

    public ProductManagement(int arraySize){
        this.products = new Product[arraySize];
        this.outOfStock = new Product[arraySize];
    }
    public boolean AddProduct(Object o)
    {
        if(counter<products.length)
        {
            products[counter] = (Product) o;
            counter++;
            return true;
        }
        return false;
    }
     public void fetchProductById(int id){
           for(Product p : products){
               if(p != null && p.getId() == id){
                   System.out.println(p);
                   break;
               }
           }
        }
    public void fetchProductByName(String name){
        for(int i = 0; i < products.length;i++){
            if(products[i] != null && products[i].getName().equals(name)){
                System.out.println(products[i]);
                break;
            }
        }
    }
    public void fetchProductByCategory(Category category){
        for(int i = 0;i < products.length;i++){
            if(products[i] != null && products[i].getCategory().equals(category)){
                System.out.println(products[i]);
            }
        }
    }
    public void updateProductPrice(int id, double price){
        for(int i = 0;i < products.length;i++){
            if(products[i] != null && products[i].getId() == id){
                products[i].setPrice(price);
                break;
            }
        }
    }
    public void updateProductStock(int id, int stockQuantity){
        for(int i = 0;i < products.length;i++){
            if(products[i] != null && products[i].getId() == id){
                products[i].setStockQuantity(stockQuantity);
                break;
            }
        }
    }
    public void removeProduct(Object o){
        Product p = (Product) o;
        for(int i = 0;i < products.length;i++){
            if(products[i].equals(p)){
                for(int j= i;j < products.length - 1;j++){
                    products[j] = products[j+1];
                }
                products[products.length - 1] = null;
                break;
            }
        }
    }
    public boolean outOfStock(Object o){
        Product p = (Product) o;
        if(p != null && p.getStockQuantity() == 0){
            outOfStock[outCounter++] = p;
            removeProduct(p);
            return true;
        }
        return false;
    }
    public boolean stockRunningLow(Object o){
        Product p = (Product) o;
        if(p != null && p.getStockQuantity() < 10){
            return true;
        }
        return false;
    }
    public void outOfStockReport(){
        for (Product p : outOfStock){
            if(p != null)
                System.out.println(p);
        }

    }
    public void stockRunningLowReport(){
        for (int i = 0;i < products.length;i++){
            if(products[i] != null && products[i].getStockQuantity() < 10){
                System.out.println(products[i]);

            }
        }
    }
    public void generateReport(){
        for(Product p : products){
            if(p != null){
                System.out.println(p);
            }

        }
    }
    public void mostFrequentlyPurchasedItemInWeek(int limit, int week) {
        for(int i = 0;i < products.length;i++){
            if(products[i] != null && products[i].getWeeklySales(week) > limit) {
                System.out.println(products[i]);
            }
        }
    }
    public void mostFrequentlyPurchasedItemInMonth(int limit, int month) {
        for(int i = 0;i < products.length;i++){
            if(products[i] != null && products[i].getMonthlySales(month) > limit) {
                System.out.println(products[i]);
            }
        }
    }
    }


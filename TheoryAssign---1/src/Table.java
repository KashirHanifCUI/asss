public class Table extends Furniture{
    private String shape;
    public Table(String name, double price,int stockQuantity, double tax,String material, double dimmension,String shape) {
        super(name,price,stockQuantity,tax,material,dimmension,FurnitureCategory.TABLES);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    public String toString(){
        String res = super.toString();
        res += String.format("\t %s",shape);
        return res;
    }
}

public class Seating extends Furniture{
    private double loadCapacity;
    public Seating(String name, double price,int stockQuantity, double tax,String material, double dimmension,double loadCapacity){
        super(name,price,stockQuantity,tax,material,dimmension,FurnitureCategory.SEATING);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public String toString(){
        String res = super.toString();
        res += String.format("\t %.2f",loadCapacity);
        return res;
    }
}

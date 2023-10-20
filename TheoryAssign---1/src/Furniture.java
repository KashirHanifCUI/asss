public class Furniture extends Product{
    private String material;
    private double dimmension;

    public Furniture(String name, double price,int stockQuantity, double tax,String material, double dimmension,FurnitureCategory category) {
        super(name,price,stockQuantity,tax,Category.FURNITURE);
        this.dimmension = dimmension;
        this.material = material;

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getDimmension() {
        return dimmension;
    }

    public void setDimmension(double dimmension) {
        this.dimmension = dimmension;
    }
    public String toString() {
        String res = super.toString();
        res += String.format(" \t %s \t %.2f",material,dimmension);
        return res;
    }
}

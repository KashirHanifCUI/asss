public class Grocery extends Product{
    private String nutrionalValues;
    Date expiryDate;

    public Grocery(String name, double price,int stockQuantity, double tax,String nutrionalValues,Date expiryDate){
        super(name,price,stockQuantity,tax,Category.GROCERY);
        this.nutrionalValues = nutrionalValues;
        this.expiryDate = expiryDate;

    }

    public String getNutrionalValues() {
        return nutrionalValues;
    }

    public void setNutrionalValues(String nutrionalValues) {
        this.nutrionalValues = nutrionalValues;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    public String toString(){
        String res = super.toString();
         res += String.format("\t %s %s",nutrionalValues,expiryDate);
         return res;
    }
}

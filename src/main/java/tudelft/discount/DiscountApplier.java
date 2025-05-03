package tudelft.discount;

// Ejercicio 3:
// Está al reves: a BUSINESS se le aplica un descuento, y a HOME un aumento

public class DiscountApplier {

    private ProductDao dao;

    public DiscountApplier (ProductDao dao) {
        this.dao = dao;
    }

    public void setNewPrices() {
        for(Product product : dao.all()) {
            if(product.getCategory().equals("HOME")) {
                product.setPrice(product.getPrice() * 0.9);
            }
            if(product.getCategory().equals("BUSINESS")) {
                product.setPrice(product.getPrice() * 1.1);
            }
        }
    }
}

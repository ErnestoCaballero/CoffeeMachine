package StaticMembers;

public class ManufacturingController {
    static int requestedProducts;

    static String requestProduct(String product) {
        return String.format("%d. Requested %s", ++requestedProducts, product);
    }

    static int getNumberOfProducts() {
        return requestedProducts;
    }
}

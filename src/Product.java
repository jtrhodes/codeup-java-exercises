import javax.print.attribute.standard.PrinterURI;

public class Product {
    private String name;
    private int priceInCents;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public Product(String name, int priceInCents){
    this.name = name;
    this.priceInCents = priceInCents;
}
//double[] products = new double[3];

    public static double findAveragePrice(Product[] products){
        int sum = 0;
        for(Product product : products){
            sum += product.getPriceInCents();

        }
        return sum / products.length;
    }

    public static void main(String[] args) {
//        Product p1 = new Product("duct tape", 399);
//        Product p2 = new Product("hacksaw",599);
//        Product p3 = new Product("hammer", 1085);
        Product[] products = {
                new Product("duct tape", 399),
                new Product("hacksaw",599),
                new Product("hammer", 1085),
        };
        double sum = 0;
        double[] numbers = new double[5];
        for(double n : numbers){
            n = (double)(Math.random() * 50);
            sum += n;
            System.out.println(sum);
        }
        System.out.println(Product.findAveragePrice(products));
    }
}

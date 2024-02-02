import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProductByMinPrice {

    private Integer id;
    private String name;
    private String category;
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ProductByMinPrice() {
        super();
    }

    public ProductByMinPrice(Integer id, String name, String category, Integer price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductByMinPrice[id=" + id + ",name=" + name + ", category =" + category + ", price= " + price + "]";
    }

    public static void main(String[] args) {
        ProductByMinPrice p1 = new ProductByMinPrice(101, "java", "Books", 150);
        ProductByMinPrice p2 = new ProductByMinPrice(102, "python", "Books", 300);
        ProductByMinPrice p3 = new ProductByMinPrice(103, "Spring", "Books", 100);
        ProductByMinPrice p4 = new ProductByMinPrice(104, "Maven", "Books", 250);
        ProductByMinPrice p5 = new ProductByMinPrice(105, "hybernet", "Books", 120);
        ProductByMinPrice p6 = new ProductByMinPrice(106, "c", "Course", 1200);
        ProductByMinPrice p7 = new ProductByMinPrice(107, "angular", "Course", 12000);
        ProductByMinPrice p8 = new ProductByMinPrice(108, "react", "Course", 5000);

        List<ProductByMinPrice> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
        ProductByMinPrice cheapestProduct = products.stream().filter(p -> p.getCategory().equalsIgnoreCase("Course"))
                .min(Comparator.comparing(ProductByMinPrice::getCategory)).get();

        System.out.println(cheapestProduct);
    }

}

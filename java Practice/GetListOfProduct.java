import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetListOfProduct {
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

    public GetListOfProduct() {
        super();
    }

    public GetListOfProduct(Integer id, String name, String category, Integer price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "GetListOfProduct[id=" + id + ",name=" + name + ", category =" + category + ", price= " + price + "]";
    }

    public static void main(String[] args) {
        GetListOfProduct p1 = new GetListOfProduct(101, "java", "Books", 150);
        GetListOfProduct p2 = new GetListOfProduct(102, "python", "Books", 300);
        GetListOfProduct p3 = new GetListOfProduct(103, "Spring", "Books", 100);
        GetListOfProduct p4 = new GetListOfProduct(104, "Maven", "Books", 250);
        GetListOfProduct p5 = new GetListOfProduct(105, "hybernet", "Books", 120);
        GetListOfProduct p6 = new GetListOfProduct(106, "c", "Course", 1200);
        GetListOfProduct p7 = new GetListOfProduct(107, "angular", "Course", 12000);
        GetListOfProduct p8 = new GetListOfProduct(108, "react", "Course", 5000);

        List<GetListOfProduct> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
        products.stream().filter(p -> p.getCategory().equalsIgnoreCase("Books")).filter(p -> p.getPrice() > 200)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}

import java.util.Objects;

class Lapy {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lapy lapy = (Lapy) o;
        return price == lapy.price && Objects.equals(model, lapy.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    public class ObjectAndHashClasses44 {
        public static void main(String[] args) {
            Lapy obj = new Lapy();
            obj.model = "Laptop Yoga1";
            obj.price = 1000;

            Lapy obj1 = new Lapy();
            obj1.model = "Laptop Yoga";
            obj1.price = 1000;

            boolean result = obj1.equals(obj1);
            System.out.println(true);
        }
    }
}

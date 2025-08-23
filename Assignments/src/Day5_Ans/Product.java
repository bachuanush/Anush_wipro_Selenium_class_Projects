package Day5_Ans;

public final class Product {
    private final String name;
    private final String code;
    private final double price;
    private final String category;

    private Product(Builder builder) {
        this.name = builder.name;
        this.code = builder.code;
        this.price = builder.price;
        this.category = builder.category;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public static class Builder {
        private String name;
        private String code;
        private double price;
        private String category;

        public Builder withName(String name) {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("name cannot be empty");
            }
            this.name = name;
            return this;
        }

        public Builder withCode(String code) {
            if (code == null || code.isEmpty()) {
                throw new IllegalArgumentException("code cannot be empty");
            }
            this.code = code;
            return this;
        }

        public Builder withPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("price cannot be negative");
            }
            this.price = price;
            return this;
        }

        public Builder withCategory(String category) {
            if (category != null && category.isEmpty()) {
                throw new IllegalArgumentException("category cannot be empty");
            }
            this.category = category;
            return this;
        }

        public Product build() {
            if (this.name == null) {
                throw new IllegalStateException("name required.");
            }
            if (this.code == null) {
                throw new IllegalStateException("code needed");
            }

            return new Product(this);
        }
    }

    public static void main(String[] args) {
        try {
            Product product = new Product.Builder()
                    .withName("laptop")
                    .withCode("lp1001")
                    .withPrice(1500.00)
                    .withCategory("electronics")
                    .build();

            System.out.println("product created");
            System.out.println("name: " + product.getName());
            System.out.println("code: " + product.getCode());
            System.out.println("price: " + product.getPrice());
            System.out.println("categery: " + product.getCategory());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

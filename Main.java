import java.time.LocalDate;

abstract class Product {
    private String pId;
    private String name;
    private int qtyOrdTillDt;
    private int quantityAvailable;
    private double unitCostPrice;
    private double unitSellingPrice;
    private double discountOffered;
    private LocalDate manufactureDate;

    public Product(String pId, String name, int qtyOrdTillDt, int quantityAvailable, double unitCostPrice,
                   double unitSellingPrice, double discountOffered, LocalDate manufactureDate) {
        this.pId = pId;
        this.name = name;
        this.qtyOrdTillDt = qtyOrdTillDt;
        this.quantityAvailable = quantityAvailable;
        this.unitCostPrice = unitCostPrice;
        this.unitSellingPrice = unitSellingPrice;
        this.discountOffered = discountOffered;
        this.manufactureDate = manufactureDate;
    }

    public String getpId() {
        return pId;
    }

    public String getName() {
        return name;
    }

    public int getQtyOrdTillDt() {
        return qtyOrdTillDt;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public double getUnitCostPrice() {
        return unitCostPrice;
    }

    public double getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public double getDiscountOffered() {
        return discountOffered;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setUnitSellingPrice(double unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public abstract void printProductDetails();

    public abstract double calculateFinalCost();
}

class ElectronicProduct extends Product {
    private String brandName;
    private String modelNo;
    private String operatingSystem;
    private String processor;

    public ElectronicProduct(String pId, String name, int qtyOrdTillDt, int quantityAvailable, double unitCostPrice,
                             double unitSellingPrice, double discountOffered, LocalDate manufactureDate,
                             String brandName, String modelNo, String operatingSystem, String processor) {
        super(pId, name, qtyOrdTillDt, quantityAvailable, unitCostPrice, unitSellingPrice, discountOffered, manufactureDate);
        this.brandName = brandName;
        this.modelNo = modelNo;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelNo() {
        return modelNo;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    public void printProductDetails() {
        System.out.println("Product ID: " + getpId());
        System.out.println("Name: " + getName());
        System.out.println("Quantity Ordered Till Date: " + getQtyOrdTillDt());
        System.out.println("Quantity Available: " + getQuantityAvailable());
        System.out.println("Unit Cost Price: " + getUnitCostPrice());
        System.out.println("Unit Selling Price: " + getUnitSellingPrice());
        System.out.println("Discount Offered: " + getDiscountOffered());
        System.out.println("Manufacture Date: " + getManufactureDate());
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model No: " + modelNo);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Processor: " + processor);
    }

    @Override
    public double calculateFinalCost() {
        return getUnitCostPrice() - (getUnitCostPrice() * (getDiscountOffered() / 100));
    }
}

class ClothingProduct extends Product {
    private String fabricType;
    private String category;
    private int fabricDensity;

    public ClothingProduct(String pId, String name, int qtyOrdTillDt, int quantityAvailable, double unitCostPrice,
                           double unitSellingPrice, double discountOffered, LocalDate manufactureDate,
                           String fabricType, String category, int fabricDensity) {
        super(pId, name, qtyOrdTillDt, quantityAvailable, unitCostPrice, unitSellingPrice, discountOffered, manufactureDate);
        this.fabricType = fabricType;
        this.category = category;
        this.fabricDensity = fabricDensity;
    }

    public String getFabricType() {
        return fabricType;
    }

    public String getCategory() {
        return category;
    }

    public int getFabricDensity() {
        return fabricDensity;
    }

    @Override
    public void printProductDetails() {
        System.out.println("Product ID: " + getpId());
        System.out.println("Name: " + getName());
        System.out.println("Quantity Ordered Till Date: " + getQtyOrdTillDt());
        System.out.println("Quantity Available: " + getQuantityAvailable());
        System.out.println("Unit Cost Price: " + getUnitCostPrice());
        System.out.println("Unit Selling Price: " + getUnitSellingPrice());
        System.out.println("Discount Offered: " + getDiscountOffered());
        System.out.println("Manufacture Date: " + getManufactureDate());
        System.out.println("Fabric Type: " + fabricType);
        System.out.println("Category: " + category);
        System.out.println("Fabric Density: " + fabricDensity);
    }

    @Override
    public double calculateFinalCost() {
        return getUnitCostPrice() - (getUnitCostPrice() * (getDiscountOffered() / 100));
    }
}

class FoodProduct extends Product {
    private LocalDate expiryDate;
    private String category;

    public FoodProduct(String pId, String name, int qtyOrdTillDt, int quantityAvailable, double unitCostPrice,
                       double unitSellingPrice, double discountOffered, LocalDate manufactureDate,
                       LocalDate expiryDate, String category) {
        super(pId, name, qtyOrdTillDt, quantityAvailable, unitCostPrice, unitSellingPrice, discountOffered, manufactureDate);
        this.expiryDate = expiryDate;
        this.category = category;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void printProductDetails() {
        System.out.println("Product ID: " + getpId());
        System.out.println("Name: " + getName());
        System.out.println("Quantity Ordered Till Date: " + getQtyOrdTillDt());
        System.out.println("Quantity Available: " + getQuantityAvailable());
        System.out.println("Unit Cost Price: " + getUnitCostPrice());
        System.out.println("Unit Selling Price: " + getUnitSellingPrice());
        System.out.println("Discount Offered: " + getDiscountOffered());
        System.out.println("Manufacture Date: " + getManufactureDate());
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Category: " + category);
    }

    @Override
    public double calculateFinalCost() {
        return getUnitCostPrice() - (getUnitCostPrice() * (getDiscountOffered() / 100));
    }
}

class InventoryHandler {
    private Product[] products;

    public InventoryHandler(Product[] products) {
        this.products = products;
    }

    public void findOutOfStockProducts() {
        System.out.println("Out of Stock Products:");
        for (Product product : products) {
            if (product.getQuantityAvailable() == 0) {
                product.printProductDetails();
                System.out.println("-----------------------------");
            }
        }
    }

    public void applyDiscount() {
        for (Product product : products) {
            if (product.getDiscountOffered() > 0) {
                double finalCost = product.calculateFinalCost();
                product.setUnitSellingPrice(finalCost);
            }
        }
    }

    public String offerDiscount(ElectronicProduct electronicProduct) {
        if (electronicProduct.getManufactureDate().isBefore(LocalDate.of(2018, 1, 1))) {
            return "50%";
        } else {
            return "0%";
        }
    }

    public String offerDiscount(FoodProduct foodProduct) {
        LocalDate currentDate = LocalDate.now();
        LocalDate expiryDate = foodProduct.getExpiryDate();
        if (expiryDate.equals(currentDate.plusDays(10))) {
            return "60%";
        } else {
            return "10%";
        }
    }

    public String offerDiscount(ClothingProduct clothingProduct) {
        if (clothingProduct.getFabricType().equalsIgnoreCase("Polyester")) {
            return "20%";
        } else {
            return "0%";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[10];
        products[0] = new ElectronicProduct("P1", "Mobile", 10, 5, 100, 150, 10, LocalDate.of(2022, 5, 1),
                "Brand A", "Model 1", "Android", "Snapdragon");
        products[1] = new FoodProduct("P2", "Bread", 15, 0, 10, 15, 0, LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 6, 15), "Bakery");
        products[2] = new ClothingProduct("P3", "Shirt", 8, 2, 20, 30, 5, LocalDate.of(2021, 10, 1),
                "Cotton", "Formal", 200);
        products[3] = new ElectronicProduct("P4", "Laptop", 5, 3, 500, 800, 0, LocalDate.of(2022, 8, 1),
                "Brand B", "Model 2", "Windows", "Intel");
        products[4] = new ClothingProduct("P5", "Trousers", 6, 1, 30, 40, 0, LocalDate.of(2021, 9, 1),
                "Polyester", "Casual", 250);
        products[5] = new FoodProduct("P6", "Milk", 20, 10, 5, 6, 0, LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 6, 12), "Dairy");
        products[6] = new ElectronicProduct("P7", "Tablet", 3, 2, 150, 200, 8, LocalDate.of(2020, 5, 1),
                "Brand C", "Model 3", "Android", "MediaTek");
        products[7] = new FoodProduct("P8", "Apple", 12, 5, 2, 3, 0, LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 6, 18), "Fruit");
        products[8] = new ClothingProduct("P9", "Dress", 7, 4, 40, 50, 0, LocalDate.of(2022, 3, 1),
                "Silk", "Partywear", 300);
        products[9] = new ElectronicProduct("P10", "Smartwatch", 4, 0, 80, 100, 10, LocalDate.of(2022, 6, 1),
                "Brand D", "Model 4", "Android", "MTK");

        InventoryHandler inventoryHandler = new InventoryHandler(products);

        System.out.println("---- Out of Stock Products ----");
        inventoryHandler.findOutOfStockProducts();

        System.out.println("---- Applying Discounts ----");
        inventoryHandler.applyDiscount();

        System.out.println("---- Offered Discounts ----");
        for (Product product : products) {
            if (product instanceof ElectronicProduct) {
                ElectronicProduct electronicProduct = (ElectronicProduct) product;
                System.out.println("Electronic Product Discount: " + inventoryHandler.offerDiscount(electronicProduct));
            } else if (product instanceof FoodProduct) {
                FoodProduct foodProduct = (FoodProduct) product;
                System.out.println("Food Product Discount: " + inventoryHandler.offerDiscount(foodProduct));
            } else if (product instanceof ClothingProduct) {
                ClothingProduct clothingProduct = (ClothingProduct) product;
                System.out.println("Clothing Product Discount: " + inventoryHandler.offerDiscount(clothingProduct));
            }
 }
    }
}

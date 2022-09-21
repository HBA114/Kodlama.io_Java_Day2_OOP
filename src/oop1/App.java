package oop1;

public class App {
    public static void main(String[] args) {

        Product product1 = new Product();

        // set values
        product1.setId(1);
        product1.setName("Delonghi Coffee Machine");
        product1.setUnitPrice(7499.99);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("delonghi_coffee_machine.jpeg");

        Product product2 = new Product();

        // set values
        product2.setId(2);
        product2.setName("Smack Coffee Machine");
        product2.setUnitPrice(6499.99);
        product2.setDiscount(8);
        product2.setUnitsInStock(4);
        product2.setImageUrl("smack_coffee_machine.jpeg");

        Product product3 = new Product();

        // set values
        product3.setId(3);
        product3.setName("Kitchen Aid Coffee Machine");
        product3.setUnitPrice(4499.99);
        product3.setDiscount(9);
        product3.setUnitsInStock(2);
        product3.setImageUrl("kitchen_aid_coffee_machine.jpeg");

        // Product Array stores multiple Product object
        Product[] products = {
                product1,
                product2,
                product3
        };

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();

        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("+90 599 488 3322");
        individualCustomer.setFirstName("Hasan Basri");
        individualCustomer.setLastName("Ayhaner");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("67890");
        corporateCustomer.setPhone("+90 589 498 2233");
        corporateCustomer.setCompanyName("HBA114");
        corporateCustomer.setTaxNumber("0001");

        Customer[] customers = {
                individualCustomer,
                corporateCustomer
        };

        for (Customer customer : customers) {
            System.out.println("Customer Id : " + customer.getId());
            System.out.println("Customer Number : " + customer.getCustomerNumber());
            System.out.println("Customer Phone : " + customer.getPhone());
        }
    }
}
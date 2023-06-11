package pipeline.dto;

import java.util.ArrayList;
import java.util.List;

public class CustomerEntity {
    private String id;
    private String name;

    public CustomerEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static List<CustomerEntity> getCustomerList() {
        CustomerEntity customer1 = new CustomerEntity("1", "Customer1");
        CustomerEntity customer2 = new CustomerEntity("2", "Customer2");
        CustomerEntity customer3 = new CustomerEntity("3", "Customer3");
        List<CustomerEntity> customerList = new ArrayList<CustomerEntity>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        return customerList;
    }
}

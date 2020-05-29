package service.implement;

import model.Customer;
import service.CustomerService;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class SimpleCustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList;
    private static long autoIncreaseId = 0;

    static {
        customerList = asList(
                new Customer(autoIncreaseId++, "T", "t@codegym.vn", "Da Nang"),
                new Customer(autoIncreaseId++, "Nhat", "nhat@codegym.vn", "Quang Tri"),
                new Customer(autoIncreaseId++, "Trang", "trang@codegym.vn", "Ha Noi"),
                new Customer(autoIncreaseId++, "Nguyen Binh Son", "son@codegym.vn", "Sai Gon"),
                new Customer(autoIncreaseId++, "Dang Xuan Hoa", "hoa.dang@codegym.vn", "Da Nang")
        );
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerList);
    }

    @Override
    public Customer getOne(Long id) {
        Customer customer = null;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)){
                customer = customerList.get(i);
            }
        }
        return customer;
    }

    @Override
    public void updateCustomer(Customer customer) {
        Customer toUpdateCustomer = getOne(customer.getId());
        toUpdateCustomer.setName(customer.getName());
        toUpdateCustomer.setEmail(customer.getEmail());
        toUpdateCustomer.setAddress(customer.getAddress());
    }
}

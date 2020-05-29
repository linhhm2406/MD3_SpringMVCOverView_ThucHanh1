package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerServiceFactory;
import service.implement.SimpleCustomerServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    CustomerServiceFactory customerServiceFactory = new CustomerServiceFactory();
    SimpleCustomerServiceImpl simpleCustomerServiceImpl = (SimpleCustomerServiceImpl) customerServiceFactory.getInstance();

    @GetMapping()
    public ModelAndView showAllList(){
        List<Customer> customerList = simpleCustomerServiceImpl.findAll();
        ModelAndView modelAndView = new ModelAndView("showList");
        modelAndView.addObject("list", customerList);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView showOne(@PathVariable Long id){
        Customer customer = simpleCustomerServiceImpl.getOne(id);
        ModelAndView modelAndView = new ModelAndView("showOne");
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute Customer customer){
        simpleCustomerServiceImpl.updateCustomer(customer);
        return showAllList();
    }
}

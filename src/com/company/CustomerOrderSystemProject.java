package com.company;

public class CustomerOrderSystemProject {
    public static void main(String[] args) {
        Customer customer = new Customer();
        LogInJOptionPane login = new LogInJOptionPane(customer);
        int result = login.getResult();
        System.out.println(login.getResult());

//        switch (result) {
//            case login.CANCEL_OPTION -> System.exit(0);
//        }
        System.out.println(customer.getID());
        System.out.println(customer.getPassword());
//        System.out.println(customer);
//        System.out.println(customer);
    }
}

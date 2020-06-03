package demo.customer;

import org.springframework.data.repository.PagingAndSortingRepository;

import demo.account.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}

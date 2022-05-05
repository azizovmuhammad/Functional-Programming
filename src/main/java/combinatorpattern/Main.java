package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alex",
                "alex@mail.com",
                "+0123456",
                LocalDate.of(2000,1,1)
        );

        //System.out.println(new CustomerValidatorService().isValid(customer));

        // if customer is valid We can add customer in db

        // Using combinator pattern

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}

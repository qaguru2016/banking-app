package ca.qaguru.banking.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;

    public AccountDto(Long id, String accountHolderName, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

}

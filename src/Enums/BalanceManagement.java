package Enums;

import java.util.Scanner;

public class BalanceManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account();
        account.code = "1234";
        account.balance = 2000L;
        changeBalance(account, Operation.WITHDRAW, 5000L);
        System.out.println(account.balance);

    }

    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        switch (operation) {
            case DEPOSIT:
                account.balance += sum;
                return true;
            case WITHDRAW:
                if (account.balance >= sum) {
                    account.balance -= sum;
                    return true;
                } else {
                    System.out.println("Not enough money to withdraw.");
                    return false;
                }
            default:
                return false;
        }
    }

    enum Operation {
        DEPOSIT,
        WITHDRAW;
    }

    static class Account {

        private String code;
        private Long balance;

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long balance) {
            this.balance = balance;
        }
    }

}

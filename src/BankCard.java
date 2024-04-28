import java.util.ArrayList;

public class BankCard extends BusinessCard implements Cards {
    private String bankAccount;

    public BankCard(String name, String surname, String tel, String city, String bankAccount) {
        super(name, surname, tel, city);
        this.bankAccount = bankAccount;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    public char getBorder() {
        return '$';
    }

   protected ArrayList<String> getLines () {
        ArrayList<String> lines = new ArrayList<>();

        lines.add(getName() + " " + getSurname());
        lines.add("tel. " + getTel());
        lines.add("Nr konta: " + bankAccount);
        return lines;

    }

}

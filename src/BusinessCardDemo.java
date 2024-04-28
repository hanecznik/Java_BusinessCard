import java.util.ArrayList;
import java.util.List;

class BusinessCardDemo {

        public static void main(String[] args) {

                BusinessCard businessCard = new BusinessCard("Piotr", "Budynek", "123456789", "Kraków");

                businessCard.setName("Piotr");
                businessCard.setSurname("Budynek");
                businessCard.setTel("123456789");
                businessCard.setCity("Kraków");
                businessCard.print();

                BankCard card = new BankCard("Piotr", "Budynek", "123456789", "Kraków", "0987654321122345678900");
                card.print();

//        WalletTest
                Wallet wallet = new Wallet();

                wallet.addCardToWallet(new BusinessCard("Jan", "Kowalski"));
                wallet.addCardToWallet(new BusinessCard("Michał",  "Budyń"));
                wallet.addCardToWallet(new BusinessCard("Aleksandra",  "Niema"));
                wallet.addCardToWallet(new BusinessCard("Agata",  "Niebo"));

                List<String> surnameToCheck = new ArrayList<>();
                surnameToCheck.add("Kowalski");
                surnameToCheck.add("Balon");
                surnameToCheck.add("Niebo");
                surnameToCheck.add("Piekło");

                List<Cards> foundCardsInWallet = wallet.findCardsBySurname(surnameToCheck);

                System.out.println("W portfelu znaleziono wizytówkę dla szukanego nazwiska: ");
                for (Cards card2 : foundCardsInWallet) {
                        System.out.println(card2.getSurname());
                }
        }
}
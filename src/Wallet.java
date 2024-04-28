import java.util.ArrayList;
import java.util.List;
public class Wallet {
private List<Cards> cards;

public Wallet() {
    cards = new ArrayList<>();
}
public void addCardToWallet(BusinessCard card) {
    cards.add(card);
}
public List<Cards> findCardsBySurname(List<String> surnameToCheck) {
    List<Cards> foundCardsInWallet = new ArrayList<>();
    for (String surname : surnameToCheck)
        for (Cards card2 : cards) {
        if (card2.getSurname().equals(surname)) {
            foundCardsInWallet.add(card2);
            }
        }
    return foundCardsInWallet;
    }

}

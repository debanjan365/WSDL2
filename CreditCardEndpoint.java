import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "com.example.generated.CreditCardService")
public class CreditCardEndpoint implements CreditCardService {

    // In-memory storage for credit cards
    private Map<String, CreditCard> creditCardStore = new HashMap<>();

    @Override
    public String addCreditCard(CreditCard creditCard) {
        creditCardStore.put(creditCard.getCardNumber(), creditCard); // Store the card in memory
        return "Credit card added successfully: " + creditCard.getCardNumber();
    }

    @Override
    public CreditCard viewCreditCard(String cardNumber) {
        // Fetch the credit card details from memory
        return creditCardStore.get(cardNumber);
    }
}

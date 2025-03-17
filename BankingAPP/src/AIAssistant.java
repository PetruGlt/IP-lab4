import java.util.ArrayList;
import java.util.List;

public class AIAssistant {
    private List<Chat> chats;

    public AIAssistant() {
        this.chats = new ArrayList<>();
    }

    private void addChat(Chat chat) {
        this.chats.add(chat);
    }

    public void handleAccountOpenRequests(Chat chat) {
        chat.setMessageFromAssistant("Sure, I can help you open a new account. Could you please provide me with your personal details?");
        this.addChat(chat);
    }

    public void provideCardInfo(Chat chat) {
        chat.setMessageFromAssistant("Here is the information about our available cards: [Card Info]");
        this.addChat(chat);
    }

    public void provideLoanInfo(Chat chat) {
        chat.setMessageFromAssistant("Here is the information about our loan options: [Loan Info]");
        this.addChat(chat);
    }

    public void guideCustomerThroughInitialApplicationForms(Chat chat) {
        chat.setMessageFromAssistant("I will guide you through the initial application forms. Please fill in the following details: [Form Details]");
        this.addChat(chat);
    }

    public void forwardComplexRequestsToHumanEmployee(Chat chat) {
        chat.setMessageFromAssistant("Your request is a bit complex. I will forward it to one of our human employees. They will get back to you shortly.");
        this.addChat(chat);
    }

    public void interactWithBankAPI(Chat chat) {
        // Simulating an interaction with a bank API to retrieve updated information
        String updatedInfo = "Retrieved updated information from the bank API.";
        chat.setMessageFromAssistant(updatedInfo);
        this.addChat(chat);
    }

    public String getChatHistory() {
        StringBuilder history = new StringBuilder();
        for (Chat chat : chats) {
            history.append("Client: ").append(chat.getMessageFromClient()).append("\n");
            history.append("Assistant: ").append(chat.getMessageFromAssistant()).append("\n\n");
        }
        return history.toString();
    }
}
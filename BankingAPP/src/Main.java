public class Main {
    public static void main(String[] args) {
        BankAIAssistant assistant = new BankAIAssistant();
        Chat chat1 = new Chat(1, "I want to open a new account.");
        assistant.handleAccountOpenRequests(chat1);

        Chat chat2 = new Chat(2, "Can you provide information about your cards?");
        assistant.provideCardInfo(chat2);

        System.out.println(assistant.getChatHistory());
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAIAssistant assistant = new BankAIAssistant();
        Chat chat1 = new Chat();
        assistant.handleAccountOpenRequests(chat1);

        Chat chat2 = new Chat();
        assistant.provideCardInfo(chat2);

        System.out.println(assistant.getChatHistory());
    }
}
class Chat{
    private final long id;
    private final String messageFromClient;
    private String messageFromAssistant;
    //    private Client client;
    private AIAssistant assistant;
    public Chat(long  id, String messageFromClient) {
        this.ID=ID;
        messageFromClient=filterMessage(messageFromClient);
    }
    public long getId(){
        return id;
    }
    public void setMessageFromAssistant(String messageFromAssistant){
        this.messageFromAssistant=messageFromAssistant;
    }
    public String getMessageFromAssistant(){
        return messageFromAssistant;
    }
    public String getMessageFromClient(){
        return messageFromClient;
    }
    private String filterMessage(String message) {
        if (message == null) {
            return null;
        }
        List<String> forbiddenWords = List.of("badword1", "badword2", "badword3");
        String filteredMessage = message;
        for (String word : forbiddenWords) {
            filteredMessage = filteredMessage.replaceAll("(?i)\\b" + word + "\\b", "***");
        }
        return filteredMessage;
    }


}
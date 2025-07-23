import java.util.HashMap;
import java.util.Scanner;

public class AdvancedChatbot {

    public static void main(String[] args) {
        HashMap<String, String> responses = new HashMap<>();

        // Greeting category
        responses.put("hello", "Hello! How can I assist you?");
        responses.put("hi", "Hi there! What can I do for you?");
        responses.put("good morning", "Good morning! How can I help you?");
        responses.put("good evening", "Good evening! What would you like to know?");
        responses.put("hey", "Hey! How can I assist you today?");

        // Farewell
        responses.put("bye", "Goodbye! Have a nice day!");
        responses.put("see you", "See you again soon!");
        responses.put("exit", "Exiting... Goodbye!");

        // Support-related
        responses.put("help", "Sure! I can answer questions about Java, services, and more.");
        responses.put("support", "You can reach our support team at support@example.com.");
        responses.put("contact", "Please contact us at contact@example.com.");
        responses.put("issue", "I'm sorry to hear that. Could you describe the issue in detail?");
        
        // Technical questions
        responses.put("what is java", "Java is a high-level, object-oriented programming language.");
        responses.put("what is oop", "OOP stands for Object-Oriented Programming.");
        responses.put("what is class", "A class is a blueprint for creating objects.");
        responses.put("what is object", "An object is an instance of a class.");
        responses.put("difference between class and object", "Class is a template, object is an instance.");

        // Fallback
        String defaultReply = "I'm not sure how to respond to that. Try asking something else.";

        Scanner scanner = new Scanner(System.in);
        System.out.println("🤖 Chatbot: Hi! I'm your assistant. Ask me anything. (type 'exit' to quit)");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase().trim();

            if (userInput.equals("exit") || userInput.equals("bye")) {
                System.out.println("🤖 Chatbot: " + responses.get("exit"));
                break;
            }

            boolean found = false;
            for (String key : responses.keySet()) {
                if (userInput.contains(key)) {
                    System.out.println("🤖 Chatbot: " + responses.get(key));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("🤖 Chatbot: " + defaultReply);
            }
        }

        scanner.close();
    }
}

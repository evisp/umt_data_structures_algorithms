import java.util.Stack;

public class TextEditor {
    private StringBuilder currentText;  // The current text in the editor
    private Stack<String> history;      // Stack to store previous states for Undo

    // Constructor to initialize the text editor
    public TextEditor() {
        this.currentText = new StringBuilder();
        this.history = new Stack<>();
    }

    // Method to add text to the editor
    public void addText(String text) {
        // Save the current text state before making changes
        history.push(currentText.toString());
        currentText.append(text);
    }

    // Method to delete last n characters from the editor
    public void deleteText(int length) {
        // Save the current text state before making changes
        history.push(currentText.toString());
        currentText.delete(currentText.length() - length, currentText.length());
    }

    // Method to undo the last change
    public void undo() {
        if (!history.isEmpty()) {
            // Revert to the previous state from the stack
            currentText = new StringBuilder(history.pop());
        } else {
            System.out.println("No actions to undo.");
        }
    }

    // Method to get the current text in the editor
    public String getCurrentText() {
        return currentText.toString();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        System.out.println("Editing text with some movie magic!");

        editor.addText("The Force is strong");
        System.out.println("Current Text: " + editor.getCurrentText());  // Output: The Force is strong

        editor.addText(" with this one.");
        System.out.println("Current Text: " + editor.getCurrentText());  // Output: The Force is strong with this one.

        editor.deleteText(5);  // Deleting " one."
        System.out.println("Current Text: " + editor.getCurrentText());  // Output: The Force is strong with thi

        editor.undo();
        System.out.println("After Undo: " + editor.getCurrentText());  // Output: The Force is strong with this one.

        editor.addText(" " + "you shall not pass!");
        System.out.println("Current Text: " + editor.getCurrentText());  // Output: The Force is strong with this one. you shall not pass!

        editor.deleteText(5);  // Deleting " pass!"
        System.out.println("Current Text: " + editor.getCurrentText());  // Output: The Force is strong with this one. you shall not

        editor.undo();
        System.out.println("After Undo: " + editor.getCurrentText());  // Output: The Force is strong with this one. you shall not pass!

        editor.addText(" I am Iron Man.");
        System.out.println("Current Text: " + editor.getCurrentText());  // Output: The Force is strong with this one. you shall not pass! I am Iron Man.

        editor.undo();
        System.out.println("After Undo: " + editor.getCurrentText());  // Output: The Force is strong with this one. you shall not pass!
    }
}

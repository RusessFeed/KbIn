public class KbIn {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        System.out.println("Нажмите на клавишу и затем ENTER: ");
        ch = (char) System.in.read();
        System.out.println("Была нажата клавиша: " + ch);
    }
}

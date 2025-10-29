package Aufgabe_3;

public class Klammerpruefer {
    private static final Stack<Character> stack = new ArrayStack<>();

    public static void main(String[] args){
        String str = "([{})";

        if(pruefeString(str)){
            System.out.println("Klammersetzung korrekt!");
        }
        else {
            System.out.println("Klammersetzung falsch!");
        }
    }

    private static boolean pruefeString(String str){
        Character prevLetter = str.charAt(0);
        stack.push(prevLetter);

        for(int i = 1; i < str.length();i++) {
            char currLetter = str.charAt(i);
            prevLetter = stack.view();
            if (prevLetter == null) continue;
            if (openKlammer(currLetter)) {
                stack.push(currLetter);
            } else {
                if (!openKlammer(currLetter) && sameCategory(currLetter, (char)prevLetter)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return prevLetter != null; //prüft ob noch offene Klammer/stack nicht leer ist
    }

    private static boolean openKlammer(char chr){
        return (chr == '(' || chr == '{' || chr == '[');
    }

    private static boolean sameCategory(char curr, char prev){
        if((prev == '(') && (curr == ')')){
            return true;
        }
        else if((prev == '[') && (curr == ']')){
            return true;
        }
        else return ((prev == '{') && (curr == '}'));
    }
}

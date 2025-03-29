package tudelft.caesarshift;

public class CaesarShiftCipher {
    //EJERCICIO 3:
    public String CaesarShiftCipher(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        shift = shift % 26;  // asegurar que el shift este en rango

        for (char currentChar : message.toCharArray()) {
            if (currentChar < 'a' || currentChar > 'z') {
                return "invalid";  // si hay caracteres fuera de "a" - "z"
            }
            char shiftedChar = (char) (currentChar + shift);
            if (shiftedChar > 'z') {
                shiftedChar -= 26;  // ajuste para mantener dentro de "a" - "z"
            }
            sb.append(shiftedChar);
        }

        return sb.toString();
    }
}

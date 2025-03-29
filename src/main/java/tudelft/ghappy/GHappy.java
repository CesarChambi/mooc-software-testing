package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str != null;
        //EJERCICIO 2:
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                //verificar que hay otra "g" a la izquierda o a la derecha
                boolean leftHappy = (i > 0 && str.charAt(i - 1) == 'g');
                boolean rightHappy = (i + 1 < str.length() && str.charAt(i + 1) == 'g');
                if (!leftHappy && !rightHappy) {
                    return false;  //si no hay "g" ni a la izquierda ni a la derecha es infeliz
                }
            }
        }

        return true;
    }
}

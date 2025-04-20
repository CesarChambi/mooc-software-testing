package tudelft.autenticador;

//ACTIVIDADES:
//Agregar los escenarios de prueba para tener un Testing Estructural en la cual se tengan en consideración tener un Coverage de un 100%

public class Autenticador {
    private String[] usuariosPermitidos = {"admin","usuario", "invitado"};

    public boolean autenticar(String usuario, String password) {
        if(usuario == null || password == null){
            return false;
        }
        if(password.length() < 4){
            return false;
        }

        boolean usuarioValido = false;

        for(String permitido : usuariosPermitidos){
            if(permitido.equals(usuario)){
                usuarioValido = true;
                break;
            }
        }

        if(!usuarioValido){
            return false;
        }

        return password.equals("1234");
    }
}
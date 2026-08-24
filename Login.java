public class Login {

    public static boolean validarUsuario(String usuario, String password) {

        if (usuario == null || password == null) {
            return false;
        }

        if (usuario.isEmpty() || password.isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Sistema de Matricula Academica");
        System.out.println("Login seguro");
    }
}

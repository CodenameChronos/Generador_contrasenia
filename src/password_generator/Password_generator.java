package password_generator;
import java.util.Random;
import javax.swing.JOptionPane;
public class Password_generator {

    public static String pwd(int largo) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        Random random = new Random();
        StringBuilder password = new StringBuilder(largo); 
        //clase que viene incluida en java, password se llamará el String construido
        for (int i = 0; i < largo; i++) {
            int siguienteCaracter = random.nextInt(caracteres.length()); 
            //genera un valor numerico, el límite es la longitud del String caracteres
            password.append(caracteres.charAt(siguienteCaracter));
            //append agrega al final al string Password. charAt obtiene el caracter en la posición "siguiente caracter"
        }
        return password.toString();
        //Lo construido se regresa en formato String al objeto del método del mismo nombre
    }
    public static void main(String[] args){
        int largo;
        largo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la contraseña"));
        JOptionPane.showMessageDialog(null, pwd(largo));
    }
}

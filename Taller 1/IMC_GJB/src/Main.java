import javax.swing.*;

// @author Giovanni Jaramillo
public class Main {
    public static void main(String[] args) {
        String name;
        float weight, height;

        name = JOptionPane.showInputDialog(
                "Bienvenido a la calculadora de IMC \n" +
                        "Digite su nombre");

        weight = Float.parseFloat(JOptionPane.showInputDialog("Digite su peso"));
        height = Float.parseFloat(JOptionPane.showInputDialog("Digite su estatura"));

        Person p1 = new Person(name, weight, height);

        BmiCalculator bmi = new BmiCalculator(p1.getWeight(), p1.getHeight());

        JOptionPane.showMessageDialog(null,
                "Calculando...",
                "Calculadora de IMC", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Hola "+p1.getName()+"\n" +
                "Su IMC es de " + bmi.getBmi() + "\n" +
                        "Tu clasificacion es: " + bmi.check_status(),
                "Calculador de IMC", JOptionPane.INFORMATION_MESSAGE);

    }
}
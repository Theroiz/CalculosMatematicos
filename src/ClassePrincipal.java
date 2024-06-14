
import java.util.Random;
public class ClassePrincipal {
    public static double celsiusToFahrenheit (double fahrenheit)
    {
        double celsius = 5 / 9 * (fahrenheit - 32);
        return celsius;
    }
    public static double HipoTriangulo ( double altura, double largura)
    {
        double hipotenusa = Math.sqrt((altura * altura) + (largura * largura));
        return hipotenusa;
    }
    public static double dados()
    {
        Random rNumb = new Random();
        int giro1 = rNumb.nextInt(1,6);
        int giro2 = rNumb.nextInt(1,6);
        return giro1 + giro2;
    }
    
}

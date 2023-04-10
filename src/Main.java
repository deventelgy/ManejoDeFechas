import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args)
    {
        Calendar calendario = new GregorianCalendar(2023, Calendar.DECEMBER, 25);
        //Calendar calendario2 = Calendar.getInstance();
        //int anio = calendario2.get(Calendar.DAY_OF_YEAR);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int anio = calendario.get(Calendar.YEAR);

        System.out.println("Dia: "+dia);
        System.out.println("Mes "+mes);
        System.out.println("Año: "+anio);


    }
}
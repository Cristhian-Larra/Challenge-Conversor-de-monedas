import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CalcularTarifa calcularTarifa = new CalcularTarifa();
        Scanner lectura = new Scanner(System.in);
        while (true){
            System.out.println("""
                    **************************************************************

                            Bienvenido al conversor de Monedas

                    Indique que operación quiere realizar\s
                    1.Realizar conversion
                    0.Salir
                    **************************************************************
                    """);
            var op = lectura.nextLine();
            switch (op){
                case "0":
                    System.out.println("GRACIAS VUELVA PRONTO!!  \n");
                    System.out.println("El programa a finalizado");
                    System.exit(0);
                    break;
                case "1":
                    try {
                        System.out.println("Ingrese el codigo del pais de su moneda actual: ");
                        String pais1 = lectura.nextLine();
                        System.out.println("Ingrese el valor de su moneda actual: ");
                        String valor = lectura.nextLine();
                        System.out.println("Ingrese el codigo del pais al cual quiere convertir su moneda: ");
                        String pais2 = lectura.nextLine();
                        double valorCalculado = calcularTarifa.calcular(pais1.toUpperCase(), pais2.toUpperCase(), Double.valueOf(valor));
                        System.out.println("\n" +
                                pais1.toUpperCase() + ":" + valor + "\n" + "Equivalen a\n" +
                                pais2.toUpperCase() + ":" + String.format("%.2f",(valorCalculado)));
                    }catch (NumberFormatException e){
                        System.out.println("Error valor digitado no valido " + e.getMessage());
                    }catch (NullPointerException e){
                        System.out.println("Error argumento nullo "+ e.getMessage());
                    }



                    break;
                default:
                    System.out.println("    ***Error***\n");
                    System.out.println("OPCION NO VALIDA, VUELVA A INTENTARLOS");
            }
        }
    }
}

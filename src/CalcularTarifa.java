public class CalcularTarifa {
    public double calcular(String codigoDeMoneda, String codigoDeMonedaAcalcular, Double valor){
        ConsultarTarifa consulta = new ConsultarTarifa();
        Tarifas tarifas = consulta.buscarTarifas(codigoDeMoneda);
        Double valorCalculado =  tarifas.conversion_rates().get(codigoDeMonedaAcalcular) * valor;
        String mensaje = "Error el arguneto " + codigoDeMoneda + " no se enconmtro";

        return  valorCalculado;





    }
}

public class FreteSedex implements FreteStrategy{
    public double calculaFrete(double distancia) {
        return 0.5*distancia; //50 centavos por km
    }
}

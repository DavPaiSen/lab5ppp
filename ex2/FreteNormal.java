public class FreteNormal implements FreteStrategy{
    public double calculaFrete (double distancia) {
        return 0.25*distancia; //25 centavos por km
    }
}

public class carro{
    public static void main (String [] args){//com as variaveis é mais facil
        String carro = "nissan";//eu informo o tipo da variavel, do um nome a ela, e passo um valor para ela, podendo ser numeros ou caracteres
        int ano = 2025;
        String name = "kicks";
        double pesoMedio = 1000.05;
        int velocidade = 180;

        System.out.println(//o print significa que estou pedindo que, me mostre algo na tela (um resultado)
            "Marca do carro:  "   + carro +  //dentro do print oque estiver entre "", sera uma menssagem exibida, e o outro é eu chamando a variavel
            "Ano de fabricação:  "   + ano +    //o simbolo de + é uma concatenação que une e me mostra as duas informações 
            "Quanto ele Pesa?  "  + pesoMedio +  
            "ele eh Rapido?  "  + velocidade +   
            "Qual carro eh?  "  + name);



}

}

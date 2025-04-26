public class repetDo{
    public static void main(String[] args) {
        int numero = 0;//aqui é igual ao for, diferença eu declaro a variavel antes
        do{// chamo o do e abro as chaves {}
            System.out.println("Contando: " + numero);//aqui na hora de printar eu coloco uma string ou nao e chamo a variavel
            numero++;//aqui estou dizendo para o laço que eu quero que el repita na sequencia 

        }while(numero <=10);//aqui eu passo o valor de ate onde quero que ele conte 
    }
}
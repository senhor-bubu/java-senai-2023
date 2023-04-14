/*constante -> variavel em java em que não posso alterar o valor
     * usamos a palavra chave FINAL
     */
    public class exemplo2 {

        public static final int  TAXA = 10;
        public static final double PI = 3.14;

        // public -> a constante pode ser acessada em qualquer parte de codígo.
        //static -> essa constante é compartilhada entre todas as classes do meu pro
        // final -> não posso alterar o valor.


        public static vois main(String[] args){
            System.out.println("a taxa da loja é de: "+ TAXA+"%");
            System.out.println("PI vale:" +PI);
        }

    }
   

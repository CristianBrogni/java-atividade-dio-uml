public class Main {
    public static void main(String[] args) {
        Iphone  iphone = new Iphone();

        //Reprodutor musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.println("----------------------");
        //Aparelho telefonico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("----------------------");
        //Navegador da internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

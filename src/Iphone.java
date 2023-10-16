public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void ligar() {
        System.out.println("Aparelho telefonico ligando");
    }

    @Override
    public void atender() {
        System.out.println("Aparelho telefonico atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Aparelho telefonico iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Navegador da internet exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegador da internet adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador da internet atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Reprodutor musical tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodutor musical pausando musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Reprodutor musical selecionando musica");
    }
}

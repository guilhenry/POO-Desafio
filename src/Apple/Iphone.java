package Apple;

import Apple.internet.NavegadorInternet;
import Apple.ligacao.AparelhoTelefonico;
import Apple.musica.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    public void ligar(){
        System.out.println("Ligando para contato");
    }
    public void atender(){
        System.out.println("atendendo ligação");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciou correio de voz");
    }

    public void tocar(){
        System.out.println("Tocando musica");
    }
    public void pausar(){
        System.out.println("Musica pausada");
    }
    public void selecionarMusica(){
        System.out.println("Musica selecionada");
    }

    public void exibirPagina(){
        System.out.println("Pagina aberta");
    }
    public void adicionarNovaPagina(){
        System.out.println("Pagina nova aberta");
    }
    public void atualizarPagina(){
        System.out.println("Pagina atuliazada");
    }
}

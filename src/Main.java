import Apple.Iphone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Iphone iphone = new Iphone();
    System.out.println("---------------ligação----------------");
    iphone.ligar();
    iphone.atender();
    iphone.iniciarCorreioVoz();
    System.out.println("---------------Musica----------------");
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica();
    System.out.println("---------------Internet----------------");
    iphone.exibirPagina();
    iphone.adicionarNovaPagina();
    iphone.atualizarPagina();
    }
}
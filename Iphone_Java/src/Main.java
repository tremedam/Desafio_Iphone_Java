public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Demonstrating the Music Player functionality
        iphone.selecionarMusica("Song A");
        iphone.tocar();
        iphone.pausar();

        // Demonstrating the Phone functionality
        iphone.ligar("123-456-7890");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Demonstrating the Internet Browser functionality
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.example.com");
        iphone.atualizarPagina();
    }
}
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    private String modelo;

    public iPhone(String modelo, String numero) {
        this.modelo = modelo;
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música no " + modelo + "...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no " + modelo + "...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica + " no " + modelo);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero + " usando o " + modelo);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no " + modelo + "...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no " + modelo + "...");
    }

    // Métodos de NavegadorNaInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url + " no " + modelo);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no " + modelo + "...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no " + modelo + "...");
    }
}

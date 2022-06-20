public class Main{
    public static void main(String[] args) {
        PessoaDAO Vitaototoso = new PessoaDAO();
        Pessoa Daslanviado = new Pessoa(4, "viado");
        Pessoa Vitogato = new Pessoa(10, "gato");
        Pessoa Lueslen = new Pessoa(24, "baitola");
        Vitaototoso.add(Daslanviado);
        Vitaototoso.add(Vitogato);
        Vitaototoso.add(Lueslen);
        System.out.println(Vitaototoso.getAll());
        Vitaototoso.delete(Lueslen);
        System.out.println(Vitaototoso.getAll());
        System.out.println(Vitaototoso.getbyid(10));
    }
}

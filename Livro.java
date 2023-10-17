package bilbioteca;

public class Livro {
  Titulo titulo;
  public Livro(int codigo) {
    titulo = new Titulo(codigo);
  }
  public int verPrazo() {
    return titulo.getPrazo();
  }


}

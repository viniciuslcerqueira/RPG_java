public class Bruxo extends Personagem {

    public Bruxo(String nickname) {
        super(nickname, 110, 80, 25, 25);
    }

    @Override
    public void seBuffar() {
        this.setForca(getForca() + 5);
        this.setInteligencia(getInteligencia() + 5);
        System.out.println(getNickname() + " aumentou sua força para " + getForca() + " e inteligência para " + getInteligencia());
    }



}

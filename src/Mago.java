public class Mago extends Personagem {


    public Mago(String nickname) {
        super(nickname, 80, 120, 10, 40);

    }

    @Override
    public void seBuffar() {
        this.setInteligencia(getInteligencia() + 25);
        System.out.println(getNickname() + " aumentou sua inteligência para " + getInteligencia());

    }

}

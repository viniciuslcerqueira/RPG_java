public class Mago extends Personagem {


    public Mago(String nickname, int health, int mana, int forca, int inteligencia) {
        super(nickname, health, mana, forca, inteligencia);
        health = 100;
    }

    @Override
    public void seBuffar() {
        this.setInteligencia(getInteligencia() + 10);
        System.out.println(getNickname() + " aumentou sua inteligência para " + getInteligencia());

    }

}

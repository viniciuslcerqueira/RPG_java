public class Guerreiro extends Personagem  {

    public Guerreiro(String nickname, int health, int mana, int forca, int inteligencia) {
        super(nickname, health, mana, forca, inteligencia);
    }

    @Override
    public void seBuffar() {
        this.setForca(getForca() + 10);
        System.out.println(getNickname() + " aumentou sua força para " + getForca());

    }
}

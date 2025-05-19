public class Bruxo extends Personagem {

    public Bruxo(String nickname, int health, int mana, int forca, int inteligencia) {
        super(nickname, health, mana, forca, inteligencia);
    }

    @Override
    public void seBuffar() {
        this.setForca(getForca() + 5);
        this.setInteligencia(getInteligencia() + 5);
        System.out.println(getNickname() + " aumentou sua força para " + getForca() + " e inteligência para " + getInteligencia());
    }



}

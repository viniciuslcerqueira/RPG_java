public class Guerreiro extends Personagem  {

    public Guerreiro(String nickname) {
        super(nickname, 150, 30, 40, 10);
    }

    @Override
    public void seBuffar() {
        this.setForca(getForca() + 10);
        System.out.println(getNickname() + " aumentou sua força para " + getForca());

    }
}

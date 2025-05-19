

public abstract class Personagem implements AcaoPersonagens {
    private final String nickname;
    private int health;
    private int mana;
    private int forca;
    private int inteligencia;


    public Personagem(String nickname, int health, int mana, int forca, int inteligencia) {
        this.nickname = nickname;
        this.health = health;
        this.mana = mana;
        this.forca = forca;
        this.inteligencia = inteligencia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public String getNickname() {
        return nickname;
    }


    public void atacar(Personagem alvo) {
        int vidaAtual = alvo.getHealth();
        int dano = this.getForca();
        int vidaFinal = vidaAtual - dano;

        if (vidaFinal <= 0) {
            vidaFinal = 0;
        }

        alvo.setHealth(vidaFinal);
        System.out.println(alvo.getNickname() + " Sofreu " + dano + " e agora sua vida é de: " + alvo.getHealth());
    }

    public void usarHabilidade(Personagem alvo) {
        int vidaAtual = alvo.getHealth();
        int dano = this.getInteligencia();
        int vidaFinal = vidaAtual - dano;

        if (vidaFinal <= 0) {
            vidaFinal = 0;
        }

        alvo.setHealth(vidaFinal);
        System.out.println(alvo.getNickname() + " Sofreu " + dano + " e agora sua vida é de: " + alvo.getHealth());
    }



}




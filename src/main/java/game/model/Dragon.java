package game.model;

/**
 * Modela un dragón. No es necesario modificar esta clase. Pero debe crear tantas clases como entidades
 * necesite para llevar a cabo esta parte del hito 3. Inclúyalas en el paquete "game.model"
 */
public class Dragon {

    private String name;
    private int life_points;

    public Dragon(String name, int life) {
        this.name = name;
        this.life_points = life;
    }

    public int getLife() {
        return this.life_points;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife_points() {
        return life_points;
    }

    public void setLife_points(int life_points) {
        this.life_points = life_points;
    }
}

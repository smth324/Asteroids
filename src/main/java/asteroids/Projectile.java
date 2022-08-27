/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

/**
 *
 * @author gocheco
 */
import javafx.scene.shape.Polygon;

public class Projectile extends Character {

    public Projectile(int x, int y) {
        super(new Polygon(2, -2, 2, 2, -2, 2, -2, -2), x, y);
    }

    @Override
    public void move() {
        this.character.setTranslateX(this.character.getTranslateX() + this.movement.getX());
        this.character.setTranslateY(this.character.getTranslateY() + this.movement.getY());
        if (this.character.getTranslateX() < 0) {
            this.alive = false;
        }

        if (this.character.getTranslateX() > AsteroidsApplication.WIDTH) {
            this.alive = false;
        }

        if (this.character.getTranslateY() < 0) {
            this.alive = false;
        }

        if (this.character.getTranslateY() > AsteroidsApplication.HEIGHT) {
            this.alive = false;
        }
    }
}

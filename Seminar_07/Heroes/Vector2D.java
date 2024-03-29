package Seminar_07.Heroes;


public class Vector2D {
    protected int posX;
    protected int posY;

    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected boolean isLeft(Vector2D oponent){
        return posX < oponent.posX;
    }

    protected double getDistance(Vector2D oponent){
        return Math.sqrt(Math.pow(posX - oponent.posX,2) + Math.pow(posY - oponent.posY,2));
    }

    protected Vector2D chooseWay(Vector2D opponent) {

        return new Vector2D(posX - opponent.posX, posY - opponent.posY);
    }
}

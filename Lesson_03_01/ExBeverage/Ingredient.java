package Lesson_03_01.ExBeverage;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }
    
/**Перегрузка метода toSrting */
    @Override
    public String toString() {
        return brand;
    }

    @Override
    public boolean equals(Object obj) {
        Ingredient t = (Ingredient) obj;
        return t.brand == this.brand;   // если наименования совпадают значит добавлять его не нужно
    }
}
package Lesson_01;
import java.util.Random;

public class BaseHero {
    protected static int number;
    protected static Random r;
/* модификатор protected - дает доступ в рамках текущего класса и в рамках всех классов наследников */
    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }
 /**Конструктор который отвечает за инициализацию */
    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() {
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
        BaseHero.r.nextInt(100, 200));
    }
/*Метод получения информации */
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }
/*Метод лечения */
    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    public void Attack(BaseHero target) {
        int damage = BaseHero.r.nextInt(10, 20);  // генерим случайное число урона
        target.GetDamage(damage);  // и передаем в метод GetDamage
    }
}


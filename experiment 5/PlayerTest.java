class Player {
    protected String name;
    protected int age;
    protected String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void play() {
        System.out.println(name + " is playing in position: " + position);
    }

    public void train() {
        System.out.println(name + " is training hard.");
    }
}

class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is batting/bowling as a " + position);
    }

    @Override
    public void train() {
        System.out.println(name + " is practicing in the nets.");
    }
}

class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is dribbling and scoring as a " + position);
    }

    @Override
    public void train() {
        System.out.println(name + " is doing cardio and ball control exercises.");
    }
}

class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }
    @Override
    public void play() {
        System.out.println(name + " is playing in the field as a " + position);
    }
    @Override
    public void train() {
        System.out.println(name + " is practicing dribbling and shooting.");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
        Cricket_Player cricketer = new Cricket_Player("Virat Kohli", 35, "Batsman");
        Football_Player footballer = new Football_Player("Lionel Messi", 36, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Manpreet Singh", 32, "Midfielder");

        cricketer.play();
        cricketer.train();

        footballer.play();
        footballer.train();

        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}

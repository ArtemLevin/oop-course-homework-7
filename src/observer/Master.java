package observer;

public class Master implements Observer {
    private  String name;
    private double salary;

    private String profession;

    public Master(String name) {
        this.name = name;
        salary = 80000;
        profession = "Программист";
    }

    @Override
    public void receiveOffer(String companyName, double salary, String profession) {
        if (this.salary < salary & profession.equals("Прогрaммист") ){
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s - %f - %s]\n", name, companyName, salary, profession);
            this.salary = salary;
        }
        else {
            System.out.printf("Мастер %s >>> Я найду работу получше! [%s - %f - %s]\n", name, companyName, salary, profession);
        }
    }
}

package observer;

public class Student implements Observer {

    private  String name;
    private double salary;

    private String profession;

    public Student(String name) {
        this.name = name;
        salary = 5000;
        profession = "Юрист";
    }

    @Override
    public void receiveOffer(String companyName, double salary, String profession) {
        if (this.salary < salary & profession.equals("Юрист")){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f - %s]\n", name, companyName, salary, profession);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f - %s]\n", name, companyName, salary, profession);
        }
    }
}

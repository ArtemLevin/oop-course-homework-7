package observer;

import java.util.ArrayList;
import java.util.Random;

public class Company {


    private Random random;
    private String nameCompany;
    private double maxSalary;

    private String createdVacancy;

    private Publisher jobAgency;

    private Vacancy vacancy;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    /**
     * TODO: Доработать метод, компания должна генерировать объект "Вакансия" и передавать
     *  объект в агенство.
     * Поиск сотрудника
     */

    public void needEmployee(){
        double salary = random.nextDouble(3000, maxSalary);
        String createdVacancy = new Vacancy().newVacancyCreation();
        jobAgency.sendOffer(nameCompany, salary, createdVacancy);
    }

}

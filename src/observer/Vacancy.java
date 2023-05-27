package observer;

import java.util.ArrayList;
import java.util.Random;

public class Vacancy {


    public ArrayList<String> professionsList = new ArrayList<>();
    public ArrayList<String> newVacancyListInitialization(){
        professionsList.add("Программист");
        professionsList.add("Юрист");
        professionsList.add("Экономист");
        return professionsList;
    }

    Random random = new Random();
    public String newVacancyCreation(){
        return newVacancyListInitialization().get(random.nextInt(0,professionsList.size()));
    }

}


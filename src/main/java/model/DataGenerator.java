package model;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {}
    public static class Registration {
        private Registration() {}
        public static ru.netology.delivery.data.TestUser generateByFaker(String locale) {
            Faker faker = new Faker(new Locale(locale));
            String[] cities = {"Петрозаводск", "Уфа", "Самара", "Махачкала", "Москва",
                "Хабаровск", "Воронеж", "Тверь", "Якутск", "Калуга", "Иркутск", "Элиста", "Пермь",
                "Владимир", "Тюмень", "Новосибирск", "Казань", "Чита", "Калининград", "Волгоград",
                "Ставрополь", "Краснодар", "Красноярск", "Ульяновск", "Сыктывкар", "Саранск",
                "Саратов", "Пермь", "Владивосток", "Липецк", "Мурманск", "Кемерово", "Курск",
                "Вологда", "Томск", "Тула", "Рязань", "Благовещинск","Киров", "Магадан", "Псков" };
                Random rand = new Random();

            return new ru.netology.delivery.data.TestUser(faker.name().name(),
                    faker.phoneNumber().phoneNumber(),
                    cities[rand.nextInt(cities.length)]
            );
        }
        }
    }
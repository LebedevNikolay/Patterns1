package ru.netology;

import com.github.javafaker.Faker;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;


public class DataGenerator {
    private DataGenerator() {
    }
    public static String generateDate(int shift) {
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateCity() {
        String[] cities = new String[]{"Петрозаводск", "Уфа", "Самара", "Махачкала", "Москва",
                "Хабаровск", "Воронеж", "Тверь", "Якутск", "Калуга", "Иркутск", "Элиста", "Пермь",
                "Владимир", "Тюмень", "Новосибирск", "Казань", "Чита", "Калининград", "Волгоград",
                "Ставрополь", "Краснодар", "Красноярск", "Ульяновск", "Сыктывкар", "Саранск",
                "Саратов", "Пермь", "Владивосток", "Липецк", "Мурманск", "Кемерово", "Курск",
                "Вологда", "Томск", "Тула", "Рязань", "Благовещинск","Киров", "Магадан", "Псков",
        };
        return cities[new Random().nextInt(cities.length)];
    }

    public static String generateName(String locale) {
        Faker faker = new Faker(new Locale(locale));
        return faker.name().lastName() + " " + faker.name().firstName();
    }
    public static String generatePhone(String locale) {
        Faker faker = new Faker(new Locale(locale));
        return faker.phoneNumber().phoneNumber();
    }

    public static class Registration {
        private Registration() {
        }

        public static UserInfo generateUser(String locale) {
            return new UserInfo(generateCity(), generateName(locale), generatePhone(locale));
        }
    }
    @Value
    public static class RegistrationDto {
        String city;
        String name;
        String phone;
    }
}
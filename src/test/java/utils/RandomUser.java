package utils;

import com.github.javafaker.Faker;

public class RandomUser {

    public String userName;
    public String emailAddress;
    public String password = "YHNyhn1199";

    public RandomUser() {
        Faker faker = new Faker();
        this.userName = faker.name().username();
        this.emailAddress = this.userName + faker.random().nextInt(1000) + "@gmail.com";
    }

    @Override
    public String toString() {
        return "RandomUser{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + emailAddress + '\'' +
                '}';
    }
}

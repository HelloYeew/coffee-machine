package machine;
import java.util.Scanner;


public class CoffeeMachine {
    public void buy() {

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffee_beans = 120;
        int cups = 9;
        int money = 550;
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice = scanner.next();
                    switch (choice) {
                        case "1":
                            if (water >= 250 & coffee_beans >= 16 & cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                coffee_beans -= 16;
                                money += 4;
                                cups -= 1;
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else if (coffee_beans < 16){
                                System.out.println("Sorry, not enough coffee beans!");
                            } else {
                                System.out.println("Sorry, not enough disposable cups!");
                            }
                            break;
                        case "2":
                            if (water >= 350 & milk >= 75 & coffee_beans >= 20 & cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                coffee_beans -= 20;
                                money += 7;
                                cups -= 1;
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (coffee_beans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else {
                                System.out.println("Sorry, not enough disposable cups!");
                            }
                            break;
                        case "3":
                            if (water >= 200 & milk >= 100 & coffee_beans >= 12 & cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                coffee_beans -= 12;
                                money += 6;
                                cups -= 1;
                            } else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (coffee_beans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else {
                                System.out.println("Sorry, not enough disposable cups!");
                            }
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Wrong input");
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int fill_water = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int fill_milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int fill_coffee = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int fill_cups = scanner.nextInt();
                    water += fill_water;
                    milk += fill_milk;
                    coffee_beans += fill_coffee;
                    cups += fill_cups;
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffee_beans + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(money + " of money");
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
        }
        }
    }
}

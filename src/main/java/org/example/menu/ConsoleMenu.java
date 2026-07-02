package two.menu;

import two.model.*;
import two.shelter.Shelter;

import java.util.Scanner;

public class ConsoleMenu {
    private final Shelter<Animal> shelter;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleMenu(Shelter<Animal> shelter) {
        this.shelter = shelter;
    }

    public void start() {
        while (true) {
            printMenu();
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter one of the following animal species:\nCat\nDog\nBird");
                    String animalSpecies = scanner.next();
                    System.out.println("Enter animal name: ");
                    String name = scanner.next();
                    System.out.println("Enter animal age: ");
                    int age = scanner.nextInt();
                    if (animalSpecies.equalsIgnoreCase("Cat"))
                        shelter.addAnimal(new Cat(new AnimalId(), name, age));
                    else if (animalSpecies.equalsIgnoreCase("Dog"))
                        shelter.addAnimal(new Dog(new AnimalId(), name, age));
                    else if (animalSpecies.equalsIgnoreCase("Bird"))
                        shelter.addAnimal(new Bird(new AnimalId(), name, age));
                    else System.out.println("Invalid input(s)");
                    break;
                case 2:
                    System.out.println(shelter.getAllAnimals());
                    break;
                case 3:
                    System.out.println("Enter one of the following animal species:\nCat\nDog\nBird");
                    String species = scanner.next();
                    System.out.println(shelter.findBySpecies(species));
                    break;
                case 4:
                    System.out.println(shelter.findAvailableAnimals());
                    break;
                case 5:
                    System.out.println("Enter animal id:");
                    String animalId = scanner.next();
                    shelter.markAsAdopted(animalId);
                    System.out.println("Animal with id " + animalId + " marked as adopted");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    private void printMenu() {
        System.out.println("""
                1. Add animal
                2. List all animals
                3. Find animals by species
                4. List available animals
                5. Mark animal as adopted
                0. Exit
                """);
    }
}

package View;

import controller.ProdukteController;
import controller.ProdukteControllerInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private ProdukteControllerInterface produkteController;


    public View(ProdukteControllerInterface produkteController) {
        this.produkteController = produkteController;


        produkteController.addProdukte("Banane", 5, 25759, 10);
        produkteController.addProdukte("Kirschen", 40, 45464, 6);


    }


    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""
                     
                     0. Exit Program \r
                     1. Show all Products \r
                     2. Add a Product \r
                     3. Remove a Product \r
                     4. Update a Product \r
                    """);
            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                case 0:
                    break loop;
                case 1:
                    showProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    addProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:

            }

        }
    }

        private void showProduct() {
            System.out.println(produkteController.getAll());
        }

        private void addProduct() {
            Scanner scanner = new Scanner(System.in);


            try {
                int id = scanner.nextInt();
                System.out.println("Enter Product name:");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Enter Product price:");
                int price = scanner.nextInt();
                System.out.println("Enter Product sku:");
                double sku = scanner.nextDouble();
                System.out.println("Enter Product anzahl:");
                int anzahl = scanner.nextInt();

                produkteController.addProdukte(name, price, sku,anzahl);
            } catch (Exception e) {
                throw e;
            }
        }

        private void deleteProduct() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Product name:");
            String name = scanner.nextLine();
            produkteController.deleteProdukt(name);
        }

        private void updateMovie() {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("You will need to write a few things that represent Product attributes.");
                System.out.println("Enter Product name:");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Enter Product price:");
                int price = scanner.nextInt();
                System.out.println("Enter Product sku:");
                double sku = scanner.nextDouble();
                System.out.println("Enter Product anzahl:");
                int anzahl = scanner.nextInt();

                produkteController.addProdukte(name, price, sku,anzahl);
            } catch (Exception e) {
                throw e;
            }
        }
    }
//package ru.netology;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        // Создаем экземпляр класса Game
//        Game game = new Game();
//
//        // Создаем игроков
//        Player player1 = new Player(1, "John", 10);
//        Player player2 = new Player(2, "Alice", 15);
//        Player player3 = new Player(3, "Bob", 12);
//
//        // Регистрируем игроков в турнире
//        game.register(player1);
//        game.register(player2);
//
//        try {
//            // Производим раунд между игроками John и Alice
//            int result = game.round("John", "Alice");
//            switch (result) {
//                case 0:
//                    System.out.println("It's a tie.");
//                    break;
//                case 1:
//                    System.out.println("John wins.");
//                    break;
//                case 2:
//                    System.out.println("Alice wins.");
//                    break;
//            }
//        } catch (NotRegisteredException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            // Производим раунд между игроками John и Bob
//            int result = game.round("John", "Bob");
//            switch (result) {
//                case 0:
//                    System.out.println("It's a tie.");
//                    break;
//                case 1:
//                    System.out.println("John wins.");
//                    break;
//                case 2:
//                    System.out.println("Bob wins.");
//                    break;
//            }
//        } catch (NotRegisteredException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
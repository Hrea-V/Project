package org.example;

import com.google.gson.Gson;

import java.util.*;

public class Main {
    public static <id> void main(String[] args) {
        Set<Integer> id = new HashSet<>();
        Map<String, Book> booksCollections = new HashMap<>();
        Map<Integer, Members> member = new HashMap<>();
//        Books TLOTR = new Books("9788845292613", "The Lord of the Rings", BookTypes.FANTASY);
//        Books HP1 = new Books("9780545069670", "Harry Potter and the Philosopher's Stone", BookTypes.FANTASY);
//        book.put(TLOTR.getISBN(), TLOTR);
//        book.put(HP1.getISBN(), HP1);
            ArrayList<String> bTypes = new ArrayList<>();
            bTypes.add("Fantasy"  + "Science_Fiction"  + "Action_and_Adventure"  + "Mystery"  + "Horror" + "Thriller"  + "Historical");
            Gson gson = new Gson();

        System.out.println(gson.toJson(bTypes.toString()));
            boolean loop = true;
            do {
                System.out.println("What do you want to do?");
                System.out.println("1. Add a new book");
                System.out.println("2. Add a new Member");
                System.out.println("3. Borrow a Book");
                System.out.println("4. Return a Book");
                System.out.println("5. Exit");
                Scanner scanner = new Scanner(System.in);
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter the name of the book: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter the ISBN of the book: ");
                        String ISBN = scanner.nextLine();
                        System.out.println("Enter the Genre of the book: ");
                       // System.out.println();
                        BookTypes type = null;
                        try {
                            type = BookTypes.valueOf(scanner.nextLine());
                        } catch (IllegalArgumentException e) {
                            System.out.println("no such type");
                        }
                        Book book1 = new Book(ISBN, name, type);
                        booksCollections.putIfAbsent(ISBN, book1);
                        System.out.println("Book " + ISBN + " added to the book list");
                    }
                    case 2 -> {
                        System.out.println("Enter the name of the member: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter the Type of the member: ");
                        System.out.println("    PUBLIC, \n" +
                                           "    PAID, \n" +
                                           "    STAFF\n");
                        MemberTypes type = MemberTypes.valueOf(scanner.nextLine());
                        System.out.println("Enter the ID of the member: ");
                        int memberID = 0;
                        try {
                            memberID = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("id is not a number");
                        }
                        Members member1 = new Members(name, memberID, type);
                        member.putIfAbsent(memberID, member1);
                        id.add(memberID);
                        System.out.println("Member " + name + " added to the Member list");
                    }
                    case 3 -> {
                        System.out.println("Enter the name of the member that wish to borrow a book: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter the ISBN of the Book that you wish to borrow: ");
                        String ISBN = scanner.nextLine();
                        String bookName = booksCollections.get(ISBN).getTitle();
                        System.out.println("The Book " + bookName + " borrowed from the book list");
                    }
                    case 4 -> {
                        System.out.println("Enter the name of the member: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter the ISBN of the Book that you wish to return: ");
                        String ISBN = scanner.nextLine();
                        String bookName = booksCollections.get(ISBN).getTitle();
                        System.out.println("The Book " + bookName + " returned from the book list");
                    }
                    case 5 -> {
                        loop = false;
                    }
                    default -> System.out.println("invalid choice");
                }
            }while(loop);
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

//Animals
        ArrayList<Animal> AnimalMenu = new ArrayList<>();
//Use a loop to ask the user for the name of their animal and if the animal is a dog or no
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        Boolean isItDog = true;
        while (true) {
            System.out.println("Please enter a name: ");
            String animalName = UserInput.nextLine();
            if (animalName.isEmpty()) {
                break;
            }
            System.out.println("Is it a dog? Yes or no: ");
            String dogQuestion = UserInput.nextLine();
            if (dogQuestion.equalsIgnoreCase("y")){
                 isItDog = true;
            } else if (dogQuestion.equalsIgnoreCase("no")){
                isItDog = false;
            }
            AnimalMenu.add(new Animal(animalName, isItDog));
        }
        //print animal object using loop
        System.out.println(AnimalMenu);

        //TV Shows
        ArrayList<TvShow> TvShowList = new ArrayList<>();
        while (true) {
            System.out.println("Name of the show: ");
            String TvShowName = UserInput.nextLine();
            if (TvShowName.isEmpty()) {
                break;
            }
            System.out.println("How many episodes? ");
            int episodeNumber = Integer.valueOf(UserInput.nextLine());
            System.out.println("What is the genre? ");
            String genre = UserInput.nextLine();
            TvShowList.add(new TvShow(TvShowName, episodeNumber, genre));
        }
        System.out.println(TvShowList);


//Books
        ArrayList<Book> BookList = new ArrayList<>();


///adding books to array
        while (true) {
            System.out.println("Title of the Book: ");
            String bookTitle = UserInput.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
            System.out.println("How many pages? ");
            int pageNumber = Integer.valueOf(UserInput.nextLine());
            System.out.println("What is the publication year? ");
            int publicationYear = Integer.valueOf(UserInput.nextLine());
            BookList.add(new Book(bookTitle, pageNumber, publicationYear));
        }
        //displaying all books

        System.out.println("What information will be printed?");
        String BookUserInput = UserInput.nextLine();
        for (Book Book : BookList) {
            if (BookUserInput.equalsIgnoreCase("everything")) {
                System.out.println(BookList);
            } else if (BookUserInput.equalsIgnoreCase("name")) {
                System.out.println(Book.getBookTitle());
            }
        }
    }


    }

package pl.itacademy.lesson15;

public class GeneriksTester {
    public static void main(String[] args) {

        Food food = new Food("apple");
        Food food1 = new Food("bread");
        Food food2 = new Food("banana");
        Food food3 = new Food("water");
        Box<Food> box = new Box<>();
        box.add(food);
        box.add(food1);
        box.add(food2);
        box.add(food3);
        System.out.println(box.getList());

        Toy toy = new Toy("car");
        Toy toy1 = new Toy("train");
        Toy toy2 = new Toy("doll");
        Box<Toy> toyBox = new Box<>();
        toyBox.add(toy);
        toyBox.add(toy1);
        toyBox.add(toy2);
        System.out.println(toyBox.getList());

        Book book = new Tale("Harry Potter");
        Book book1 = new Fantasy("Abc");
        Book book2 = new Tale("Hours");
        Box<Book> bookBox = new Box<>();
        bookBox.add(book);
        bookBox.add(book1);
        bookBox.add(book2);
        System.out.println(bookBox.getList());

        FoodShelf foodShelf = new FoodShelf();
        foodShelf.addFood(box);
        foodShelf.printFoodShelf();

        ToysShelf toysShelf = new ToysShelf();
        toysShelf.addToy(toyBox);
        toysShelf.printToysShelf();

        BooksShelf booksShelf = new BooksShelf();
        booksShelf.addBook(bookBox);
        booksShelf.printBookShelf();

        UniversalShelf universalShelf = new UniversalShelf();
        universalShelf.addBox(box);
        universalShelf.addBox(bookBox);
        universalShelf.addBox(toyBox);
        universalShelf.printUniversalShelf();

    }

}

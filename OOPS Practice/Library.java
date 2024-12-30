import java.util.*;

class Lib{
    ArrayList<Book>store = new ArrayList<Book>();

    void add(Book B){
        store.add(B);
        System.out.println("Book Added SuccessFully");
        System.out.println();
        return ;
    }

    void showAll(){
        int n = store.size();
        for(int i=0;i<n;i++){
            Book B = store.get(i);
            System.out.println(i+1+".");
            System.out.println("Book Name : " + B.title);
            System.out.println("Author Name : " + B.author);
            System.out.println("ISBN Number : " + B.ISBN);
            System.out.println();
        }
    }

    void search(String title){
        int n = store.size();
        for(int i=0;i<n;i++){

            if(store.get(i).title.equals(title)){
                System.out.println("Book Present in Library");
                System.out.println();
                return;
            }
            System.out.println("Book Not Present in Library");
            System.out.println();
            return;
        }
    }

};

class Book{
    String title ;
    String author ;
    int ISBN;
    Book(String title , String author , int ISBN ){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
};

class Library{
    public static void main(String args[]){
        Lib library = new Lib();

        System.out.println("Welcome to Library \n");
    
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("1 to add new Book \n");
            System.out.println("2 to see all books  \n");
            System.out.println("3 to search particular book \n");
            System.out.println("ANY key to EXIT \n");
            int n = scan.nextInt();
            scan.nextLine();
            
            if(n == 1){
                System.out.println("Book Name :  \n");
                String name = scan.nextLine();
                System.out.println("Author Name :  \n");
                String author = scan.nextLine();
                System.out.println("ISBN Number :  \n");
                int isbn = scan.nextInt();
                scan.nextLine();
                
                Book b= new Book(name, author , isbn);
                library.add(b);
            }
            else if(n == 2){
                library.showAll();
            }
            else if(n == 3){
                System.out.println("Book Name :  \n");
                String name = scan.nextLine();
                library.search(name);
            }
            else {
                break;
            }
        }

        System.out.println("Visit Again");
        return ;

        
    }
}


/**
 * Write a description of class Book here.
 *
 * @author Srikar Ravi
 * @version October 8, 2020
 */
public class Book
{
   private int pages;
   private int page;
   
   public Book(int numPages, int currentPage)
   {
       pages = numPages;
       page = currentPage;

   }
   
   public static int addTotalPages(int pages1, int pages2, int pages3)
   {
       int totalPages = (int) pages1 + pages2 + pages3;
       return totalPages;
   }
   public static int addPagesread(int page1, int page2, int page3)
   {
       int pagesread = (int) page1 + page2 + page3;
       return pagesread;
   }
   
   
   public static void main(String[] args)
   {
       Book book1 = new Book(245, 15);
       Book book2 = new Book(325, 75);
       Book book3 = new Book(300, 45);
       
       System.out.println(book1.pages);
       System.out.println(book1.page);
       
       System.out.println(book2.pages);
       System.out.println(book2.page);
       
    System.out.println(addTotalPages(book1.pages, book2.pages, book3.pages));
    System.out.println(addPagesread(book1.page, book2.page, book3.page));
       
   }
}

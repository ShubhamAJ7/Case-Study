abstract class item{
    private int id,noc;
    private char tit;
    abstract void Com (int id,char tit,int noc);


   /* item()
            {
                System.out.println("Items:");
                System.out.println("Book");
                System.out.println("Journal");
                System.out.println("Video");
                System.out.println("CD");


            }*/
        // This keyword refers to current instance itself
    

}
/////////////////////////////////////
abstract class WrittenItem extends item
{
    char author;
    abstract void auth(char author);

    

}
class Book extends WrittenItem
{
    

    void Com (int id,char tit,int noc)
    {
        System.out.println("Book id :"+id);
        System.out.println("Book Title :"+tit);
        System.out.println("Book Nof of Copies :"+noc);
        
    }
    void auth(char author)
    {
        System.out.println("Book Author :"+author);
    }

}
class JournalPaper extends WrittenItem
{
    private int year;
    void Com (int id,char tit,int noc)
    {
        System.out.println("Journal id :"+id);
        System.out.println("Journal title :"+tit);
        System.out.println("Journal no of pages :"+noc);
        
    }
    void auth(char author)
    {
        System.out.println("Journal AUTHOR :"+author);
    }
    void year(int year)
    {
        this.year=year;
    }
    void getyear()
    {
        System.out.println("Journal Year :"+year);
    }

    

}
/////////////////////
abstract class MediaItem extends item
{
    int runtime;
    abstract void runtime (int runtime);

}
class Video extends MediaItem
{
    private char Director; 
    private int  Relyear;
    private char Genere;

    void Com (int id,char tit,int noc)
    {
        System.out.println("Video id :"+id);
        System.out.println("Video Title :"+tit);
        System.out.println("Video No of Copies :"+noc);
        
    }
    void runtime (int runtime)
    {
        System.out.println("Video Runtime :"+runtime);
    }
    void Vide(char Director,char Genere,int  Relyear)
    {
        this.Director=Director;
        this.Genere=Genere;
        this.Relyear=Relyear;
    }
    void getvideodetail()
    {
        System.out.println("Director Video :"+Director);
        System.out.println("Genere Video :"+Genere);
        System.out.println("Release Year Video :"+Relyear);
    }

}
class CD extends MediaItem

{
    private char Artist;
    private char Genere;
    void Com (int id,char tit,int noc)
    {
        System.out.println("CD id :"+id);
        System.out.println("CD TITLE :"+tit);
        System.out.println("CD NO OF COPIES :"+noc);
        
    }
    void runtime (int runtime)
    {
        System.out.println("CD RUNTIME :"+runtime);
    }
    void CDE(char Artist ,char Genere)
    {
        this.Artist=Artist;
        this.Genere=Genere;
        
    }
    void getcddetail()
    {
        System.out.println("CD ARTIST:"+Artist);
        System.out.println("CD Gnere :"+Genere);
        
    }

}

public class Library
{
    public static void main(String[] args) 
    {
        Book b=new Book();
        System.out.println("Book Detail:");
         b.auth('S');
        b.Com(1, 'a', 3);
        //////////////
        JournalPaper J=new JournalPaper();
        System.out.println("Journal Detail :");
         J.auth('J');
        J.Com(2, 'J', 3);
        J.year(5);
        J.getyear();
        ////////////////////
        Video V=new Video();
        System.out.println("Video Detail :");
         V.runtime(5);
        V.Com(4, 'J', 3);
        V.Vide('A', 'B', 2018);
        V.getvideodetail();
        ////////////////////////////
        CD C=new CD();
        System.out.println("CD Detail :");
         C.runtime(6);
        C.Com('E','F', 3);
        C.CDE('G', 'T');
        C.getcddetail();






        
    }
}

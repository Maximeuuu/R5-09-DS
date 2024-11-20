public class Q3
{
  public static void main( String[] args )
  {
    int nbEtoiles = Integer.parseInt(args[0]);

    String etoiles = "";
    for( int cpt=0; cpt<nbEtoiles; cpt++ )
    {
      etoiles += "*";
    }

    System.out.println( etoiles );
  }
}

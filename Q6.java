public class Q6
{
	public static void main( String[] args )
	{
		int nbEtoiles = Integer.parseInt(args[0]);

		StringBuilder sb = new StringBuilder();
		for( int cptLig=0; cptLig<nbEtoiles; cptLig++ )
		{
			for( int cptCol=cptLig; cptCol<nbEtoiles; cptCol++ )
			{
				sb.append('x');
			}
			sb.append('\n');
		}

		System.out.println( sb.toString() );
	}
}
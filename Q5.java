public class Q5
{
	public static void main( String[] args )
	{
		int nbEtoiles = Integer.parseInt(args[0]);

		StringBuilder sb = new StringBuilder();
		for( int cptLig=0; cptLig<nbEtoiles; cptLig++ )
		{
			for( int cptCol=0; cptCol<cptLig+1; cptCol++ )
			{
				sb.append('*');
			}
			sb.append('\n');
		}

		System.out.println( sb.toString() );
	}
}

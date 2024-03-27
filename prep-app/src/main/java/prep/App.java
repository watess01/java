package prep;

import prep.modules.AnagramFinder;
import prep.modules.string_tokens.StringBreaker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        System.out.println( "Hello World!" );

        AnagramFinder.Run();

        StringBreaker.Run("He is a very very good boy, isn't he?", 10);
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class ParsesSearchPath{
    /*Parse the Postgres "search_path" configuration value into an array.
    @param  string|list|null  searchPath
    @return list*/
  public static void parseSearchPath(String[] searchPath){
    Pattern pattern = Pattern.compile('/[^\s,"\']+/', Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(least[i]);
    boolean matchFound = matcher.find();
    if (matchFound){
    return searchPath.trim();
    }
    else{
      System.out.println("Match not found!");
    }
  }
}

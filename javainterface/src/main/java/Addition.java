//Example of impelementing inheritance , Consider this a drived class that extends base class
public class Addition extends CalculateBase {
    
 @Override
 public void calculations() {
     double value = getleftVal() + getrightVal();
     setResult(value);
 }

}

    


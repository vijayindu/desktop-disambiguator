package aruth;

import com.aruth.swsd.Disambiguator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

public TextField textContext;
public TextField textWord;

    public Text output;


    Disambiguator disambiguator=new Disambiguator();


  @FXML
  public void click(ActionEvent sctionEvent) throws Exception{
        String context=textContext.getCharacters().toString();
        String polysiomusWord=textWord.getCharacters().toString();

        String result=disambiguator.getNounSensesUsingOptimizedLesk(context,polysiomusWord);
      if (context.length()==0) {
          output.setText("Please enter context you need disambiguate");
      }
      else if (polysiomusWord.length()==0){
          output.setText("Please enter word you need disambiguate");
      }
      else if(!context.contains(polysiomusWord)){
          output.setText("Polysemous word you enter is not in the context");

      }
      else {

          output.setText(result);
      }     System.out.println(result);
   }





}

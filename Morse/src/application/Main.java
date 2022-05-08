package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent; 


public class Main extends Application {
	
	public static String encode (String toEncode)
    {
        String morse = toEncode;

        /*
         * pøiøazení písmen ke znakùm morseovky
         */
        
        if (toEncode.equalsIgnoreCase("a")) {
            morse = ".-";
        }
        else if (toEncode.equalsIgnoreCase("b")) {
            morse = "-...";
        }
        else if (toEncode.equalsIgnoreCase("c")) {
            morse = "-.-.";
        }
        else if (toEncode.equalsIgnoreCase("d")) {
            morse = "-..";
        }
        else if (toEncode.equalsIgnoreCase("e")) {
            morse = ".";
        }
        else if (toEncode.equalsIgnoreCase("f")) {
            morse = "..-.";
        }
        else if (toEncode.equalsIgnoreCase("g")) {
            morse = "--.";
        }
        else if (toEncode.equalsIgnoreCase("h")) {
            morse = "....";
        }
        else if (toEncode.equalsIgnoreCase("i")) {
            morse = "..";
        }
        else if (toEncode.equalsIgnoreCase("j")) {
            morse = ".---";
        }
        else if (toEncode.equalsIgnoreCase("k")) {
            morse = "-.-";
        }
        else if (toEncode.equalsIgnoreCase("l")) {
            morse = ".-..";
        }
        else if (toEncode.equalsIgnoreCase("m")) {
            morse = "--";
        }
        else if (toEncode.equalsIgnoreCase("n")) {
            morse = "-.";
        }
        else if (toEncode.equalsIgnoreCase("o")) {
            morse = "---";
        }
        else if (toEncode.equalsIgnoreCase("p")) {
            morse = ".--.";
        }
        else if (toEncode.equalsIgnoreCase("q")) {
            morse = "--.-";
        }
        else if (toEncode.equalsIgnoreCase("r")) {
            morse = ".-.";
        }
        else if (toEncode.equalsIgnoreCase("s")) {
            morse = "...";
        }
        else if (toEncode.equalsIgnoreCase("t")) {
            morse = "-";
        }
        else if (toEncode.equalsIgnoreCase("u")) {
            morse = "..-";
        }
        else if (toEncode.equalsIgnoreCase("v")) {
            morse = "...-";
        }
        else if (toEncode.equalsIgnoreCase("w")) {
            morse = ".--";
        }
        else if (toEncode.equalsIgnoreCase("x")) {
            morse = "-..-";
        }
        else if (toEncode.equalsIgnoreCase("y")) {
            morse = "-.--";
        }
        else if (toEncode.equalsIgnoreCase("z")) {
            morse = "--..";
        }
        else if (toEncode.equalsIgnoreCase(".")) {
            morse = ".-.-";
        }
        else if (toEncode.equalsIgnoreCase(",")) {
            morse = "--..--";
        }
        else if (toEncode.equalsIgnoreCase("?")) {
            morse = "..--..";
        }

        return morse;
    }

    public static String decode (String toEncode) {
        String morse = toEncode;

        /*
         * pøiøazení znakù morseovky k písmenùm
         */
        
        if (toEncode.equalsIgnoreCase(".-")) {
            morse = "a";
        }
        else if (toEncode.equalsIgnoreCase("-...")) {
            morse = "b";
        }
        else if (toEncode.equalsIgnoreCase("-.-.")) {
            morse = "c";
        }
        else if (toEncode.equalsIgnoreCase("-..")) {
            morse = "d";
        }
        else if (toEncode.equalsIgnoreCase(".")) {
            morse = "e";
        }
        else if (toEncode.equalsIgnoreCase("..-.")) {
            morse = "f";
        }
        else if (toEncode.equalsIgnoreCase("--.")) {
            morse = "g";
        }
        else if (toEncode.equalsIgnoreCase("....")) {
            morse = "h";
        }
        else if (toEncode.equalsIgnoreCase("..")) {
            morse = "i";
        }
        else if (toEncode.equalsIgnoreCase(".---")) {
            morse = "j";
        }
        else if (toEncode.equalsIgnoreCase("-.-")) {
            morse = "k";
        }
        else if (toEncode.equalsIgnoreCase(".-..")) {
            morse = "l";
        }
        else if (toEncode.equalsIgnoreCase("--")) {
            morse = "m";
        }
        else if (toEncode.equalsIgnoreCase("-.")) {
            morse = "n";
        }
        else if (toEncode.equalsIgnoreCase("---")) {
            morse = "o";
        }
        else if (toEncode.equalsIgnoreCase(".--.")) {
            morse = "p";
        }
        else if (toEncode.equalsIgnoreCase("--.-")) {
            morse = "q";
        }
        else if (toEncode.equalsIgnoreCase(".-.")) {
            morse = "r";
        }
        else if (toEncode.equalsIgnoreCase("...")) {
            morse = "s";
        }
        else if (toEncode.equalsIgnoreCase("-")) {
            morse = "t";
        }
        else if (toEncode.equalsIgnoreCase("..-")) {
            morse = "u";
        }
        else if (toEncode.equalsIgnoreCase("...-")) {
            morse = "v";
        }
        else if (toEncode.equalsIgnoreCase(".--")) {
            morse = "w";
        }
        else if (toEncode.equalsIgnoreCase("-..-")) {
            morse = "x";
        }
        else if (toEncode.equalsIgnoreCase("-.--")) {
            morse = "y";
        }
        else if (toEncode.equalsIgnoreCase("--..")) {
            morse = "z";
        }
        else if (toEncode.equalsIgnoreCase("|")) {
            morse = "";
        }
        
        return morse;
    }

    public static String stringMorse( String text )
    {

        String novyText = "";
        String vybranyZnak;
        String prevedenyZnak;
        for (int i = 0; i < text.length(); i++)
        {

            //vybrání dalšího znaku
        	vybranyZnak = text.charAt(i) + "";

            //pøevedení znaku
        	prevedenyZnak = encode(vybranyZnak);

            if (prevedenyZnak.equals("")) //
            {
                novyText = novyText + "|";
            }
            // pøidání pøevedeného textu a pøídání mezery
            else
            {
                novyText = novyText + prevedenyZnak;
                if (!prevedenyZnak.equals(""))
                {
                    novyText = novyText + "|";
                }
            }
        }

        return novyText;
    }
    public static String stringCzech( String text )
    {    
    		   String cestina = ""; //nastavení stringu cestina
    		   String vybranaCestina; //nastavení stringu pro vybranaCestina
    		   String prevedenaCestina; //nastavení stringu pro prevedenaCestina
    		   String[] znaky = text.split(" ");    		   
    		   for (int i = 0; i < znaky.length; i++)
    		   {
    		       //vybrání dalšího znaku morseovky
    			   vybranaCestina = znaky[i];
    		       boolean konci = vybranaCestina.endsWith("||");
    		       if(konci) vybranaCestina = vybranaCestina.substring(0, vybranaCestina.length() - 1);
    		       //pževedení stringu
    		       prevedenaCestina = decode(vybranaCestina);

    		       cestina = cestina + prevedenaCestina;
    		       if (konci) {
    		           cestina = cestina + " ";
    		       }
    		   }

    		   return cestina;
    }	
   
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Button btn = new Button("Morzeovka na èeštinu");
			Button btn1 = new Button("Èeština na morzeovku");
			TextArea area = new TextArea();				
			
			Label lbl = new Label("Zadej text který chceš pøeložit! Následnì vyber z možností!");
			Label lbl1 = new Label("Pøeklad");
			VBox box = new VBox(btn,btn1);
			Label navod = new Label("Morseovka se zadává:\n''.. | --- || ..'' nebo ''.. --- || ..'' \nvýsledek je ''io i''");
			navod.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
			navod.setDisable(false);
			
			TextArea vypis = new TextArea();
			vypis.setEditable(false);

			btn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {					
					String b = stringCzech(area.getText()); //pøidìlení pøeloženého textu
					vypis.setText(b); //výpis do text arey
				}
			});
			
			btn1.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {					
					String a = stringMorse(area.getText()); //pøidìlení pøeloženého textu
					vypis.setText(a);
				}

			});
			
			GridPane tabulka = new GridPane(); 
			
			tabulka.setPadding(new Insets(3));
	        tabulka.setHgap(10);
	        tabulka.setVgap(10);
	        tabulka.add(lbl, 0, 0);
	        tabulka.add(navod, 0, 1);;
	        tabulka.add(area, 0, 2);
	        tabulka.add(box, 2, 2);
	        tabulka.add(lbl1, 0, 3);
	        tabulka.add(vypis, 0, 4);
		
			Scene scene = new Scene(tabulka,1024,720);
			primaryStage.setTitle("Pøekladaè");
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
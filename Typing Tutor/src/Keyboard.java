/*kevin nguyen 020793105
* Virtual keyboard typing simulation
* displays text on screen whilst highlighting keyboard presses*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Keyboard extends JFrame {
    //array of keyboard characters
    public static final String[] qwerty = {"`","1","2","3","4","5","6","7","8","9","0","-","=","Backspace","Tab","q","w","e","r","t","y","u","i","o","p",
                                        "[","]","\\","caps","a","s","d","f","g","h","j","k","l",";","'","enter","shift", "z",
                                        "x","c","v","b","n","m",",",".","/","^"," ","<","↓",">"};
    private KeyBoardPane keyboardpane = new KeyBoardPane();

    Keyboard(){
        add(keyboardpane);
    }

    public static void main(String[] args) {
        Keyboard key = new Keyboard();
        key.setSize(710,400);
        key.setVisible(true);
        key.getContentPane();
        key.setDefaultCloseOperation(EXIT_ON_CLOSE);
        key.setTitle("virtual keyboard");
    }
}
 class KeyBoardPane extends JPanel{                             //class to create keyboard layout and listener functions and response
     JButton[] keyButtons;                                      //array for buttons
     JPanel panel;
     JTextArea textArea;                                         //area for typing

    public KeyBoardPane(){
        makeKeyboard();
        setFocusable(true);
        this.addKeyListener(new KeyListener(){                          //listens for keyboard input
            @Override
            public void keyPressed(KeyEvent e){
                switch (e.getKeyChar()){
                    case '`':
                        keyButtons[0].setBackground(Color.GREEN);
                        textArea.append(Keyboard.qwerty[0]);
                        break;
                    case '~':
                        keyButtons[0].setBackground(Color.GREEN);
                        textArea.append("~");
                        break;
                    case '1':
                        keyButtons[1].setBackground(Color.GREEN);
                        textArea.append("1");
                        break;
                    case '!':
                        keyButtons[1].setBackground(Color.GREEN);
                        textArea.append("!");
                        break;
                    case '2':
                        keyButtons[2].setBackground(Color.GREEN);
                        textArea.append("2");
                        break;
                    case '@':
                        keyButtons[2].setBackground(Color.GREEN);
                        textArea.append("@");
                        break;
                    case '3':
                        keyButtons[3].setBackground(Color.GREEN);
                        textArea.append("3");
                        break;
                    case '#':
                        keyButtons[3].setBackground(Color.GREEN);
                        textArea.append("#");
                        break;
                    case '4':
                        keyButtons[4].setBackground(Color.GREEN);
                        textArea.append("4");
                        break;
                    case '$':
                        keyButtons[4].setBackground(Color.GREEN);
                        textArea.append("$");
                        break;
                    case '5':
                        keyButtons[5].setBackground(Color.GREEN);
                        textArea.append("5");
                        break;
                    case '%':
                        keyButtons[5].setBackground(Color.GREEN);
                        textArea.append("%");
                        break;
                    case '6':
                        keyButtons[6].setBackground(Color.GREEN);
                        textArea.append("6");
                        break;
                    case '^':
                        keyButtons[6].setBackground(Color.GREEN);
                        textArea.append("^");
                        break;
                    case '7':
                        keyButtons[7].setBackground(Color.GREEN);
                        textArea.append("7");
                        break;
                    case '&':
                        keyButtons[7].setBackground(Color.GREEN);
                        textArea.append("&");
                        break;
                    case '8':
                        keyButtons[8].setBackground(Color.GREEN);
                        textArea.append("8");
                        break;
                    case '*':
                        keyButtons[8].setBackground(Color.GREEN);
                        textArea.append("*");
                        break;
                    case '9':
                        keyButtons[9].setBackground(Color.GREEN);
                        textArea.append("9");
                        break;
                    case '(':
                        keyButtons[9].setBackground(Color.GREEN);
                        textArea.append("(");
                        break;
                    case '0':
                        keyButtons[10].setBackground(Color.GREEN);
                        textArea.append("0");
                        break;
                    case ')':
                        keyButtons[10].setBackground(Color.GREEN);
                        textArea.append(")");
                        break;
                    case '-':
                        keyButtons[11].setBackground(Color.GREEN);
                        textArea.append("-");
                        break;
                    case '_':
                        keyButtons[11].setBackground(Color.GREEN);
                        textArea.append("_");
                        break;
                    case '=':
                        keyButtons[12].setBackground(Color.GREEN);
                        textArea.append("=");
                        break;
                    case '+':
                        keyButtons[12].setBackground(Color.GREEN);
                        textArea.append("+");
                        break;
                    case '\b':
                        keyButtons[13].setBackground(Color.GREEN);
                        textArea.replaceRange("",textArea.getSelectionStart()-1,textArea.getSelectionEnd());
                        break;
                    case '\t':
                        keyButtons[14].setBackground(Color.GREEN);
                        break;
                    case 'q':
                        keyButtons[15].setBackground(Color.GREEN);
                        textArea.append("q");
                        break;
                    case 'Q':
                        keyButtons[15].setBackground(Color.GREEN);
                        textArea.append("Q");
                        break;
                    case 'w':
                        keyButtons[16].setBackground(Color.GREEN);
                        textArea.append("w");
                        break;
                    case 'W':
                        keyButtons[16].setBackground(Color.GREEN);
                        textArea.append("W");
                        break;
                    case 'e':
                        keyButtons[17].setBackground(Color.GREEN);
                        textArea.append("e");
                        break;
                    case 'E':
                        keyButtons[17].setBackground(Color.GREEN);
                        textArea.append("E");
                        break;
                    case 'r':
                        keyButtons[18].setBackground(Color.GREEN);
                        textArea.append("r");
                        break;
                    case 'R':
                        keyButtons[18].setBackground(Color.GREEN);
                        textArea.append("R");
                        break;
                    case 't':
                        keyButtons[19].setBackground(Color.GREEN);
                        textArea.append("t");
                        break;
                    case 'T':
                        keyButtons[19].setBackground(Color.GREEN);
                        textArea.append("T");
                        break;
                    case 'y':
                        keyButtons[20].setBackground(Color.GREEN);
                        textArea.append("y");
                        break;
                    case 'Y':
                        keyButtons[20].setBackground(Color.GREEN);
                        textArea.append("Y");
                        break;
                    case 'u':
                        keyButtons[21].setBackground(Color.GREEN);
                        textArea.append("u");
                        break;
                    case 'U':
                        keyButtons[21].setBackground(Color.GREEN);
                        textArea.append("U");
                        break;
                    case 'i':
                        keyButtons[22].setBackground(Color.GREEN);
                        textArea.append("i");
                        break;
                    case 'I':
                        keyButtons[22].setBackground(Color.GREEN);
                        textArea.append("I");
                        break;
                    case 'o':
                        keyButtons[23].setBackground(Color.GREEN);
                        textArea.append("o");
                        break;
                    case 'O':
                        keyButtons[23].setBackground(Color.GREEN);
                        textArea.append("O");
                        break;
                    case 'p':
                        keyButtons[24].setBackground(Color.GREEN);
                        textArea.append("p");
                        break;
                    case 'P':
                        keyButtons[24].setBackground(Color.GREEN);
                        textArea.append("P");
                        break;
                    case '[':
                        keyButtons[25].setBackground(Color.GREEN);
                        textArea.append("[");
                        break;
                    case '{':
                        keyButtons[25].setBackground(Color.GREEN);
                        textArea.append("{");
                        break;
                    case ']':
                        keyButtons[26].setBackground(Color.GREEN);
                        textArea.append("]");
                        break;
                    case '}':
                        keyButtons[26].setBackground(Color.GREEN);
                        textArea.append("}");
                        break;
                    case '\\':
                        keyButtons[27].setBackground(Color.GREEN);
                        textArea.append("\\");
                        break;
                    case '|':
                        keyButtons[27].setBackground(Color.GREEN);
                        textArea.append("|");
                        break;
                    case 'a':
                        keyButtons[29].setBackground(Color.GREEN);
                        textArea.append("a");
                        break;
                    case 'A':
                        keyButtons[29].setBackground(Color.GREEN);
                        textArea.append("A");
                        break;
                    case 's':
                        keyButtons[30].setBackground(Color.GREEN);
                        textArea.append("s");
                        break;
                    case 'S':
                        keyButtons[30].setBackground(Color.GREEN);
                        textArea.append("S");
                        break;
                    case 'd':
                        keyButtons[31].setBackground(Color.GREEN);
                        textArea.append("d");
                        break;
                    case 'D':
                        keyButtons[31].setBackground(Color.GREEN);
                        textArea.append("D");
                        break;
                    case 'f':
                        keyButtons[32].setBackground(Color.GREEN);
                        textArea.append("f");
                        break;
                    case 'F':
                        keyButtons[32].setBackground(Color.GREEN);
                        textArea.append("F");
                        break;
                    case 'g':
                        keyButtons[33].setBackground(Color.GREEN);
                        textArea.append("g");
                        break;
                    case 'G':
                        keyButtons[33].setBackground(Color.GREEN);
                        textArea.append("G");
                        break;
                    case 'h':
                        keyButtons[34].setBackground(Color.GREEN);
                        textArea.append("h");
                        break;
                    case 'H':
                        keyButtons[34].setBackground(Color.GREEN);
                        textArea.append("H");
                        break;
                    case 'j':
                        keyButtons[35].setBackground(Color.GREEN);
                        textArea.append("j");
                        break;
                    case 'J':
                        keyButtons[35].setBackground(Color.GREEN);
                        textArea.append("J");
                        break;
                    case 'k':
                        keyButtons[36].setBackground(Color.GREEN);
                        textArea.append("k");
                        break;
                    case 'K':
                        keyButtons[36].setBackground(Color.GREEN);
                        textArea.append("K");
                        break;
                    case 'l':
                        keyButtons[37].setBackground(Color.GREEN);
                        textArea.append("l");
                        break;
                    case 'L':
                        keyButtons[37].setBackground(Color.GREEN);
                        textArea.append("L");
                        break;
                    case ';':
                        keyButtons[38].setBackground(Color.GREEN);
                        textArea.append(";");
                        break;
                    case ':':
                        keyButtons[38].setBackground(Color.GREEN);
                        textArea.append(":");
                        break;
                    case '\'':
                        keyButtons[39].setBackground(Color.GREEN);
                        textArea.append("\'");
                        break;
                    case '"':
                        keyButtons[39].setBackground(Color.GREEN);
                        textArea.append("\"");
                        break;
                    case '\n':
                        keyButtons[40].setBackground(Color.GREEN);
                        textArea.append("\n");
                        break;
                    case 'z':
                        keyButtons[42].setBackground(Color.GREEN);
                        textArea.append("z");
                        break;
                    case 'Z':
                        keyButtons[42].setBackground(Color.GREEN);
                        textArea.append("Z");
                        break;
                    case 'x':
                        keyButtons[43].setBackground(Color.GREEN);
                        textArea.append("x");
                        break;
                    case 'X':
                        keyButtons[43].setBackground(Color.GREEN);
                        textArea.append("X");
                        break;
                    case 'c':
                        keyButtons[44].setBackground(Color.GREEN);
                        textArea.append("c");
                        break;
                    case 'C':
                        keyButtons[44].setBackground(Color.GREEN);
                        textArea.append("C");
                        break;
                    case 'v':
                        keyButtons[45].setBackground(Color.GREEN);
                        textArea.append("v");
                        break;
                    case 'V':
                        keyButtons[45].setBackground(Color.GREEN);
                        textArea.append("V");
                        break;
                    case 'b':
                        keyButtons[46].setBackground(Color.GREEN);
                        textArea.append("b");
                        break;
                    case 'B':
                        keyButtons[46].setBackground(Color.GREEN);
                        textArea.append("B");
                        break;
                    case 'n':
                        keyButtons[47].setBackground(Color.GREEN);
                        textArea.append("n");
                        break;
                    case 'N':
                        keyButtons[47].setBackground(Color.GREEN);
                        textArea.append("N");
                        break;
                    case 'm':
                        keyButtons[48].setBackground(Color.GREEN);
                        textArea.append("m");
                        break;
                    case 'M':
                        keyButtons[48].setBackground(Color.GREEN);
                        textArea.append("M");
                        break;
                    case ',':
                        keyButtons[49].setBackground(Color.GREEN);
                        textArea.append(",");
                        break;
                    case '<':
                        keyButtons[49].setBackground(Color.GREEN);
                        textArea.append("<");
                        break;
                    case '.':
                        keyButtons[50].setBackground(Color.GREEN);
                        textArea.append(".");
                        break;
                    case '>':
                        keyButtons[50].setBackground(Color.GREEN);
                        textArea.append(">");
                        break;
                    case '/':
                        keyButtons[51].setBackground(Color.GREEN);
                        textArea.append("/");
                        break;
                    case '?':
                        keyButtons[51].setBackground(Color.GREEN);
                        textArea.append("?");
                        break;
                    case ' ':
                        keyButtons[53].setBackground(Color.GREEN);
                        textArea.append(" ");
                        break;
                    default:
                        break;
                }
                    switch (e.getKeyCode()){
                        case KeyEvent.VK_CAPS_LOCK:
                            if (keyButtons[28].getBackground() != Color.GREEN)
                                 keyButtons[28].setBackground(Color.GREEN);
                            else
                                keyButtons[28].setBackground(getBackground());
                            break;
                        case KeyEvent.VK_SHIFT:
                            keyButtons[41].setBackground(Color.GREEN);
                            break;
                        case KeyEvent.VK_UP:
                            keyButtons[52].setBackground(Color.GREEN);
                            break;
                        case KeyEvent.VK_LEFT:
                            keyButtons[54].setBackground(Color.GREEN);
                            break;
                        case KeyEvent.VK_DOWN:
                            keyButtons[55].setBackground(Color.GREEN);
                            break;
                        case KeyEvent.VK_RIGHT:
                            keyButtons[56].setBackground(Color.GREEN);
                            break;
                        default:
                            break;
                    }
            }
            @Override
            public void keyReleased(KeyEvent e){                                //one-dimensional maps with parabolic maxima and Feigenbaum constants of a bifurcation parameter
                switch (e.getKeyChar()){
                    case '`':
                    case '~':
                        keyButtons[0].setBackground(getBackground());
                        break;
                    case '1':
                    case '!':
                        keyButtons[1].setBackground(getBackground());
                        break;
                    case '2':
                    case '@':
                        keyButtons[2].setBackground(getBackground());
                        break;
                    case '3':
                    case '#':
                        keyButtons[3].setBackground(getBackground());
                        break;
                    case '4':
                    case '$':
                        keyButtons[4].setBackground(getBackground());
                        break;
                    case '5':
                    case '%':
                        keyButtons[5].setBackground(getBackground());
                        break;
                    case '6':
                    case '^':
                        keyButtons[6].setBackground(getBackground());
                        break;
                    case '7':
                    case '&':
                        keyButtons[7].setBackground(getBackground());
                        break;
                    case '8':
                    case '*':
                        keyButtons[8].setBackground(getBackground());
                        break;
                    case '9':
                    case '(':
                        keyButtons[9].setBackground(getBackground());
                        break;
                    case '0':
                    case ')':
                        keyButtons[10].setBackground(getBackground());
                        break;
                    case '-':
                    case '_':
                        keyButtons[11].setBackground(getBackground());
                        break;
                    case '=':
                    case '+':
                        keyButtons[12].setBackground(getBackground());
                        break;
                    case '\b':
                        keyButtons[13].setBackground(getBackground());
                        break;
                    case '\t':
                        keyButtons[14].setBackground(getBackground());
                        break;
                    case 'q':
                    case 'Q':
                        keyButtons[15].setBackground(getBackground());
                        break;
                    case 'w':
                    case 'W':
                        keyButtons[16].setBackground(getBackground());
                        break;
                    case 'e':
                    case 'E':
                        keyButtons[17].setBackground(getBackground());
                        break;
                    case 'r':
                    case 'R':
                        keyButtons[18].setBackground(getBackground());
                        break;
                    case 't':
                    case 'T':
                        keyButtons[19].setBackground(getBackground());
                        break;
                    case 'y':
                    case 'Y':
                        keyButtons[20].setBackground(getBackground());
                        break;
                    case 'u':
                    case 'U':
                        keyButtons[21].setBackground(getBackground());
                        break;
                    case 'i':
                    case 'I':
                        keyButtons[22].setBackground(getBackground());
                        break;
                    case 'o':
                    case 'O':
                        keyButtons[23].setBackground(getBackground());
                        break;
                    case 'p':
                    case 'P':
                        keyButtons[24].setBackground(getBackground());
                        break;
                    case '[':
                    case '{':
                        keyButtons[25].setBackground(getBackground());
                        break;
                    case ']':
                    case '}':
                        keyButtons[26].setBackground(getBackground());
                        break;
                    case '\\':
                    case '|':
                        keyButtons[27].setBackground(getBackground());
                        break;
                    case 'a':
                    case 'A':
                        keyButtons[29].setBackground(getBackground());
                        break;
                    case 's':
                    case 'S':
                        keyButtons[30].setBackground(getBackground());
                        break;
                    case 'd':
                    case 'D':
                        keyButtons[31].setBackground(getBackground());
                        break;
                    case 'f':
                    case 'F':
                        keyButtons[32].setBackground(getBackground());
                        break;
                    case 'g':
                    case 'G':
                        keyButtons[33].setBackground(getBackground());
                        break;
                    case 'h':
                    case 'H':
                        keyButtons[34].setBackground(getBackground());
                        break;
                    case 'j':
                    case 'J':
                        keyButtons[35].setBackground(getBackground());
                        break;
                    case 'k':
                    case 'K':
                        keyButtons[36].setBackground(getBackground());
                        break;
                    case 'l':
                    case 'L':
                        keyButtons[37].setBackground(getBackground());
                        break;
                    case ';':
                    case ':':
                        keyButtons[38].setBackground(getBackground());
                        break;
                    case '\'':
                    case '"':
                        keyButtons[39].setBackground(getBackground());
                        break;
                    case '\n':
                        keyButtons[40].setBackground(getBackground());
                        break;
                    case 'z':
                    case 'Z':
                        keyButtons[42].setBackground(getBackground());
                        break;
                    case 'x':
                    case 'X':
                        keyButtons[43].setBackground(getBackground());
                        break;
                    case 'c':
                    case 'C':
                        keyButtons[44].setBackground(getBackground());
                        break;
                    case 'v':
                    case 'V':
                        keyButtons[45].setBackground(getBackground());
                        break;
                    case 'b':
                    case 'B':
                        keyButtons[46].setBackground(getBackground());
                        break;
                    case 'n':
                    case 'N':
                        keyButtons[47].setBackground(getBackground());
                        break;
                    case 'm':
                    case 'M':
                        keyButtons[48].setBackground(getBackground());
                        break;
                    case ',':
                    case '<':
                        keyButtons[49].setBackground(getBackground());
                        break;
                    case '.':
                    case '>':
                        keyButtons[50].setBackground(getBackground());
                        break;
                    case '/':
                    case '?':
                        keyButtons[51].setBackground(getBackground());
                        break;
                    case ' ':
                        keyButtons[53].setBackground(getBackground());
                        break;
                    default:
                        break;
                }
                switch (e.getKeyCode()){
                    case KeyEvent.VK_SHIFT:
                        keyButtons[41].setBackground(getBackground());
                        break;
                    case KeyEvent.VK_UP:
                        keyButtons[52].setBackground(getBackground());
                        break;
                    case KeyEvent.VK_LEFT:
                        keyButtons[54].setBackground(getBackground());
                        break;
                    case KeyEvent.VK_DOWN:
                        keyButtons[55].setBackground(getBackground());
                        break;
                    case KeyEvent.VK_RIGHT:
                        keyButtons[56].setBackground(getBackground());
                        break;
                }
            }

            @Override
            public void keyTyped(KeyEvent e){
            }
        });
    }
    //creates buttons for small keys
    public void makeSmallKey(int start, int end){
        Dimension dimension = new Dimension(45,45);
        for (int i = start;i < end;i++)
        {
            keyButtons[i] = new JButton(Keyboard.qwerty[i]);
            keyButtons[i].setPreferredSize(dimension);
            panel.add(keyButtons[i]);
        }
     }
     //creates buttons for medium keys
     public void makeMedKey(int index){
         Dimension dimension = new Dimension(65,45);
         keyButtons[index] = new JButton(Keyboard.qwerty[index]);
         keyButtons[index].setPreferredSize(dimension);
         panel.add(keyButtons[index]);
     }
     //creates buttons for big keys
     public void makeBigKey(int index){
         Dimension dimension = new Dimension(100,45);
         keyButtons[index] = new JButton(Keyboard.qwerty[index]);
         keyButtons[index].setPreferredSize(dimension);
         panel.add(keyButtons[index]);
     }
    //sets spacing for keys
     public void setLayout(){
         panel = new JPanel();
         add(panel);
         panel.setLayout(new GridBagLayout());
     }
    //modular implementation of creating the keyboard buttons via a directed acyclic graph approach instead of a monolithic approach
     public void makeKeyboard(){
         keyButtons = new JButton[Keyboard.qwerty.length+1];
         textArea = new JTextArea(5,50);
         JScrollPane pane = new JScrollPane(textArea);
         add(pane);
         setLayout();
         makeSmallKey(0,13);
         makeBigKey(13);
         setLayout();
         makeMedKey(14);
         makeSmallKey(15,28);
         setLayout();
         makeMedKey(28);
         makeSmallKey(29,40);
         makeBigKey(40);
         setLayout();
         makeBigKey(41);
         makeSmallKey(42,53);
         JPanel panel = new JPanel();
         panel.add(keyButtons[52], BorderLayout.LINE_END);
         add(panel);
         panel = new JPanel();
         Dimension dimension = new Dimension(250,45);
         keyButtons[53] = new JButton();
         keyButtons[53].setPreferredSize(dimension);
         panel.add(keyButtons[53]);
         add(panel);
         panel = new JPanel();
         keyButtons[54] = new JButton(Keyboard.qwerty[54]);
         dimension = new Dimension(45,45);
         keyButtons[55] = new JButton(Keyboard.qwerty[55]);
         keyButtons[56] = new JButton(Keyboard.qwerty[56]);
         keyButtons[54].setPreferredSize(dimension);
         keyButtons[55].setPreferredSize(dimension);
         keyButtons[56].setPreferredSize(dimension);
         panel.add(keyButtons[54]);
         panel.add(keyButtons[55]);
         panel.add(keyButtons[56]);
         add(panel);
     }


}
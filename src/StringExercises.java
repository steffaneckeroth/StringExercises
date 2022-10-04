import java.util.Scanner;


public class StringExercises {
    public void exercise1(String input)
    {
        String output = "<" + input + ">";
        System.out.println(output);
    }

    public void exercise2(String input) {
        int stringLength;
        stringLength = input.length();
        System.out.println(stringLength);
    }

    public void exercise3(String input)
    {
        for (int i = 0; i < input.length(); i++)
        {
            System.out.println(input.charAt(i) + "@");
        }
    }

    public void exercise4(String input){
        String str = input, nstr= "";
        char ch;

        System.out.print("original word  ");
        System.out.print(str);

        for (int i = 0; i <str.length(); i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println(nstr);
    }

    public  void exercise5(String name){
        char ch;

        for (int i = 0; i < name.length(); i++){
            ch = name.charAt(i);
            String morceCh = morse(ch);
            System.out.print(morceCh + " ");
        }
    }


    public String morse(char input){
        switch (Character.toLowerCase(input)) {
            case 'a':
                return ".-";
            case 'b':
                return "-...";
            case 'c':
                return "-.-.";
            case 'd':
                return "-..";
            case 'e':
                return ".";
            case 'f':
                return "..-.";
            case 'g':
                return "--.";
            case 'h':
                return "....";
            case 'i':
                return "..";
            case 'j':
                return ".---";
            case 'k':
                return "-.-";
            case 'l':
                return ".-..";
            case 'm':
                return "--";
            case 'n':
                return "-.";
            case 'o':
                return "---";
            case 'p':
                return ".--.";
            case 'q':
                return "--.-";
            case 'r':
                return ".-.";
            case 's':
                return "...";
            case 't':
                return "-";
            case 'u':
                return "..-";
            case 'v':
                return "...-";
            case 'w':
                return "...-";
            case 'x':
                return "-..-";
            case 'y':
                return ".-..";
            case 'z':
                return "--..";
            case ' ':
                return " / ";
            default:
                return "ERROR!";
        }
    }

    public void exercise6(String name){

        String s = name.replaceAll("horse","****").replaceAll("spores","****")
                .replaceAll("saddle", "*****");
        System.out.println(s);
    }

    public void exercise7(String input){
        String str = input, nstr="";
        char ch;

        System.out.print("original word  ");

        for (int i = 0; i <str.length(); i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println(str + " " + nstr);
    }
    public void exercise8(String name){
        char ch;
        String result = "";

        for (int i = 0; i < name.length(); i++){
            ch = name.charAt(i);
            if(i % 2 == 0){
                result = result + Character.toUpperCase(ch);
            }
            else{
                result = result + ch;
            }
        }

        System.out.println(result);
    }

    //public void exercise9(String name){

    }







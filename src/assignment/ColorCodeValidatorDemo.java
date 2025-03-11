package assignment;
class ColorCodevalidator{
    String str;
   int validateHex(String str){
        if(str.matches("^#[A-Fa-f0-9]{6}$")) {
            return 1;
        }
       return -1;
        }

    }

public class ColorCodeValidatorDemo {
    public static void main(String[] args) {
    ColorCodevalidator cv=new ColorCodevalidator();
        System.out.println( cv.validateHex("#123y455")==1?"valid":"invalid");
    }
}

package Tenchurina;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App
{
    public static void main( String[] args ){

        Casino casino = new Casino();
        Method [] methods = casino.getClass().getDeclaredMethods();
        for (Method method : methods){
            MyAnnotation annotation = method.getDeclaredAnnotation(MyAnnotation.class);
            if ( annotation!= null) {
                try {
                    method.invoke(casino);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    System.err.println("При запуске метода что то пошло не так "+ e);;
                }
            }
        }
    }

}

package Tenchurina;

import java.util.Random;

public class Casino {

    @MyAnnotation
    public void fortuna() {
        Random random = new Random();
        boolean isWin = (random.nextInt(2) == 0) ? false : true;
        int sum = random.nextInt(300000) + 50;
        int valutaIndex = random.nextInt(Valuta.values().length);
        Valuta valuta = Valuta.values()[valutaIndex];
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        if (isWin) {
            System.out.println(String.format("Игра в %s была удачной, выигрыш составил %d %s", name, sum, valuta));
        } else {
            System.out.println(String.format("Игра в %s была неудачной, проигрыш составил %d %s", name, sum, valuta));
        }
    }

    @MyAnnotation
    public void ruletka() {
        Random random = new Random();
        boolean isWin = (random.nextInt(2) == 0) ? false : true;
        int sum = random.nextInt(300000) + 50;
        int valutaIndex = random.nextInt(Valuta.values().length);
        Valuta valuta = Valuta.values()[valutaIndex];
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        if (isWin) {
            System.out.println(String.format("Игра в %s была удачной, выигрыш составил %d %s", name, sum, valuta));
        } else {
            System.out.println(String.format("Игра в %s была неудачной, проигрыш составил %d %s", name, sum, valuta));
        }
    }

    public void bakkara() {
        Random random = new Random();
        boolean isWin = (random.nextInt(2) == 0) ? false : true;
        int sum = random.nextInt(300000) + 50;
        int valutaIndex = random.nextInt(Valuta.values().length);
        Valuta valuta = Valuta.values()[valutaIndex];
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        if (isWin) {
            System.out.println(String.format("Игра в %s была удачной, выигрыш составил %d %s", name, sum, valuta));
        } else {
            System.out.println(String.format("Игра в %s была неудачной, проигрыш составил %d %s", name, sum, valuta));
        }
    }

    @MyAnnotation
    public void poker() {
        Random random = new Random();
        boolean isWin = (random.nextInt(2) == 0) ? false : true;
        int sum = random.nextInt(300000) + 50;
        int valutaIndex = random.nextInt(Valuta.values().length);
        Valuta valuta = Valuta.values()[valutaIndex];
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        if (isWin) {
            System.out.println(String.format("Игра в %s была удачной, выигрыш составил %d %s", name, sum, valuta));
        } else {
            System.out.println(String.format("Игра в %s была неудачной, проигрыш составил %d %s", name, sum, valuta));
        }
    }

    public void igrovoyAvtomat() {
        Random random = new Random();
        boolean isWin = (random.nextInt(2) == 0) ? false : true;
        int sum = random.nextInt(300000) + 50;
        int valutaIndex = random.nextInt(Valuta.values().length);
        Valuta valuta = Valuta.values()[valutaIndex];
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        if (isWin) {
            System.out.println(String.format("Игра в %s была удачной, выигрыш составил %d %s", name, sum, valuta));
        } else {
            System.out.println(String.format("Игра в %s была неудачной, проигрыш составил %d %s", name, sum, valuta));
        }
    }

    @MyAnnotation
    public void bleckJeck() {
        Random random = new Random();
        boolean isWin = (random.nextInt(2) == 0) ? false : true;
        int sum = random.nextInt(300000) + 50;
        int valutaIndex = random.nextInt(Valuta.values().length);
        Valuta valuta = Valuta.values()[valutaIndex];
        String name = new Object(){ }.getClass().getEnclosingMethod().getName();
        if (isWin) {
            System.out.println(String.format("Игра в %s была удачной, выигрыш составил %d %s", name, sum, valuta));
        } else {
            System.out.println(String.format("Игра в %s была неудачной, проигрыш составил %d %s", name, sum, valuta));
        }
    }
}

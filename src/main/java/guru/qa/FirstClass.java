package guru.qa;

public class FirstClass {

    byte aByte = 10;  //8bit  -128... 127
    short aShort = 100; //16bit  -32768...32727

    //самый используемый
    int aInt = 1000;  //32 bit  -2^31 ... (-2^31) -1
    long aLong = 100L;  //64 bit -2^63 ... (-2^63) -1

    float aFloat = 0.0F; //32 bit
    // самый испоьлзуемый (если просто хранить, но не использовать арифметику)
    double aDouble = 0.0D; //64 bit

    char  aChar = 'c'; // 1 symbol
    boolean aBoolean = false;
    String aString = "qa guru";

    public static void main(String[] args) {
        // + --сложение
        // - --вычитание
        // * --умножение
        // / - целочисленное деление
        // % --  остаток от деления
        // инкремент ++
        // декремент --

        //System.out.println( 5+10);

        // >
        // <
        // >=
        // <=
        // ==
        // !=

        //System.out.println(2 != 3);

        // =
        // +=
        // -= ...
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println( "a + b = "+(a + b));
        System.out.println( "a - b = "+ (a - b) );
        System.out.println( "a * b = "+ (a * b) );
        System.out.println( "a / b = "+ (a / b) );
        System.out.println( "c > a ? "+ (c > a) );
        System.out.println( "c < a ? " + (c < a)  );
        System.out.println( "a==b ? "+ (a == b) );
        System.out.println( "a != b ? "+ (a != b) );

        //&& (&) = AND
        // || (|) - OR
        //! - NO

        float f = 0.5F;
        double d = 5.84;

        System.out.println(((f - d) > 0) && ((d - f) > 0));
        System.out.println(((f - d) > 0) || ((d - f) > 0));
        System.out.println(d / f);
        System.out.println(d % f);


        Lesson javalesson = new Lesson();
        javalesson.doFinishLesson();


    }

}

package Week12Homework;

public class ArithmeticOperations {
    public static void main (String[] args) {
        // primitive data types
        /*
        BYTE:
        RANGE:-128 to 127;
        MEMORY:1byte = 8 bits
         */
        byte b = 25; //define
        System.out.println(b);

        /*
        SHORT:
        RANGE: -32768 to 32767
        MEMORY: 2bytes =16 bits
         */
        short s = 32700;
        System.out.println(s);

        /*
        INTEGER:
        RANGE: quite high
        MEMORY: 4 bytes = 32 bits
         */
        int i = 1000000000;
        System.out.println(i);

        /*
    }   LONG:
        RANGE: really high
        MEMORY: 8 bytes = 64 bits
        */
        Long l = 100000000000L;
        System.out.println(l);

        //DECIMAL NUMBERS

        /*
        FLOAT:
        MEMORY: 4 bytes=32 bits
        RANGE: -quite high less than double

        */
        float f = 12.34f;
        float f1 = (float) 12.22;
        System.out.println(f);

        /*
        DOUBLE:
        MEMORY: 8 bytes = 64bits
        RANGE: up to 15 decimal places roughly
        */
        double d = 12.44;
        System.out.println(d);

        /*
        CHARACTER:single values - unicode values
        MEMORY: 2 bytes = 16 bits
        */
        char c1 = 'A';
        char c2 = 'B';
        char c3 = 'C';
        System.out.println(c1);

        /*
        BOOLEAN:
        MEMORY: less than 1bit
        RANGE: true or false;
        */
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);


    }


}

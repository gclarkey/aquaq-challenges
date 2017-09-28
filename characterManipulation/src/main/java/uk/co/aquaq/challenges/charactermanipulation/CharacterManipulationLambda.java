package uk.co.aquaq.challenges.charactermanipulation;

public class CharacterManipulationLambda {

    public interface N{
        String c(char[] a);
    }

    public N n = a -> {                                   // Lambda with char-array parameter and String return-type
        String r = "";                                    //  Result-String
        int i = 0;                                        //  Flag for alteration
        for (int c : a)                                   //  Loop over the characters of the input
            r += (char)                                   //   And append the result-String with the following (converted to char):
                    (c > 64 & c < 91 | c > 96 & c < 123 ? //    If it's a letter:
                            i++ % 2 < 1 ?                 //     And the flag states it should be lowercase:
                                    (c | 32)              //      Convert it to lowercase
                                    :                     //     Else (should be uppercase):
                                    (c & ~32)             //      Convert it to uppercase
                            :                             //    Else:
                            c);                           //     Simply append the non-letter character as is
        //  End of loop (implicit / single-line body)
        return r;                                         //  Return result-String
    };
}

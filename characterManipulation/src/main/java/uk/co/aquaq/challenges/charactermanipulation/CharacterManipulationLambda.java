package uk.co.aquaq.challenges.charactermanipulation;

public class CharacterManipulationLambda {

    public interface N {
        String c(char[] a);
    }

    public N n = a -> {                                   // Lambda with char-array parameter and String return-type
        final StringBuilder r = new StringBuilder();      //  Result-String
        int i = 0;                                        //  Flag for alteration
        for (int c : a)                                   //  Loop over the characters of the input
            r.append((char)                              //   And append the result-String with the following (converted to char):
                    (c > 64 & c < 91 | c > 96 & c < 123 ? //    If it's a letter:
                            i++ % 2 < 1 ?                 //     And the flag states it should be lowercase:
                                    (c | 32)              //      Convert it to lowercase
                                    :                     //     Else (should be uppercase):
                                    (c & ~32)             //      Convert it to uppercase
                            :                             //    Else:
                            c));                          //     Simply append the non-letter character as is
        //  End of loop (implicit / single-line body)
        return r.toString();                              //  Return result-String
    };

String p(char[] a){String r="";int i=0;for(int c:a)r+=(char)c>64&c<91|c>96&c<123?i++%2<1?(c|32):(c&~32):c;return r;}


}

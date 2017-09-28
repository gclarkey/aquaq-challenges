package uk.co.aquaq.challenges.charactermanipulation;

public class Driver {

    /* Alternate character case
     * Rules:
     * #1: Every character must have a different case to preceding and following characters
     * #2: Ignore non alphabetic characters (everything except [a-z,A-Z]
     * #3: Input strings will only consist of printable characters (ASCII 20 to 7E)
     * #4: The first character case should be inverted
     *
     * Examples:
     * #1: ALLONEWORDUPPER -> aLlOnEwOrDuPpEr
     * #2: allonewordlower -> AlLoNeWoRdLoWeR
     * #3: 666             -> 666
     * #4: #ignore+$ymB01s -> #IgNoRe+$YmB01s
     * #5: AA11BB22cc60zyx -> aA11bB22cC60zYx
     */

    public static void main(String args[]){

        final CharacterManipulation characterManipulation = new CharacterManipulation();

        final String allOneWordUpper = "ALLONEWORDUPPER";
        final String allOneWordUpperAlternated = "aLlOnEwOrDuPpEr";
        final String allOneWordUpperResult = characterManipulation.alternateCase(allOneWordUpper);
        if(!allOneWordUpperAlternated.equals(allOneWordUpperResult)){
            final String message = String.format("allOneWordUpperAlternated: %s does not match allOneWordUpperResult %s", allOneWordUpperAlternated, allOneWordUpperResult);
            throw new RuntimeException(message);
        }

        final String allOneWordLower = "allonewordlower";
        final String allOneWordLowerAlternated = "AlLoNeWoRdLoWeR";
        final String allOneWordLowerResult = characterManipulation.alternateCase(allOneWordLower);
        if(!allOneWordLowerAlternated.equals(allOneWordLowerResult)){
            final String message = String.format("allOneWordLowerAlternated: %s does not match allOneWordLowerResult %s", allOneWordLowerAlternated, allOneWordLowerResult);
            throw new RuntimeException(message);
        }

        final String sixSixSix = "666";
        final String sixSixSixAlternated = "666";
        final String sixSixSixResult = characterManipulation.alternateCase(sixSixSix);
        if(!sixSixSixAlternated.equals(sixSixSixResult)){
            final String message = String.format("sixSixSixAlternated: %s does not match sixSixSixResult %s", sixSixSixAlternated, sixSixSixResult);
            throw new RuntimeException(message);
        }

        final String ignoreSymbols = "#ignore+$ymB01s";
        final String ignoreSymbolsAlternated = "#IgNoRe+$YmB01s";
        final String ignoreSymbolsResult = characterManipulation.alternateCase(ignoreSymbols);
        if(!ignoreSymbolsAlternated.equals(ignoreSymbolsResult)){
            final String message = String.format("ignoreSymbolsAlternated: %s does not match ignoreSymbolsResult %s", ignoreSymbolsAlternated, ignoreSymbolsResult);
            throw new RuntimeException(message);
        }

        final String ab12 = "AA11BB22cc60zyx";
        final String ab12Alternated = "aA11bB22cC60zYx";
        final String ab12Result = characterManipulation.alternateCase(ab12);
        if(!ab12Alternated.equals(ab12Result)){
            final String message = String.format("ab12Alternated: %s does not match ab12Result %s", ab12Alternated, ab12Result);
            throw new RuntimeException(message);
        }

        final CharacterManipulationLambda cml = new CharacterManipulationLambda();
        System.out.println(cml.n.c("ASCII".toCharArray()));
        System.out.println(characterManipulation.alternateCase("ASCII"));

    }

}

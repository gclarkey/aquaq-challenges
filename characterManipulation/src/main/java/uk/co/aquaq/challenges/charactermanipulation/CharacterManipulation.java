package uk.co.aquaq.challenges.charactermanipulation;

public class CharacterManipulation {

    public String alternateCase(final String input){
        final StringBuilder output = new StringBuilder();
        boolean firstCharProcessed = false;
        boolean nextCharShouldBeLowerCase = false;
        for(char c : input.toCharArray()){
            if(Character.isAlphabetic(c)){
                if(!firstCharProcessed){
                    if(Character.isUpperCase(c)){
                        output.append(Character.toLowerCase(c));
                        nextCharShouldBeLowerCase = false;
                    } else {
                        output.append(Character.toUpperCase(c));
                        nextCharShouldBeLowerCase = true;
                    }
                    firstCharProcessed = true;
                } else {
                    if(nextCharShouldBeLowerCase){
                        output.append(Character.toLowerCase(c));
                        nextCharShouldBeLowerCase = false;
                    } else {
                        output.append(Character.toUpperCase(c));
                        nextCharShouldBeLowerCase = true;
                    }
                }
            } else {
                output.append(c);
            }
        }

        return output.toString();
    }
}

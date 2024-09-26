import java.util.Scanner;

class Quiz {
    public static void main(String args[]) 
    {
        System.out.println("SPACE ODYSSEY QUIZ");
        int score = 0;

        // Q1
        System.out.println("WHAT IS THE LARGEST PLANET IN OUR SOLAR SYSTEM?");
        System.out.println("1: EARTH");
        System.out.println("2: MARS");
        System.out.println("3: JUPITER"); // CORRECT
        System.out.println("4: SATURN");

        System.out.println("ENTER THE CORRECT OPTION NUMBER:");
        Scanner a1 = new Scanner(System.in);
        int q1 = a1.nextInt();
        switch (q1) {
            case 1:
            case 2:
            case 4:
                System.out.println("INCORRECT OPTION! CORRECT ANSWER WILL BE OPTION 3: JUPITER.");
                break;
            case 3:
                System.out.println("CORRECT ANSWER! +5");
                score += 5;
                break;
            default:
                System.out.println("PLEASE ENTER A VALID ANSWER. TRY ENTERING THE OPTION NUMBER ONLY WITHOUT ANY OTHER CHARACTER/s");
                break;
        }

        // Q2
        System.out.println("WHICH FAMOUS COMET ORBITS THE SUN AND IS VISIBLE FROM EARTH PERIODICALLY?");
        System.out.println("1: HALLEY'S COMET"); // CORRECT
        System.out.println("2: COMET ISON");
        System.out.println("3: COMET HALE-BOPP");
        System.out.println("4: COMET SHOEMAKER-LEVY 9");

        System.out.println("ENTER THE CORRECT OPTION NUMBER:");
        Scanner a2 = new Scanner(System.in);
        int q2 = a2.nextInt();
        switch (q2) {
            case 2:
            case 3:
            case 4:
                System.out.println("INCORRECT OPTION! CORRECT ANSWER WILL BE OPTION 1: HALLEY'S COMET.");
                System.out.println("TOTAL SCORE: " + score);
                break;
            case 1:
                System.out.println("CORRECT ANSWER! +5");
                score += 5;
                System.out.println("TOTAL SCORE: " + score);
                break;
            default:
                System.out.println("PLEASE ENTER A VALID ANSWER. TRY ENTERING THE OPTION NUMBER ONLY WITHOUT ANY OTHER CHARACTER/s");
                break;
        }
        // Q3
        System.out.println("WHAT CAUSES THE NORTHERN LIGHTS (AURORA BOREALIS)?");
        System.out.println("1: REFLECTION OF CITY LIGHTS"); 
        System.out.println("2: SOLAR WIND INTERACTING WITH EARTH'S MAGNETIC FIELD"); //CORRECT
        System.out.println("3: VOLCANIC ERUPTIONS");
        System.out.println("4: ALIEN DISCO PARTY");

        System.out.println("ENTER THE CORRECT OPTION NUMBER:");
        Scanner a3 = new Scanner(System.in);
        int q3 = a3.nextInt();
        switch (q3) {
            case 1:
            case 3:
            case 4:
                System.out.println("INCORRECT OPTION! CORRECT ANSWER WILL BE OPTION 2: SOLAR WIND INTERACTING WITH EARTH'S MAGNETIC FIELD");
                System.out.println("TOTAL SCORE: " + score);
                break;
            case 2:
                System.out.println("CORRECT ANSWER! +5");
                score += 5;
                System.out.println("TOTAL SCORE: " + score);
                break;
            default:
                System.out.println("PLEASE ENTER A VALID ANSWER. TRY ENTERING THE OPTION NUMBER ONLY WITHOUT ANY OTHER CHARACTER/s");
                break;
        }
        // Q4
        System.out.println("WHICH SPACECRAFT CARRIED HUMANS TO THE MOON DURING THE APOLLO MISSIONS?");
        System.out.println("1: VOYAGER"); 
        System.out.println("2: HUBBLE");
        System.out.println("3: APOLLO"); //CORRECT
        System.out.println("4: SPACEX DRAGON");

        System.out.println("ENTER THE CORRECT OPTION NUMBER:");
        Scanner a4 = new Scanner(System.in);
        int q4 = a4.nextInt();
        switch (q4) {
            case 1:
            case 2:
            case 4:
                System.out.println("INCORRECT OPTION! CORRECT ANSWER WILL BE OPTION 3: APOLLO");
                System.out.println("TOTAL SCORE: " + score);
                break;
            case 3:
                System.out.println("CORRECT ANSWER! +5");
                score += 5;
                System.out.println("TOTAL SCORE: " + score);
                break;
            default:
                System.out.println("PLEASE ENTER A VALID ANSWER. TRY ENTERING THE OPTION NUMBER ONLY WITHOUT ANY OTHER CHARACTER/s");
                break;
        }
        // Q5
        System.out.println("WHAT IS THE NAME OF THE GALAXY THAT CONTAINS OUR SOLAR SYSTEM?");
        System.out.println("1: MILKY WAY"); //CORRECT
        System.out.println("2: ANDROMEDA");
        System.out.println("3: TRIANGULUM"); 
        System.out.println("4: SOMBRERO");

        System.out.println("ENTER THE CORRECT OPTION NUMBER:");
        Scanner a5 = new Scanner(System.in);
        int q5 = a5.nextInt();
        switch (q5) {
            case 2:
            case 3:
            case 4:
                System.out.println("INCORRECT OPTION! CORRECT ANSWER WILL BE OPTION 1: MILKY WAY");
                System.out.println("TOTAL SCORE: " + score);
                break;
            case 1:
                System.out.println("CORRECT ANSWER! +5");
                score += 5;
                System.out.println("TOTAL SCORE: " + score);
                break;
            default:
                System.out.println("PLEASE ENTER A VALID ANSWER. TRY ENTERING THE OPTION NUMBER ONLY WITHOUT ANY OTHER CHARACTER/s");
                break;
        }
        // Q6
        System.out.println("WHAT IS A LIGHT YEAR?");
        System.out.println("1: THE DISTANCE COEVERED BY LIGHT IN VACCUM IN A YEAR"); //CORRECT 
        System.out.println("2: A UNIT OF TIME");
        System.out.println("3: THE DISTANCE BETWEEN EARTH AND THE SUN"); 
        System.out.println("4: A DELICIOUS COSMIC SNACK");

        System.out.println("ENTER THE CORRECT OPTION NUMBER:");
        Scanner a6 = new Scanner(System.in);
        int q6 = a6.nextInt();
        switch (q6) {
            case 2:
            case 3:
            case 4:
                System.out.println("INCORRECT OPTION! CORRECT ANSWER WILL BE OPTION 1: THE DISTANCE COVERED BY LIGHT IN VACCUM IN A YEAR");
                System.out.println("TOTAL SCORE: " + score);
                break;
            case 1:
                System.out.println("CORRECT ANSWER! +5");
                score += 5;
                System.out.println("TOTAL SCORE: " + score);
                break;
            default:
                System.out.println("PLEASE ENTER A VALID ANSWER. TRY ENTERING THE OPTION NUMBER ONLY WITHOUT ANY OTHER CHARACTER/s");
                break;
        }
        // Q7
        System.out.println("WHICH PLANET HAS THE GREAT RED SPOT, A MASSIVE STORM SYSTEM?");
        System.out.println("1: MARS"); 
        System.out.println("2: VENUS");
        System.out.println("3: JUPITER"); //CORRECT
        System.out.println("4: NEPTUNE");

        System.out.println("ENTER THE CORRECT OPTION NUMBER:");
        Scanner a7 = new Scanner(System.in);
        int q7 = a7.nextInt();
        switch (q7) {
            case 1:
            case 2:
            case 4:
                System.out.println("INCORRECT OPTION! CORRECT ANSWER WILL BE OPTION 3: JUPITER");
                System.out.println("TOTAL SCORE: " + score);
                break;
            case 3:
                System.out.println("CORRECT ANSWER! +5");
                score += 5;
                System.out.println("TOTAL SCORE: " + score);
                break;
            default:
                System.out.println("PLEASE ENTER A VALID ANSWER. TRY ENTERING THE OPTION NUMBER ONLY WITHOUT ANY OTHER CHARACTER/s");
                break;
        }
        // Q8
        System.out.println("WHAT IS THE PROCESS BY WHICH A STAR ENDS ITS LIFE IN A BRILLIANT EXPLOSION?");
        System.out.println("1: FUSION"); 
        System.out.println("2: BLACK HOLE FORMATION");
        System.out.println("3: SUPERNOVA"); //CORRECT
        System.out.println("4: CELESTIAL FIREWORKS");

        System.out.println("ENTER THE CORRECT OPTION NUMBER:");
        Scanner a8 = new Scanner(System.in);
        int q8 = a8.nextInt();
        switch (q8) {
            case 1:
            case 2:
            case 4:
                System.out.println("INCORRECT OPTION! CORRECT ANSWER WILL BE OPTION 3: SUPERNOVA");
                System.out.println("TOTAL SCORE: " + score);
                break;
            case 3:
                System.out.println("CORRECT ANSWER! +5");
                score += 5;
                System.out.println("TOTAL SCORE: " + score);
                break;
            default:
                System.out.println("PLEASE ENTER A VALID ANSWER. TRY ENTERING THE OPTION NUMBER ONLY WITHOUT ANY OTHER CHARACTER/s");
                break;
        }
        // Q9
        System.out.println("WHAT IS THE NAME OF THE FIRST ARTIFICIAL SATELLITE LAUNCED INTO SPACE?");
        System.out.println("1: SPUTNIK 1"); //CORRECT 
        System.out.println("2: EXPLORER 1");
        System.out.println("3: LUNA 1"); 
        System.out.println("4: STARSHIP ENTERPRISE");

        System.out.println("ENTER THE CORRECT OPTION NUMBER:");
        Scanner a9 = new Scanner(System.in);
        int q9 = a9.nextInt();
        switch (q9) {
            case 2:
            case 3:
            case 4:
                System.out.println("INCORRECT OPTION! CORRECT ANSWER WILL BE OPTION 1: SPUTNIK 1");
                System.out.println("TOTAL SCORE: " + score);
                break;
            case 1:
                System.out.println("CORRECT ANSWER! +5");
                score += 5;
                System.out.println("TOTAL SCORE: " + score);
                break;
            default:
                System.out.println("PLEASE ENTER A VALID ANSWER. TRY ENTERING THE OPTION NUMBER ONLY WITHOUT ANY OTHER CHARACTER/s");
                break;
        }
        // Q10
        System.out.println("WHICH MOON OF JUPITER IS KNOWN FOR ITS ICY SURFACE AND HIDDEN SUBSURFACE OCEAN?");
        System.out.println("1: GANYMEDE"); 
        System.out.println("2: LO");
        System.out.println("3: CALLISTO"); 
        System.out.println("4: EUROPA"); // CORRECT

        System.out.println("ENTER THE CORRECT OPTION NUMBER:");
        Scanner a10 = new Scanner(System.in);
        int q10 = a10.nextInt();
        switch (q10) {
            case 1:
            case 2:
            case 3:
                System.out.println("INCORRECT OPTION! CORRECT ANSWER WILL BE OPTION 4: EUROPA");
                System.out.println("TOTAL SCORE: " + score);
                break;
            case 4:
                System.out.println("CORRECT ANSWER! +5");
                score += 5;
                System.out.println("TOTAL SCORE: " + score);
                break;
            default:
                System.out.println("PLEASE ENTER A VALID ANSWER. TRY ENTERING THE OPTION NUMBER ONLY WITHOUT ANY OTHER CHARACTER/s");
                break;
        }
        System.out.println("");
        System.out.println("YOUR RESULT:");
        System.out.println("YOUR TOTAL SCORE:"+score+" points");
        System.out.println("YOU ANSWERED "+(score*2)+"% OF THE QUESTIONS CORRECT"); // (score/50)*100 = score*2
    }
}

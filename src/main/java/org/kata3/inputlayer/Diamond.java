package org.kata3.inputlayer;

public class Diamond {

    private int dimension;

    // COLOURS ****************************************************************
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // BACKGROUND
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    // *************************************************************************

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public Diamond(int dimension) {
        this.dimension = dimension;
    }

    public void printDiamond() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= dimension; i++) {
            if (i%2 > 0) {
                for (int j = 1; j <= dimension - i; j=j+2) {
                    sb.append(" ");
                } // TODO: change space to x to see the structure
                for (int k = 1; k <= i; k++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        }

        for (int i = dimension - 1; i >= 1; i--) {
            if (i%2 > 0) {
                for (int j = 1; j <= dimension - i; j=j+2) {
                    sb.append(" ");
                } // TODO: change space to x to see the structure
                for (int k = 1; k <= i; k++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        }

        // **********************************************************************
        // COLOURS USAGE
//        System.out.println(ANSI_GREEN_BACKGROUND + "This text has a green background but default text!" + ANSI_RESET);
//        System.out.println(ANSI_RED + "This text has red text but a default background!" + ANSI_RESET);
//        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_RED + "This text has a green background and red text!" + ANSI_RESET);

//        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_RED + sb + ANSI_RESET);
//        System.out.println(ANSI_YELLOW_BACKGROUND + ANSI_BLUE + sb + ANSI_RESET);
//        System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_RED + sb + ANSI_RESET);
//        System.out.println(ANSI_CYAN_BACKGROUND + ANSI_RED + sb + ANSI_RESET);
        System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + sb + ANSI_RESET);

    }
}

package org.kata3.inputlayer;

public class Diamond {
    private int dimension;

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
                } // TODO: change space to x
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
                } // TODO: change space to x
                for (int k = 1; k <= i; k++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);

    }
}

import java.io.*;
import java.util.*;
/**
 * Write a description of class OCR here.
 * 
 * Vaed Prasad
 * 
 */
public class OCR
{
    private int [][] templateA = {
            {-1,-1,-1,-1, 0, 0, 0, 0, 1,-1,-1,-1},
            {-1,-1,-1, 0, 0, 0, 1, 0, 1,-1,-1,-1},
            {-1,-1, 0, 0, 1, 1, 1, 1, 0,-1,-1,-1},
            {-1,-1, 0,-1, 0, 0, 0, 1, 0, 0,-1,-1},
            {-1, 0, 1, 0, 0,-1,-1, 0, 1, 0,-1,-1},
            {-1, 0, 1, 0, 0,-1,-1, 0, 1, 0,-1,-1},
            {-1, 0, 1, 0, 0,-1,-1, 0, 1, 1,-1,-1},
            { 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0,-1},
            { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,-1},
            { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,-1},
            { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0,-1},
            { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0,-1},
            { 0, 1, 1, 1, 0,-1,-1, 0, 1, 1, 1, 0},
            { 0, 1, 1, 1, 0,-1,-1, 0, 1, 1, 1, 0},
            { 1, 1, 1, 0,-1,-1,-1,-1, 0, 1, 1, 1},
            { 1, 1, 1, 0,-1,-1,-1,-1, 0, 1, 1, 1}
        };

    private int [][] templateB = {
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
            {0, 1, 0,-1,-1,-1, 1, 0, 1, 1, 1, 0},
            {0, 1, 0,-1,-1,-1, 1, 0, 1, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
            {0, 1, 0,-1,-1,-1,-1, 1, 0, 1, 1, 0},
            {0, 1, 0,-1,-1,-1,-1, 1, 0,-1, 1, 0},
            {0, 1, 0,-1,-1,-1,-1, 1, 0, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}
        };
    public static void main(String[] args) {
        System.out.print("\f");
        OCR test = new OCR();
        for (int k =1; k<=6; k++) {
            String fileName = "Image" +k + ".pgm";
            int [] [] image = test.loadImage(fileName, 24, 20);
            System.out.println(fileName + ": " + test.ocr(image));
        }
    }

    public static int findVertPosition(int[] [] image, int h) {
        int rows = image.length, cols = image[ 0].length;
        int [] sums = new int[rows];
        for (int r =  0; r < rows; r++) {
            int s =  0;
            for (int light: image[r]) {
                s+=light;
            }
            sums[r] = s;
        }
        int minSum = -1, minRow = -1;
        for (int r= 0; r<= rows-h;r++) {
            int s =  0;
            for (int k = r; k< r+h; k++) {
                s+= sums[k];
            }
            if (minSum == -1 || s<minSum) {
                minSum = s;
                minRow = r;
            }
        }
        return minRow;
    }

    /**private int findHorzPosition (int[][] image, int row0, int h, int w) {
        int[] sums = new int[image[ 0].length];
        for (int col =  0; col < sums.length; col++) {
            int s =  0;
            for (int row = row0; row < row0 + h; row++) {
                s += image[row][col];
            }
            sums[col] = s;
        }
        int minSum = Integer.MAX_VALUE;
        int minCol = -1;
        for (int startCol =  0; startCol < image[ 0].length - w; startCol += w) {
            int sum = 0;
            for (int col = startCol; col < startCol + w; col++) {
                sum += sums[col];
            }
            if (sum < minSum) {
                minSum = sum;
                minCol = startCol;
            }
        }
        return minCol;
    }*/

    private int findHorzPosition (int [] [] image, int row0, int h, int w) {
        int rows= image.length, cols= image [0].length;
        int [] sums= new int [cols];
        for (int c=0; c<cols; c++) {
            int s= 0;
            for( int r= row0; r<row0+h; r++) {
                s+= image [r] [c];
            }
            sums [c]= s;
        }
        int minSum=-1, minCol=-1;
        for (int c= 0; c<=cols-w; c++) {
            int s= 0;
            for (int k=c; k<c+w; k++) {
                s+=sums[k];
            }
            if (minSum==-1 || s<minSum)
            {
                minSum=s;
                minCol= c;
            }
        }
        return minCol;
    }

    /**
    private int match (int [] [] image, int [] [] template, int row, int col) {
    int [][]  imageSubset = new int[template.length][template[0].length];
    //copy over the subset of image (size of template) to compare with template
    for (int r = row; r < template.length; r++) {
    for (int c = col; c < template[r].length; c++) {
    imageSubset[r-row][c-col] = image[r][c];
    }
    }

    int totalDiff = 0;
    for (int r = 0; r < imageSubset.length; r++) {
    for (int c = 0; c < imageSubset[r].length; c++) {
    if (imageSubset[r][c] != 0 && template[r][c] != 0) {
    totalDiff += Math.abs(imageSubset[r][c] - template[r][c]);
    }
    }
    }

    return totalDiff;
    }*/
    private double match (int [] [] image, int [] [] template, int row, int col) {

        int rows = template.length, cols = template [0].length;
        int n = rows * cols;
        double avgImage = 0.0, avgTempl = 0.0;
        for(int r=0; r<rows; r++) {
            for (int c=0; c<cols;c++) {
                avgImage += image[r + row][c+ col];
                avgTempl += template[r ][c];
            }
        }
        avgImage /= n;
        avgTempl /= n;

        double sigmaImage = 0.0, sigmaTempl = 0.0, cov = 0.0;
        for(int r=0; r<rows; r++) {
            for (int c=0; c<cols;c++) {
                double d1 = image[r + row][c+ col] - avgImage;
                double d2 = template[r][c] - avgTempl;
                sigmaImage += d1 * d1;
                sigmaTempl += d2 * d2;
                cov += d1 * d2;
            }
        }
        sigmaImage = Math.sqrt(sigmaImage / n);
        sigmaTempl = Math.sqrt(sigmaTempl / n);

        cov /= n;
        double corr = -cov / (sigmaImage * sigmaTempl);
        return corr;
    }

    private int[][] loadImage(String fileName, int rows, int cols) {
        File file = new File(fileName);
        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println("*** Can't open " + fileName + " ***");
            System.exit(1);
        } 
        int[][] image = new int[rows][cols];

        // Skip header lines:
        input.nextLine();
        input.nextLine();
        input.nextLine(); 

        // Read pixel data: 
        int r = 0, c = 0;
        while (input.hasNextInt()) { 
            if (r >= rows) { 
                System.out.println("*** Too many numbers in the image file " + fileName + " ***");
                input.close();
                System.exit(1);
            } 
            image[r][c++] = input.nextInt();
            if (c == cols) {
                c = 0;
                r++;
            }
        }

        if (c != 0 || r != rows) {
            System.out.println("*** Too many numbers in the image file " + fileName + " ***");
            input.close();
            System.exit(1);
        }

        input.close();
        return image;
    }

    public char ocr(int[][] image) {
        int h = templateA.length;
        int w = templateA[0].length;

        int row0 = findVertPosition(image, h);

        int col0 = findHorzPosition (image,  row0, h, w);
        double matchA = match (image,  templateA, row0, col0);
        double matchB = match (image, templateB, row0, col0);
        if (matchA > matchB) {
            return 'A';
        }
        else if (matchB > matchA) {
            return 'B';
        }
        else {
            return '?';
        }
    }
}
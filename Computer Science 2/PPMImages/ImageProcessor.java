import java.util.Scanner;
import java.io.PrintWriter;
/**
 * Write a description of class ImageProcessor here.
 * 
 * @Vaed Prasad
 * @October 2014
 */
public class ImageProcessor
{
    private Scanner userin;
    public ImageProcessor()
    {
        userin = new Scanner (System.in);
    }

    public  void runprocessor () throws java.io.IOException
    {
        clearScreen();
        displayWelcome();
        String FileName= getFileName(userin);
        System.out.println(FileName);
        Scanner myPicture = initInfile(FileName);
        //copyToScreen (myPicture);
        //displayFilterChoice(FileName);
        PrintWriter outpic = openOutFile(FileName.substring(0,FileName.length()-4)+ "out.ppm");
        int choice = displayFilterChoice(FileName);
        RunFilterChoice(FileName, myPicture, outpic, choice);
        //ScaleImproved(myPicture, outpic);
        displayFarewell();

    }

    public  void clearScreen ()
    {
        System.out.println("\f");
    }
    
    public  void displayWelcome ()
    {
        System.out.println("*******************");
        System.out.println("Welcome to ⓘⓜⓐⓖⓔ ⓟⓡⓞⓒⓔⓢⓢⓞⓡ \n Beta 1.0");
        System.out.println("By Vaed Prasad");
        System.out.println("Computer Science 2: G Period");
        System.out.println("*******************");

    }

    public String getFileName (Scanner userInput)
    {
        System.out.println("Input the file of your choosing:");
        String file = userInput.nextLine ();
        file = file  + ".ppm";
        return file;
    }

    public int displayFilterChoice(String file)
    {
        System.out.println("*******************");
        System.out.println("What Filter would you like to use on " + file +"?  Select the corresponding number the the seleced filter.");
        System.out.println("1. Flatten Red");
        System.out.println("2. Flatten Green");
        System.out.println("3. Flatten Blue");
        System.out.println("4. Negate Red");
        System.out.println("5. Negate Green");
        System.out.println("6. Negate Blue");
        System.out.println("7. Grey Scale");
        System.out.println("8. Scale by Factor of 2");
        System.out.println("9. Improved Scale");
        System.out.println("10. Collage");
        System.out.println("*******************");
        int choice = userin.nextInt();
        return choice;
    }

    public  void RunFilterChoice(String file, Scanner picfile, PrintWriter outpic, int choice)
    {    

        if(choice==1)
        {
            System.out.println("You have selected the Flatten Red Filter");
            flattenRedFilter(picfile, outpic);
        }
        else if(choice==2)
        {
            System.out.println("You have selected the Flatten Green Filter");
            flattenGreenFilter(picfile, outpic);
        }
        else if(choice==3)
        {
            System.out.println("You have selected the Flatten Blue Filter");
            flattenBlueFilter(picfile, outpic);
        }
        else if(choice==4)
        {
            System.out.println("You have selected the Negate Red Filter");
            negateRedFilter(picfile, outpic);
        }
        else if(choice==5)
        {
            System.out.println("You have selected the Negate Green Filter");
            negateGreenFilter(picfile, outpic);
        }
        else if(choice==6)
        {
            System.out.println("You have selected the Negate Blue Filter");
            negateBlueFilter(picfile, outpic);
        }
        else if(choice==7)
        {
            System.out.println("You have selected the Grey Scale Filter");
            negateGreyScale(picfile, outpic);
        }
        else if(choice==8)
        {
            System.out.println("You have selected the Scale by Factor of 2 Transformation");
            scaleBasic(picfile, outpic);
        }
        else if(choice==9)
        {
            System.out.println("You have selected the Improved Scale Transformation");
            scaleImproved(picfile, outpic);
        }
        else if(choice==10)
        {
            System.out.println("You have selected the Collage");
            collage(picfile, outpic);
        }
        
        else
        {
            System.out.println("You have failed to select an appropriate option");
        }

    }

    public  void displayFarewell()
    {
        System.out.println("*******************");
        System.out.println("Your File has been appropriately filtered according to the selected filter.");
        System.out.println("Have A Great Day!");
        System.out.println("*******************");

    }

    public Scanner initInfile(String filename) throws java.io.IOException
    {
        java.io.File file= new java.io.File(System.getProperty("user.dir")+ "/MyPPMs/" + filename);
        Scanner fileScanner = new Scanner (file);
        return fileScanner;
    }
    //Filters:
    public void flattenBlueFilter (Scanner picfile, PrintWriter outfile)
    {
        String p3Part = picfile.nextLine();
        int numCols = picfile.nextInt();
        int numRows = picfile.nextInt();
        int maxColor = picfile.nextInt();

        outfile.println(p3Part);
        outfile.println(numCols+ " " + numRows);
        outfile.println(maxColor);
        for (int row=0; row< numRows; row++)
        {
            for (int col=0; col< numCols; col++)
            {
                int r = picfile.nextInt();
                int g = picfile.nextInt();
                int b = picfile.nextInt();
                outfile.print(r+ " " + g+ " " + "0      ");
            }
            outfile.println();
        }
        outfile.flush();
    }

    public void flattenRedFilter (Scanner picfile, PrintWriter outfile)
    {
        String p3Part = picfile.nextLine();
        int numCols = picfile.nextInt();
        int numRows = picfile.nextInt();
        int maxColor = picfile.nextInt();

        outfile.println(p3Part);
        outfile.println(numCols+ " " + numRows);
        outfile.println(maxColor);
        for (int row=0; row< numRows; row++)
        {
            for (int col=0; col< numCols; col++)
            {
                int r = picfile.nextInt();
                int g = picfile.nextInt();
                int b = picfile.nextInt();
                outfile.print("0" + " " + g+ " " + b +"       ");
            }
            outfile.println();
        }
        outfile.flush();
    }

    public void flattenGreenFilter (Scanner picfile, PrintWriter outfile)
    {
        String p3Part = picfile.nextLine();
        int numCols = picfile.nextInt();
        int numRows = picfile.nextInt();
        int maxColor = picfile.nextInt();

        outfile.println(p3Part);
        outfile.println(numCols+ " " + numRows);
        outfile.println(maxColor);
        for (int row=0; row< numRows; row++)
        {
            for (int col=0; col< numCols; col++)
            {
                int r = picfile.nextInt();
                int g = picfile.nextInt();
                int b = picfile.nextInt();
                outfile.print(r + " " + "0"+ " " + b +"       ");
            }
            outfile.println();
        }
        outfile.flush();
    }

    public void negateRedFilter (Scanner picfile, PrintWriter outfile)
    {
        String p3Part = picfile.nextLine();
        int numCols = picfile.nextInt();
        int numRows = picfile.nextInt();
        int maxColor = picfile.nextInt();

        outfile.println(p3Part);
        outfile.println(numCols+ " " + numRows);
        outfile.println(maxColor);
        for (int row=0; row< numRows; row++)
        {
            for (int col=0; col< numCols; col++)
            {
                int r = picfile.nextInt();
                int g = picfile.nextInt();
                int b = picfile.nextInt();
                int r1 =  maxColor-r;
                outfile.print(r1+ " " + g+ " " + b +"      ");
            }
            outfile.println();
        }
        outfile.flush();
    }

    public void negateBlueFilter (Scanner picfile, PrintWriter outfile)
    {
        String p3Part = picfile.nextLine();
        int numCols = picfile.nextInt();
        int numRows = picfile.nextInt();
        int maxColor = picfile.nextInt();

        outfile.println(p3Part);
        outfile.println(numCols+ " " + numRows);
        outfile.println(maxColor);
        for (int row=0; row< numRows; row++)
        {
            for (int col=0; col< numCols; col++)
            {
                int r = picfile.nextInt();
                int g = picfile.nextInt();
                int b = picfile.nextInt();
                int b1 =  maxColor-b;
                outfile.print(r+ " " + g+ " " + b1 +"      ");
            }
            outfile.println();
        }
        outfile.flush();
    }

    public void negateGreenFilter (Scanner picfile, PrintWriter outfile)
    {
        String p3Part = picfile.nextLine();
        int numCols = picfile.nextInt();
        int numRows = picfile.nextInt();
        int maxColor = picfile.nextInt();

        outfile.println(p3Part);
        outfile.println(numCols+ " " + numRows);
        outfile.println(maxColor);
        for (int row=0; row< numRows; row++)
        {
            for (int col=0; col< numCols; col++)
            {
                int r = picfile.nextInt();
                int g = picfile.nextInt();
                int b = picfile.nextInt();
                int g1 =  maxColor-g;
                outfile.print(r+ " " + g1+ " " + b +"      ");
            }
            outfile.println();
        }
        outfile.flush();
    }

    public void negateGreyScale (Scanner picfile, PrintWriter outfile)
    {
        String p3Part = picfile.nextLine();
        int numCols = picfile.nextInt();
        int numRows = picfile.nextInt();
        int maxColor = picfile.nextInt();

        outfile.println(p3Part);
        outfile.println(numCols+ " " + numRows);
        outfile.println(maxColor);
        for (int row=0; row< numRows; row++)
        {
            for (int col=0; col< numCols; col++)
            {
                int r = picfile.nextInt();
                int g = picfile.nextInt();
                int b = picfile.nextInt();
                int average =  (r+g+b)/3;
                outfile.print(average+ " " + average+ " " + average +"      ");
            }
            outfile.println();
        }
        outfile.flush();
    }
    //Transformations:

    public void scaleBasic (Scanner picfile, PrintWriter outfile)
    {
        String p3Part = picfile.nextLine();
        int numCols = picfile.nextInt();
        int numRows = picfile.nextInt();
        int maxColor = picfile.nextInt();

        outfile.println(p3Part);
        outfile.println(numCols*2+ " " + numRows*2);
        outfile.println(maxColor);
        for (int row=0; row< numRows; row++)
        {
            String repeat = "";
            for (int col=0; col< numCols; col++)
            {
                int r = picfile.nextInt();
                int g = picfile.nextInt();
                int b = picfile.nextInt();
                String pixel = r+ " " + g+ " " + b+"    ";
                repeat = repeat + pixel + pixel;

            }
            outfile.println(repeat);
            outfile.println(repeat);
        }
        outfile.flush();
    }

    public void scaleImproved (Scanner picfile, PrintWriter outfile)
    {
        System.out.println("By what factor would you like to scale your picture?");
        int factor = userin.nextInt ();
        String p3Part = picfile.nextLine();
        int numCols = picfile.nextInt();
        int numRows = picfile.nextInt();
        int maxColor = picfile.nextInt();

        outfile.println(p3Part);
        outfile.println(numCols*factor+ " " + numRows*factor);
        outfile.println(maxColor);
        for (int row=0; row< numRows; row++)
        {
            String repeat = "";
            for (int col=0; col< numCols; col++)
            {
                int r = picfile.nextInt();
                int g = picfile.nextInt();
                int b = picfile.nextInt();
                String pixel = r+ " " + g+ " " + b+"    ";
                for (int x=0; x<factor; x++)
                {
                    repeat = repeat + pixel;
                    //Makes as many colums as the scale is improved
                }
            }
            for(int y = 0; y < factor; y++)
            {
                outfile.println(repeat);
            }
        }
        outfile.flush();
    }

    public void collage (Scanner picfile, PrintWriter outfile)
    {
        String p3Part = picfile.nextLine();
        int numCols = picfile.nextInt();
        int numRows = picfile.nextInt();
        int maxColor = picfile.nextInt();

        outfile.println(p3Part);
        outfile.println(numCols*8+ " " + numRows*2);
        outfile.println(maxColor);
        for (int row=0; row< numRows; row++)
        {
            String normal = "";
            String averageLine = "";
            String negate = "";
            String flat = "";
            for (int col=0; col< numCols; col++)
            {
                int r = picfile.nextInt();
                int g = picfile.nextInt();
                int b = picfile.nextInt();
                int average =  (r+g+b)/3;
                int r1 =  maxColor-r;
                int g1 =  maxColor-g;
                int b1 =  maxColor-b;
                int r2 = 0;
                String line = r+ " " + g + " " + b + " "+ r + " " + g + " " + b + " ";
                String negateline = r1+ " " + g1 + " " + b1 + " "+ r1 + " " + g1 + " " + b1 + " ";
                String flatline = r2+ " " + g + " " + b + " "+ r2 + " " + g + " " + b + " ";
                
                //Original Image
                normal = normal + " " + line;
                //Flatten Red
                flat = flat + " " +flatline;
                //Negate Everything
                negate= negate + " " + negateline;
                //Grey Scale
                averageLine = averageLine + " " + average+ " " + average+ " " + average+"    " + average+ " " + average+ " " + average+"    ";
            }
            //Resulting Collage is a Basic Scaled version of the normal picture side-by-side with the grey scale
            outfile.println(normal+averageLine+negate+flat);
            outfile.println(normal+averageLine+negate+flat);
        }
        outfile.flush();
    }

    public void copyToScreen (Scanner picfile)
    {
        String p3Part = picfile.nextLine();
        int numCols = picfile.nextInt();
        int numRows = picfile.nextInt();
        int maxColor = picfile.nextInt();

        System.out.println(p3Part);
        System.out.println(numCols+ " " + numRows);
        System.out.println(maxColor);
        for (int row=0; row< numRows; row++)
        {
            for (int col=0; col< numCols; col++)
            {
                int r = picfile.nextInt();
                int g = picfile.nextInt();
                int b = picfile.nextInt();
                System.out.print(r+ " " + g+ " " + b+ "          ");
            }
            System.out.println();
        }
    }

    public PrintWriter openOutFile (String filename) throws java.io.IOException
    {
        PrintWriter picfile = new PrintWriter (System.getProperty("user.dir")+ "/MyPPMs/" + filename);

        return picfile;
    }
}

  
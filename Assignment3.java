import java.util.Scanner;

class Assignment3 {
    public static void main(String[] args) {
        System.out.print("Enter the any Sentence : ");
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        System.out.println("Enter the any letter A-Z");
        char letter = sc.next().charAt(0);
        String result = "";
        boolean flag=false;
        if (letter >= 'a' && 90 <= letter || letter >='A' && 'Z' <= letter) {
            for (int i = 0; i <= sent.length() - 1; i++) {

                if (sent.charAt(i) == letter) {
                    flag=true;
                    for (int j = i + 1; j <= sent.length() - 1; j++) {
                        result = result + sent.charAt(j);    
                    }
                    break;
                }

            }
            if (flag) { 
                System.out.println("Sentence : "+sent);
                System.out.println("Letter : "+letter);
                System.out.println("result : " + result);
            } 
            else 
            {
                System.out.println("Sentence : "+sent);
                System.out.println("Letter : "+letter);
                System.out.print("result : " + result);
                System.out.print("The letter does not exist in the sentence");     
            }
        } 
        else 
        {
            System.out.println("Input Valid Letter A-Z");
        }
        sc.close();
    }
}
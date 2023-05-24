import java.util.Scanner;
class Selectionstatement{
    char ch;
    public void menu(){
        System.out.println("ENTER YOUR CHOICE=");
        System.out.println("1.DAYS COUNTER ");
        System.out.println("2.PANDA RESTAURANT");
        System.out.println("3.NET INCOME");
        System.out.println("4.CONVERTOR PROGRAM");
        System.out.println("5.MARKSHEET");
        System.out.println("6.SWIPING VALUES");
        System.out.println("7.NUMBER IS EVEN OR ODD");
        System.out.println("8.NUMBER IS NEGATIVE OR POSITIVE");
        System.out.println("9.WHICH NUMBER IS GRATER USING 3 NUMBERS");
        System.out.println("10.CALCULATOR");
        System.out.println("11.ATM MACHINE");
        System.out.println("12.ELECTRICITY BILL");
        System.out.println("13.SEASON PROGRAM");
        System.out.println("14.EXIT");

        Scanner scan=new Scanner(System.in);
        int option=scan.nextInt();

        if(option==1){
            Dayscounter();
        }
        else if (option==2){
            Pandarestaurant();
        }
        else if (option==3) {
            NETincome();
        }
        else if (option==4) {
            Convertorprogram();
        }
        else if(option==5){
            Marksheet();
        }
        else if(option==6){
            Swipingvalues();
        }
        else if(option==7){
            Evenodd();
        }
        else if(option==8){
            Negativepositive();
        }
        else if(option==9){
            Largestnumber();
        }
        else if(option==10){
            calculator();
        }
        else if(option==11){
            atmmachine();
        }
        else if(option==12){
            Elicitricitybill();
        }
        else if(option==13){
            Seasonprogram();
        }
        else if (option==14) {
            return;

        } else{
            System.out.println("ENTER A VALID CHOICE");
        }
    }
    public void Dayscounter(){
        do{
            System.out.println("-----PROGRAM TO CALCULATE DAYS-----");
            System.out.println("\tEnter days you want to calculate=");
            Scanner scan=new Scanner(System.in);
            int totaldays = scan.nextInt();
            int years = totaldays / 365;
            int remainingdays = totaldays % 365;
            int months = remainingdays / 30;
            remainingdays = remainingdays % 30;
            int weeks = remainingdays / 7;
            remainingdays = remainingdays % 7;

            System.out.println("Total Days=" + totaldays);
            System.out.println("Years=" + years);
            System.out.println("Months=" + months);
            System.out.println("Weeks=" + weeks);
            System.out.println("Days=" + remainingdays);

            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);


        } while (ch==('Y') | ch==('y'));
        menu();

    }
    public void Pandarestaurant(){
        do{
            System.out.println("\t\t\t\t\t\t\t\t\t*******WELCOME TO Panda's restaurant*******");
            System.out.println("Menu\n 1.burger\n 2.tea\n 3.coffee\n 4.cold drink\n 5.large pizza\n 6.small pizza");
            System.out.println("\tenter choices(1-6):");

            Scanner scan=new Scanner(System.in);
            System.out.println("\toption=");
            int choose = scan.nextInt();
            String order;


            switch (choose) {
                case 1:
                    order = "Chicken Burger";
                    System.out.println("price =350 PKR");

                    break;
                case 2:
                    order = "Tea";
                    System.out.println("price =70 PKR");
                    break;
                case 3:
                    order = "Coffee";
                    System.out.println("price =100 PKR");
                    break;
                case 4:
                    order = "Cold drink";
                    System.out.println("price =50 PKR");
                    break;
                case 5:
                    order = "Large pizza";
                    System.out.println("price =800");
                    break;
                case 6:
                    order = "Small pizza";
                    System.out.println("price =400");
                    break;
                default:
                    order = "sorry not in menu";
            }
            System.out.println("your order is " + order);

            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);


        } while (ch==('Y') | ch==('y'));
        menu();

    }
    public void NETincome(){
        do{
            System.out.println("-----PROGRAM TO CALCULATE NETINCOME-----");
            System.out.println("\tEnter your basic pay=");
            Scanner scan=new Scanner(System.in);
            int basicpay = scan.nextInt();
            int houserent = basicpay * 45 / 100;
            int medicalallowance = basicpay * 15 / 100;
            int bonus = basicpay * 5 / 100;
            int grosspay = basicpay + houserent + medicalallowance + bonus;
            int incometax = basicpay * 5 / 100;
            int convanceallowance = basicpay * 8 / 100;
            double zakat = basicpay * 2.5 / 100;
            double netSalary = grosspay - convanceallowance - incometax - zakat;

            System.out.println("BASIC PAY=" + basicpay);
            System.out.println("HOUSE RENT AT THE RATE OF 45%=" + houserent);
            System.out.println("MEDICAL ALLOWANCE AT THE RATE OF 15%=" + medicalallowance);
            System.out.println("BONUS AT THE RATE OF 5%=" + bonus);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("GROSS PAY =" + grosspay);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("INCOMR TAX AT THE RATE OF 5%=" + incometax);
            System.out.println("CONVANCEALLOWANCE AT THE RATE OF  8%=" + convanceallowance);
            System.out.println("ZAKAT AT THE RATE OF 2.5%=" + zakat);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("NET SALARY=" + netSalary);

            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);


        } while (ch==('Y') | ch==('y'));
        menu();
    }
    public void Convertorprogram(){
        do{
            System.out.println("***********PROGRAM FOR CONVERSIONS**************");
            System.out.println("ENTER KILOGRAMS=");
            Scanner scan=new Scanner(System.in);
            double kilograms=scan.nextDouble();
            double g=kilograms*1000;
            double grams=2000;
            double kg=grams/1000;
            double foot=40;
            double inch=foot*12;
            double inches=100;
            double ft=inches/12;

            System.out.print(kilograms + " KILO GRAMS= ");
            System.out.println(g+ " GRAMS");
            System.out.print(grams + " GRAMS= ");
            System.out.println(kg+ " KILOGRAMS");
            System.out.print(foot + " FOOTS= ");
            System.out.println(inch+ " INCHES");
            System.out.print(inches + " INCHES= ");
            System.out.println(ft+ " FOOT");


        }while(ch==('Y')| ch==('y'));
        menu();

    }
    public void Marksheet(){
        do{
            System.out.println("************MARKSHEET FOR CALCULATING GRADES***********");
            System.out.println("ENTER YOUR MARKS=");
            Scanner scan=new Scanner(System.in);
            int marks= scan.nextInt();
            if(marks>100) {
                System.out.println("INVALID NUMBER");
            } else if (marks<0) {
                System.out.println("INVALID NUMBER");
            } else if(marks>=80&&marks<=100){
                System.out.println("A1 GRADE");
            } else if (marks>=70&&marks<=79) {
                System.out.println("A GRADE");
            } else if (marks>=60&&marks<=69) {
                System.out.println("B GRADE");
            } else if (marks>=50&&marks<=59) {
                System.out.println("C GRADE");
            } else if (marks>=40&&marks<=49) {
                System.out.println("D GRADE");
            } else if (marks>=1&&marks<=39) {
                System.out.println("FAIL");
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);

        }while(ch==('Y')| ch==('y'));
        menu();
    }
    public void Swipingvalues(){
        do{
            System.out.println("-----PROGRAM FOR SWIPING NUMBERS-----");
            Scanner scan=new Scanner(System.in);
            System.out.println("\tEnter first number to swape=");
            int x = scan.nextInt();

            System.out.println("\tEnter second number to swape=");
            int y = scan.nextInt();

            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("Value store in first number= " + x);
            System.out.println("Value store in second number=" + y);

            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);


        } while (ch==('Y') | ch==('y'));
        menu();

    }
    public void Evenodd(){
        do{
            System.out.println("-----PROGRAM TO IDENTIFIY WEATHER NUMBER IS EVEN OR ODD-----");
            System.out.println("\tEnter Number=");
            Scanner scan=new Scanner(System.in);
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("\t" + num + " is Even");
            } else {
                System.out.println("\t" + num + " is Odd");
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);


        } while (ch==('Y') | ch==('y'));
        menu();
    }
    public void Negativepositive(){
        do{
            System.out.println("-----------------NUMBER IS POSITIVE OR NEGATIVE------------");
            Scanner scan=new Scanner(System.in);
            int number= scan.nextInt();
            if (number > 0) {

                System.out.println(number + " is positive.");

            } else if (number < 0) {

                System.out.println(number + " is negative.");

            } else {

                System.out.println(number + " is equal to zero.");

            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);

        }while (ch==('Y') | ch==('y'));
        menu();
    }
    public void Largestnumber(){
        do{
            System.out.println("-----PROGRAM TO FIND LARGEST NUMBER AMONG 3 NUMBERS-----");
            Scanner scan=new Scanner(System.in);
            System.out.println("\tEnter first number=");
            int n1 = scan.nextInt();

            System.out.println("\tEnter second number=");
            int n2 = scan.nextInt();


            System.out.println("\tEnter third number=");
            int n3 = scan.nextInt();

            if (n1 >= n2 && n1 >= n3) {
                System.out.println("\t\t" + n1 + " is the largest number.");
            } else if (n2 >= n1 && n2 >= n3) {
                System.out.println("\t\t" + n2 + " is the largest number.");
            } else {
                System.out.println("\t\t" + n3 + " is the largest number.");
            } System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);


        } while (ch==('Y') | ch==('y'));
        menu();

    }
    public void calculator(){
        do {
            System.out.println("-----PROGRAM TO PERFORM AIRTHMETIC OPERATOR-----");
            System.out.println("\t\tChoose an operator: +, -, *, or /");
            Scanner scan=new Scanner(System.in);
            String option = scan.next();

            System.out.println("Enter first number=");
            int number1 = scan.nextInt();

            System.out.println("Enter second number=");
            int number2 = scan.nextInt();



            switch (option) {
                case "+":
                    System.out.println("Addition of num1 and num2=" + (number1 + number2));
                    break;
                case "-":
                    System.out.println("Subtraction of num1 and num2=" + (number1 - number2));
                    break;
                case "*":
                    System.out.println("Multiplication of num1 and num2=" + (number1 * number2));
                    break;
                case "/":
                    System.out.println("Division of num1 and num2=" + (number1 / number2));
                    break;
                default:
                    System.out.println("Invalid operator");

            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);


        } while (ch==('Y') | ch==('y'));
        menu();
    }
    public void atmmachine(){
        do{
            int balance = 100000, withdraw, deposit;
            Scanner sc = new Scanner(System.in);
            char choice;
            System.out.print("\t\t\t\t\t\t\t\t***WELCOME TO AUTOMATED TELLER MACHINE***\t\t\t\t\t\t\t\t");




            System.out.println("\n\nChoose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("\n\t\tChoose the operation you want to perform:");


            int option = sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.print("\n\tEnter money to be withdrawn:");
                    withdraw = sc.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("\tPlease collect your money");
                    }
                    else
                    {

                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("\n\tEnter money to be deposited:");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("\tYour Money has been successfully depsited");
                    System.out.println("");
                    break;



                case 3:
                    System.out.println("\n\t\tBalance : "+balance);
                    System.out.println("");
                    break;



                case 4:
                    System.out.print("\n*Thank You For Using My ATM*  \n*Have a Nice Day*  \n*Good-Bye!*");
                    System.exit(0);
                    break;

            }System.out.println("want to continue press Y=yes or N=no");

            ch=sc.next().charAt(0);


        }while (ch==('Y') | ch==('y'));
        menu();
    }
    public void Elicitricitybill(){
        do{
            System.out.println("-----PROGRAM TO CALCULATE ELECTRICITY BILL-----");
            System.out.println("\tEnter consumed units=");
            Scanner scan=new Scanner(System.in);
            int units = scan.nextInt();
            double billAmount;

            if (units >= 1 && units <= 100) {
                System.out.print("TOTAL AMOUNT=");
                System.out.println(billAmount = units * 1);
            } else if (units >= 101 && units <= 200) {
                System.out.print("TOTAL AMOUNT=");
                System.out.println(billAmount = 100 + (units - 100) * 3);
            } else if (units >= 201 && units <= 300) {
                System.out.print("TOTAL AMOUNT=");
                System.out.println(billAmount = 400 + (units - 200) * 5);
            } else if (units >= 301 && units <= 400) {
                System.out.print("TOTAL AMOUNT=");
                System.out.println(billAmount = +900 + (units - 300) * 7);
            } else if (units >= 401 && units <= 500) {
                System.out.print("TOTAL AMOUNT=");
                System.out.println(billAmount = +1600 + (units - 400) * 9);
            } else {
                System.out.println("Invalid units");
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);


        } while (ch==('Y') | ch==('y'));
        menu();
    }
    public void Seasonprogram(){
        do{
            System.out.println("-----------SEASON PROGRAM-------------");
            System.out.println("ENTER NUMBER YOU WANT TO KNOW WHICH SEASON IS THIS=");
            Scanner scan=new Scanner(System.in);
            int num= scan.nextInt();

            if (num== 2 || num == 3 || num == 4) {
                System.out.println("the season is spring");}
            if (num == 5 || num == 6 || num == 7) {
                System.out.println("the season is summer");
            } else if (num == 8 || num == 9 || num == 10) {
                System.out.println("the season is autumn");
            }else if (num == 11 || num == 12 || num == 1) {
                System.out.println("the season is winter");
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);

        } while (ch==('Y') | ch==('y'));
        menu();
    }

}
class Loops{
    char ch;
    public void menu2(){
        System.out.println("ENTER YOUR CHOICE=");
        System.out.println("1.PRINT TABLE");
        System.out.println("2.PRINT NESTED WORDS");
        System.out.println("3.PRINT CHAR ");
        System.out.println("4.exit");
        Scanner scan=new Scanner(System.in);
        int option=scan.nextInt();

        if(option==1){
            printtable();
        }
        else if (option==2){
            printnestedworeds();
        }
        else if (option==3) {
            printcharwords();
        }
        else if (option==4) {
            return;
        }
        else {
            System.out.println("INVALID CHOICE");
        }

    }
    public void printtable(){
        do{
            System.out.println("-----PROGRAM TO PRINT TABLE OF ANY NUMBER-----");
            System.out.println("\tInput Number=");
            Scanner scan=new Scanner(System.in);
            int number = scan.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = "
                        + number * i);
            } System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);


        } while (ch==('Y') | ch==('y'));
        menu2();
    }
    public void printnestedworeds(){
        do{
            System.out.println("-------PRINT YOUR NAME IN NESTED LOOP---------");
            Scanner scan=new Scanner(System.in);
            for (int i = 0; i < 5; i++){
                for (int j = 0; j <= i; j++){
                    System.out.print("SAFFA ");
                }
                System.out.println("");
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);

        }while (ch==('Y') | ch==('y'));
        menu2();
    }
    public void printcharwords(){
        do{
            System.out.println("-------PRINTING CHARACTER PATTERN--------");
            System.out.println("ENTER YOUR NAME=");
            Scanner scan=new Scanner(System.in);
            String name= scan.nextLine();
            for(int i=0;i<name.length();i++)
            {
                System.out.println(name.substring(0,i+1));
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);
        }while (ch==('Y') | ch==('y'));
        menu2();
    }

}
class Starpattern{
    char ch;
    public void menu3(){
        System.out.println("ENTER YOUR CHOICE=");
        System.out.println("1.STAR PATTERN 1");
        System.out.println("2.STAR PATTERN 2");
        System.out.println("3.STAR PATTERN 3");
        System.out.println("4.exit");
        Scanner scan=new Scanner(System.in);
        int option=scan.nextInt();

        if(option==1){
            Starpattern1();
        }
        else if (option==2){
            Starpattern2();
        }
        else if (option==3) {
            Starpattern3();
        }
        else if (option==4) {
            return;
        }
        else {
            System.out.println("INVALID CHOICE");
        }
    }
    public void Starpattern1(){
        do {
            System.out.println("--------STAR PATTERN 1-------");
            Scanner scan=new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);
        }while (ch==('Y') | ch==('y'));
        menu3();
    }
    public void Starpattern2(){
        do {
            System.out.println("---------STAR PATTERN 2-------");
            Scanner scan=new Scanner(System.in);
            for (int i = 1; i < 5; i++) {

                for (int j = 5 - 1; j > i; j--) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);
        } while (ch==('Y') | ch==('y'));
        menu3();
    }
    public void Starpattern3(){
        do {
            System.out.println("-------STAR PATTERN 3--------");
            Scanner scan=new Scanner(System.in);
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }

                for (int k = 4; k >= i; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);
        }while (ch==('Y') | ch==('y'));
        menu3();
    }
}

class Numberpattern{
    char ch;
    public void menu4(){
        System.out.println("ENTER YOUR CHOICE=");
        System.out.println("1.RIGHT NUMBER TRIANGLE");
        System.out.println("2.LEFT NUMBER TRIANGLE");
        System.out.println("3.exit");
        Scanner scan=new Scanner(System.in);
        int option=scan.nextInt();

        if(option==1){
            Rightnumbertriangle();
        }
        else if (option==2){
            Leftnumbertriangle();
        }

        else if (option==3) {
            return;
        }
        else {
            System.out.println("INVALID CHOICE");
        }

    }
    public void Rightnumbertriangle(){
        do{
            Scanner scan=new Scanner(System.in);
            for (int i = 0; i < 5; i++) {

                for (int j = 1; j < 5 - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k <= i; k++) {
                    System.out.print(k+1);
                }

                System.out.println();
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);
        } while (ch==('Y') | ch==('y'));
        menu4();

    }
    public void Leftnumbertriangle(){
        do{
            Scanner scan=new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(j+1);
                }
                System.out.println();
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);
        }while (ch==('Y') | ch==('y'));
        menu4();
    }

}
class Logicalprogram{
    char ch;
    public void menu5(){
        System.out.println("ENTER YOUR CHOICE=");
        System.out.println("1.FIZZBUZZ PROGRAM");
        System.out.println("2.FABONACCI SERIES");
        System.out.println("3.exit");
        Scanner scan=new Scanner(System.in);
        int option=scan.nextInt();

        if(option==1){
            Fizzbuzz();
        }
        else if (option==2){
            Fabonacciseries();
        }
        else if(option==3){
            return;

        }
        else {
            System.out.println("INVALID CHOICE");
        }

    }
    public void Fizzbuzz(){
        do{ Scanner scan = new Scanner(System.in);
            System.out.println("Enter number: ");

            int input = scan.nextInt();

            for (int i = 1; i <=input; i++) {

                if(i%3==0 && i%5==0){
                    System.out.println("hal chari");
                }
                else if (i%3==0) {
                    System.out.println("hal");
                    continue;
                }else if (i%5==0) {
                    System.out.println("chari");

                }else{
                    System.out.println(i);
                }
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);

        }while (ch==('Y') | ch==('y'));
        menu5();
    }
    public void Fabonacciseries(){
        do{
            Scanner scan=new Scanner(System.in);
            int n1=0,n2=1,n3,i,count=10;
            System.out.print(n1+" "+n2);//printing 0 and 1

            for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
            {
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }
            System.out.println("want to continue press Y=yes or N=no");
            ch=scan.next().charAt(0);
        }while (ch==('Y') | ch==('y'));
        menu5();
    }

}
public class Miniproject1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("*___________________________________WELCOME TO MINI PROJECT______________________________________*");
            System.out.println("\nSELECT ANY ONE CLASS:");
            System.out.println("1.SELECTION STATEMENT");
            System.out.println("2.LOOPS");
            System.out.println("3.STAR PATTERN");
            System.out.println("4.NUMBER PATTERN");
            System.out.println("5.LOGICAL PROGRAM");
            System.out.println("6.EXIT");

            int option = scan.nextInt();

            if (option == 1) {
                Selectionstatement obj = new Selectionstatement();
                obj.menu();
            } else if (option == 2) {
                Loops obj = new Loops();
                obj.menu2();

            } else if (option == 3) {
                Starpattern obj = new Starpattern();
                obj.menu3();
            } else if (option == 4) {
                Numberpattern obj = new Numberpattern();
                obj.menu4();
            } else if (option == 5) {
                Logicalprogram obj = new Logicalprogram();
                obj.menu5();
            } else if (option == 6) {
                System.out.println("-------HAVE A NICE DAY--------");
                return;
            } else {
                System.out.println("INVALID CHOICE");
            }
        }
    }
}
import java.util.Scanner;

public class QuestionService {
    Scanner scan = new Scanner(System.in);
    Question[] questions = new Question[10];
    String[] selection = new String[questions.length];

    public QuestionService(){
        questions[0] = new Question(1, "Size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "Size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "Size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "Size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "Size of boolean", "1", "2", "4", "8", "1");
        questions[5] = new Question(6, "Default value of int", "0", "1", "-1", "null", "0");
        questions[6] = new Question(7, "Wrapper class for int", "Integer", "Int", "int", "Num", "Integer");
        questions[7] = new Question(8, "Which is not a primitive type?", "int", "char", "boolean", "String", "String");
        questions[8] = new Question(9, "Size of float", "4", "8", "2", "6", "4");
        questions[9] = new Question(10, "Java keyword for constant", "const", "final", "static", "volatile", "final");
    }


    public void play(){
        int i=0;
        for(Question q : questions){
            System.out.println("Ques "+q.getId()+": "+q.getQuestion());
            System.out.println("(a) "+q.getOpt1());
            System.out.println("(b) "+q.getOpt2());
            System.out.println("(c) "+q.getOpt3());
            System.out.println("(d) "+q.getOpt4());
            System.out.print("Enter answer : ");
            selection[i++]=scan.next();
        }
    }
    
    public void scoreCal(){
        int score = 0;
        int i=0;
        for (Question q : questions) {
            String ans = selection[i++];
            if(ans.equals(q.getAnswer()))
                score++;
        }
        System.out.println("Your Score : "+score);
    }
}

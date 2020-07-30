package day20_WhileLoops;

public class BranchingStatements {
    public static void main(String[] args) {

        char cg = 'A';
        while (cg <='E'){
            if(cg == 'C'){
                cg++;
                continue;
            }
            System.out.println(cg);
            cg++;
        }

    }
}

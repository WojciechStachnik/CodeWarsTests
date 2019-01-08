package TakeaTenMinuteWalk;


public class main {
    public static void main(String[] args) {
        char[] walk = {'n','s','n','s','n','s','n','s','n','s'};

        int move = 0;

        for (int i=0; i<walk.length;i++){
            if (walk[i] == 'n' || walk[i] == 'w'){
                move += 1;
            }else if (walk[i] == 's' || walk[i] == 'e'){
                move -= 1;
            }
        }

        if ((walk.length == 10) && (move == 0)){
            System.out.println("ok");
        }else{
            System.out.println("nie ok");
        }
    }
}

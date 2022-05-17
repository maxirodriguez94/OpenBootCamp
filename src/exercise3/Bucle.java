package exercise3;

public class Bucle {

    public static void main(String[] args){
        String[] sentences = {"exercise", "three" , "finished"};

        String sentece0 = "";
        String sentece1 = "";
        String sentece2 = "";

        for(int i=0; i < sentences.length; i++){
            int x = i;
           String value = sentences[i];
            switch(x) {
                case 0:
                    sentece0 = value;
                    break;
                case 1:
                    sentece1 = value;
                    break;
                case 2:
                    sentece2 = value;
            }
        }
              System.out.println(sentece0 + " "+ " " + sentece1+ " " +sentece2);
    }

    }


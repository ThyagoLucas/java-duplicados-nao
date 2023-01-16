
public class App {
    public static void main(String[] args) throws Exception {
       
        String[] names = {"maria", "joana", "ana", "leticia", "paula"};
        String[] names2 = {"julia", "flavia", "alice", "luana", "olivia", "paula"};

        for(int i = 0; i < names.length; i++)
            for(int j = 0; j < names2.length; j++)

                if(names[i]== names2[j]) 
                System.out.println(names2[j]);
            

    }
}

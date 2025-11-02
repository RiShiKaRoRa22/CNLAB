import java.util.*;

public class gobackN {
    public static void main(String[] args) {
        int base=0;
        int window=0;
        int frames=0;
        int nextseqnum=0;
        Random r= new Random();

        Scanner sc= new Scanner(System.in);
        System.out.println("enter window size:");
        window=sc.nextInt();
        System.out.println("enter total number of frames:");
        frames=sc.nextInt();

        while(base<frames){// until all acks keep sending , main loop hai ye
            while(nextseqnum<frames && nextseqnum<base+window){
                System.out.println("frame sent: "+ nextseqnum);
                nextseqnum++;// send window size frames at once, then wait for acks
            }
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            Boolean ifsent= r.nextBoolean();

            if(ifsent){
                System.out.println("ACK received from frame:" + base);
                base++;
            }
            else{
                System.out.println("No ACK Rreceived from frame" + base);
                nextseqnum=base;
            }

        }
    }
}

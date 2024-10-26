package PackageThreads;
public class ThreadsTeste {
	static int i = 0;
	public static void main(String[] args) {
		new Thread(t1).start();
		new Thread(t2).start();
	}

    private static void contador(String name){
        i++;
        System.out.println("O valor do contador atual �: " + i + ", thread : " + name);
    }

    private static Runnable t1 = new Runnable() {
        public void run() {
            try{
                for(int i=0; i<5; i++){
                    contador("t1");
                }
            } catch (Exception e){}

        }
    };

    private static Runnable t2 = new Runnable() {
        public void run() {
            try{
                for(int i=0; i<5; i++){
                    contador("t2");
                }
            } catch (Exception e){}
       }
    };
    public static void setI(int i) {
        ThreadsTeste.i = i;
    }

    public static void setT1(Runnable t1) {
        ThreadsTeste.t1 = t1;
    }

    public static void setT2(Runnable t2) {
        ThreadsTeste.t2 = t2;
    }
}

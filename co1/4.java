class Cpu {
    int price;

        Cpu(int p) {
        this.price = p;
        }

        static  class P {
        int cores;
        String madeby;

        P(int a, String b) {
            this.cores = a;
            this.madeby = b;
        }

        void display() {
            System.out.println("no of core in " + this.cores);
            System.out.println("processor mabe by " + this.madeby);
        }
    }

    static class Ram {
        int memory;
        String madeby;

        Ram(int a, String b) {
            this.memory = a;
            this.madeby = b;
        }

        void display() {
            System.out.println("memory size is " + this.memory+" Gb");
            
        }
    }

    void display() {
        System.out.println("price of cpu " + this.price);
    }

    public static void main(String[] args) {
        Cpu intel = new Cpu(1000);
        Cpu.P p = new P(8, "intel");
        Cpu.Ram ram = new Ram(1, "a");
        intel.display();
        p.display();
        ram.display();
    }
}

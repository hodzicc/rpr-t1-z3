
public class Main {

        private int sati,minute,sekunde;
        public Main(int sati, int minute, int sekunde) { Postavi(sati,minute,sekunde); }
        public void Postavi(int sati1, int minute1, int sekunde1) { sati=sati1; minute=minute1; sekunde=sekunde1; }
        public void Sljedeci() {
            sekunde++;
            if (sekunde==60) { sekunde=0; minute++; }
            if (minute==60) { minute=0; sati++; }
            if (sati==24) sati=0;
        }
        public void Prethodni() {
            sekunde--;
            if (sekunde==-1) { sekunde=59; minute--; }
            if (minute==-1) { minute=59; sati--; }
            if (sati==-1) sati=23;
        }
        public void PomjeriZa(int pomak) {
            if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
            else for (int i=0; i<-pomak; i++) Prethodni();
        }
        public int DajSate() { return sati; }
        public int DajMinute() { return minute; }
        public int DajSekunde() { return sekunde; }
        public void Ispisi() {
            System.out.println(+sati+":"+minute+":"+sekunde);
        }


    public static void main(String[] args) {
        Main s= new Main(15,30,45);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();

    }
}
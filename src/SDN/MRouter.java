package SDN;

public class MRouter {
//port numaraları belirtildi.
    public static final int ANKARA    = 1000;
    public static final int CORUM     = 1001;
    public static final int ESKİSEHİR = 1002;
    public static final int BOLU      = 1003;
    public static final int SAMSUN    = 1004;
    public static final int BURSA     = 1005;
    public static final int KARABUK   = 1006;
    public static final int KASTAMONU = 1007;
    public static final int ZONGULDAK = 1008;
    public static final int BARTIN    = 1009;

    public static void main(String[] args) {
	    //port  numaraları ve gideceği yerleri belirttik.       
        Router r1 = new Router(ZONGULDAK, BARTIN);//Bartın dan başlayacak ya Zonguldak ya da Kastamonuya gidecek.
        Router r2 = new Router(KASTAMONU, BARTIN);
        Router r3 = new Router(KARABUK,new int[]{KASTAMONU,ZONGULDAK});//Zonguldak ve Kastamonunun ortak noktası.
        Router r4 = new Router(BURSA,new int[]{KARABUK,ZONGULDAK});
        Router r5 = new Router(SAMSUN,new int[]{KASTAMONU,KARABUK});
        Router r6 = new Router(BOLU,new int[]{SAMSUN,BURSA});//Samsun ile Bursanın ortak Noktası.
        Router r7 = new Router(ESKİSEHİR,new int[]{BOLU,BURSA});
        Router r8 = new Router(CORUM,new int[]{SAMSUN,BOLU});
        Router r9 = new Router(ANKARA,new int[]{CORUM,ESKİSEHİR});
	    
	    //portları başlatır.
        r9.start();
        r8.start();
        r7.start();
        r6.start();
        r5.start();
        r4.start();
        r3.start();
        r2.start();
        r1.start();


    }
}

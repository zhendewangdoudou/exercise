package JichengyuDuotai.Jicheng.neibulei;

public class demo18Bootstrap {

    public static void main(String[] args) {
        demo18RedpacketFrame frame = new demo18RedpacketFrame("hh");
        frame.setOwnerName("王");
        demo18OpenMode normal = new demo18NormalMode();
        frame.setOpenway(normal);

        demo18OpenMode random = new demo18randomMode() ;
        frame.setOpenway(random);
    }
}

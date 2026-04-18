package ink.reactor.zlib;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class ZlibSupplier {

    public static final byte SUPPORTED = 1, UNCHECKED = -1, NOT_SUPPORTED = 0;

    private static byte supportIGZip; 

    static {
        final String os = System.getProperty("os.name");
        supportIGZip = os.equals("Linux") ? UNCHECKED : NOT_SUPPORTED;
    }



    public static ZLib createZlib() {
        return new JavaZlib();
    }
}
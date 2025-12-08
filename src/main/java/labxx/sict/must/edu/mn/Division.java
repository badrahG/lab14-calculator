package labxx.sict.must.edu.mn;

/**
 * Хуваах үйлдэл хийдэг класс.
 */
public class Division {
    
    /**
     * Хоёр тоог хуваана.
     *
     * @param a эхний тоо (хуваагдагч)
     * @param b хоёр дахь тоо (хуваагч)
     * @return ноогдвор
     * @throws IllegalArgumentException тэгээр хуваах үед
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                "Алдаа: Тэгээр хуваах боломжгүй. Хуваагч нь 0-ээс өөр байх ёстой.");
        }
        return a / b;
    }
}
import java.util.Random;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class aleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            System.out.println(random.nextInt(i));
        }
    }
}

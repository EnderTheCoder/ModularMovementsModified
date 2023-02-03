import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("net.minecraft.client.renderer.entity.RenderPlayer");
        Field[] methods = clazz.getFields();

        for (Field m : methods) {
            System.out.println(m.getName() + " " + m.getType());
        }
    }
}

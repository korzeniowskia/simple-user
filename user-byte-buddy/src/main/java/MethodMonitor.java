import net.bytebuddy.asm.Advice.OnMethodEnter;
import net.bytebuddy.asm.Advice.Origin;

public class MethodMonitor {

  @OnMethodEnter
  public static void onEnter(@Origin Class clazz, @Origin("#m") String methodName) {
    System.out.println("Entering method: " + methodName);
  }
}

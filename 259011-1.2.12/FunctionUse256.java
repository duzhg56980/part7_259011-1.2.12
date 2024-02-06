import org.apache.log4j.NDC;
public class FunctionUse256 {
public void funcUse() {
NDC ndc = new NDC();
ndc.lazyRemove();
}
}
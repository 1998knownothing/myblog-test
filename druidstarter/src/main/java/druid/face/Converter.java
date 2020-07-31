package druid.face;



public interface Converter<A, B>{
     B doForward(A a);
     A doBackward(B b);
}
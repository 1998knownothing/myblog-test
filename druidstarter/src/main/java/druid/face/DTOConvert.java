package druid.face;

public interface DTOConvert<S,T> {
    T convert(S s);
}

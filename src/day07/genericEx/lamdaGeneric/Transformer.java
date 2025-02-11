package day07.genericEx.lamdaGeneric;

import java.util.function.Function;

@FunctionalInterface
public interface Transformer<T,R>{
    R transform(T input);
}

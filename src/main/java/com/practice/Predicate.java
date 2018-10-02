package com.practice;

@FunctionalInterface
public interface Predicate<T> {
    boolean apply(T t);

    default Predicate<T> or (Predicate other) {
        return t -> this.apply(t) || other.apply(t);
    }

    default Predicate<T> and (Predicate other) {
        return t -> this.apply(t) && other.apply(t);
    }

    default Predicate<T> not () {
        return  t -> ! this.apply(t);
    }

}

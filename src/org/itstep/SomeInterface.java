package org.itstep;
//interface marker
public interface SomeInterface {

    void getArea();

    default double getPerimetr() {
        return 2 * 4;
    };
}

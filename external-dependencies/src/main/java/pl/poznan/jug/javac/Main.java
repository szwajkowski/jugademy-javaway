package pl.poznan.jug.javac;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Main {

    public static void main(String[] args) {
        Hello hello = new Hello("Javac");
        hello.greet();
        System.out.println(ToStringBuilder.reflectionToString(hello, ToStringStyle.SHORT_PREFIX_STYLE));
    }
}

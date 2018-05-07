package com.dante.functional.java8Lambda;

import java.util.ArrayList;
import java.util.List;

public class FirstLambda {

    private static List<String> stringList = new ArrayList();

    public FirstLambda(){
        stringList.add( "a" );
        stringList.add( "b" );
        stringList.add( "d" );
        stringList.add( "e" );
        stringList.add( "dante" );
    }

    public static void sort(){
        stringList.sort( String :: compareTo );
    }

    public static void main(String[] args) {
        FirstLambda firstLambda = new FirstLambda();
        FirstLambda.sort();
        stringList.forEach( System.out::println );


    }
}

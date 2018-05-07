package com.dante.functional.java8Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLambda {

    private static List<String> stringList = new ArrayList();

    private static Map<String , String> stringMap = new ConcurrentHashMap<>();

    public StreamLambda(){
        stringList.add( "a" );
        stringList.add( "b" );
        stringList.add( "d" );
        stringList.add( "e" );
        stringList.add( "dante" );

        stringMap.put( "a" , "aaa" );
        stringMap.put( "b" , "blue" );
        stringMap.put( "c" , "class" );
        stringMap.put( "d" , "dante" );
    }

    public static List<String> stream()  {
        Stream<String> stringStream = stringList.stream();
        return stringStream.filter( (String a) -> a.indexOf("d") > -1 ).sorted( String::compareTo ).collect(Collectors.toList());
    }



    public static void main(String[] args) {
        StreamLambda streamLambda = new StreamLambda();
        List<String> stream = StreamLambda.stream();
        stream.forEach( System.out::println );
    }
}

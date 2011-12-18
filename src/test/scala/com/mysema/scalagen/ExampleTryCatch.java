package com.mysema.scalagen;

import java.util.Arrays;

public class ExampleTryCatch {
    
    public void run() {
        try {
            for (String str : Arrays.asList("a","b","c")) {
                System.out.println(str);
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getClass().getName());
            System.err.println(e.getMessage());
        } finally {
            System.out.println("done");
        }
    }

}
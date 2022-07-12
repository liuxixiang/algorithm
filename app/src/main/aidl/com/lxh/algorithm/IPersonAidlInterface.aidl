// IPersonAidlInterface.aidl
package com.lxh.algorithm;

// Declare any non-default types here with import statements

interface IPersonAidlInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);

            //具体的业务
                void setName(String name);
                void setAge(int age);
                String getInfo();
}
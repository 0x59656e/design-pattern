package com.designpattern;

import java.io.NotSerializableException;
import java.io.ObjectStreamClass;
import java.io.Serializable;

import com.designpattern.entity.Base;

public class SerialNumberGenerator {
    static public long getSerialVersionUID(Class clazz) throws NotSerializableException {
        long result = 0;

        if (clazz != null) {
            // check if class implements Serailizable:
            Class[] classes = clazz.getInterfaces();
            if (classes != null) {
                for (Class c : classes) {
                    if (c == Serializable.class) {
                        result = ObjectStreamClass.lookup(clazz).getSerialVersionUID();
                        break;
                    }
                } // next interface
                if (result == 0) {
                    throw new NotSerializableException(
                            "Class '" + clazz.getName() + "' does not implement " + Serializable.class);
                }
            } // else: interfaces unavailable
        } // else: input unavailable

        return result;
    }
    public static void main(String[] args) throws NotSerializableException {
        long id = SerialNumberGenerator.getSerialVersionUID(Base.class);
        System.out.println(id);
    }
}

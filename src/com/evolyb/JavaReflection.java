package com.evolyb;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaReflection {
    public static interface SuperInterface{
        String methodOfInterface();
    }

    public static class FatherClass{
        private String fatherProperty;
        public String getFatherProperty(){
            return fatherProperty;
        };
        public void setFatherProperty(String fatherProperty){
            this.fatherProperty = fatherProperty;
        };
    }

    public static class ChildClass extends FatherClass implements SuperInterface{
        private String childProperties01 = "Default";
        public String childProperties02 = "Default";
        public String getChildProperties01(){
            return this.childProperties01;
        };
        private void setChildProperties01(String childProperties01){
            this.childProperties01 = childProperties01;
        };
        public ChildClass() {}
        public ChildClass(String childProperties01) {
            this.childProperties01 = childProperties01;
        }
        @Override
        public String methodOfInterface() {
            return null;
        }
    }

    // Return the actual class not declared class;
    // com.evolyb.JavaReflection$ChildClass
    public static Class getClass(Object object){
        return object.getClass();
    }

    // Get full name of a class. Includes package
    // com.evolyb.JavaReflection$ChildClass
    public static String getClassName(Object object){
        return object.getClass().getName();
    }

    // Get simple name of a class. Not includes package
    // ChildClass
    public static String getSimpleClassName(Object object){
        return object.getClass().getSimpleName();
    }

    // Only properties that has public access modifiers
    // Includes Superclass and Interfaces
    public static Field[] getFields(Object object){
        return object.getClass().getFields();
    }

    // Only properties of child class
    public static Field[] getDeclaredFields(Object object){
        return object.getClass().getDeclaredFields();
    }

    // Get field by name
    public static Field getDeclaredFieldByName(Object object, String fieldName)
            throws NoSuchFieldException {
        return object.getClass().getDeclaredField(fieldName);
    }

    // Get Data type of Field
    public static Class getTypeOfAField(Field field){
        return field.getType();
    }

    // Change accessible of a field
    // To change a you must set setAccessible = true;
    public static void setAccessibleOfAField(Field field, boolean accessAble){
        field.setAccessible(accessAble);
    }

    // Set value of a field
    public static void setValueToAField(Object mainObject, Field field, Object value)
            throws IllegalAccessException {
        field.set(mainObject,value);
    }

    // Get value of a field
    // With a static method of class. We can pass null as mainObject
    public static Object getValueToAField(Object mainObject, Field field)
            throws IllegalAccessException {
        return field.get(mainObject);
    }

    // Use with boolean Modifier.isPublic(return value)
    // to check modifiers of class
    public static int getModifiers(Object object){
        return object.getClass().getModifiers();
    }

    // return package contains the class
    // package com.evolyb
    public static Package getPackage(Object object){
        return object.getClass().getPackage();
    }

    // Return SuperClass
    // FatherClass
    public static Class getSuperClass(Object object){
        return object.getClass().getSuperclass();
    }

    // return list of Interfaces
    public static Class[] getInterfaces(Object object){
        return object.getClass().getInterfaces();
    }

    // return list of Constructors
    public static Constructor[] getConstructors(Object object){
        return object.getClass().getConstructors();
    }

    // Get Constructor with specific parameters
    // Example: Parameter is String.class
    // Return Constructor that has 1 String parameter
    // Create new Object by return.newInstance(List of Parameters)
    public static Constructor getConstructorByParameters(Object object,
                                                               Class[] parameters)
            throws NoSuchMethodException {
        return object.getClass().getConstructor(parameters);
    }

    // List of public methods - Includes SuperClass and Interfaces
    public static Method[] getMethods(Object object){
        return object.getClass().getMethods();
    }

    // List of methods - Only this class but includes private methods;
    public static Method[] getDeclaredMethods(Object object){
        return object.getClass().getDeclaredMethods();
    }

    // Get a method by name and parameters
    public static Method getDeclaredMethodsByNameAndParameters(Object object,
                                                               String methodName,
                                                               Class[] parameters)
            throws NoSuchMethodException {
        return object.getClass().getDeclaredMethod(methodName,parameters);
    }

    // Invoke a method
    public static Object invokeAMethod(Object object,
                                       Method method,
                                       Object[] parameters)
            throws InvocationTargetException, IllegalAccessException {
        return method.invoke(object,parameters);
    }
}

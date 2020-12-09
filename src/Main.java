import java.lang.reflect.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException, ParseException {
//        JavaReflection.FatherClass myClass = new JavaReflection.ChildClass("ABC");
//        Class clazz = JavaReflection.getClass(myClass);
//        // class com.evolyb.JavaReflection$ChildClass
//        System.out.println(clazz);
//        System.out.println(JavaReflection.getClassName(myClass)); //JavaReflection$ChildClass
//        System.out.println(JavaReflection.getSimpleClassName(myClass)); //ChildClass
//        Arrays.stream(JavaReflection.getDeclaredFields(myClass))
//                .forEach(m-> System.out.println(m.getName())); // Only properties of child class
//        System.out.println(Modifier.isPublic(JavaReflection.getModifiers(myClass))); //true
//        System.out.println(Modifier.isFinal(JavaReflection.getModifiers(myClass))); //false
//        System.out.println(JavaReflection.getPackage(myClass));
//        System.out.println(JavaReflection.getSuperClass(myClass));
//        Arrays.stream(JavaReflection.getInterfaces(myClass)).forEach(m-> System.out.println(m.getName()));
//        Constructor[] constructors = JavaReflection.getConstructors(myClass);
//        Arrays.stream(constructors).forEach(m-> System.out.println(m.getName()));
//        Class[] classes = {String.class};
//        Constructor constructor = JavaReflection.getConstructorAccordingParameter(myClass,classes);
//        JavaReflection.ChildClass newObject = (JavaReflection.ChildClass) constructor.newInstance("HasParameter");
//        System.out.println(newObject.getSql());
//        Field field = JavaReflection.getDeclaredFieldByName(myClass,"noSql");
//        System.out.println(JavaReflection.getTypeOfAField(field));
//        field.setAccessible(true);
//        field.set(myClass,"FieldChanged");
//        System.out.println(JavaReflection.getValueToAField(myClass,field));
//        Arrays.stream(JavaReflection.getDeclaredMethods(myClass)).forEach(m-> System.out.println(m.getName()));
//        Method setSql = JavaReflection.getDeclaredMethodsByNameAndParameters(myClass,"setSql",new Class[]{String.class});
//        setSql.setAccessible(true);
//        JavaReflection.invokeAMethod(myClass,setSql,new Object[]{"Invoked"});
//        Method getSql = JavaReflection.getDeclaredMethodsByNameAndParameters(myClass,"getSql",new Class[0]);
//        getSql.setAccessible(true);
//        String result = (String) JavaReflection.invokeAMethod(myClass,getSql,new Object[0]);
//        System.out.println(result);
//        System.out.println(DateTimeHelper.getDaysBetween("20201212","","yyyyMMdd"));
//        System.out.println(DateTimeHelper.addDate(new Date(),2));
//        System.out.println(StringHelper.getNumberFormat(1000.643,0));
    }

}

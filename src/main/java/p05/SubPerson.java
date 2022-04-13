package p05;

/**
 * @author: ymm
 * @date: 2022/4/13
 * @version: 1.0.0
 * @description:
 */
//public class SubPerson extends Person { // 不保留泛型，没有指定类型，此时Person类中的T默认为Object类型  擦除
//public class SubPerson extends Person<String> { // 不保留泛型，但指定了泛型的类型，此时Person类中的T为String类型
//public class SubPerson<T> extends Person<T> { // 保留父类泛型，在构造对象时指定T的类型
public class SubPerson<T, T1> extends Person<T> { // 保留父类泛型，同时在子类中增加新的泛型

}

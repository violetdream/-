# 学习设计模式 

产品族和产品等级结构之间的关系
产品簇指的是同一个工厂下生产的不同产品构成的一个对象
产品等级指的是不同工厂创建的内容差异
通过创建一系列相关或相互依赖对象的接口，无须指定他们具体的类。再通过工厂的具体的实现，实现了上述产品族与产品等级之间的关联。


总结每种单例写法的优、缺点。
饿汉式单例优点为没有加任何的锁，执行效率比较高，在用户体验上来说，比懒汉式更好；缺点为类加载的时候就初始化，不管用与不用都占着内存空间；
懒汉式单例优点是用时才实例化，不占空间；缺点是synchronized实现线程安全具有性能问题；
注册式单例 避免了反射创建对象时，发生频率增加，内存分配开销也增大的缺陷；
枚举式单例  优点反射无法创建枚举类，因而无法破坏枚举式单例；
ThreadLocal线程单例  以空间换时间，优点比上锁的单例效率高；缺点占用空间；不能保证全局单例；能保证线程内单例

3、思考破坏单例模式的方式有哪些？并且归纳总结。
有反射及序列化 以及原型模式深度克隆

为什么JDK动态代理中要求目标类实现的接口数量不能超过65535个？
class文件中有一项interfaces_count，使用u2(unicode)类型存储。u2类型占用2个字节，每个字节8位，一共16位。
16位存储的最大值为2的16次方=65536，减去一位标记位得65535。超出这个数则class文件无法存储。


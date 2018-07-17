package practice.ncsoft.com.kotlinretrofit

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    // 1. Lazy 와 lateInit

    private val name: String by lazy {
        // 호출된 시점에 초기화
        println("--- lazy init")              // val 만 가능
        "lazy init"
    }

    private lateinit var lateInitName: String // Null을 가질 수 없다.
    // var 만 가능

    @Test
    @Throws(Exception::class)

    fun testForLazyAndLateinit() {
        lateInitName = name
    }

    // 2. Class

    fun testForClass(){
        ClassName("TGKim",  10)                    // age 만 명시하여 표현 가능
    }


    // Kotlin 생성자
    class ClassName constructor(val name: String="TGKim", val age: Int =0) { // 생성자

        init {                                 // 초기화
            println("name: $name, age: $age")
        }
    }

    /*Java 생성자                              // 별도의 함수로 생성자 선언
    class ClassName{
        public ClassName(String name){
            ...
        }
    }
    */

    // 3. 상속
    abstract class AbstractBase(val age: Int)

    // 4. interface
    interface InterfaceBase{
        fun morThan10YearsOld(): Boolean
    }

    class Customer(age: Int) : InterfaceBase, AbstractBase(age){ // abstract 는 하나만, interface는 여러개
                                                                 // extends             implements
        override fun morThan10YearsOld() = age>10
    }

    // 확장하고자 할 때
    /*class User(age: Int) : Customer(age){ // 사용하려면 open 사용
                                          // Custom 클래스는 Final로 만들었기 때문에 추가 확장이 안됨
                                          // Kotlin은 final로 구현되어 있음
    }*/
}

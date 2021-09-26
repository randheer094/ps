package helper

import kotlin.test.BeforeTest

abstract class BaseTest<T : Any> {

    protected lateinit var subject: T

    @BeforeTest
    fun setupTest() {
        subject = init()
    }

    abstract fun init(): T
}
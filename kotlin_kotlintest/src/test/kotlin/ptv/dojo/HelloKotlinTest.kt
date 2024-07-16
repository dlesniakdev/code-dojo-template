package ptv.dojo

import io.kotest.core.spec.style.FeatureSpec
import io.kotest.matchers.shouldBe


class HelloKotlinTest : FeatureSpec({
    feature("should greet correctly") {
        val objectUnderTest = HelloKotlin()
        val names = arrayOf("Kata", "World")

        names.forEach {
            scenario("should say 'Hello $it!'") {
                objectUnderTest.greet(it) shouldBe "Hello $it!"
            }
        }

        scenario("should say 'Hello Kotlin!'") {
            objectUnderTest.greet shouldBe "Hello Kotlin!"
        }
    }
})

//package cf
//
//import org.hamcrest.MatcherAssert.assertThat
//import org.hamcrest.Matchers.equalTo
//
//import org.spekframework.spek2.Spek
//import org.spekframework.spek2.style.specification.describe
//
//class CF_71ASpec: Spek({
//    describe("abbreviate") {
//        val testCases = mapOf(
//            "able" to "able",
//            "localization" to "l10n",
//            "internationalization" to "i18n",
//            "pneumonoultramicroscopicsilicovolcanoconiosis" to "p43s"
//        )
//        testCases.forEach { (value, expectedValue) ->
//            describe(value) {
//                it("prints '$expectedValue' when passed '$value'"){
//                    assertThat(abbreviate(value), equalTo(expectedValue))
//                    assert(expectedValue == abbreviate(value))
//                }
//            }
//        }
//    }
//})
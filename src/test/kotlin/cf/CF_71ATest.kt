package org.example.cf

import cf.abbreviate

import org.junit.*
import org.junit.runner.*
import org.junit.runners.*

@RunWith(Parameterized::class)
class CF_71ATest(val input: String, val expected: String) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : Collection<Array<String>> {
            return listOf(
                arrayOf("able", "able"),
                arrayOf("localization", "l10n"),
                arrayOf("internationalization", "i18n"),
                arrayOf("pneumonoultramicroscopicsilicovolcanoconiosis", "p43s")
            )
        }
    }
    @Test
    fun testAbbreviate() {
        Assert.assertEquals(expected, abbreviate(input))
    }
}
package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class areFollowingPatternsTest: StringSpec({
    "true" {
        areFollowingPatterns(mutableListOf("cat", "dog", "dog"), mutableListOf("a", "b", "b")) shouldBe true
    }

    "false" {
        areFollowingPatterns(mutableListOf("cat", "dog", "doggy"), mutableListOf("a", "b", "b")) shouldBe false
    }
})
package bike.cobi.kotlinplayground

import io.kotlintest.matchers.string.shouldNotBeBlank
import io.kotlintest.specs.StringSpec

internal class MainTest : StringSpec({
  "should pass please" {
    "awesome!".shouldNotBeBlank()
  }
})

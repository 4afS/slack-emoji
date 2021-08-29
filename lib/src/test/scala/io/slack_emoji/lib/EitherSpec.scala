package io.slack_emoji.lib

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class EitherSpec extends AnyWordSpec with Matchers:

  "when" should {
    "return right value" in {
      when(1 + 1 >= 2, "right") shouldEqual Right(())
    }

    "return left value" in {
      when(1 + 1 > 2, "left") shouldEqual Left("left")
    }
  }

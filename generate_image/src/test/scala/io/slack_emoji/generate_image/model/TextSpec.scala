package io.slack_emoji.generate_image.model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class TextSpec extends AnyWordSpec with Matchers:

  "Text model" should {
    "success 1 line text" in {
      Text("aaa") shouldEqual Right(new Text.Text1("aaa"))
    }

    "success 2 line text" in {
      val text =
        """|aaa
           |bbb""".stripMargin

      Text(text) shouldEqual Right(new Text.Text2("aaa", "bbb"))
    }

    "failed 3 line text" in {
      val text =
        """|aaa
           |bbb
           |ccc""".stripMargin

      Text(text) shouldEqual Left(TextError.InvalidNumberOfLines)
    }

    "failed too long string" in {
      Text("12345678901") shouldEqual Left(TextError.TooLong)
    }

    "success max length string" in {
      Text("1234567890") shouldEqual Right(new Text.Text1("1234567890"))
    }

    "failed too short string" in {
      Text("") shouldEqual Left(TextError.TooShort)
    }

    "success min length string" in {
      Text("1") shouldEqual Right(new Text.Text1("1"))
    }

  }

end TextSpec

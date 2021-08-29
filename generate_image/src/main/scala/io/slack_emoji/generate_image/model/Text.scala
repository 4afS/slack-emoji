package io.slack_emoji.generate_image.model

import io.slack_emoji.lib.when

enum Text:
  case Text1(val _1: String)
  case Text2(val _1: String, _2: String)

enum TextError:
  case TooLong, TooShort, InvalidNumberOfLines

object Text:

  def apply(t: String): Either[TextError, Text] =
    t.strip.split('\n').toList match
      case f :: Nil =>
        for str1 <- validateText(f)
        yield Text1(str1)
      case f :: s :: Nil =>
        for
          str1 <- validateText(f)
          str2 <- validateText(s)
        yield Text2(str1, str2)
      case _ =>
        Left(TextError.InvalidNumberOfLines)

  val maxLen = 10

  private def validateText(text: String): Either[TextError, String] =
    for
      _ <- when(text.length > 0, TextError.TooShort)
      _ <- when(text.length <= 10, TextError.TooLong)
    yield text

end Text

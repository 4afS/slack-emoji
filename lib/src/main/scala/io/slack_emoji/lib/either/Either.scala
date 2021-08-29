package io.slack_emoji.lib.either

def when[E](p: Boolean, e: => E): Either[E, Unit] = Either.cond(p, (), e)

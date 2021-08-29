package io.slack_emoji.lib

def when[E](p: Boolean, e: => E): Either[E, Unit] = Either.cond(p, (), e)

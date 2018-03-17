package example

import pureapp._
import monix.eval.Task
import monix.execution.Scheduler.Implicits.global
import cats.implicits._

object Main extends PureApp[Task] {

  // MODEL

  type Model = String

  type Msg = Unit

  type Cmd = Unit

  def init: (Model, Cmd) = ("hello monix task", ())

  override val quit: Option[Msg] = Some(())

  // UPDATE

  def update(msg: Msg, model: Model): (Model, Cmd) = (model, ())

  // IO

  def io(model: Model, cmd: Cmd): Task[Msg] =
    Task { println(model) }.void
}

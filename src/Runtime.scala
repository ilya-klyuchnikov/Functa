import primitives.{Block, Value}

import scala.util.{Try, Success}

class Runtime(input: String, fileName: Option[String] = None) {
  private val parser = new Parser(input, fileName)

  def evaluate = {
    new Organizer(parser, fileName).getValues
  }
}

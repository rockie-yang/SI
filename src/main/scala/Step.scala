import net.liftweb.json.JsonAST.JValue

/**
 * Created by : Rockie Yang(eyouyan@gmail.com, snowriver.org)
 * Created at : 2/18/13
 */

trait Logic {
  def transform(context: Map[String, Object], request: JValue): JValue
}

trait CompositeLogic extends Logic {

}


object ActionMap extends Enumeration {
  val addOnCreate = Value ("InvokeLDAPAddOnCreateOperation")
  val modifyOnCreate = Value ("InvokeLDAPModifyOnCreateOperation")
  val addOnUpdate = Value ("InvokeLDAPAddOnUpdateOperation")
  val modifyOnUpdate = Value ("InvokeLDAPModifyOnUpdateOperation")
  val deleteOnDelete = Value ("InvokeLDAPDeleteOnDeleteOperation")
  val modifyOnDelete = Value ("InvokeLDAPModifyOnDeleteOperation")

}


class LDAPLogic extends Logic {
  def transform(context: Map[String, Object], request: JValue): JValue = null
}

trait Resource

trait Task

trait AtomicTask extends Task

trait BlockTask extends Task

trait Link {
  def rawSend(context: Map[String, Object], request: JValue): JValue
}

class LDAPLink extends Link {
  def rawSend(context: Map[String, Object], request: JValue): JValue = null
}

object LDAPLink {
  //  def apply(name: String, )
}

object Main {
  def main(args: Array[String]) {
    import net.liftweb.json.JsonDSL._

    import net.liftweb.json._

    val input =
      ("request" ->
       ("id" -> "1234") ~
       ("name" -> "rockie"))

    val
  }
}
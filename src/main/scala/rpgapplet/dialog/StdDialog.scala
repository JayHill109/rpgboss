package rpgboss.rpgapplet.dialog

import rpgboss.rpgapplet.lib._
import scala.swing._
import scala.swing.event._

abstract class StdDialog(owner: Window, titleArg: String) 
  extends Dialog(owner) with HttpSender
{
  title = titleArg
  modal = true
  defaultButton = okButton
  setLocationRelativeTo(owner)
  
  def okFunc()
  
  lazy val cancelButton = new Button(Action("Cancel") { close() })
  
  lazy val okButton = new Button(new Action("OK") {
    mnemonic = Key.O.id
    def apply() = okFunc
  })
}

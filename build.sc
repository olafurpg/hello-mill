// build.sc
import coursier.Repository
import mill._
import mill.define.Command
import mill.scalalib._

object foo extends ScalaModule {
  def scalaVersion = "2.12.4"

  def ivyDeps = Agg(
    ivy"com.lihaoyi::pprint:0.5.3",
  )
}

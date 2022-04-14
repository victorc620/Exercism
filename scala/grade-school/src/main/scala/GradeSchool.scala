import scala.collection.immutable.ListMap

class School {
  type DB = Map[Int, Seq[String]]
  var roaster:DB = Map() //School Roaster

  def add(name: String, g: Int) = {
    var newNameSeq = roaster.getOrElse(g, Seq()):+ name
    roaster += (g -> newNameSeq)
  }

  def db: DB = roaster

  def grade(g: Int): Seq[String] = roaster.getOrElse(g, Seq())

  def sorted: DB = {
    for((k,v) <- roaster) {
      val sorted_v = v.sorted
      roaster += (k -> sorted_v)
    }
    roaster = ListMap(roaster.toSeq.sortBy(_._1):_*) // sort by key
    roaster
  }
}


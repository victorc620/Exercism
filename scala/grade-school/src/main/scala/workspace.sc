import scala.collection.immutable.ListMap

class School {
  type DB = Map[Int, Seq[String]]
  private var roaster:DB = Map() //School Roaster

  def add(name: String, g: Int) = {
    var newNameSeq = roaster.getOrElse(g, Seq()):+ name
    roaster += (g -> newNameSeq)
  }

  def db: DB = roaster

  def grade(g: Int): Seq[String] = {
    roaster.getOrElse(g, Seq())
  }

  def sorted = {
    for((k,v) <- roaster) {
      val sorted_v = v.sorted
      roaster += (k -> sorted_v)
    }
    roaster = ListMap(roaster.toSeq.sortBy(_._1):_*) // sort by key
  }
}

val school = new School
school.db
school.add("Aimee", 2)
school.db
school.add("James", 2)
school.add("Blair", 2)
school.add("Paul", 2)
school.db
school.add("Chelsea", 3)
school.add("Logan", 7)
school.db
school.add("Franklin", 5)
school.add("Bradley", 5)
school.add("Jeff", 1)
school.grade(5)
school.grade(100)
school.sorted
school.db


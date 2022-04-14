//import scala.collection.mutable.Map
//
//class School {
//  type DB = Map[Int, Seq[String]]
//  var roaster:DB = Map(2 -> Seq("Victor")) //School Roaster
//
//  def add(name: String, g: Int):DB = {
//    if(roaster.contains(g)) {
//      val newNameSeq = roaster(g):+name
//      roaster += (g -> newNameSeq)
//      roaster
//    }
//    else {
//      roaster += (g -> Seq(name))
//      roaster
//    }
//  }
//
//  def db: DB = roaster
//
//  def grade(g: Int): Seq[String] = ???
//
//  def sorted: DB = ???
//}

class School {
  type DB = Map[Int, Seq[String]]
  var roaster:DB = Map(2 -> Seq("Victor")) //School Roaster

  def add(name: String, g: Int):DB = {
    if(roaster.contains(g)){
    var newNameSeq:Seq[String] = roaster(g) :+ name
    roaster += (g -> newNameSeq)
    roaster
    } else {
      roaster += (g -> Seq(name))
      roaster
    }
  }
}

val school = new School
school.roaster
val newNameSeq = school.roaster(2):+"Ben"
school.roaster += (2 -> newNameSeq)
school.roaster
school.add("Aimee", 2)
school.add("Aimee", 3)
school.roaster

object SpaceAge {

  val earthYearInSecond = 31557600
  def onPlanetAge(orbitalPeriod:Double, ageInSecond:Double):Double = ageInSecond/(orbitalPeriod*earthYearInSecond)

  def onEarth(ageInSecond:Double): Double = onPlanetAge(1, ageInSecond)
  def onMercury(ageInSecond:Double): Double = onPlanetAge(0.2408467, ageInSecond)
  def onVenus(ageInSecond:Double): Double = onPlanetAge(0.61519726, ageInSecond)
  def onMars(ageInSecond:Double): Double = onPlanetAge(1.8808158, ageInSecond)
  def onJupiter(ageInSecond:Double): Double = onPlanetAge(11.862615, ageInSecond)
  def onSaturn(ageInSecond:Double): Double = onPlanetAge(29.447498, ageInSecond)
  def onUranus(ageInSecond:Double): Double = onPlanetAge(84.016846, ageInSecond)
  def onNeptune(ageInSecond:Double): Double = onPlanetAge(164.79132, ageInSecond)
}
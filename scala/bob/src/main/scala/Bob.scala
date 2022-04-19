object Bob {
  def response(statement: String): String = {
    var statementCleaned = statement.trim()
    // Address him without actually saying anything
    if (sayNothing(statementCleaned)) "Fine. Be that way!"

    // A question with ?
    else if (statementCleaned(statementCleaned.length - 1) == '?') {
      if (allCapital(statementCleaned) & !allDigit(statementCleaned)) "Calm down, I know what I'm doing!"
      else "Sure."
    }

    // anything else -> "Whatever"
    else if (allCapital(statementCleaned) & !allDigit(statementCleaned)) "Whoa, chill out!"
    else "Whatever."
  }

  def sayNothing(statement: String):Boolean = {
    statement.replace(" ", "").isEmpty
  }

  def allCapital(statement: String):Boolean ={
    val statementNew = statement.replaceAll("[\\p{Punct} ]","")
    var upperCheck:Boolean = true
    for (x <- statementNew) if (x.isLower) upperCheck = false
    upperCheck
  }

  def allDigit(statement: String): Boolean = {
    var digitCheck: Boolean = true
    val statementNew = statement.replaceAll("[\\p{Punct} ]","")
    for (x <- statementNew) if (!x.isDigit) digitCheck = false
    digitCheck
  }
}

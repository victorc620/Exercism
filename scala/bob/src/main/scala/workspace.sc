def sayNothing(statement: String): Boolean = {
  statement.replace(" ", "").isEmpty
}

def allCapital(statement: String): Boolean = {
  val statementNew = statement.replaceAll("[\\p{Punct} ]", "")
  var upperCheck: Boolean = true
  for (x <- statementNew) if (x.isLower) upperCheck = false
  upperCheck
}

def allDigit(statement: String): Boolean = {
  var digitCheck: Boolean = true
  val statementNew = statement.replaceAll("[\\p{Punct} ]","")
  for (x <- statementNew) if (!(x.isDigit)) digitCheck = false
  digitCheck
}

def response(statement: String): String = {

  // Address him without actually saying anything
  if (sayNothing(statement)) "Fine. Be that way!"

  // A question with ?
  else if (statement(statement.length - 1) == '?') {
    if (allCapital(statement) & !allDigit(statement)) "Calm down, I know what I'm doing!"
    else "Sure."
  }

  // anything else -> "Whatever"
  else if (allCapital(statement)) "Whoa, chill out!"
  else "Whatever."
}

response("										")
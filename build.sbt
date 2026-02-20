val root = (project in file("."))
  .settings(
    name := "dfdl-csv",

    organization := "com.owlcyberdefense",

    version := "0.1.1-SNAPSHOT",

    daffodilFlatLayout := true
  )
  .daffodilProject()

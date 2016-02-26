val commonSetting = Seq(
  organization  := "com.github.yutaono",
  version       := "0.1",
  scalaVersion  := "2.11.6",
  scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8"),
  libraryDependencies ++= {
    val akkaV = "2.3.9"
    val sprayV = "1.3.3"
    Seq(
      "io.spray"            %%  "spray-can"     % sprayV,
      "io.spray"            %%  "spray-client"  % sprayV,
      "io.spray"            %%  "spray-routing" % sprayV,
      "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
      "io.spray"            %%  "spray-testkit" % sprayV  % "test",
      "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test"
    )
  }
)

lazy val timeoutExample = (project in file("timeout"))
  .settings(commonSetting)

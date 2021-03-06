

sbtPlugin := true


name := "sbt-teamcity-test-reporting-plugin"

organization := "com.gu"

version := "1.2"


publishTo <<= (version) { version: String =>
    val publishType = if (version.endsWith("SNAPSHOT")) "repo-snapshots" else "repo-releases"
    Some(
        Resolver.file(
            "guardian github " + publishType,
            file(System.getProperty("user.home")) / "guardian.github.com" / "maven" / publishType
        )
    )
}

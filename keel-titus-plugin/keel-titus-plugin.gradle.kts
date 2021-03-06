plugins {
  `java-library`
  id("kotlin-spring")
}

dependencies {
  api(project(":keel-api"))
  api(project(":keel-titus-api"))
  implementation(project(":keel-core")) // TODO: ideally not
  implementation(project(":keel-clouddriver"))
  implementation(project(":keel-orca"))
  implementation(project(":keel-retrofit"))
  implementation(project(":keel-docker"))
  implementation(project(":keel-artifact"))
  implementation("io.spinnaker.kork:kork-core")
  implementation("io.spinnaker.kork:kork-web")
  implementation("org.springframework:spring-context")
  implementation("org.springframework.boot:spring-boot-autoconfigure")
  implementation("com.netflix.frigga:frigga")

  testImplementation(project(":keel-test"))
  testImplementation("io.strikt:strikt-jackson")
  testImplementation("io.strikt:strikt-mockk")
  testImplementation("dev.minutest:minutest")
  testImplementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml")
  testImplementation("org.funktionale:funktionale-partials")
  testImplementation("org.apache.commons:commons-lang3")
  testImplementation(project(":keel-core-test"))
}

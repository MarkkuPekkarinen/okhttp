plugins {
  kotlin("jvm")
}

dependencies {
  implementation(project(":okhttp"))
  implementation(Dependencies.moshi)
}

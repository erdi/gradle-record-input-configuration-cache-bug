plugins {
    `kotlin-dsl-base`
    `java-gradle-plugin`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":record"))
}

gradlePlugin {
    plugins {
        create("pluginWithTaskUsingRecordInput") {
            implementationClass = "com.github.erdi.gradle.configuration.cache.bug.PluginWithTaskUsingRecordAsInput"
            id = "com.github.erdi.gradle.configuration.cache.bug.plugin-with-task-using-record-as-input"
        }
    }
}

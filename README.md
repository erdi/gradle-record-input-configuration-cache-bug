# Reproducer project for https://github.com/gradle/gradle/issues/26926

To reproduce run `./gradlew :taskUsingRecordAsInput --configuration-cache`

Note that running `./gradlew :taskUsingRecordAsInput` succeeds.

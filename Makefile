clean:
	./gradlew clean
build:
	./gradlew clean build install checkstyleMain
install:
	./gradlew clean install checkstyleMain
run-dist:
	./build/install/java-project-lvl1/bin/java-project-lvl1
run:
	./gradlew run
lint:
	./gradlew checkstyleMain
check-updates:
	./gradlew useLatestVersions